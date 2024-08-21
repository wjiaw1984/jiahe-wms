 package cn.com.wms.common.reflect.meta;
 
 import cn.com.wms.common.reflect.meta.support.MethodInfo;
 import cn.com.wms.common.reflect.meta.support.ParamInfo;
 import java.lang.annotation.Annotation;
 import java.lang.reflect.Method;
 import java.lang.reflect.ParameterizedType;
 import java.lang.reflect.Type;
 import java.text.MessageFormat;
 import java.util.HashMap;
 import java.util.Map;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 
 
 public class ComponentInfoStore
 {
/*  18 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.common.reflect.meta.ComponentInfoStore.class);
 
 
 
 
   
/*  24 */   private Map<String, MethodInfo> methodInfoMap = new HashMap<>();
 
   
   public MethodInfo get(Class<?> clazz, String methodName) {
/*  28 */     String methodKey = getMethodKey(clazz, methodName);
     
/*  30 */     if (this.methodInfoMap.containsKey(methodKey)) {
/*  31 */       return this.methodInfoMap.get(methodKey);
     }
     
/*  34 */     Method method = findMethod(clazz, methodName);
     
/*  36 */     MethodInfo methodInfo = new MethodInfo(clazz, method);
/*  37 */     methodInfo.setParamCount(Integer.valueOf(method.getParameterCount()));
 
     
/*  40 */     if (methodInfo.getParamCount().intValue() == 0) {
/*  41 */       return methodInfo;
     }
     
/*  44 */     Class[] types = method.getParameterTypes();
/*  45 */     Type[] genericTypes = method.getGenericParameterTypes();
/*  46 */     Annotation[][] parameterAnnotations = findAnnotation(method);
     
/*  48 */     for (int i = 0; i < methodInfo.getParamCount().intValue(); i++) {
/*  49 */       Class type = types[i];
/*  50 */       Type genericType = genericTypes[i];
       
/*  52 */       ParamInfo paramInfo = new ParamInfo();
/*  53 */       paramInfo.setType(types[i]);
/*  54 */       paramInfo.setAnnotations((parameterAnnotations == null) ? null : parameterAnnotations[i]);
       
       try {
/*  57 */         if (genericType instanceof ParameterizedType) {
/*  58 */           ParameterizedType parameterizedType = (ParameterizedType)genericType;
/*  59 */           Type[] typeList = parameterizedType.getActualTypeArguments();
           
/*  61 */           paramInfo.setActualTypeList(typeList);
           
/*  63 */           if (typeList != null && typeList.length > 0) {
/*  64 */             paramInfo.setActualType(Class.forName(typeList[0].getTypeName()));
           }
         }
       
/*  68 */       } catch (ClassNotFoundException e) {
/*  69 */         log.error(e.getMessage(), e);
       } 
       
/*  72 */       methodInfo.getParamInfoList().add(paramInfo);
     } 
     
/*  75 */     this.methodInfoMap.put(methodKey, methodInfo);
     
/*  77 */     return methodInfo;
   }
   
   private String getMethodKey(Class clazz, String methodName) {
/*  81 */     return MessageFormat.format("{0}.{1}", new Object[] { clazz.getName(), methodName });
   }
   
   private Method findMethod(Class clazz, String methodName) {
/*  85 */     Method[] methods = clazz.getDeclaredMethods();
/*  86 */     Method result = null;
     
/*  88 */     int count = 0;
/*  89 */     for (Method method : methods) {
/*  90 */       if (method.getName().equalsIgnoreCase(methodName)) {
/*  91 */         count++;
/*  92 */         if (count > 1) {
/*  93 */           throw new RuntimeException(MessageFormat.format("{0} 找到多个方法 {1}", new Object[] { clazz.getName(), methodName }));
         }
/*  95 */         result = method;
       } 
     } 
     
/*  99 */     return result;
   }
   
   private Annotation[][] findAnnotation(Method method) {
/* 103 */     Annotation[][] parameterAnnotations = method.getParameterAnnotations();
     
/* 105 */     if (parameterAnnotations == null || parameterAnnotations.length == 0) {
/* 106 */       return (Annotation[][])null;
     }
     
/* 109 */     if (parameterAnnotations.length == 1 && (parameterAnnotations[0]).length == 0) {
/* 110 */       return (Annotation[][])null;
     }
     
/* 113 */     return parameterAnnotations;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflect\meta\ComponentInfoStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */