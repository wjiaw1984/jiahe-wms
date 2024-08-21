 package cn.com.wms.common.utils;
 
 import cn.com.wms.common.utils.Convert;
 import java.util.Date;
 
 
 
 
 public class CheckEndDate
 {
/* 11 */   static final Date END_DATE = Convert.stringToDate("2025-09-01");
   
   public static boolean checkEndDate(Date endDate) {
/* 14 */     boolean result = false;
/* 15 */     if (END_DATE.after(endDate)) {
/* 16 */       result = true;
     }
/* 18 */     return result;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\commo\\utils\CheckEndDate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */