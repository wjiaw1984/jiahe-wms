/*     */ package BOOT-INF.classes.com.best.javaSdk.wmsSoStatusPush.request;
/*     */ 
/*     */ import cn.com.wms.model.wms.fr.FrRationnote;
/*     */ import cn.com.wms.model.wms.fr.FrRet;
/*     */ import com.best.javaSdk.wmsSoStatusPush.request.Product;
/*     */ import java.util.List;
/*     */ 
/*     */ public class WmsSoStatusPushReq implements BaseRequest {
/*     */   private String customerCode;
/*     */   private String warehouseCode;
/*     */   private String orderCode;
/*     */   private String extTradeId;
/*     */   private String orderType;
/*     */   private String orderStatus;
/*     */   private String extOrderType;
/*     */   private String operator;
/*     */   private Date operatorTime;
/*     */   private String logisticsProviderCode;
/*     */   
/*  20 */   public void setCustomerCode(String customerCode) { this.customerCode = customerCode; } private String shippingOrderNo; private String remark; private String skuItem; private String totalVolume; private String totalWeight; private String totalNetWeight; private boolean wmsCreatedFlag; private Recipient recipient; private Products products; private Packages packages; public void setWarehouseCode(String warehouseCode) { this.warehouseCode = warehouseCode; } public void setOrderCode(String orderCode) { this.orderCode = orderCode; } public void setExtTradeId(String extTradeId) { this.extTradeId = extTradeId; } public void setOrderType(String orderType) { this.orderType = orderType; } public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; } public void setExtOrderType(String extOrderType) { this.extOrderType = extOrderType; } public void setOperator(String operator) { this.operator = operator; } public void setOperatorTime(Date operatorTime) { this.operatorTime = operatorTime; } public void setLogisticsProviderCode(String logisticsProviderCode) { this.logisticsProviderCode = logisticsProviderCode; } public void setShippingOrderNo(String shippingOrderNo) { this.shippingOrderNo = shippingOrderNo; } public void setRemark(String remark) { this.remark = remark; } public void setSkuItem(String skuItem) { this.skuItem = skuItem; } public void setTotalVolume(String totalVolume) { this.totalVolume = totalVolume; } public void setTotalWeight(String totalWeight) { this.totalWeight = totalWeight; } public void setTotalNetWeight(String totalNetWeight) { this.totalNetWeight = totalNetWeight; } public void setWmsCreatedFlag(boolean wmsCreatedFlag) { this.wmsCreatedFlag = wmsCreatedFlag; } public void setRecipient(Recipient recipient) { this.recipient = recipient; } public void setProducts(Products products) { this.products = products; } public void setPackages(Packages packages) { this.packages = packages; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.request.WmsSoStatusPushReq)) return false;  com.best.javaSdk.wmsSoStatusPush.request.WmsSoStatusPushReq other = (com.best.javaSdk.wmsSoStatusPush.request.WmsSoStatusPushReq)o; if (!other.canEqual(this)) return false;  Object this$customerCode = getCustomerCode(), other$customerCode = other.getCustomerCode(); if ((this$customerCode == null) ? (other$customerCode != null) : !this$customerCode.equals(other$customerCode)) return false;  Object this$warehouseCode = getWarehouseCode(), other$warehouseCode = other.getWarehouseCode(); if ((this$warehouseCode == null) ? (other$warehouseCode != null) : !this$warehouseCode.equals(other$warehouseCode)) return false;  Object this$orderCode = getOrderCode(), other$orderCode = other.getOrderCode(); if ((this$orderCode == null) ? (other$orderCode != null) : !this$orderCode.equals(other$orderCode)) return false;  Object this$extTradeId = getExtTradeId(), other$extTradeId = other.getExtTradeId(); if ((this$extTradeId == null) ? (other$extTradeId != null) : !this$extTradeId.equals(other$extTradeId)) return false;  Object this$orderType = getOrderType(), other$orderType = other.getOrderType(); if ((this$orderType == null) ? (other$orderType != null) : !this$orderType.equals(other$orderType)) return false;  Object this$orderStatus = getOrderStatus(), other$orderStatus = other.getOrderStatus(); if ((this$orderStatus == null) ? (other$orderStatus != null) : !this$orderStatus.equals(other$orderStatus)) return false;  Object this$extOrderType = getExtOrderType(), other$extOrderType = other.getExtOrderType(); if ((this$extOrderType == null) ? (other$extOrderType != null) : !this$extOrderType.equals(other$extOrderType)) return false;  Object this$operator = getOperator(), other$operator = other.getOperator(); if ((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator)) return false;  Object this$operatorTime = getOperatorTime(), other$operatorTime = other.getOperatorTime(); if ((this$operatorTime == null) ? (other$operatorTime != null) : !this$operatorTime.equals(other$operatorTime)) return false;  Object this$logisticsProviderCode = getLogisticsProviderCode(), other$logisticsProviderCode = other.getLogisticsProviderCode(); if ((this$logisticsProviderCode == null) ? (other$logisticsProviderCode != null) : !this$logisticsProviderCode.equals(other$logisticsProviderCode)) return false;  Object this$shippingOrderNo = getShippingOrderNo(), other$shippingOrderNo = other.getShippingOrderNo(); if ((this$shippingOrderNo == null) ? (other$shippingOrderNo != null) : !this$shippingOrderNo.equals(other$shippingOrderNo)) return false;  Object this$remark = getRemark(), other$remark = other.getRemark(); if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;  Object this$skuItem = getSkuItem(), other$skuItem = other.getSkuItem(); if ((this$skuItem == null) ? (other$skuItem != null) : !this$skuItem.equals(other$skuItem)) return false;  Object this$totalVolume = getTotalVolume(), other$totalVolume = other.getTotalVolume(); if ((this$totalVolume == null) ? (other$totalVolume != null) : !this$totalVolume.equals(other$totalVolume)) return false;  Object this$totalWeight = getTotalWeight(), other$totalWeight = other.getTotalWeight(); if ((this$totalWeight == null) ? (other$totalWeight != null) : !this$totalWeight.equals(other$totalWeight)) return false;  Object this$totalNetWeight = getTotalNetWeight(), other$totalNetWeight = other.getTotalNetWeight(); if ((this$totalNetWeight == null) ? (other$totalNetWeight != null) : !this$totalNetWeight.equals(other$totalNetWeight)) return false;  if (isWmsCreatedFlag() != other.isWmsCreatedFlag()) return false;  Object this$recipient = getRecipient(), other$recipient = other.getRecipient(); if ((this$recipient == null) ? (other$recipient != null) : !this$recipient.equals(other$recipient)) return false;  Object this$products = getProducts(), other$products = other.getProducts(); if ((this$products == null) ? (other$products != null) : !this$products.equals(other$products)) return false;  Object this$packages = getPackages(), other$packages = other.getPackages(); return !((this$packages == null) ? (other$packages != null) : !this$packages.equals(other$packages)); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsSoStatusPush.request.WmsSoStatusPushReq; } public int hashCode() { int PRIME = 59; result = 1; Object $customerCode = getCustomerCode(); result = result * 59 + (($customerCode == null) ? 43 : $customerCode.hashCode()); Object $warehouseCode = getWarehouseCode(); result = result * 59 + (($warehouseCode == null) ? 43 : $warehouseCode.hashCode()); Object $orderCode = getOrderCode(); result = result * 59 + (($orderCode == null) ? 43 : $orderCode.hashCode()); Object $extTradeId = getExtTradeId(); result = result * 59 + (($extTradeId == null) ? 43 : $extTradeId.hashCode()); Object $orderType = getOrderType(); result = result * 59 + (($orderType == null) ? 43 : $orderType.hashCode()); Object $orderStatus = getOrderStatus(); result = result * 59 + (($orderStatus == null) ? 43 : $orderStatus.hashCode()); Object $extOrderType = getExtOrderType(); result = result * 59 + (($extOrderType == null) ? 43 : $extOrderType.hashCode()); Object $operator = getOperator(); result = result * 59 + (($operator == null) ? 43 : $operator.hashCode()); Object $operatorTime = getOperatorTime(); result = result * 59 + (($operatorTime == null) ? 43 : $operatorTime.hashCode()); Object $logisticsProviderCode = getLogisticsProviderCode(); result = result * 59 + (($logisticsProviderCode == null) ? 43 : $logisticsProviderCode.hashCode()); Object $shippingOrderNo = getShippingOrderNo(); result = result * 59 + (($shippingOrderNo == null) ? 43 : $shippingOrderNo.hashCode()); Object $remark = getRemark(); result = result * 59 + (($remark == null) ? 43 : $remark.hashCode()); Object $skuItem = getSkuItem(); result = result * 59 + (($skuItem == null) ? 43 : $skuItem.hashCode()); Object $totalVolume = getTotalVolume(); result = result * 59 + (($totalVolume == null) ? 43 : $totalVolume.hashCode()); Object $totalWeight = getTotalWeight(); result = result * 59 + (($totalWeight == null) ? 43 : $totalWeight.hashCode()); Object $totalNetWeight = getTotalNetWeight(); result = result * 59 + (($totalNetWeight == null) ? 43 : $totalNetWeight.hashCode()); result = result * 59 + (isWmsCreatedFlag() ? 79 : 97); Object $recipient = getRecipient(); result = result * 59 + (($recipient == null) ? 43 : $recipient.hashCode()); Object $products = getProducts(); result = result * 59 + (($products == null) ? 43 : $products.hashCode()); Object $packages = getPackages(); return result * 59 + (($packages == null) ? 43 : $packages.hashCode()); } public String toString() { return "WmsSoStatusPushReq(customerCode=" + getCustomerCode() + ", warehouseCode=" + getWarehouseCode() + ", orderCode=" + getOrderCode() + ", extTradeId=" + getExtTradeId() + ", orderType=" + getOrderType() + ", orderStatus=" + getOrderStatus() + ", extOrderType=" + getExtOrderType() + ", operator=" + getOperator() + ", operatorTime=" + getOperatorTime() + ", logisticsProviderCode=" + getLogisticsProviderCode() + ", shippingOrderNo=" + getShippingOrderNo() + ", remark=" + getRemark() + ", skuItem=" + getSkuItem() + ", totalVolume=" + getTotalVolume() + ", totalWeight=" + getTotalWeight() + ", totalNetWeight=" + getTotalNetWeight() + ", wmsCreatedFlag=" + isWmsCreatedFlag() + ", recipient=" + getRecipient() + ", products=" + getProducts() + ", packages=" + getPackages() + ")"; }
/*     */    public String getCustomerCode() {
/*  22 */     return this.customerCode;
/*     */   } public String getWarehouseCode() {
/*  24 */     return this.warehouseCode;
/*     */   } public String getOrderCode() {
/*  26 */     return this.orderCode;
/*     */   } public String getExtTradeId() {
/*  28 */     return this.extTradeId;
/*     */   } public String getOrderType() {
/*  30 */     return this.orderType;
/*     */   } public String getOrderStatus() {
/*  32 */     return this.orderStatus;
/*     */   } public String getExtOrderType() {
/*  34 */     return this.extOrderType;
/*     */   } public String getOperator() {
/*  36 */     return this.operator;
/*     */   } public Date getOperatorTime() {
/*  38 */     return this.operatorTime;
/*     */   } public String getLogisticsProviderCode() {
/*  40 */     return this.logisticsProviderCode;
/*     */   } public String getShippingOrderNo() {
/*  42 */     return this.shippingOrderNo;
/*     */   } public String getRemark() {
/*  44 */     return this.remark;
/*     */   } public String getSkuItem() {
/*  46 */     return this.skuItem;
/*     */   } public String getTotalVolume() {
/*  48 */     return this.totalVolume;
/*     */   } public String getTotalWeight() {
/*  50 */     return this.totalWeight;
/*     */   } public String getTotalNetWeight() {
/*  52 */     return this.totalNetWeight;
/*     */   } public boolean isWmsCreatedFlag() {
/*  54 */     return this.wmsCreatedFlag;
/*     */   } public Recipient getRecipient() {
/*  56 */     return this.recipient;
/*     */   } public Products getProducts() {
/*  58 */     return this.products;
/*     */   } public Packages getPackages() {
/*  60 */     return this.packages;
/*     */   }
/*     */   
/*     */   public String obtainServiceType() {
/*  64 */     return "WMS_SO_STATUS_PUSH";
/*     */   }
/*     */ 
/*     */   
/*     */   public BaseResponse makeResponse(String rsp, String format) {
/*  69 */     if ("xml".equalsIgnoreCase(format)) {
/*  70 */       return (BaseResponse)Parser.coverXml2Object(rsp, WmsSoStatusPushRsp.class);
/*     */     }
/*  72 */     return (BaseResponse)Parser.convertJson2Object(rsp, WmsSoStatusPushRsp.class);
/*     */   }
/*     */   
/*     */   public List<FrRationnote> toRationNote(String fixString) {
/*  76 */     if (this == null) {
/*  77 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     List<FrRationnote> result = new ArrayList<>();
/*     */     
/*  86 */     for (Product product : this.products.getProduct()) {
/*  87 */       FrRationnote entity = new FrRationnote();
/*  88 */       entity.setSheetid(this.orderCode);
/*  89 */       String[] orderCodeArr = this.orderCode.split("-");
/*  90 */       if (orderCodeArr.length > 1) {
/*  91 */         entity.setRefSheetid(orderCodeArr[0]);
/*  92 */         entity.setShopid(orderCodeArr[1]);
/*     */       } else {
/*  94 */         throw new RuntimeException(String.format("处理配送回传单号【%s】发生错误，单据编码不格式不正确！", new Object[] { this.orderCode }));
/*     */       } 
/*  96 */       entity.setSdate(this.operatorTime);
/*  97 */       entity.setVenderid("0");
/*     */ 
/*     */ 
/*     */       
/* 101 */       entity.setGoodsid(product.getItemSkuCode());
/* 102 */       entity.setLotno(Integer.valueOf(-1));
/* 103 */       entity.setRealqty(product.getNormalQuantity());
/* 104 */       entity.setBadQty(product.getDefectiveQuantity());
/* 105 */       result.add(entity);
/*     */     } 
/* 107 */     return result;
/*     */   }
/*     */   
/*     */   public List<FrRet> toFrRet(String fixString) {
/* 111 */     if (this == null) {
/* 112 */       return null;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     List<FrRet> result = new ArrayList<>();
/*     */     
/* 121 */     for (Product product : this.products.getProduct()) {
/* 122 */       FrRet entity = new FrRet();
/* 123 */       entity.setSheetid(this.orderCode);
/*     */       
/* 125 */       entity.setSdate(this.operatorTime);
/* 126 */       entity.setOperator(this.operator);
/*     */ 
/*     */       
/* 129 */       entity.setGoodsid(product.getItemSkuCode());
/* 130 */       entity.setVenderid("888888");
/* 131 */       entity.setLotno(Integer.valueOf(-1));
/* 132 */       entity.setPlanQty(product.getItemQuantity());
/* 133 */       entity.setRealQty(product.getNormalQuantity());
/* 134 */       entity.setBadQty(product.getDefectiveQuantity());
/* 135 */       result.add(entity);
/*     */     } 
/* 137 */     return result;
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\WmsSoStatusPushReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */