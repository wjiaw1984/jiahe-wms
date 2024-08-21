/*     */ package BOOT-INF.classes.cn.com.wms.common.reflect.impl;
/*     */ 
/*     */ import cn.com.wms.common.reflect.ComponentInvoker;
/*     */ import cn.com.wms.common.reflect.deserializer.BeanDeserializer;
/*     */ import cn.com.wms.common.reflect.deserializer.DeserializerConfig;
/*     */ import cn.com.wms.common.reflect.meta.ComponentInfoStore;
/*     */ import cn.com.wms.common.reflect.meta.support.MethodInfo;
/*     */ import cn.com.wms.common.reflect.meta.support.ParamInfo;
/*     */ import cn.com.wms.common.reflect.utils.ParamCheckUtil;
/*     */ import cn.com.wms.common.reflect.utils.ReflectUtils;
/*     */ import com.alibaba.fastjson2.JSON;
/*     */ import com.alibaba.fastjson2.JSONArray;
/*     */ import com.alibaba.fastjson2.JSONObject;
/*     */ import com.alibaba.fastjson2.util.TypeUtils;
/*     */ import java.lang.reflect.Method;
/*     */ import java.text.MessageFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.springframework.beans.BeansException;
/*     */ import org.springframework.context.ApplicationContext;
/*     */ import org.springframework.context.ApplicationContextAware;
/*     */ import org.springframework.util.Assert;
/*     */ import org.springframework.util.ReflectionUtils;
/*     */ import org.springframework.util.StringUtils;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SpringComponentInvoker
/*     */   implements ComponentInvoker, ApplicationContextAware
/*     */ {
/*     */   protected ApplicationContext applicationContext;
/*  33 */   protected ComponentInfoStore componentInfoStore = new ComponentInfoStore();
/*     */ 
/*     */ 
/*     */   
/*     */   public Object invoke(String componentName, String componentMethod, Object... args) {
/*  38 */     Assert.hasText(componentName, "componentName is empty");
/*  39 */     Assert.hasText(componentMethod, "componentMethod is empty");
/*     */     
/*  41 */     Object component = this.applicationContext.getBean(componentName);
/*     */     
/*  43 */     Method method = findMethod(component.getClass(), componentMethod);
/*  44 */     if (method == null) {
/*  45 */       throw new RuntimeException("未找到方法 " + componentMethod);
/*     */     }
/*     */     
/*  48 */     return ReflectionUtils.invokeMethod(method, component, args);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object invoke(String methodStr, JSONObject jsonObject) {
/*  53 */     Assert.hasText(methodStr, "method is empty");
/*     */     
/*  55 */     if (!methodStr.contains(".")) {
/*  56 */       throw new IllegalArgumentException("method name invalid");
/*     */     }
/*     */     
/*  59 */     int lastDot = methodStr.lastIndexOf(".");
/*     */     
/*  61 */     String componentName = methodStr.substring(0, lastDot);
/*  62 */     String componentMethod = methodStr.substring(lastDot + 1);
/*     */     
/*  64 */     Object component = this.applicationContext.getBean(componentName);
/*  65 */     Class componentClazz = ReflectUtils.getClass(component);
/*     */     
/*  67 */     Method method = findMethod(componentClazz, componentMethod);
/*  68 */     if (method == null) {
/*  69 */       throw new RuntimeException("未找到方法 " + componentMethod);
/*     */     }
/*     */     
/*  72 */     MethodInfo methodInfo = this.componentInfoStore.get(componentClazz, componentMethod);
/*     */     
/*  74 */     int paramCount = methodInfo.getParamCount().intValue();
/*     */     
/*  76 */     int requestParamCount = methodInfo.getRequestParamCount();
/*     */ 
/*     */     
/*  79 */     if (methodInfo.getParamCount().intValue() == 0) {
/*  80 */       return ReflectionUtils.invokeMethod(method, component);
/*     */     }
/*     */     
/*  83 */     if (requestParamCount == 0 && paramCount > 1) {
/*  84 */       throw new RuntimeException(
/*  85 */           MessageFormat.format("{0} 没有 @RequestParam 注解的情况下，只允许一个参数，且参数类型只能是 JsonObject/JavaBean", new Object[] { methodStr }));
/*     */     }
/*     */     
/*  88 */     if (requestParamCount != 0 && requestParamCount != paramCount) {
/*  89 */       throw new RuntimeException(
/*  90 */           MessageFormat.format("{0} 参数个数与 @RequestParam 个数不一致", new Object[] { methodStr }));
/*     */     }
/*     */ 
/*     */     
/*  94 */     if (requestParamCount == 0) {
/*  95 */       ParamInfo paramInfo = methodInfo.getParamInfoList().get(0);
/*  96 */       Class clazz = paramInfo.getType();
/*     */       
/*  98 */       if (jsonObject == null && ((
/*  99 */         paramInfo.getRequestParam() != null && paramInfo.getRequestParam().required()) || paramInfo
/* 100 */         .getValidated() != null)) {
/* 101 */         throw new RuntimeException(
/* 102 */             MessageFormat.format("{0}: {1}参数不能为空", new Object[] { methodStr, paramInfo.getParamName() }));
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 107 */       if (clazz.getName().equalsIgnoreCase(JSONObject.class.getName())) {
/* 108 */         return ReflectionUtils.invokeMethod(method, component, new Object[] { jsonObject });
/*     */       }
/*     */       
/* 111 */       if (ReflectUtils.isJavaBean(clazz)) {
/* 112 */         Object javaObject = toJavaObject(jsonObject, clazz);
/*     */         
/* 114 */         if (paramInfo.hasValidated()) {
/* 115 */           ParamCheckUtil.validate(javaObject);
/*     */         }
/* 117 */         return ReflectionUtils.invokeMethod(method, component, new Object[] { javaObject });
/*     */       } 
/* 119 */       throw new RuntimeException(MessageFormat.format("{0}:{1} 只有一个参数并且没有@RequestParam注解的情况下，参数类型只能是 JsonObject/JavaBean ", new Object[] { methodStr, paramInfo.getParamName() }));
/*     */     } 
/*     */ 
/*     */     
/* 123 */     List<ParamInfo> paramInfoList = methodInfo.getParamInfoList();
/*     */     
/* 125 */     List<Object> objectList = new ArrayList();
/* 126 */     for (ParamInfo paramInfo : paramInfoList) {
/* 127 */       RequestParam requestParam = paramInfo.getRequestParam();
/* 128 */       String param = paramInfo.getParamName();
/* 129 */       Class type = paramInfo.getType();
/*     */       
/* 131 */       Object value = jsonObject.get(param);
/* 132 */       Object targetValue = null;
/*     */       
/* 134 */       if (value == null) {
/* 135 */         targetValue = null;
/*     */       }
/* 137 */       else if (value.getClass().getName().equalsIgnoreCase(type.getName())) {
/* 138 */         targetValue = value;
/*     */       }
/* 140 */       else if (value instanceof JSONObject) {
/* 141 */         targetValue = toJavaObject((JSONObject)value, type);
/*     */       }
/* 143 */       else if (value instanceof JSONArray) {
/* 144 */         targetValue = toJavaObjectList((JSONArray)value, paramInfo.getActualType());
/*     */       } else {
/*     */         
/* 147 */         targetValue = TypeUtils.cast(value, type, null);
/*     */       } 
/*     */       
/* 150 */       if (requestParam.required() && (
/* 151 */         targetValue == null || (targetValue instanceof String && !StringUtils.hasText(targetValue.toString())))) {
/* 152 */         throw new RuntimeException(MessageFormat.format("参数{0}不能为空", new Object[] { param }));
/*     */       }
/*     */ 
/*     */       
/* 156 */       if (paramInfo.hasValidated()) {
/* 157 */         ParamCheckUtil.validate(targetValue);
/*     */       }
/*     */       
/* 160 */       objectList.add(targetValue);
/*     */     } 
/*     */     
/* 163 */     return ReflectionUtils.invokeMethod(method, component, objectList.toArray());
/*     */   }
/*     */   
/*     */   private Object toJavaObject(JSONObject jsonObject, Class clazz) {
/* 167 */     BeanDeserializer beanDeserializer = DeserializerConfig.getGlobalInstance().get(clazz);
/* 168 */     if (beanDeserializer != null) {
/* 169 */       return beanDeserializer.deserializer(jsonObject);
/*     */     }
/*     */     
/* 172 */     return JSON.parseObject(jsonObject.toString(), clazz);
/*     */   }
/*     */   
/*     */   private Object toJavaObjectList(JSONArray jsonArray, Class clazz) {
/* 176 */     return JSON.parseArray(jsonArray.toString(), clazz);
/*     */   }
/*     */   
/*     */   private Method findMethod(Class clazz, String methodName) {
/* 180 */     Method[] methods = clazz.getDeclaredMethods();
/* 181 */     for (Method method : methods) {
/* 182 */       if (method.getName().equalsIgnoreCase(methodName)) {
/* 183 */         return method;
/*     */       }
/*     */     } 
/*     */     
/* 187 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
/* 192 */     this.applicationContext = applicationContext;
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflect\impl\SpringComponentInvoker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */