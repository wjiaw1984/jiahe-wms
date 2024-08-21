 package com.best.javaSdk.getShippingOrderInfo.response;
 
 import com.best.javaSdk.BaseResponse;
 import com.best.javaSdk.getShippingOrderInfo.response.Errors;
 import com.best.javaSdk.getShippingOrderInfo.response.SalesOrders;
 
 public class GetShippingOrderInfoRsp
   implements BaseResponse
 {
   private String flag;
   private String note;
   private Errors errors;
   private SalesOrders salesOrders;
   
   public String getFlag() {
/* 16 */     return this.flag;
   }
 
   
   public void setFlag(String value) {
/* 21 */     this.flag = value;
   }
 
   
   public String getNote() {
/* 26 */     return this.note;
   }
 
   
   public void setNote(String value) {
/* 31 */     this.note = value;
   }
 
   
   public Errors getErrors() {
/* 36 */     return this.errors;
   }
 
   
   public void setErrors(Errors value) {
/* 41 */     this.errors = value;
   }
 
   
   public SalesOrders getSalesOrders() {
/* 46 */     return this.salesOrders;
   }
 
   
   public void setSalesOrders(SalesOrders value) {
/* 51 */     this.salesOrders = value;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\getShippingOrderInfo\response\GetShippingOrderInfoRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */