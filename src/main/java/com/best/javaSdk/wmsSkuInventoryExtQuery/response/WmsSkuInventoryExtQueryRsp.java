/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSkuInventoryExtQuery.response;
/*    */ 
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ import com.best.javaSdk.wmsSkuInventoryExtQuery.response.Errors;
/*    */ import com.best.javaSdk.wmsSkuInventoryExtQuery.response.Products;
/*    */ 
/*    */ public class WmsSkuInventoryExtQueryRsp
/*    */   implements BaseResponse
/*    */ {
/*    */   private boolean result;
/*    */   private Products products;
/*    */   private Errors errors;
/*    */   private String note;
/*    */   
/*    */   public boolean getResult() {
/* 16 */     return this.result;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setResult(boolean value) {
/* 21 */     this.result = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public Products getProducts() {
/* 26 */     return this.products;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setProducts(Products value) {
/* 31 */     this.products = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public Errors getErrors() {
/* 36 */     return this.errors;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setErrors(Errors value) {
/* 41 */     this.errors = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getNote() {
/* 46 */     return this.note;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setNote(String value) {
/* 51 */     this.note = value;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSkuInventoryExtQuery\response\WmsSkuInventoryExtQueryRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */