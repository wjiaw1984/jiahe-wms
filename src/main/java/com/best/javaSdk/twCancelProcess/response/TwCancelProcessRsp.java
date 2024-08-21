/*    */ package BOOT-INF.classes.com.best.javaSdk.twCancelProcess.response;
/*    */ 
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.twCancelProcess.response.Errors;
/*    */ 
/*    */ public class TwCancelProcessRsp
/*    */   implements BaseResponse
/*    */ {
/*    */   private Errors errors;
/*    */   private String note;
/*    */   private boolean result;
/*    */   
/*    */   public Errors getErrors() {
/* 14 */     return this.errors;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setErrors(Errors value) {
/* 19 */     this.errors = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getNote() {
/* 24 */     return this.note;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setNote(String value) {
/* 29 */     this.note = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean getResult() {
/* 34 */     return this.result;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setResult(boolean value) {
/* 39 */     this.result = value;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twCancelProcess\response\TwCancelProcessRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */