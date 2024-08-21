 package com.best.javaSdk.wmsProcessStatusPush.response;
 
 import com.best.javaSdk.BaseResponse;
 import com.best.javaSdk.wmsProcessStatusPush.response.Result;
 
 public class WmsProcessStatusPushRsp
   implements BaseResponse
 {
   private Object errors;
   private String note;
   private Result result;
   
   public Object getErrors() {
/* 14 */     return this.errors;
   }
 
   
   public void setErrors(Object value) {
/* 19 */     this.errors = value;
   }
 
   
   public String getNote() {
/* 24 */     return this.note;
   }
 
   
   public void setNote(String value) {
/* 29 */     this.note = value;
   }
 
   
   public Result getResult() {
/* 34 */     return this.result;
   }
 
   
   public void setResult(Result value) {
/* 39 */     this.result = value;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsProcessStatusPush\response\WmsProcessStatusPushRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */