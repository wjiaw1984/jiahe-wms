/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSoStatusPush.request;
/*    */ 
/*    */ public class Batch {
/*    */   private String fixStatusCode;
/*    */   private Date productionDate;
/*    */   private Date expiryDate;
/*    */   private Integer quantity;
/*    */   private String packCode;
/*    */   private Integer decimalQuantity;
/*    */   
/* 11 */   public void setFixStatusCode(String fixStatusCode) { this.fixStatusCode = fixStatusCode; } public void setProductionDate(Date productionDate) { this.productionDate = productionDate; } public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; } public void setQuantity(Integer quantity) { this.quantity = quantity; } public void setPackCode(String packCode) { this.packCode = packCode; } public void setDecimalQuantity(Integer decimalQuantity) { this.decimalQuantity = decimalQuantity; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.request.Batch)) return false;  com.best.javaSdk.wmsSoStatusPush.request.Batch other = (com.best.javaSdk.wmsSoStatusPush.request.Batch)o; if (!other.canEqual(this)) return false;  Object this$fixStatusCode = getFixStatusCode(), other$fixStatusCode = other.getFixStatusCode(); if ((this$fixStatusCode == null) ? (other$fixStatusCode != null) : !this$fixStatusCode.equals(other$fixStatusCode)) return false;  Object this$productionDate = getProductionDate(), other$productionDate = other.getProductionDate(); if ((this$productionDate == null) ? (other$productionDate != null) : !this$productionDate.equals(other$productionDate)) return false;  Object this$expiryDate = getExpiryDate(), other$expiryDate = other.getExpiryDate(); if ((this$expiryDate == null) ? (other$expiryDate != null) : !this$expiryDate.equals(other$expiryDate)) return false;  Object this$quantity = getQuantity(), other$quantity = other.getQuantity(); if ((this$quantity == null) ? (other$quantity != null) : !this$quantity.equals(other$quantity)) return false;  Object this$packCode = getPackCode(), other$packCode = other.getPackCode(); if ((this$packCode == null) ? (other$packCode != null) : !this$packCode.equals(other$packCode)) return false;  Object this$decimalQuantity = getDecimalQuantity(), other$decimalQuantity = other.getDecimalQuantity(); return !((this$decimalQuantity == null) ? (other$decimalQuantity != null) : !this$decimalQuantity.equals(other$decimalQuantity)); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsSoStatusPush.request.Batch; } public int hashCode() { int PRIME = 59; result = 1; Object $fixStatusCode = getFixStatusCode(); result = result * 59 + (($fixStatusCode == null) ? 43 : $fixStatusCode.hashCode()); Object $productionDate = getProductionDate(); result = result * 59 + (($productionDate == null) ? 43 : $productionDate.hashCode()); Object $expiryDate = getExpiryDate(); result = result * 59 + (($expiryDate == null) ? 43 : $expiryDate.hashCode()); Object $quantity = getQuantity(); result = result * 59 + (($quantity == null) ? 43 : $quantity.hashCode()); Object $packCode = getPackCode(); result = result * 59 + (($packCode == null) ? 43 : $packCode.hashCode()); Object $decimalQuantity = getDecimalQuantity(); return result * 59 + (($decimalQuantity == null) ? 43 : $decimalQuantity.hashCode()); } public String toString() { return "Batch(fixStatusCode=" + getFixStatusCode() + ", productionDate=" + getProductionDate() + ", expiryDate=" + getExpiryDate() + ", quantity=" + getQuantity() + ", packCode=" + getPackCode() + ", decimalQuantity=" + getDecimalQuantity() + ")"; }
/*    */    public String getFixStatusCode() {
/* 13 */     return this.fixStatusCode;
/*    */   } public Date getProductionDate() {
/* 15 */     return this.productionDate;
/*    */   } public Date getExpiryDate() {
/* 17 */     return this.expiryDate;
/*    */   } public Integer getQuantity() {
/* 19 */     return this.quantity;
/*    */   } public String getPackCode() {
/* 21 */     return this.packCode;
/*    */   } public Integer getDecimalQuantity() {
/* 23 */     return this.decimalQuantity;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\Batch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */