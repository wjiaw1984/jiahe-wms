/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsAsnStatusPush.request;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ public class Batch {
/*    */   private String fixStatusCode;
/*    */   private Date productionDate;
/*    */   private List<String> packCode;
/*    */   private String uomCode;
/*    */   private String quantity;
/*    */   private String decimalQuantity;
/*    */   
/* 13 */   public void setFixStatusCode(String fixStatusCode) { this.fixStatusCode = fixStatusCode; } public void setProductionDate(Date productionDate) { this.productionDate = productionDate; } public void setPackCode(List<String> packCode) { this.packCode = packCode; } public void setUomCode(String uomCode) { this.uomCode = uomCode; } public void setQuantity(String quantity) { this.quantity = quantity; } public void setDecimalQuantity(String decimalQuantity) { this.decimalQuantity = decimalQuantity; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsAsnStatusPush.request.Batch)) return false;  com.best.javaSdk.wmsAsnStatusPush.request.Batch other = (com.best.javaSdk.wmsAsnStatusPush.request.Batch)o; if (!other.canEqual(this)) return false;  Object this$fixStatusCode = getFixStatusCode(), other$fixStatusCode = other.getFixStatusCode(); if ((this$fixStatusCode == null) ? (other$fixStatusCode != null) : !this$fixStatusCode.equals(other$fixStatusCode)) return false;  Object this$productionDate = getProductionDate(), other$productionDate = other.getProductionDate(); if ((this$productionDate == null) ? (other$productionDate != null) : !this$productionDate.equals(other$productionDate)) return false;  Object<String> this$packCode = (Object<String>)getPackCode(), other$packCode = (Object<String>)other.getPackCode(); if ((this$packCode == null) ? (other$packCode != null) : !this$packCode.equals(other$packCode)) return false;  Object this$uomCode = getUomCode(), other$uomCode = other.getUomCode(); if ((this$uomCode == null) ? (other$uomCode != null) : !this$uomCode.equals(other$uomCode)) return false;  Object this$quantity = getQuantity(), other$quantity = other.getQuantity(); if ((this$quantity == null) ? (other$quantity != null) : !this$quantity.equals(other$quantity)) return false;  Object this$decimalQuantity = getDecimalQuantity(), other$decimalQuantity = other.getDecimalQuantity(); return !((this$decimalQuantity == null) ? (other$decimalQuantity != null) : !this$decimalQuantity.equals(other$decimalQuantity)); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsAsnStatusPush.request.Batch; } public int hashCode() { int PRIME = 59; result = 1; Object $fixStatusCode = getFixStatusCode(); result = result * 59 + (($fixStatusCode == null) ? 43 : $fixStatusCode.hashCode()); Object $productionDate = getProductionDate(); result = result * 59 + (($productionDate == null) ? 43 : $productionDate.hashCode()); Object<String> $packCode = (Object<String>)getPackCode(); result = result * 59 + (($packCode == null) ? 43 : $packCode.hashCode()); Object $uomCode = getUomCode(); result = result * 59 + (($uomCode == null) ? 43 : $uomCode.hashCode()); Object $quantity = getQuantity(); result = result * 59 + (($quantity == null) ? 43 : $quantity.hashCode()); Object $decimalQuantity = getDecimalQuantity(); return result * 59 + (($decimalQuantity == null) ? 43 : $decimalQuantity.hashCode()); } public String toString() { return "Batch(fixStatusCode=" + getFixStatusCode() + ", productionDate=" + getProductionDate() + ", packCode=" + getPackCode() + ", uomCode=" + getUomCode() + ", quantity=" + getQuantity() + ", decimalQuantity=" + getDecimalQuantity() + ")"; }
/*    */    public String getFixStatusCode() {
/* 15 */     return this.fixStatusCode;
/*    */   } public Date getProductionDate() {
/* 17 */     return this.productionDate;
/*    */   } public List<String> getPackCode() {
/* 19 */     return this.packCode;
/*    */   } public String getUomCode() {
/* 21 */     return this.uomCode;
/*    */   } public String getQuantity() {
/* 23 */     return this.quantity;
/*    */   } public String getDecimalQuantity() {
/* 25 */     return this.decimalQuantity;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsAsnStatusPush\request\Batch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */