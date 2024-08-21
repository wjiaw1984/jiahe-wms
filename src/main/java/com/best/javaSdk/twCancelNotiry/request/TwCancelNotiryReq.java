/*    */ package BOOT-INF.classes.com.best.javaSdk.twCancelNotiry.request;
/*    */ 
/*    */ import com.best.javaSdk.BaseRequest;
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.Parser;
/*    */ import com.best.javaSdk.twCancelNotiry.response.TwCancelNotiryRsp;
/*    */ 
/*    */ public class TwCancelNotiryReq
/*    */   implements BaseRequest {
/*    */   private String customerCode;
/*    */   private String orderCode;
/*    */   private String operationTypeCode;
/*    */   
/*    */   public String getCustomerCode() {
/* 15 */     return this.customerCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCustomerCode(String value) {
/* 20 */     this.customerCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getOrderCode() {
/* 25 */     return this.orderCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setOrderCode(String value) {
/* 30 */     this.orderCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getOperationTypeCode() {
/* 35 */     return this.operationTypeCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setOperationTypeCode(String value) {
/* 40 */     this.operationTypeCode = value;
/*    */   }
/*    */   
/*    */   public String obtainServiceType() {
/* 44 */     return "TW_CANCEL_NOTIRY";
/*    */   }
/*    */   
/*    */   public BaseResponse makeResponse(String rsp, String format) {
/* 48 */     if ("xml".equalsIgnoreCase(format)) {
/* 49 */       return (BaseResponse)Parser.coverXml2Object(rsp, TwCancelNotiryRsp.class);
/*    */     }
/* 51 */     return (BaseResponse)Parser.convertJson2Object(rsp, TwCancelNotiryRsp.class);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twCancelNotiry\request\TwCancelNotiryReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */