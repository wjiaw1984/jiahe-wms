/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSoStatusPush.request;
/*    */ 
/*    */ import com.best.javaSdk.wmsSoStatusPush.request.Product;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class Products
/*    */ {
/*    */   private List<Product> product;
/*    */   
/*    */   public String toString() {
/* 12 */     return "Products(product=" + getProduct() + ")"; } public int hashCode() { int PRIME = 59; result = 1; Object<Product> $product = (Object<Product>)getProduct(); return result * 59 + (($product == null) ? 43 : $product.hashCode()); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsSoStatusPush.request.Products; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.request.Products)) return false;  com.best.javaSdk.wmsSoStatusPush.request.Products other = (com.best.javaSdk.wmsSoStatusPush.request.Products)o; if (!other.canEqual(this)) return false;  Object<Product> this$product = (Object<Product>)getProduct(), other$product = (Object<Product>)other.getProduct(); return !((this$product == null) ? (other$product != null) : !this$product.equals(other$product)); } public void setProduct(List<Product> product) { this.product = product; }
/*    */    public List<Product> getProduct() {
/* 14 */     return this.product;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\Products.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */