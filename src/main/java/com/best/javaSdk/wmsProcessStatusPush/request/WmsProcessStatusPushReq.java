/*     */ package BOOT-INF.classes.com.best.javaSdk.wmsProcessStatusPush.request;
/*     */ 
/*     */ import com.best.javaSdk.BaseRequest;
/*     */ import com.best.javaSdk.BaseResponse;
/*     */ import com.best.javaSdk.Parser;
/*     */ import com.best.javaSdk.wmsProcessStatusPush.request.Materialitems;
/*     */ import com.best.javaSdk.wmsProcessStatusPush.request.Productitems;
/*     */ import com.best.javaSdk.wmsProcessStatusPush.response.WmsProcessStatusPushRsp;
/*     */ 
/*     */ public class WmsProcessStatusPushReq
/*     */   implements BaseRequest {
/*     */   private String actualSkuItem;
/*     */   private Materialitems materialitems;
/*     */   private Productitems productitems;
/*     */   private double actualQty;
/*     */   private String skuItem;
/*     */   private double totalAmount;
/*     */   private String serviceType;
/*     */   private String orderCompleteTime;
/*     */   private String outBizCode;
/*     */   private String orderStatus;
/*     */   private String processOrderCode;
/*     */   private String warehouseCode;
/*     */   private String customerCode;
/*     */   
/*     */   public String getActualSkuItem() {
/*  27 */     return this.actualSkuItem;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setActualSkuItem(String value) {
/*  32 */     this.actualSkuItem = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public Materialitems getMaterialitems() {
/*  37 */     return this.materialitems;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMaterialitems(Materialitems value) {
/*  42 */     this.materialitems = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public Productitems getProductitems() {
/*  47 */     return this.productitems;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProductitems(Productitems value) {
/*  52 */     this.productitems = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public double getActualQty() {
/*  57 */     return this.actualQty;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setActualQty(double value) {
/*  62 */     this.actualQty = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSkuItem() {
/*  67 */     return this.skuItem;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSkuItem(String value) {
/*  72 */     this.skuItem = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public double getTotalAmount() {
/*  77 */     return this.totalAmount;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTotalAmount(double value) {
/*  82 */     this.totalAmount = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getServiceType() {
/*  87 */     return this.serviceType;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setServiceType(String value) {
/*  92 */     this.serviceType = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getOrderCompleteTime() {
/*  97 */     return this.orderCompleteTime;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOrderCompleteTime(String value) {
/* 102 */     this.orderCompleteTime = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getOutBizCode() {
/* 107 */     return this.outBizCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOutBizCode(String value) {
/* 112 */     this.outBizCode = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getOrderStatus() {
/* 117 */     return this.orderStatus;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOrderStatus(String value) {
/* 122 */     this.orderStatus = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProcessOrderCode() {
/* 127 */     return this.processOrderCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProcessOrderCode(String value) {
/* 132 */     this.processOrderCode = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getWarehouseCode() {
/* 137 */     return this.warehouseCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWarehouseCode(String value) {
/* 142 */     this.warehouseCode = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCustomerCode() {
/* 147 */     return this.customerCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCustomerCode(String value) {
/* 152 */     this.customerCode = value;
/*     */   }
/*     */   
/*     */   public String obtainServiceType() {
/* 156 */     return "WMS_PROCESS_STATUS_PUSH";
/*     */   }
/*     */   
/*     */   public BaseResponse makeResponse(String rsp, String format) {
/* 160 */     if ("xml".equalsIgnoreCase(format)) {
/* 161 */       return (BaseResponse)Parser.coverXml2Object(rsp, WmsProcessStatusPushRsp.class);
/*     */     }
/* 163 */     return (BaseResponse)Parser.convertJson2Object(rsp, WmsProcessStatusPushRsp.class);
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsProcessStatusPush\request\WmsProcessStatusPushReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */