 package cn.com.wms.model.bset;

 import cn.com.wms.model.bset.Product;
 import java.io.Serializable;
 import java.util.List;


 public class SendGoodsVo
   implements Serializable
 {
   private String providerCode;
   private List<Product> products;

   public void setProviderCode(String providerCode) {
/* 15 */     this.providerCode = providerCode; } public void setProducts(List<Product> products) { this.products = products; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.bset.SendGoodsVo)) return false;  cn.com.wms.model.bset.SendGoodsVo other = (cn.com.wms.model.bset.SendGoodsVo)o; if (!other.canEqual(this)) return false;  Object this$providerCode = getProviderCode(), other$providerCode = other.getProviderCode(); if ((this$providerCode == null) ? (other$providerCode != null) : !this$providerCode.equals(other$providerCode)) return false;  Object<Product> this$products = (Object<Product>)getProducts(), other$products = (Object<Product>)other.getProducts(); return !((this$products == null) ? (other$products != null) : !this$products.equals(other$products)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.bset.SendGoodsVo; } public int hashCode() { int PRIME = 59; result = 1; Object $providerCode = getProviderCode(); result = result * 59 + (($providerCode == null) ? 43 : $providerCode.hashCode()); Object<Product> $products = (Object<Product>)getProducts(); return result * 59 + (($products == null) ? 43 : $products.hashCode()); } public String toString() { return "SendGoodsVo(providerCode=" + getProviderCode() + ", products=" + getProducts() + ")"; }


/* 18 */   public String getProviderCode() { return this.providerCode; } public List<Product> getProducts() {
/* 19 */     return this.products;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\SendGoodsVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */