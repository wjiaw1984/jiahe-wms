 package com.best.javaSdk.wmsProcessStatusPush.request;
 public class Item { private String produceCode; private String batchCode; private String parentSkuCode; private String fixStatusCode;
   private double actualQty;
   private String productDate;
   
/*  6 */   public void setLotAtt01(String lotAtt01) { this.lotAtt01 = lotAtt01; } private String expireDate; private String lotAtt01; private String lotAtt02; private String lotAtt03; private String lotAtt04; private String lotAtt05; private String lotAtt06; public void setLotAtt02(String lotAtt02) { this.lotAtt02 = lotAtt02; } public void setLotAtt03(String lotAtt03) { this.lotAtt03 = lotAtt03; } public void setLotAtt04(String lotAtt04) { this.lotAtt04 = lotAtt04; } public void setLotAtt05(String lotAtt05) { this.lotAtt05 = lotAtt05; } public void setLotAtt06(String lotAtt06) { this.lotAtt06 = lotAtt06; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsProcessStatusPush.request.Item)) return false;  com.best.javaSdk.wmsProcessStatusPush.request.Item other = (com.best.javaSdk.wmsProcessStatusPush.request.Item)o; if (!other.canEqual(this)) return false;  Object this$produceCode = getProduceCode(), other$produceCode = other.getProduceCode(); if ((this$produceCode == null) ? (other$produceCode != null) : !this$produceCode.equals(other$produceCode)) return false;  Object this$batchCode = getBatchCode(), other$batchCode = other.getBatchCode(); if ((this$batchCode == null) ? (other$batchCode != null) : !this$batchCode.equals(other$batchCode)) return false;  Object this$parentSkuCode = getParentSkuCode(), other$parentSkuCode = other.getParentSkuCode(); if ((this$parentSkuCode == null) ? (other$parentSkuCode != null) : !this$parentSkuCode.equals(other$parentSkuCode)) return false;  Object this$fixStatusCode = getFixStatusCode(), other$fixStatusCode = other.getFixStatusCode(); if ((this$fixStatusCode == null) ? (other$fixStatusCode != null) : !this$fixStatusCode.equals(other$fixStatusCode)) return false;  if (Double.compare(getActualQty(), other.getActualQty()) != 0) return false;  Object this$productDate = getProductDate(), other$productDate = other.getProductDate(); if ((this$productDate == null) ? (other$productDate != null) : !this$productDate.equals(other$productDate)) return false;  Object this$expireDate = getExpireDate(), other$expireDate = other.getExpireDate(); if ((this$expireDate == null) ? (other$expireDate != null) : !this$expireDate.equals(other$expireDate)) return false;  Object this$lotAtt01 = getLotAtt01(), other$lotAtt01 = other.getLotAtt01(); if ((this$lotAtt01 == null) ? (other$lotAtt01 != null) : !this$lotAtt01.equals(other$lotAtt01)) return false;  Object this$lotAtt02 = getLotAtt02(), other$lotAtt02 = other.getLotAtt02(); if ((this$lotAtt02 == null) ? (other$lotAtt02 != null) : !this$lotAtt02.equals(other$lotAtt02)) return false;  Object this$lotAtt03 = getLotAtt03(), other$lotAtt03 = other.getLotAtt03(); if ((this$lotAtt03 == null) ? (other$lotAtt03 != null) : !this$lotAtt03.equals(other$lotAtt03)) return false;  Object this$lotAtt04 = getLotAtt04(), other$lotAtt04 = other.getLotAtt04(); if ((this$lotAtt04 == null) ? (other$lotAtt04 != null) : !this$lotAtt04.equals(other$lotAtt04)) return false;  Object this$lotAtt05 = getLotAtt05(), other$lotAtt05 = other.getLotAtt05(); if ((this$lotAtt05 == null) ? (other$lotAtt05 != null) : !this$lotAtt05.equals(other$lotAtt05)) return false;  Object this$lotAtt06 = getLotAtt06(), other$lotAtt06 = other.getLotAtt06(); return !((this$lotAtt06 == null) ? (other$lotAtt06 != null) : !this$lotAtt06.equals(other$lotAtt06)); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsProcessStatusPush.request.Item; } public int hashCode() { int PRIME = 59; result = 1; Object $produceCode = getProduceCode(); result = result * 59 + (($produceCode == null) ? 43 : $produceCode.hashCode()); Object $batchCode = getBatchCode(); result = result * 59 + (($batchCode == null) ? 43 : $batchCode.hashCode()); Object $parentSkuCode = getParentSkuCode(); result = result * 59 + (($parentSkuCode == null) ? 43 : $parentSkuCode.hashCode()); Object $fixStatusCode = getFixStatusCode(); result = result * 59 + (($fixStatusCode == null) ? 43 : $fixStatusCode.hashCode()); long $actualQty = Double.doubleToLongBits(getActualQty()); result = result * 59 + (int)($actualQty >>> 32L ^ $actualQty); Object $productDate = getProductDate(); result = result * 59 + (($productDate == null) ? 43 : $productDate.hashCode()); Object $expireDate = getExpireDate(); result = result * 59 + (($expireDate == null) ? 43 : $expireDate.hashCode()); Object $lotAtt01 = getLotAtt01(); result = result * 59 + (($lotAtt01 == null) ? 43 : $lotAtt01.hashCode()); Object $lotAtt02 = getLotAtt02(); result = result * 59 + (($lotAtt02 == null) ? 43 : $lotAtt02.hashCode()); Object $lotAtt03 = getLotAtt03(); result = result * 59 + (($lotAtt03 == null) ? 43 : $lotAtt03.hashCode()); Object $lotAtt04 = getLotAtt04(); result = result * 59 + (($lotAtt04 == null) ? 43 : $lotAtt04.hashCode()); Object $lotAtt05 = getLotAtt05(); result = result * 59 + (($lotAtt05 == null) ? 43 : $lotAtt05.hashCode()); Object $lotAtt06 = getLotAtt06(); return result * 59 + (($lotAtt06 == null) ? 43 : $lotAtt06.hashCode()); } public String toString() { return "Item(produceCode=" + getProduceCode() + ", batchCode=" + getBatchCode() + ", parentSkuCode=" + getParentSkuCode() + ", fixStatusCode=" + getFixStatusCode() + ", actualQty=" + getActualQty() + ", productDate=" + getProductDate() + ", expireDate=" + getExpireDate() + ", lotAtt01=" + getLotAtt01() + ", lotAtt02=" + getLotAtt02() + ", lotAtt03=" + getLotAtt03() + ", lotAtt04=" + getLotAtt04() + ", lotAtt05=" + getLotAtt05() + ", lotAtt06=" + getLotAtt06() + ")"; }
 
 
 
 
 
 
   
   public String getLotAtt01() {
/* 15 */     return this.lotAtt01;
/* 16 */   } public String getLotAtt02() { return this.lotAtt02; }
/* 17 */   public String getLotAtt03() { return this.lotAtt03; }
/* 18 */   public String getLotAtt04() { return this.lotAtt04; }
/* 19 */   public String getLotAtt05() { return this.lotAtt05; } public String getLotAtt06() {
/* 20 */     return this.lotAtt06;
   }
   
   public String getProduceCode() {
/* 24 */     return this.produceCode;
   }
 
   
   public void setProduceCode(String value) {
/* 29 */     this.produceCode = value;
   }
 
   
   public String getBatchCode() {
/* 34 */     return this.batchCode;
   }
 
   
   public void setBatchCode(String value) {
/* 39 */     this.batchCode = value;
   }
 
   
   public String getParentSkuCode() {
/* 44 */     return this.parentSkuCode;
   }
 
   
   public void setParentSkuCode(String value) {
/* 49 */     this.parentSkuCode = value;
   }
 
   
   public String getFixStatusCode() {
/* 54 */     return this.fixStatusCode;
   }
 
   
   public void setFixStatusCode(String value) {
/* 59 */     this.fixStatusCode = value;
   }
 
   
   public double getActualQty() {
/* 64 */     return this.actualQty;
   }
 
   
   public void setActualQty(double value) {
/* 69 */     this.actualQty = value;
   }
 
   
   public String getProductDate() {
/* 74 */     return this.productDate;
   }
 
   
   public void setProductDate(String value) {
/* 79 */     this.productDate = value;
   }
 
   
   public String getExpireDate() {
/* 84 */     return this.expireDate;
   }
 
   
   public void setExpireDate(String value) {
/* 89 */     this.expireDate = value;
   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsProcessStatusPush\request\Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */