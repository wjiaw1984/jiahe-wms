/*    */ package BOOT-INF.classes.cn.com.wms.common.reflect.meta.support;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import java.util.Arrays;
/*    */ import javax.validation.Valid;
/*    */ import org.springframework.validation.annotation.Validated;
/*    */ import org.springframework.web.bind.annotation.RequestParam;
/*    */ 
/*    */ public class ParamInfo {
/*    */   private Class type;
/*    */   private Class actualType;
/*    */   private Type[] actualTypeList;
/*    */   private RequestParam requestParam;
/*    */   
/* 15 */   public void setType(Class type) { this.type = type; } private Validated validated; private Valid valid; private Annotation[] annotations; private String paramName; public void setActualType(Class actualType) { this.actualType = actualType; } public void setActualTypeList(Type[] actualTypeList) { this.actualTypeList = actualTypeList; } public void setRequestParam(RequestParam requestParam) { this.requestParam = requestParam; } public void setValidated(Validated validated) { this.validated = validated; } public void setValid(Valid valid) { this.valid = valid; } public void setParamName(String paramName) { this.paramName = paramName; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.common.reflect.meta.support.ParamInfo)) return false;  cn.com.wms.common.reflect.meta.support.ParamInfo other = (cn.com.wms.common.reflect.meta.support.ParamInfo)o; if (!other.canEqual(this)) return false;  Object this$type = getType(), other$type = other.getType(); if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;  Object this$actualType = getActualType(), other$actualType = other.getActualType(); if ((this$actualType == null) ? (other$actualType != null) : !this$actualType.equals(other$actualType)) return false;  if (!Arrays.deepEquals((Object[])getActualTypeList(), (Object[])other.getActualTypeList())) return false;  Object this$requestParam = getRequestParam(), other$requestParam = other.getRequestParam(); if ((this$requestParam == null) ? (other$requestParam != null) : !this$requestParam.equals(other$requestParam)) return false;  Object this$validated = getValidated(), other$validated = other.getValidated(); if ((this$validated == null) ? (other$validated != null) : !this$validated.equals(other$validated)) return false;  Object this$valid = getValid(), other$valid = other.getValid(); if ((this$valid == null) ? (other$valid != null) : !this$valid.equals(other$valid)) return false;  if (!Arrays.deepEquals((Object[])getAnnotations(), (Object[])other.getAnnotations())) return false;  Object this$paramName = getParamName(), other$paramName = other.getParamName(); return !((this$paramName == null) ? (other$paramName != null) : !this$paramName.equals(other$paramName)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.common.reflect.meta.support.ParamInfo; } public int hashCode() { int PRIME = 59; result = 1; Object $type = getType(); result = result * 59 + (($type == null) ? 43 : $type.hashCode()); Object $actualType = getActualType(); result = result * 59 + (($actualType == null) ? 43 : $actualType.hashCode()); result = result * 59 + Arrays.deepHashCode((Object[])getActualTypeList()); Object $requestParam = getRequestParam(); result = result * 59 + (($requestParam == null) ? 43 : $requestParam.hashCode()); Object $validated = getValidated(); result = result * 59 + (($validated == null) ? 43 : $validated.hashCode()); Object $valid = getValid(); result = result * 59 + (($valid == null) ? 43 : $valid.hashCode()); result = result * 59 + Arrays.deepHashCode((Object[])getAnnotations()); Object $paramName = getParamName(); return result * 59 + (($paramName == null) ? 43 : $paramName.hashCode()); } public String toString() { return "ParamInfo(type=" + getType() + ", actualType=" + getActualType() + ", actualTypeList=" + Arrays.deepToString((Object[])getActualTypeList()) + ", requestParam=" + getRequestParam() + ", validated=" + getValidated() + ", valid=" + getValid() + ", annotations=" + Arrays.deepToString((Object[])getAnnotations()) + ", paramName=" + getParamName() + ")"; }
/*    */   
/* 17 */   public Class getType() { return this.type; }
/* 18 */   public Class getActualType() { return this.actualType; }
/* 19 */   public Type[] getActualTypeList() { return this.actualTypeList; }
/* 20 */   public RequestParam getRequestParam() { return this.requestParam; }
/* 21 */   public Validated getValidated() { return this.validated; }
/* 22 */   public Valid getValid() { return this.valid; } public Annotation[] getAnnotations() {
/* 23 */     return this.annotations;
/*    */   }
/*    */   
/*    */   public String getParamName() {
/* 27 */     if (this.paramName != null) {
/* 28 */       return this.paramName;
/*    */     }
/*    */     
/* 31 */     if (this.requestParam == null) {
/* 32 */       return null;
/*    */     }
/*    */     
/* 35 */     if (StringUtils.hasText(this.requestParam.value())) {
/* 36 */       this.paramName = this.requestParam.value();
/* 37 */     } else if (StringUtils.hasText(this.requestParam.name())) {
/* 38 */       this.paramName = this.requestParam.name();
/*    */     } 
/*    */     
/* 41 */     return this.paramName;
/*    */   }
/*    */   
/*    */   public boolean hasRequestParam() {
/* 45 */     return (this.requestParam != null);
/*    */   }
/*    */   
/*    */   public boolean hasValidated() {
/* 49 */     return (this.valid != null || this.validated != null);
/*    */   }
/*    */   
/*    */   public void setAnnotations(Annotation[] annotations) {
/* 53 */     this.annotations = annotations;
/*    */     
/* 55 */     if (annotations == null || annotations.length == 0) {
/*    */       return;
/*    */     }
/*    */     
/* 59 */     for (int i = 0; i < annotations.length; i++) {
/* 60 */       Annotation annotation = annotations[i];
/*    */       
/* 62 */       if (annotation.annotationType().equals(RequestParam.class)) {
/* 63 */         this.requestParam = (RequestParam)annotation;
/*    */       }
/* 65 */       else if (annotation.annotationType().equals(Validated.class)) {
/* 66 */         this.validated = (Validated)annotation;
/*    */       }
/* 68 */       else if (annotation.annotationType().equals(Valid.class)) {
/* 69 */         this.valid = (Valid)annotation;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflect\meta\support\ParamInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */