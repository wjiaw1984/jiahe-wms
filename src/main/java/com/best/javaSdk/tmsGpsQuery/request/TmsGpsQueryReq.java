/*    */ package BOOT-INF.classes.com.best.javaSdk.tmsGpsQuery.request;
/*    */ 
/*    */ import com.best.javaSdk.BaseRequest;
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.Parser;
/*    */ import com.best.javaSdk.tmsGpsQuery.response.TmsGpsQueryRsp;
/*    */ 
/*    */ public class TmsGpsQueryReq
/*    */   implements BaseRequest {
/*    */   private String projectCode;
/*    */   private String orderCode;
/*    */   private long startTime;
/*    */   private long endTime;
/*    */   
/*    */   public String getProjectCode() {
/* 16 */     return this.projectCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setProjectCode(String value) {
/* 21 */     this.projectCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getOrderCode() {
/* 26 */     return this.orderCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setOrderCode(String value) {
/* 31 */     this.orderCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public long getStartTime() {
/* 36 */     return this.startTime;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setStartTime(long value) {
/* 41 */     this.startTime = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public long getEndTime() {
/* 46 */     return this.endTime;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setEndTime(long value) {
/* 51 */     this.endTime = value;
/*    */   }
/*    */   
/*    */   public String obtainServiceType() {
/* 55 */     return "TMS_GPS_QUERY";
/*    */   }
/*    */   
/*    */   public BaseResponse makeResponse(String rsp, String format) {
/* 59 */     if ("xml".equalsIgnoreCase(format)) {
/* 60 */       return (BaseResponse)Parser.coverXml2Object(rsp, TmsGpsQueryRsp.class);
/*    */     }
/* 62 */     return (BaseResponse)Parser.convertJson2Object(rsp, TmsGpsQueryRsp.class);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\tmsGpsQuery\request\TmsGpsQueryReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */