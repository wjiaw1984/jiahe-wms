/*    */ package BOOT-INF.classes.com.best.javaSdk.getShippingOrderInfo.request;
/*    */ 
/*    */ import com.best.javaSdk.BaseRequest;
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.Parser;
/*    */ import com.best.javaSdk.getShippingOrderInfo.request.ShippingOrders;
/*    */ import com.best.javaSdk.getShippingOrderInfo.response.GetShippingOrderInfoRsp;
/*    */ 
/*    */ public class GetShippingOrderInfoReq
/*    */   implements BaseRequest {
/*    */   private String customerCode;
/*    */   private String warehouseCode;
/*    */   private ShippingOrders shippingOrders;
/*    */   
/*    */   public String getCustomerCode() {
/* 16 */     return this.customerCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCustomerCode(String value) {
/* 21 */     this.customerCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getWarehouseCode() {
/* 26 */     return this.warehouseCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setWarehouseCode(String value) {
/* 31 */     this.warehouseCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public ShippingOrders getShippingOrders() {
/* 36 */     return this.shippingOrders;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setShippingOrders(ShippingOrders value) {
/* 41 */     this.shippingOrders = value;
/*    */   }
/*    */   
/*    */   public String obtainServiceType() {
/* 45 */     return "GetShippingOrderInfo";
/*    */   }
/*    */   
/*    */   public BaseResponse makeResponse(String rsp, String format) {
/* 49 */     if ("xml".equalsIgnoreCase(format)) {
/* 50 */       return (BaseResponse)Parser.coverXml2Object(rsp, GetShippingOrderInfoRsp.class);
/*    */     }
/* 52 */     return (BaseResponse)Parser.convertJson2Object(rsp, GetShippingOrderInfoRsp.class);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\getShippingOrderInfo\request\GetShippingOrderInfoReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */