/*    */ package BOOT-INF.classes.com.best.javaSdk.converter;
/*    */ 
/*    */ public class ConverterUtil {
/*    */   public static Object convert(Class<?> type, String value) {
/*  5 */     if (type.isAssignableFrom(int.class))
/*  6 */       return Integer.valueOf(Integer.parseInt(value)); 
/*  7 */     if (type.isAssignableFrom(double.class)) {
/*  8 */       return Double.valueOf(value);
/*    */     }
/* 10 */     return value;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converter\ConverterUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */