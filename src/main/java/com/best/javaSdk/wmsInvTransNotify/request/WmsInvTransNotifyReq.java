/*     */ package BOOT-INF.classes.com.best.javaSdk.wmsInvTransNotify.request;
/*     */ 
/*     */ import com.best.javaSdk.BaseRequest;
/*     */ import com.best.javaSdk.BaseResponse;
/*     */ import com.best.javaSdk.Parser;
/*     */ import com.best.javaSdk.wmsInvTransNotify.request.Products;
/*     */ import com.best.javaSdk.wmsInvTransNotify.response.WmsInvTransNotifyRsp;
/*     */ 
/*     */ public class WmsInvTransNotifyReq
/*     */   implements BaseRequest {
/*     */   private Products products;
/*     */   private String udf8;
/*     */   private String udf7;
/*     */   private String udf6;
/*     */   private String udf5;
/*     */   private String udf4;
/*     */   private String udf3;
/*     */   private String udf1;
/*     */   private String warehouseCode;
/*     */   private String udf2;
/*     */   private String customerCode;
/*     */   private String orderCode;
/*     */   private String transferTypeCode;
/*     */   private String toCustomerCode;
/*     */   private String remark;
/*     */   
/*     */   public Products getProducts() {
/*  28 */     return this.products;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProducts(Products value) {
/*  33 */     this.products = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUdf8() {
/*  38 */     return this.udf8;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUdf8(String value) {
/*  43 */     this.udf8 = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUdf7() {
/*  48 */     return this.udf7;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUdf7(String value) {
/*  53 */     this.udf7 = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUdf6() {
/*  58 */     return this.udf6;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUdf6(String value) {
/*  63 */     this.udf6 = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUdf5() {
/*  68 */     return this.udf5;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUdf5(String value) {
/*  73 */     this.udf5 = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUdf4() {
/*  78 */     return this.udf4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUdf4(String value) {
/*  83 */     this.udf4 = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUdf3() {
/*  88 */     return this.udf3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUdf3(String value) {
/*  93 */     this.udf3 = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUdf1() {
/*  98 */     return this.udf1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUdf1(String value) {
/* 103 */     this.udf1 = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getWarehouseCode() {
/* 108 */     return this.warehouseCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWarehouseCode(String value) {
/* 113 */     this.warehouseCode = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUdf2() {
/* 118 */     return this.udf2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUdf2(String value) {
/* 123 */     this.udf2 = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCustomerCode() {
/* 128 */     return this.customerCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCustomerCode(String value) {
/* 133 */     this.customerCode = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getOrderCode() {
/* 138 */     return this.orderCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOrderCode(String value) {
/* 143 */     this.orderCode = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTransferTypeCode() {
/* 148 */     return this.transferTypeCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTransferTypeCode(String value) {
/* 153 */     this.transferTypeCode = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getToCustomerCode() {
/* 158 */     return this.toCustomerCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setToCustomerCode(String value) {
/* 163 */     this.toCustomerCode = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRemark() {
/* 168 */     return this.remark;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRemark(String value) {
/* 173 */     this.remark = value;
/*     */   }
/*     */   
/*     */   public String obtainServiceType() {
/* 177 */     return "WMS_INV_TRANS_NOTIFY";
/*     */   }
/*     */   
/*     */   public BaseResponse makeResponse(String rsp, String format) {
/* 181 */     if ("xml".equalsIgnoreCase(format)) {
/* 182 */       return (BaseResponse)Parser.coverXml2Object(rsp, WmsInvTransNotifyRsp.class);
/*     */     }
/* 184 */     return (BaseResponse)Parser.convertJson2Object(rsp, WmsInvTransNotifyRsp.class);
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsInvTransNotify\request\WmsInvTransNotifyReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */