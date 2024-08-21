/*    */ package BOOT-INF.classes.cn.com.wms.model.bset;
/*    */ public class ItemVo implements Serializable { private Long lineNo;
/*    */   private String itemSkuCode;
/*    */   private String itemName;
/*    */   private Integer itemQuantity;
/*    */   private Integer packageCount;
/*    */   private String uomCode;
/*    */   private BigDecimal weight;
/*    */   private BigDecimal volume;
/*    */   private BigDecimal volumeWeight;
/*    */   private BigDecimal unitPrice;
/*    */   private BigDecimal declaredValue;
/*    */   private String fixStatusCode;
/*    */   private String productionDate;
/*    */   
/* 16 */   public void setLineNo(Long lineNo) { this.lineNo = lineNo; } private String expiryDate; private String lotAtt01; private String lotAtt02; private String lotAtt12; private String providerCode; private String providerFrom; private String providerName; private String packCode; private String packageStandard; private String remark; private Integer defectiveQuantity; private BigDecimal averageWeight; private List<BatchVo> batchs; public void setItemSkuCode(String itemSkuCode) { this.itemSkuCode = itemSkuCode; } public void setItemName(String itemName) { this.itemName = itemName; } public void setItemQuantity(Integer itemQuantity) { this.itemQuantity = itemQuantity; } public void setPackageCount(Integer packageCount) { this.packageCount = packageCount; } public void setUomCode(String uomCode) { this.uomCode = uomCode; } public void setWeight(BigDecimal weight) { this.weight = weight; } public void setVolume(BigDecimal volume) { this.volume = volume; } public void setVolumeWeight(BigDecimal volumeWeight) { this.volumeWeight = volumeWeight; } public void setUnitPrice(BigDecimal unitPrice) { this.unitPrice = unitPrice; } public void setDeclaredValue(BigDecimal declaredValue) { this.declaredValue = declaredValue; } public void setFixStatusCode(String fixStatusCode) { this.fixStatusCode = fixStatusCode; } public void setProductionDate(String productionDate) { this.productionDate = productionDate; } public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; } public void setLotAtt01(String lotAtt01) { this.lotAtt01 = lotAtt01; } public void setLotAtt02(String lotAtt02) { this.lotAtt02 = lotAtt02; } public void setLotAtt12(String lotAtt12) { this.lotAtt12 = lotAtt12; } public void setProviderCode(String providerCode) { this.providerCode = providerCode; } public void setProviderFrom(String providerFrom) { this.providerFrom = providerFrom; } public void setProviderName(String providerName) { this.providerName = providerName; } public void setPackCode(String packCode) { this.packCode = packCode; } public void setPackageStandard(String packageStandard) { this.packageStandard = packageStandard; } public void setRemark(String remark) { this.remark = remark; } public void setDefectiveQuantity(Integer defectiveQuantity) { this.defectiveQuantity = defectiveQuantity; } public void setAverageWeight(BigDecimal averageWeight) { this.averageWeight = averageWeight; } public void setBatchs(List<BatchVo> batchs) { this.batchs = batchs; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.bset.ItemVo)) return false;  cn.com.wms.model.bset.ItemVo other = (cn.com.wms.model.bset.ItemVo)o; if (!other.canEqual(this)) return false;  Object this$lineNo = getLineNo(), other$lineNo = other.getLineNo(); if ((this$lineNo == null) ? (other$lineNo != null) : !this$lineNo.equals(other$lineNo)) return false;  Object this$itemSkuCode = getItemSkuCode(), other$itemSkuCode = other.getItemSkuCode(); if ((this$itemSkuCode == null) ? (other$itemSkuCode != null) : !this$itemSkuCode.equals(other$itemSkuCode)) return false;  Object this$itemName = getItemName(), other$itemName = other.getItemName(); if ((this$itemName == null) ? (other$itemName != null) : !this$itemName.equals(other$itemName)) return false;  Object this$itemQuantity = getItemQuantity(), other$itemQuantity = other.getItemQuantity(); if ((this$itemQuantity == null) ? (other$itemQuantity != null) : !this$itemQuantity.equals(other$itemQuantity)) return false;  Object this$packageCount = getPackageCount(), other$packageCount = other.getPackageCount(); if ((this$packageCount == null) ? (other$packageCount != null) : !this$packageCount.equals(other$packageCount)) return false;  Object this$uomCode = getUomCode(), other$uomCode = other.getUomCode(); if ((this$uomCode == null) ? (other$uomCode != null) : !this$uomCode.equals(other$uomCode)) return false;  Object this$weight = getWeight(), other$weight = other.getWeight(); if ((this$weight == null) ? (other$weight != null) : !this$weight.equals(other$weight)) return false;  Object this$volume = getVolume(), other$volume = other.getVolume(); if ((this$volume == null) ? (other$volume != null) : !this$volume.equals(other$volume)) return false;  Object this$volumeWeight = getVolumeWeight(), other$volumeWeight = other.getVolumeWeight(); if ((this$volumeWeight == null) ? (other$volumeWeight != null) : !this$volumeWeight.equals(other$volumeWeight)) return false;  Object this$unitPrice = getUnitPrice(), other$unitPrice = other.getUnitPrice(); if ((this$unitPrice == null) ? (other$unitPrice != null) : !this$unitPrice.equals(other$unitPrice)) return false;  Object this$declaredValue = getDeclaredValue(), other$declaredValue = other.getDeclaredValue(); if ((this$declaredValue == null) ? (other$declaredValue != null) : !this$declaredValue.equals(other$declaredValue)) return false;  Object this$fixStatusCode = getFixStatusCode(), other$fixStatusCode = other.getFixStatusCode(); if ((this$fixStatusCode == null) ? (other$fixStatusCode != null) : !this$fixStatusCode.equals(other$fixStatusCode)) return false;  Object this$productionDate = getProductionDate(), other$productionDate = other.getProductionDate(); if ((this$productionDate == null) ? (other$productionDate != null) : !this$productionDate.equals(other$productionDate)) return false;  Object this$expiryDate = getExpiryDate(), other$expiryDate = other.getExpiryDate(); if ((this$expiryDate == null) ? (other$expiryDate != null) : !this$expiryDate.equals(other$expiryDate)) return false;  Object this$lotAtt01 = getLotAtt01(), other$lotAtt01 = other.getLotAtt01(); if ((this$lotAtt01 == null) ? (other$lotAtt01 != null) : !this$lotAtt01.equals(other$lotAtt01)) return false;  Object this$lotAtt02 = getLotAtt02(), other$lotAtt02 = other.getLotAtt02(); if ((this$lotAtt02 == null) ? (other$lotAtt02 != null) : !this$lotAtt02.equals(other$lotAtt02)) return false;  Object this$lotAtt12 = getLotAtt12(), other$lotAtt12 = other.getLotAtt12(); if ((this$lotAtt12 == null) ? (other$lotAtt12 != null) : !this$lotAtt12.equals(other$lotAtt12)) return false;  Object this$providerCode = getProviderCode(), other$providerCode = other.getProviderCode(); if ((this$providerCode == null) ? (other$providerCode != null) : !this$providerCode.equals(other$providerCode)) return false;  Object this$providerFrom = getProviderFrom(), other$providerFrom = other.getProviderFrom(); if ((this$providerFrom == null) ? (other$providerFrom != null) : !this$providerFrom.equals(other$providerFrom)) return false;  Object this$providerName = getProviderName(), other$providerName = other.getProviderName(); if ((this$providerName == null) ? (other$providerName != null) : !this$providerName.equals(other$providerName)) return false;  Object this$packCode = getPackCode(), other$packCode = other.getPackCode(); if ((this$packCode == null) ? (other$packCode != null) : !this$packCode.equals(other$packCode)) return false;  Object this$packageStandard = getPackageStandard(), other$packageStandard = other.getPackageStandard(); if ((this$packageStandard == null) ? (other$packageStandard != null) : !this$packageStandard.equals(other$packageStandard)) return false;  Object this$remark = getRemark(), other$remark = other.getRemark(); if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;  Object this$defectiveQuantity = getDefectiveQuantity(), other$defectiveQuantity = other.getDefectiveQuantity(); if ((this$defectiveQuantity == null) ? (other$defectiveQuantity != null) : !this$defectiveQuantity.equals(other$defectiveQuantity)) return false;  Object this$averageWeight = getAverageWeight(), other$averageWeight = other.getAverageWeight(); if ((this$averageWeight == null) ? (other$averageWeight != null) : !this$averageWeight.equals(other$averageWeight)) return false;  Object<BatchVo> this$batchs = (Object<BatchVo>)getBatchs(), other$batchs = (Object<BatchVo>)other.getBatchs(); return !((this$batchs == null) ? (other$batchs != null) : !this$batchs.equals(other$batchs)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.bset.ItemVo; } public int hashCode() { int PRIME = 59; result = 1; Object $lineNo = getLineNo(); result = result * 59 + (($lineNo == null) ? 43 : $lineNo.hashCode()); Object $itemSkuCode = getItemSkuCode(); result = result * 59 + (($itemSkuCode == null) ? 43 : $itemSkuCode.hashCode()); Object $itemName = getItemName(); result = result * 59 + (($itemName == null) ? 43 : $itemName.hashCode()); Object $itemQuantity = getItemQuantity(); result = result * 59 + (($itemQuantity == null) ? 43 : $itemQuantity.hashCode()); Object $packageCount = getPackageCount(); result = result * 59 + (($packageCount == null) ? 43 : $packageCount.hashCode()); Object $uomCode = getUomCode(); result = result * 59 + (($uomCode == null) ? 43 : $uomCode.hashCode()); Object $weight = getWeight(); result = result * 59 + (($weight == null) ? 43 : $weight.hashCode()); Object $volume = getVolume(); result = result * 59 + (($volume == null) ? 43 : $volume.hashCode()); Object $volumeWeight = getVolumeWeight(); result = result * 59 + (($volumeWeight == null) ? 43 : $volumeWeight.hashCode()); Object $unitPrice = getUnitPrice(); result = result * 59 + (($unitPrice == null) ? 43 : $unitPrice.hashCode()); Object $declaredValue = getDeclaredValue(); result = result * 59 + (($declaredValue == null) ? 43 : $declaredValue.hashCode()); Object $fixStatusCode = getFixStatusCode(); result = result * 59 + (($fixStatusCode == null) ? 43 : $fixStatusCode.hashCode()); Object $productionDate = getProductionDate(); result = result * 59 + (($productionDate == null) ? 43 : $productionDate.hashCode()); Object $expiryDate = getExpiryDate(); result = result * 59 + (($expiryDate == null) ? 43 : $expiryDate.hashCode()); Object $lotAtt01 = getLotAtt01(); result = result * 59 + (($lotAtt01 == null) ? 43 : $lotAtt01.hashCode()); Object $lotAtt02 = getLotAtt02(); result = result * 59 + (($lotAtt02 == null) ? 43 : $lotAtt02.hashCode()); Object $lotAtt12 = getLotAtt12(); result = result * 59 + (($lotAtt12 == null) ? 43 : $lotAtt12.hashCode()); Object $providerCode = getProviderCode(); result = result * 59 + (($providerCode == null) ? 43 : $providerCode.hashCode()); Object $providerFrom = getProviderFrom(); result = result * 59 + (($providerFrom == null) ? 43 : $providerFrom.hashCode()); Object $providerName = getProviderName(); result = result * 59 + (($providerName == null) ? 43 : $providerName.hashCode()); Object $packCode = getPackCode(); result = result * 59 + (($packCode == null) ? 43 : $packCode.hashCode()); Object $packageStandard = getPackageStandard(); result = result * 59 + (($packageStandard == null) ? 43 : $packageStandard.hashCode()); Object $remark = getRemark(); result = result * 59 + (($remark == null) ? 43 : $remark.hashCode()); Object $defectiveQuantity = getDefectiveQuantity(); result = result * 59 + (($defectiveQuantity == null) ? 43 : $defectiveQuantity.hashCode()); Object $averageWeight = getAverageWeight(); result = result * 59 + (($averageWeight == null) ? 43 : $averageWeight.hashCode()); Object<BatchVo> $batchs = (Object<BatchVo>)getBatchs(); return result * 59 + (($batchs == null) ? 43 : $batchs.hashCode()); } public String toString() { return "ItemVo(lineNo=" + getLineNo() + ", itemSkuCode=" + getItemSkuCode() + ", itemName=" + getItemName() + ", itemQuantity=" + getItemQuantity() + ", packageCount=" + getPackageCount() + ", uomCode=" + getUomCode() + ", weight=" + getWeight() + ", volume=" + getVolume() + ", volumeWeight=" + getVolumeWeight() + ", unitPrice=" + getUnitPrice() + ", declaredValue=" + getDeclaredValue() + ", fixStatusCode=" + getFixStatusCode() + ", productionDate=" + getProductionDate() + ", expiryDate=" + getExpiryDate() + ", lotAtt01=" + getLotAtt01() + ", lotAtt02=" + getLotAtt02() + ", lotAtt12=" + getLotAtt12() + ", providerCode=" + getProviderCode() + ", providerFrom=" + getProviderFrom() + ", providerName=" + getProviderName() + ", packCode=" + getPackCode() + ", packageStandard=" + getPackageStandard() + ", remark=" + getRemark() + ", defectiveQuantity=" + getDefectiveQuantity() + ", averageWeight=" + getAverageWeight() + ", batchs=" + getBatchs() + ")"; }
/*    */   
/*    */   public Long getLineNo() {
/* 19 */     return this.lineNo;
/*    */   }
/*    */   public String getItemSkuCode() {
/* 22 */     return this.itemSkuCode;
/*    */   }
/*    */   public String getItemName() {
/* 25 */     return this.itemName;
/*    */   }
/*    */   public Integer getItemQuantity() {
/* 28 */     return this.itemQuantity;
/*    */   }
/*    */   public Integer getPackageCount() {
/* 31 */     return this.packageCount;
/*    */   }
/*    */   public String getUomCode() {
/* 34 */     return this.uomCode;
/*    */   }
/*    */   public BigDecimal getWeight() {
/* 37 */     return this.weight;
/*    */   }
/*    */   public BigDecimal getVolume() {
/* 40 */     return this.volume;
/*    */   }
/*    */   public BigDecimal getVolumeWeight() {
/* 43 */     return this.volumeWeight;
/*    */   }
/*    */   public BigDecimal getUnitPrice() {
/* 46 */     return this.unitPrice;
/*    */   }
/*    */   public BigDecimal getDeclaredValue() {
/* 49 */     return this.declaredValue;
/*    */   }
/*    */   public String getFixStatusCode() {
/* 52 */     return this.fixStatusCode;
/*    */   }
/*    */   public String getProductionDate() {
/* 55 */     return this.productionDate;
/*    */   }
/*    */   public String getExpiryDate() {
/* 58 */     return this.expiryDate;
/*    */   }
/*    */   public String getLotAtt01() {
/* 61 */     return this.lotAtt01;
/*    */   }
/*    */   public String getLotAtt02() {
/* 64 */     return this.lotAtt02;
/*    */   }
/*    */   public String getLotAtt12() {
/* 67 */     return this.lotAtt12;
/*    */   }
/*    */   public String getProviderCode() {
/* 70 */     return this.providerCode;
/*    */   }
/*    */   public String getProviderFrom() {
/* 73 */     return this.providerFrom;
/*    */   }
/*    */   public String getProviderName() {
/* 76 */     return this.providerName;
/*    */   }
/*    */   public String getPackCode() {
/* 79 */     return this.packCode;
/*    */   }
/*    */   public String getPackageStandard() {
/* 82 */     return this.packageStandard;
/*    */   }
/*    */   public String getRemark() {
/* 85 */     return this.remark;
/*    */   }
/*    */   public Integer getDefectiveQuantity() {
/* 88 */     return this.defectiveQuantity;
/*    */   } public BigDecimal getAverageWeight() {
/* 90 */     return this.averageWeight;
/*    */   }
/*    */   public List<BatchVo> getBatchs() {
/* 93 */     return this.batchs;
/*    */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ItemVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */