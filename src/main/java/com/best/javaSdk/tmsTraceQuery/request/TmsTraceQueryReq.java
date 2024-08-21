/*    */ package BOOT-INF.classes.com.best.javaSdk.tmsTraceQuery.request;
/*    */ 
/*    */ import com.best.javaSdk.BaseRequest;
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.Parser;
/*    */ import com.best.javaSdk.tmsTraceQuery.response.TmsTraceQueryRsp;
/*    */ 
/*    */ public class TmsTraceQueryReq
/*    */   implements BaseRequest {
/*    */   private String customerCode;
/*    */   private String createTimeFrom;
/*    */   private String createTimeTo;
/*    */   private String orderCode;
/*    */   private String shipmentCode;
/*    */   
/*    */   public String getCustomerCode() {
/* 17 */     return this.customerCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCustomerCode(String value) {
/* 22 */     this.customerCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getCreateTimeFrom() {
/* 27 */     return this.createTimeFrom;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCreateTimeFrom(String value) {
/* 32 */     this.createTimeFrom = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getCreateTimeTo() {
/* 37 */     return this.createTimeTo;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCreateTimeTo(String value) {
/* 42 */     this.createTimeTo = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getOrderCode() {
/* 47 */     return this.orderCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setOrderCode(String value) {
/* 52 */     this.orderCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getShipmentCode() {
/* 57 */     return this.shipmentCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setShipmentCode(String value) {
/* 62 */     this.shipmentCode = value;
/*    */   }
/*    */   
/*    */   public String obtainServiceType() {
/* 66 */     return "TMS_TRACE_QUERY";
/*    */   }
/*    */   
/*    */   public BaseResponse makeResponse(String rsp, String format) {
/* 70 */     if ("xml".equalsIgnoreCase(format)) {
/* 71 */       return (BaseResponse)Parser.coverXml2Object(rsp, TmsTraceQueryRsp.class);
/*    */     }
/* 73 */     return (BaseResponse)Parser.convertJson2Object(rsp, TmsTraceQueryRsp.class);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\tmsTraceQuery\request\TmsTraceQueryReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */