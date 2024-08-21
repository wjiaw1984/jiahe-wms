/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSoStatusPush.request;
/*    */ public class Product {
/*    */   private String itemSkuCode;
/*    */   private BigDecimal itemQuantity;
/*    */   private BigDecimal normalQuantity;
/*    */   private BigDecimal defectiveQuantity;
/*    */   private BigDecimal decimalNormalQty;
/*    */   private BigDecimal decimalDefectiveQty;
/*    */   private int averageWeight;
/*    */   
/* 11 */   public void setItemSkuCode(String itemSkuCode) { this.itemSkuCode = itemSkuCode; } private String barCode; private String skuUdf1; private String Udf1; private BigDecimal weight; private BigDecimal grossWeight; private int lineNo; private Batchs batchs; public void setItemQuantity(BigDecimal itemQuantity) { this.itemQuantity = itemQuantity; } public void setNormalQuantity(BigDecimal normalQuantity) { this.normalQuantity = normalQuantity; } public void setDefectiveQuantity(BigDecimal defectiveQuantity) { this.defectiveQuantity = defectiveQuantity; } public void setDecimalNormalQty(BigDecimal decimalNormalQty) { this.decimalNormalQty = decimalNormalQty; } public void setDecimalDefectiveQty(BigDecimal decimalDefectiveQty) { this.decimalDefectiveQty = decimalDefectiveQty; } public void setAverageWeight(int averageWeight) { this.averageWeight = averageWeight; } public void setBarCode(String barCode) { this.barCode = barCode; } public void setSkuUdf1(String skuUdf1) { this.skuUdf1 = skuUdf1; } public void setUdf1(String Udf1) { this.Udf1 = Udf1; } public void setWeight(BigDecimal weight) { this.weight = weight; } public void setGrossWeight(BigDecimal grossWeight) { this.grossWeight = grossWeight; } public void setLineNo(int lineNo) { this.lineNo = lineNo; } public void setBatchs(Batchs batchs) { this.batchs = batchs; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.request.Product)) return false;  com.best.javaSdk.wmsSoStatusPush.request.Product other = (com.best.javaSdk.wmsSoStatusPush.request.Product)o; if (!other.canEqual(this)) return false;  Object this$itemSkuCode = getItemSkuCode(), other$itemSkuCode = other.getItemSkuCode(); if ((this$itemSkuCode == null) ? (other$itemSkuCode != null) : !this$itemSkuCode.equals(other$itemSkuCode)) return false;  Object this$itemQuantity = getItemQuantity(), other$itemQuantity = other.getItemQuantity(); if ((this$itemQuantity == null) ? (other$itemQuantity != null) : !this$itemQuantity.equals(other$itemQuantity)) return false;  Object this$normalQuantity = getNormalQuantity(), other$normalQuantity = other.getNormalQuantity(); if ((this$normalQuantity == null) ? (other$normalQuantity != null) : !this$normalQuantity.equals(other$normalQuantity)) return false;  Object this$defectiveQuantity = getDefectiveQuantity(), other$defectiveQuantity = other.getDefectiveQuantity(); if ((this$defectiveQuantity == null) ? (other$defectiveQuantity != null) : !this$defectiveQuantity.equals(other$defectiveQuantity)) return false;  Object this$decimalNormalQty = getDecimalNormalQty(), other$decimalNormalQty = other.getDecimalNormalQty(); if ((this$decimalNormalQty == null) ? (other$decimalNormalQty != null) : !this$decimalNormalQty.equals(other$decimalNormalQty)) return false;  Object this$decimalDefectiveQty = getDecimalDefectiveQty(), other$decimalDefectiveQty = other.getDecimalDefectiveQty(); if ((this$decimalDefectiveQty == null) ? (other$decimalDefectiveQty != null) : !this$decimalDefectiveQty.equals(other$decimalDefectiveQty)) return false;  if (getAverageWeight() != other.getAverageWeight()) return false;  Object this$barCode = getBarCode(), other$barCode = other.getBarCode(); if ((this$barCode == null) ? (other$barCode != null) : !this$barCode.equals(other$barCode)) return false;  Object this$skuUdf1 = getSkuUdf1(), other$skuUdf1 = other.getSkuUdf1(); if ((this$skuUdf1 == null) ? (other$skuUdf1 != null) : !this$skuUdf1.equals(other$skuUdf1)) return false;  Object this$Udf1 = getUdf1(), other$Udf1 = other.getUdf1(); if ((this$Udf1 == null) ? (other$Udf1 != null) : !this$Udf1.equals(other$Udf1)) return false;  Object this$weight = getWeight(), other$weight = other.getWeight(); if ((this$weight == null) ? (other$weight != null) : !this$weight.equals(other$weight)) return false;  Object this$grossWeight = getGrossWeight(), other$grossWeight = other.getGrossWeight(); if ((this$grossWeight == null) ? (other$grossWeight != null) : !this$grossWeight.equals(other$grossWeight)) return false;  if (getLineNo() != other.getLineNo()) return false;  Object this$batchs = getBatchs(), other$batchs = other.getBatchs(); return !((this$batchs == null) ? (other$batchs != null) : !this$batchs.equals(other$batchs)); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsSoStatusPush.request.Product; } public int hashCode() { int PRIME = 59; result = 1; Object $itemSkuCode = getItemSkuCode(); result = result * 59 + (($itemSkuCode == null) ? 43 : $itemSkuCode.hashCode()); Object $itemQuantity = getItemQuantity(); result = result * 59 + (($itemQuantity == null) ? 43 : $itemQuantity.hashCode()); Object $normalQuantity = getNormalQuantity(); result = result * 59 + (($normalQuantity == null) ? 43 : $normalQuantity.hashCode()); Object $defectiveQuantity = getDefectiveQuantity(); result = result * 59 + (($defectiveQuantity == null) ? 43 : $defectiveQuantity.hashCode()); Object $decimalNormalQty = getDecimalNormalQty(); result = result * 59 + (($decimalNormalQty == null) ? 43 : $decimalNormalQty.hashCode()); Object $decimalDefectiveQty = getDecimalDefectiveQty(); result = result * 59 + (($decimalDefectiveQty == null) ? 43 : $decimalDefectiveQty.hashCode()); result = result * 59 + getAverageWeight(); Object $barCode = getBarCode(); result = result * 59 + (($barCode == null) ? 43 : $barCode.hashCode()); Object $skuUdf1 = getSkuUdf1(); result = result * 59 + (($skuUdf1 == null) ? 43 : $skuUdf1.hashCode()); Object $Udf1 = getUdf1(); result = result * 59 + (($Udf1 == null) ? 43 : $Udf1.hashCode()); Object $weight = getWeight(); result = result * 59 + (($weight == null) ? 43 : $weight.hashCode()); Object $grossWeight = getGrossWeight(); result = result * 59 + (($grossWeight == null) ? 43 : $grossWeight.hashCode()); result = result * 59 + getLineNo(); Object $batchs = getBatchs(); return result * 59 + (($batchs == null) ? 43 : $batchs.hashCode()); } public String toString() { return "Product(itemSkuCode=" + getItemSkuCode() + ", itemQuantity=" + getItemQuantity() + ", normalQuantity=" + getNormalQuantity() + ", defectiveQuantity=" + getDefectiveQuantity() + ", decimalNormalQty=" + getDecimalNormalQty() + ", decimalDefectiveQty=" + getDecimalDefectiveQty() + ", averageWeight=" + getAverageWeight() + ", barCode=" + getBarCode() + ", skuUdf1=" + getSkuUdf1() + ", Udf1=" + getUdf1() + ", weight=" + getWeight() + ", grossWeight=" + getGrossWeight() + ", lineNo=" + getLineNo() + ", batchs=" + getBatchs() + ")"; }
/*    */    public String getItemSkuCode() {
/* 13 */     return this.itemSkuCode;
/*    */   }
/*    */   public BigDecimal getItemQuantity() {
/* 16 */     return this.itemQuantity;
/*    */   }
/*    */   public BigDecimal getNormalQuantity() {
/* 19 */     return this.normalQuantity;
/*    */   }
/*    */   public BigDecimal getDefectiveQuantity() {
/* 22 */     return this.defectiveQuantity;
/*    */   } public BigDecimal getDecimalNormalQty() {
/* 24 */     return this.decimalNormalQty;
/*    */   } public BigDecimal getDecimalDefectiveQty() {
/* 26 */     return this.decimalDefectiveQty;
/*    */   } public int getAverageWeight() {
/* 28 */     return this.averageWeight;
/*    */   } public String getBarCode() {
/* 30 */     return this.barCode;
/*    */   } public String getSkuUdf1() {
/* 32 */     return this.skuUdf1;
/*    */   } public String getUdf1() {
/* 34 */     return this.Udf1;
/*    */   } public BigDecimal getWeight() {
/* 36 */     return this.weight;
/*    */   } public BigDecimal getGrossWeight() {
/* 38 */     return this.grossWeight;
/*    */   } public int getLineNo() {
/* 40 */     return this.lineNo;
/*    */   } public Batchs getBatchs() {
/* 42 */     return this.batchs;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\Product.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */