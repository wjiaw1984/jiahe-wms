/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSoStatusPush.request;
/*    */ public class PackProduct {
/*    */   private String packCode;
/*    */   private String packSkuCode;
/*    */   private String packProviderCode;
/*    */   private int packQuantity;
/*    */   private int packDecimalQty;
/*    */   
/*  9 */   public void setPackCode(String packCode) { this.packCode = packCode; } public void setPackSkuCode(String packSkuCode) { this.packSkuCode = packSkuCode; } public void setPackProviderCode(String packProviderCode) { this.packProviderCode = packProviderCode; } public void setPackQuantity(int packQuantity) { this.packQuantity = packQuantity; } public void setPackDecimalQty(int packDecimalQty) { this.packDecimalQty = packDecimalQty; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.request.PackProduct)) return false;  com.best.javaSdk.wmsSoStatusPush.request.PackProduct other = (com.best.javaSdk.wmsSoStatusPush.request.PackProduct)o; if (!other.canEqual(this)) return false;  Object this$packCode = getPackCode(), other$packCode = other.getPackCode(); if ((this$packCode == null) ? (other$packCode != null) : !this$packCode.equals(other$packCode)) return false;  Object this$packSkuCode = getPackSkuCode(), other$packSkuCode = other.getPackSkuCode(); if ((this$packSkuCode == null) ? (other$packSkuCode != null) : !this$packSkuCode.equals(other$packSkuCode)) return false;  Object this$packProviderCode = getPackProviderCode(), other$packProviderCode = other.getPackProviderCode(); return ((this$packProviderCode == null) ? (other$packProviderCode != null) : !this$packProviderCode.equals(other$packProviderCode)) ? false : ((getPackQuantity() != other.getPackQuantity()) ? false : (!(getPackDecimalQty() != other.getPackDecimalQty()))); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsSoStatusPush.request.PackProduct; } public int hashCode() { int PRIME = 59; result = 1; Object $packCode = getPackCode(); result = result * 59 + (($packCode == null) ? 43 : $packCode.hashCode()); Object $packSkuCode = getPackSkuCode(); result = result * 59 + (($packSkuCode == null) ? 43 : $packSkuCode.hashCode()); Object $packProviderCode = getPackProviderCode(); result = result * 59 + (($packProviderCode == null) ? 43 : $packProviderCode.hashCode()); result = result * 59 + getPackQuantity(); return result * 59 + getPackDecimalQty(); } public String toString() { return "PackProduct(packCode=" + getPackCode() + ", packSkuCode=" + getPackSkuCode() + ", packProviderCode=" + getPackProviderCode() + ", packQuantity=" + getPackQuantity() + ", packDecimalQty=" + getPackDecimalQty() + ")"; }
/*    */    public String getPackCode() {
/* 11 */     return this.packCode;
/*    */   } public String getPackSkuCode() {
/* 13 */     return this.packSkuCode;
/*    */   } public String getPackProviderCode() {
/* 15 */     return this.packProviderCode;
/*    */   } public int getPackQuantity() {
/* 17 */     return this.packQuantity;
/*    */   } public int getPackDecimalQty() {
/* 19 */     return this.packDecimalQty;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\PackProduct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */