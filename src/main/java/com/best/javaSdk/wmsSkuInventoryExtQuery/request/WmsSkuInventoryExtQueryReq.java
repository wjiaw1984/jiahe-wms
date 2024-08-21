/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSkuInventoryExtQuery.request;
/*    */ 
/*    */ import com.best.javaSdk.BaseRequest;
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.Parser;
/*    */ import com.best.javaSdk.wmsSkuInventoryExtQuery.request.Products;
/*    */ import com.best.javaSdk.wmsSkuInventoryExtQuery.response.WmsSkuInventoryExtQueryRsp;
/*    */ 
/*    */ public class WmsSkuInventoryExtQueryReq
/*    */   implements BaseRequest {
/*    */   private String customerCode;
/*    */   private String warehouseCode;
/*    */   private Products products;
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
/*    */   public Products getProducts() {
/* 36 */     return this.products;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setProducts(Products value) {
/* 41 */     this.products = value;
/*    */   }
/*    */   
/*    */   public String obtainServiceType() {
/* 45 */     return "WMS_SKU_INVENTORY_EXT_QUERY";
/*    */   }
/*    */   
/*    */   public BaseResponse makeResponse(String rsp, String format) {
/* 49 */     if ("xml".equalsIgnoreCase(format)) {
/* 50 */       return (BaseResponse)Parser.coverXml2Object(rsp, WmsSkuInventoryExtQueryRsp.class);
/*    */     }
/* 52 */     return (BaseResponse)Parser.convertJson2Object(rsp, WmsSkuInventoryExtQueryRsp.class);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSkuInventoryExtQuery\request\WmsSkuInventoryExtQueryReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */