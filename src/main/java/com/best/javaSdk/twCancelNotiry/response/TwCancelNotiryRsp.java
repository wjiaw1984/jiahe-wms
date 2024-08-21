 package com.best.javaSdk.twCancelNotiry.response;
 
 import com.best.javaSdk.BaseResponse;
 
 public class TwCancelNotiryRsp
   implements BaseResponse
 {
   private boolean result;
   private String note;
   private String errorDescription;
   
   public boolean getResult() {
/* 13 */     return this.result;
   }
 
   
   public void setResult(boolean value) {
/* 18 */     this.result = value;
   }
 
   
   public String getNote() {
/* 23 */     return this.note;
   }
 
   
   public void setNote(String value) {
/* 28 */     this.note = value;
   }
 
   
   public String getErrorDescription() {
/* 33 */     return this.errorDescription;
   }
 
   
   public void setErrorDescription(String value) {
/* 38 */     this.errorDescription = value;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twCancelNotiry\response\TwCancelNotiryRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */