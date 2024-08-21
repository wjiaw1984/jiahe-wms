/*     */ package BOOT-INF.classes.cn.com.wms.model.bset;
/*     */ 
/*     */ 
/*     */ public class ReceiptVo implements Serializable {
/*     */   private String customerCode;
/*     */   private String warehouseCode;
/*     */   private String orderCode;
/*     */   private String asnStatus;
/*     */   private String refOrderCode;
/*     */   private String extOrderType;
/*     */   private String logisticsProviderCode;
/*     */   private String shippingOrderNo;
/*     */   private String remark;
/*     */   private Date receiveTime;
/*     */   private Date checkStartTime;
/*     */   
/*  17 */   public void setCustomerCode(String customerCode) { this.customerCode = customerCode; } private Date checkEndTime; private Date orderTime; private Boolean udfFlag; private String udf1; private String udf2; private String udf8; private BigDecimal totalVolume; private BigDecimal totalWeight; private BigDecimal totalNetWeight; private Boolean wmsCreatedFlag; private String skuItem; private List<ReceiptItemVo> products; public void setWarehouseCode(String warehouseCode) { this.warehouseCode = warehouseCode; } public void setOrderCode(String orderCode) { this.orderCode = orderCode; } public void setAsnStatus(String asnStatus) { this.asnStatus = asnStatus; } public void setRefOrderCode(String refOrderCode) { this.refOrderCode = refOrderCode; } public void setExtOrderType(String extOrderType) { this.extOrderType = extOrderType; } public void setLogisticsProviderCode(String logisticsProviderCode) { this.logisticsProviderCode = logisticsProviderCode; } public void setShippingOrderNo(String shippingOrderNo) { this.shippingOrderNo = shippingOrderNo; } public void setRemark(String remark) { this.remark = remark; } public void setReceiveTime(Date receiveTime) { this.receiveTime = receiveTime; } public void setCheckStartTime(Date checkStartTime) { this.checkStartTime = checkStartTime; } public void setCheckEndTime(Date checkEndTime) { this.checkEndTime = checkEndTime; } public void setOrderTime(Date orderTime) { this.orderTime = orderTime; } public void setUdfFlag(Boolean udfFlag) { this.udfFlag = udfFlag; } public void setUdf1(String udf1) { this.udf1 = udf1; } public void setUdf2(String udf2) { this.udf2 = udf2; } public void setUdf8(String udf8) { this.udf8 = udf8; } public void setTotalVolume(BigDecimal totalVolume) { this.totalVolume = totalVolume; } public void setTotalWeight(BigDecimal totalWeight) { this.totalWeight = totalWeight; } public void setTotalNetWeight(BigDecimal totalNetWeight) { this.totalNetWeight = totalNetWeight; } public void setWmsCreatedFlag(Boolean wmsCreatedFlag) { this.wmsCreatedFlag = wmsCreatedFlag; } public void setSkuItem(String skuItem) { this.skuItem = skuItem; } public void setProducts(List<ReceiptItemVo> products) { this.products = products; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.bset.ReceiptVo)) return false;  cn.com.wms.model.bset.ReceiptVo other = (cn.com.wms.model.bset.ReceiptVo)o; if (!other.canEqual(this)) return false;  Object this$customerCode = getCustomerCode(), other$customerCode = other.getCustomerCode(); if ((this$customerCode == null) ? (other$customerCode != null) : !this$customerCode.equals(other$customerCode)) return false;  Object this$warehouseCode = getWarehouseCode(), other$warehouseCode = other.getWarehouseCode(); if ((this$warehouseCode == null) ? (other$warehouseCode != null) : !this$warehouseCode.equals(other$warehouseCode)) return false;  Object this$orderCode = getOrderCode(), other$orderCode = other.getOrderCode(); if ((this$orderCode == null) ? (other$orderCode != null) : !this$orderCode.equals(other$orderCode)) return false;  Object this$asnStatus = getAsnStatus(), other$asnStatus = other.getAsnStatus(); if ((this$asnStatus == null) ? (other$asnStatus != null) : !this$asnStatus.equals(other$asnStatus)) return false;  Object this$refOrderCode = getRefOrderCode(), other$refOrderCode = other.getRefOrderCode(); if ((this$refOrderCode == null) ? (other$refOrderCode != null) : !this$refOrderCode.equals(other$refOrderCode)) return false;  Object this$extOrderType = getExtOrderType(), other$extOrderType = other.getExtOrderType(); if ((this$extOrderType == null) ? (other$extOrderType != null) : !this$extOrderType.equals(other$extOrderType)) return false;  Object this$logisticsProviderCode = getLogisticsProviderCode(), other$logisticsProviderCode = other.getLogisticsProviderCode(); if ((this$logisticsProviderCode == null) ? (other$logisticsProviderCode != null) : !this$logisticsProviderCode.equals(other$logisticsProviderCode)) return false;  Object this$shippingOrderNo = getShippingOrderNo(), other$shippingOrderNo = other.getShippingOrderNo(); if ((this$shippingOrderNo == null) ? (other$shippingOrderNo != null) : !this$shippingOrderNo.equals(other$shippingOrderNo)) return false;  Object this$remark = getRemark(), other$remark = other.getRemark(); if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;  Object this$receiveTime = getReceiveTime(), other$receiveTime = other.getReceiveTime(); if ((this$receiveTime == null) ? (other$receiveTime != null) : !this$receiveTime.equals(other$receiveTime)) return false;  Object this$checkStartTime = getCheckStartTime(), other$checkStartTime = other.getCheckStartTime(); if ((this$checkStartTime == null) ? (other$checkStartTime != null) : !this$checkStartTime.equals(other$checkStartTime)) return false;  Object this$checkEndTime = getCheckEndTime(), other$checkEndTime = other.getCheckEndTime(); if ((this$checkEndTime == null) ? (other$checkEndTime != null) : !this$checkEndTime.equals(other$checkEndTime)) return false;  Object this$orderTime = getOrderTime(), other$orderTime = other.getOrderTime(); if ((this$orderTime == null) ? (other$orderTime != null) : !this$orderTime.equals(other$orderTime)) return false;  Object this$udfFlag = getUdfFlag(), other$udfFlag = other.getUdfFlag(); if ((this$udfFlag == null) ? (other$udfFlag != null) : !this$udfFlag.equals(other$udfFlag)) return false;  Object this$udf1 = getUdf1(), other$udf1 = other.getUdf1(); if ((this$udf1 == null) ? (other$udf1 != null) : !this$udf1.equals(other$udf1)) return false;  Object this$udf2 = getUdf2(), other$udf2 = other.getUdf2(); if ((this$udf2 == null) ? (other$udf2 != null) : !this$udf2.equals(other$udf2)) return false;  Object this$udf8 = getUdf8(), other$udf8 = other.getUdf8(); if ((this$udf8 == null) ? (other$udf8 != null) : !this$udf8.equals(other$udf8)) return false;  Object this$totalVolume = getTotalVolume(), other$totalVolume = other.getTotalVolume(); if ((this$totalVolume == null) ? (other$totalVolume != null) : !this$totalVolume.equals(other$totalVolume)) return false;  Object this$totalWeight = getTotalWeight(), other$totalWeight = other.getTotalWeight(); if ((this$totalWeight == null) ? (other$totalWeight != null) : !this$totalWeight.equals(other$totalWeight)) return false;  Object this$totalNetWeight = getTotalNetWeight(), other$totalNetWeight = other.getTotalNetWeight(); if ((this$totalNetWeight == null) ? (other$totalNetWeight != null) : !this$totalNetWeight.equals(other$totalNetWeight)) return false;  Object this$wmsCreatedFlag = getWmsCreatedFlag(), other$wmsCreatedFlag = other.getWmsCreatedFlag(); if ((this$wmsCreatedFlag == null) ? (other$wmsCreatedFlag != null) : !this$wmsCreatedFlag.equals(other$wmsCreatedFlag)) return false;  Object this$skuItem = getSkuItem(), other$skuItem = other.getSkuItem(); if ((this$skuItem == null) ? (other$skuItem != null) : !this$skuItem.equals(other$skuItem)) return false;  Object<ReceiptItemVo> this$products = (Object<ReceiptItemVo>)getProducts(), other$products = (Object<ReceiptItemVo>)other.getProducts(); return !((this$products == null) ? (other$products != null) : !this$products.equals(other$products)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.bset.ReceiptVo; } public int hashCode() { int PRIME = 59; result = 1; Object $customerCode = getCustomerCode(); result = result * 59 + (($customerCode == null) ? 43 : $customerCode.hashCode()); Object $warehouseCode = getWarehouseCode(); result = result * 59 + (($warehouseCode == null) ? 43 : $warehouseCode.hashCode()); Object $orderCode = getOrderCode(); result = result * 59 + (($orderCode == null) ? 43 : $orderCode.hashCode()); Object $asnStatus = getAsnStatus(); result = result * 59 + (($asnStatus == null) ? 43 : $asnStatus.hashCode()); Object $refOrderCode = getRefOrderCode(); result = result * 59 + (($refOrderCode == null) ? 43 : $refOrderCode.hashCode()); Object $extOrderType = getExtOrderType(); result = result * 59 + (($extOrderType == null) ? 43 : $extOrderType.hashCode()); Object $logisticsProviderCode = getLogisticsProviderCode(); result = result * 59 + (($logisticsProviderCode == null) ? 43 : $logisticsProviderCode.hashCode()); Object $shippingOrderNo = getShippingOrderNo(); result = result * 59 + (($shippingOrderNo == null) ? 43 : $shippingOrderNo.hashCode()); Object $remark = getRemark(); result = result * 59 + (($remark == null) ? 43 : $remark.hashCode()); Object $receiveTime = getReceiveTime(); result = result * 59 + (($receiveTime == null) ? 43 : $receiveTime.hashCode()); Object $checkStartTime = getCheckStartTime(); result = result * 59 + (($checkStartTime == null) ? 43 : $checkStartTime.hashCode()); Object $checkEndTime = getCheckEndTime(); result = result * 59 + (($checkEndTime == null) ? 43 : $checkEndTime.hashCode()); Object $orderTime = getOrderTime(); result = result * 59 + (($orderTime == null) ? 43 : $orderTime.hashCode()); Object $udfFlag = getUdfFlag(); result = result * 59 + (($udfFlag == null) ? 43 : $udfFlag.hashCode()); Object $udf1 = getUdf1(); result = result * 59 + (($udf1 == null) ? 43 : $udf1.hashCode()); Object $udf2 = getUdf2(); result = result * 59 + (($udf2 == null) ? 43 : $udf2.hashCode()); Object $udf8 = getUdf8(); result = result * 59 + (($udf8 == null) ? 43 : $udf8.hashCode()); Object $totalVolume = getTotalVolume(); result = result * 59 + (($totalVolume == null) ? 43 : $totalVolume.hashCode()); Object $totalWeight = getTotalWeight(); result = result * 59 + (($totalWeight == null) ? 43 : $totalWeight.hashCode()); Object $totalNetWeight = getTotalNetWeight(); result = result * 59 + (($totalNetWeight == null) ? 43 : $totalNetWeight.hashCode()); Object $wmsCreatedFlag = getWmsCreatedFlag(); result = result * 59 + (($wmsCreatedFlag == null) ? 43 : $wmsCreatedFlag.hashCode()); Object $skuItem = getSkuItem(); result = result * 59 + (($skuItem == null) ? 43 : $skuItem.hashCode()); Object<ReceiptItemVo> $products = (Object<ReceiptItemVo>)getProducts(); return result * 59 + (($products == null) ? 43 : $products.hashCode()); } public String toString() { return "ReceiptVo(customerCode=" + getCustomerCode() + ", warehouseCode=" + getWarehouseCode() + ", orderCode=" + getOrderCode() + ", asnStatus=" + getAsnStatus() + ", refOrderCode=" + getRefOrderCode() + ", extOrderType=" + getExtOrderType() + ", logisticsProviderCode=" + getLogisticsProviderCode() + ", shippingOrderNo=" + getShippingOrderNo() + ", remark=" + getRemark() + ", receiveTime=" + getReceiveTime() + ", checkStartTime=" + getCheckStartTime() + ", checkEndTime=" + getCheckEndTime() + ", orderTime=" + getOrderTime() + ", udfFlag=" + getUdfFlag() + ", udf1=" + getUdf1() + ", udf2=" + getUdf2() + ", udf8=" + getUdf8() + ", totalVolume=" + getTotalVolume() + ", totalWeight=" + getTotalWeight() + ", totalNetWeight=" + getTotalNetWeight() + ", wmsCreatedFlag=" + getWmsCreatedFlag() + ", skuItem=" + getSkuItem() + ", products=" + getProducts() + ")"; }
/*     */   
/*     */   public String getCustomerCode() {
/*  20 */     return this.customerCode;
/*     */   }
/*     */   public String getWarehouseCode() {
/*  23 */     return this.warehouseCode;
/*     */   }
/*     */   public String getOrderCode() {
/*  26 */     return this.orderCode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAsnStatus() {
/*  33 */     return this.asnStatus;
/*     */   }
/*     */   public String getRefOrderCode() {
/*  36 */     return this.refOrderCode;
/*     */   }
/*     */   public String getExtOrderType() {
/*  39 */     return this.extOrderType;
/*     */   }
/*     */   public String getLogisticsProviderCode() {
/*  42 */     return this.logisticsProviderCode;
/*     */   }
/*     */   public String getShippingOrderNo() {
/*  45 */     return this.shippingOrderNo;
/*     */   }
/*     */   public String getRemark() {
/*  48 */     return this.remark;
/*     */   }
/*     */   public Date getReceiveTime() {
/*  51 */     return this.receiveTime;
/*     */   }
/*     */   public Date getCheckStartTime() {
/*  54 */     return this.checkStartTime;
/*     */   }
/*     */   public Date getCheckEndTime() {
/*  57 */     return this.checkEndTime;
/*     */   }
/*     */   public Date getOrderTime() {
/*  60 */     return this.orderTime;
/*     */   }
/*     */   public Boolean getUdfFlag() {
/*  63 */     return this.udfFlag;
/*     */   }
/*     */   public String getUdf1() {
/*  66 */     return this.udf1;
/*     */   }
/*     */   public String getUdf2() {
/*  69 */     return this.udf2;
/*     */   }
/*     */   public String getUdf8() {
/*  72 */     return this.udf8;
/*     */   }
/*     */   public BigDecimal getTotalVolume() {
/*  75 */     return this.totalVolume;
/*     */   }
/*     */   public BigDecimal getTotalWeight() {
/*  78 */     return this.totalWeight;
/*     */   }
/*     */   public BigDecimal getTotalNetWeight() {
/*  81 */     return this.totalNetWeight;
/*     */   }
/*     */   public Boolean getWmsCreatedFlag() {
/*  84 */     return this.wmsCreatedFlag;
/*     */   }
/*     */   public String getSkuItem() {
/*  87 */     return this.skuItem;
/*     */   } public List<ReceiptItemVo> getProducts() {
/*  89 */     return this.products;
/*     */   }
/*     */   
/*     */   public List<FrReceipt> toFrReceipt() {
/*  93 */     List<FrReceipt> result = new ArrayList<>();
/*     */ 
/*     */     
/*  96 */     for (ReceiptItemVo item : this.products) {
/*  97 */       if (item.getNormalQuantity().compareTo(new BigDecimal(0)) == 0) {
/*     */         
/*  99 */         FrReceipt frReceipt = new FrReceipt();
/*     */         
/* 101 */         frReceipt.setSheetid(getOrderCode());
/*     */         
/* 103 */         frReceipt.setRefsheetid(getOrderCode());
/*     */         
/* 105 */         frReceipt.setOperator("best");
/*     */         
/* 107 */         frReceipt.setSdate(this.checkEndTime);
/*     */         
/* 109 */         frReceipt.setGoodsid(item.getItemSkuCode());
/*     */         
/* 111 */         frReceipt.setFreshflag(Integer.valueOf(0));
/*     */         
/* 113 */         frReceipt.setLotno(Integer.valueOf(-1));
/*     */         
/* 115 */         frReceipt.setQty(item.getNormalQuantity());
/*     */         
/* 117 */         frReceipt.setBadQty(item.getDefectiveQuantity());
/*     */         
/* 119 */         frReceipt.setOrerqty(item.getItemQuantity());
/*     */         
/* 121 */         Optional<BatchVo> minBatch = item.getBatchs().stream().min((e1, e2) -> e1.getProductionDate().compareTo(e2.getProductionDate()));
/*     */         
/* 123 */         frReceipt.setProductDate(((BatchVo)minBatch.get()).getProductionDate());
/*     */         
/* 125 */         result.add(frReceipt);
/*     */       } 
/*     */     } 
/* 128 */     return result;
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ReceiptVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */