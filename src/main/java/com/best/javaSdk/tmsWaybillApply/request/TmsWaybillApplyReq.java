 package com.best.javaSdk.tmsWaybillApply.request;
 
 import com.best.javaSdk.BaseRequest;
 import com.best.javaSdk.BaseResponse;
 import com.best.javaSdk.Parser;
 import com.best.javaSdk.tmsWaybillApply.request.Orders;
 import com.best.javaSdk.tmsWaybillApply.response.TmsWaybillApplyRsp;
 
 public class TmsWaybillApplyReq
   implements BaseRequest {
   private String customerCode;
   private String projectCode;
   private String siteFlag;
   private String requestID;
   private Orders orders;
   
   public String getCustomerCode() {
/* 18 */     return this.customerCode;
   }
 
   
   public void setCustomerCode(String value) {
/* 23 */     this.customerCode = value;
   }
 
   
   public String getProjectCode() {
/* 28 */     return this.projectCode;
   }
 
   
   public void setProjectCode(String value) {
/* 33 */     this.projectCode = value;
   }
 
   
   public String getSiteFlag() {
/* 38 */     return this.siteFlag;
   }
 
   
   public void setSiteFlag(String value) {
/* 43 */     this.siteFlag = value;
   }
 
   
   public String getRequestID() {
/* 48 */     return this.requestID;
   }
 
   
   public void setRequestID(String value) {
/* 53 */     this.requestID = value;
   }
 
   
   public Orders getOrders() {
/* 58 */     return this.orders;
   }
 
   
   public void setOrders(Orders value) {
/* 63 */     this.orders = value;
   }
   
   public String obtainServiceType() {
/* 67 */     return "TMS_WAYBILL_APPLY";
   }
   
   public BaseResponse makeResponse(String rsp, String format) {
/* 71 */     if ("xml".equalsIgnoreCase(format)) {
/* 72 */       return (BaseResponse)Parser.coverXml2Object(rsp, TmsWaybillApplyRsp.class);
     }
/* 74 */     return (BaseResponse)Parser.convertJson2Object(rsp, TmsWaybillApplyRsp.class);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\tmsWaybillApply\request\TmsWaybillApplyReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */