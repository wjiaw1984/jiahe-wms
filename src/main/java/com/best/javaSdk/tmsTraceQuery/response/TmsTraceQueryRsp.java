 package com.best.javaSdk.tmsTraceQuery.response;

 import com.best.javaSdk.BaseResponse;
 import com.best.javaSdk.tmsTraceQuery.response.Errors;
 import com.best.javaSdk.tmsTraceQuery.response.OrderInfos;

 public class TmsTraceQueryRsp
   implements BaseResponse
 {
   private boolean result;
   private Errors errors;
   private OrderInfos orderInfos;

   public boolean getResult() {
/* 15 */     return this.result;
   }


   public void setResult(boolean value) {
/* 20 */     this.result = value;
   }


   public Errors getErrors() {
/* 25 */     return this.errors;
   }


   public void setErrors(Errors value) {
/* 30 */     this.errors = value;
   }


   public OrderInfos getOrderInfos() {
/* 35 */     return this.orderInfos;
   }


   public void setOrderInfos(OrderInfos value) {
/* 40 */     this.orderInfos = value;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\tmsTraceQuery\response\TmsTraceQueryRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */