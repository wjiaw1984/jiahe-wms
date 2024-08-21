/*    */ package BOOT-INF.classes.com.best.javaSdk.twCancelProcess.request;
/*    */ 
/*    */ import com.best.javaSdk.BaseRequest;
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.Parser;
/*    */ import com.best.javaSdk.twCancelProcess.response.TwCancelProcessRsp;
/*    */ 
/*    */ public class TwCancelProcessReq
/*    */   implements BaseRequest {
/*    */   private String warehouseCode;
/*    */   private String ownerCode;
/*    */   private String orderCode;
/*    */   
/*    */   public String getWarehouseCode() {
/* 15 */     return this.warehouseCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setWarehouseCode(String value) {
/* 20 */     this.warehouseCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getOwnerCode() {
/* 25 */     return this.ownerCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setOwnerCode(String value) {
/* 30 */     this.ownerCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getOrderCode() {
/* 35 */     return this.orderCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setOrderCode(String value) {
/* 40 */     this.orderCode = value;
/*    */   }
/*    */   
/*    */   public String obtainServiceType() {
/* 44 */     return "TW_CANCEL_PROCESS";
/*    */   }
/*    */   
/*    */   public BaseResponse makeResponse(String rsp, String format) {
/* 48 */     if ("xml".equalsIgnoreCase(format)) {
/* 49 */       return (BaseResponse)Parser.coverXml2Object(rsp, TwCancelProcessRsp.class);
/*    */     }
/* 51 */     return (BaseResponse)Parser.convertJson2Object(rsp, TwCancelProcessRsp.class);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twCancelProcess\request\TwCancelProcessReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */