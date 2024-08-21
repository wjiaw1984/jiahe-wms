/*    */ package BOOT-INF.classes.cn.com.wms.common.utils;
/*    */ 
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Convert
/*    */ {
/*    */   public static String dateFormat(Date date, String sDateTimeFormat) {
/* 14 */     String strdt = null;
/* 15 */     if (date != null) {
/*    */       try {
/* 17 */         SimpleDateFormat format = new SimpleDateFormat(sDateTimeFormat);
/* 18 */         strdt = format.format(date);
/* 19 */       } catch (Exception exc) {
/* 20 */         return strdt;
/*    */       } 
/*    */     }
/* 23 */     return strdt;
/*    */   }
/*    */   
/*    */   public static String formatDateTime(Object sourceObject) {
/* 27 */     if (sourceObject == null)
/* 28 */       return ""; 
/* 29 */     if (sourceObject instanceof String) {
/* 30 */       SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 31 */       return dF.format(stringToDate((String)sourceObject));
/* 32 */     }  if (sourceObject instanceof Date) {
/* 33 */       SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 34 */       return dF.format((Date)sourceObject);
/* 35 */     }  if (sourceObject instanceof Calendar) {
/* 36 */       SimpleDateFormat dF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 37 */       Calendar t = (Calendar)sourceObject;
/* 38 */       return dF.format(t.getTime());
/*    */     } 
/* 40 */     return "";
/*    */   }
/*    */   
/*    */   public static Date stringToDate(String sDate) {
/* 44 */     if (sDate != null && !sDate.equals("")) {
/*    */       try {
/* 46 */         String sDateTimeFormat = "yyyy-MM-dd HH:mm:ss";
/* 47 */         if (sDate.length() == 8)
/* 48 */           sDateTimeFormat = "HH:mm:ss"; 
/* 49 */         if (sDate.length() == 10)
/* 50 */           sDateTimeFormat = "yyyy-MM-dd"; 
/* 51 */         Date dt = (new SimpleDateFormat(sDateTimeFormat)).parse(sDate);
/*    */         
/* 53 */         return dt;
/* 54 */       } catch (Exception exc) {
/* 55 */         return null;
/*    */       } 
/*    */     }
/* 58 */     return null;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\commo\\utils\Convert.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */