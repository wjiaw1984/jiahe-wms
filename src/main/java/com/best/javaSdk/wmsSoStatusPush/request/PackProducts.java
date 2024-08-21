/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSoStatusPush.request;
/*    */ 
/*    */ import com.best.javaSdk.wmsSoStatusPush.request.PackProduct;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class PackProducts
/*    */ {
/*    */   private List<PackProduct> packProduct;
/*    */   
/*    */   public String toString() {
/* 12 */     return "PackProducts(packProduct=" + getPackProduct() + ")"; } public int hashCode() { int PRIME = 59; result = 1; Object<PackProduct> $packProduct = (Object<PackProduct>)getPackProduct(); return result * 59 + (($packProduct == null) ? 43 : $packProduct.hashCode()); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsSoStatusPush.request.PackProducts; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.request.PackProducts)) return false;  com.best.javaSdk.wmsSoStatusPush.request.PackProducts other = (com.best.javaSdk.wmsSoStatusPush.request.PackProducts)o; if (!other.canEqual(this)) return false;  Object<PackProduct> this$packProduct = (Object<PackProduct>)getPackProduct(), other$packProduct = (Object<PackProduct>)other.getPackProduct(); return !((this$packProduct == null) ? (other$packProduct != null) : !this$packProduct.equals(other$packProduct)); } public void setPackProduct(List<PackProduct> packProduct) { this.packProduct = packProduct; }
/*    */    public List<PackProduct> getPackProduct() {
/* 14 */     return this.packProduct;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\PackProducts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */