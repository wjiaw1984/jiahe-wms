/*    */ package BOOT-INF.classes.cn.com.wms.common.reflect.utils;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.Set;
/*    */ import javax.validation.ConstraintViolation;
/*    */ import javax.validation.Validation;
/*    */ import javax.validation.Validator;
/*    */ import javax.validation.ValidatorFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ParamCheckUtil
/*    */ {
/* 15 */   private static Validator validator = null;
/*    */   
/*    */   public static <T> String checkParam(T obj) {
/* 18 */     Set<ConstraintViolation<T>> valideSert = getConstraintViolations(obj);
/* 19 */     if (valideSert != null && valideSert.size() > 0) {
/* 20 */       StringBuilder strBuff = new StringBuilder();
/* 21 */       for (ConstraintViolation<T> cv : valideSert) {
/* 22 */         strBuff.append(cv.getPropertyPath()).append(":").append(cv.getMessage()).append(";");
/*    */       }
/* 24 */       return strBuff.toString();
/*    */     } 
/* 26 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T> void validate(T obj) {
/* 31 */     Set<ConstraintViolation<T>> valideSert = getConstraintViolations(obj);
/* 32 */     if (valideSert != null && valideSert.size() > 0) {
/* 33 */       ConstraintViolation<T> cv = valideSert.iterator().next();
/* 34 */       throw new IllegalArgumentException(cv.getMessage());
/*    */     } 
/*    */   }
/*    */   
/*    */   public static <T> void validate(Collection<T> collection) {
/* 39 */     for (T obj : collection) {
/* 40 */       Set<ConstraintViolation<T>> valideSert = getConstraintViolations(obj);
/* 41 */       if (valideSert != null && valideSert.size() > 0) {
/* 42 */         ConstraintViolation<T> cv = valideSert.iterator().next();
/* 43 */         throw new IllegalArgumentException(cv.getMessage());
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private static <T> Set<ConstraintViolation<T>> getConstraintViolations(T obj) {
/* 49 */     if (validator == null) {
/* 50 */       ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
/* 51 */       validator = validatorFactory.getValidator();
/*    */     } 
/* 53 */     return validator.validate(obj, new Class[0]);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflec\\utils\ParamCheckUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */