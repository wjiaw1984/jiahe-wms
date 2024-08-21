/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSkuNotify.response;
/*    */ 
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.wmsSkuNotify.response.Errors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WmsSkuNotifyRsp
/*    */   implements BaseResponse
/*    */ {
/*    */   private Errors errors;
/*    */   private String note;
/*    */   private boolean result;
/*    */   
/*    */   public Errors getErrors() {
/* 17 */     return this.errors;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setErrors(Errors value) {
/* 22 */     this.errors = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getNote() {
/* 27 */     return this.note;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setNote(String value) {
/* 32 */     this.note = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean getResult() {
/* 37 */     return this.result;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setResult(boolean value) {
/* 42 */     this.result = value;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSkuNotify\response\WmsSkuNotifyRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */