/*    */ package BOOT-INF.classes.com.best.javaSdk.tmsWaybillApply.response;
/*    */ 
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.tmsWaybillApply.response.Errors;
/*    */ import com.best.javaSdk.tmsWaybillApply.response.Waybills;
/*    */ 
/*    */ public class TmsWaybillApplyRsp
/*    */   implements BaseResponse
/*    */ {
/*    */   private Waybills waybills;
/*    */   private boolean result;
/*    */   private Errors errors;
/*    */   
/*    */   public Waybills getWaybills() {
/* 15 */     return this.waybills;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setWaybills(Waybills value) {
/* 20 */     this.waybills = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean getResult() {
/* 25 */     return this.result;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setResult(boolean value) {
/* 30 */     this.result = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public Errors getErrors() {
/* 35 */     return this.errors;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setErrors(Errors value) {
/* 40 */     this.errors = value;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\tmsWaybillApply\response\TmsWaybillApplyRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */