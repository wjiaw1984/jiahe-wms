/*    */ package BOOT-INF.classes.com.best.javaSdk.tmsGpsQuery.response;
/*    */ 
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.tmsGpsQuery.response.ObDestConcernedGpsInfo;
/*    */ import com.best.javaSdk.tmsGpsQuery.response.ObSourceConcernedGpsInfo;
/*    */ import com.best.javaSdk.tmsGpsQuery.response.TraceOmGpsList;
/*    */ 
/*    */ public class TmsGpsQueryRsp
/*    */   implements BaseResponse
/*    */ {
/*    */   private String errorDescription;
/*    */   private String errorCode;
/*    */   private boolean result;
/*    */   private TraceOmGpsList traceOmGpsList;
/*    */   private ObDestConcernedGpsInfo obDestConcernedGpsInfo;
/*    */   private String orderCode;
/*    */   private ObSourceConcernedGpsInfo obSourceConcernedGpsInfo;
/*    */   
/*    */   public String getErrorDescription() {
/* 20 */     return this.errorDescription;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setErrorDescription(String value) {
/* 25 */     this.errorDescription = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getErrorCode() {
/* 30 */     return this.errorCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setErrorCode(String value) {
/* 35 */     this.errorCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean getResult() {
/* 40 */     return this.result;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setResult(boolean value) {
/* 45 */     this.result = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public TraceOmGpsList getTraceOmGpsList() {
/* 50 */     return this.traceOmGpsList;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setTraceOmGpsList(TraceOmGpsList value) {
/* 55 */     this.traceOmGpsList = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public ObDestConcernedGpsInfo getObDestConcernedGpsInfo() {
/* 60 */     return this.obDestConcernedGpsInfo;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setObDestConcernedGpsInfo(ObDestConcernedGpsInfo value) {
/* 65 */     this.obDestConcernedGpsInfo = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getOrderCode() {
/* 70 */     return this.orderCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setOrderCode(String value) {
/* 75 */     this.orderCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public ObSourceConcernedGpsInfo getObSourceConcernedGpsInfo() {
/* 80 */     return this.obSourceConcernedGpsInfo;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setObSourceConcernedGpsInfo(ObSourceConcernedGpsInfo value) {
/* 85 */     this.obSourceConcernedGpsInfo = value;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\tmsGpsQuery\response\TmsGpsQueryRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */