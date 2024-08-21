 package com.best.javaSdk.wmsSkuNotify.request;
 
 import cn.com.wms.model.wms.sdwms.SdwmsGoods;
 import com.best.javaSdk.wmsSkuNotify.request.Product;
 import java.util.ArrayList;
 import java.util.List;
 import org.springframework.util.CollectionUtils;
 
 
 
 public class Products
 {
   private List<Product> product;
   
   public List<Product> getProduct() {
/* 16 */     return this.product;
   }
 
   
   public void setProduct(List<Product> value) {
/* 21 */     this.product = value;
   }
   
   public static com.best.javaSdk.wmsSkuNotify.request.Products build(List<SdwmsGoods> goodsList) {
/* 25 */     com.best.javaSdk.wmsSkuNotify.request.Products result = new com.best.javaSdk.wmsSkuNotify.request.Products();
/* 26 */     result.setProduct(new ArrayList<>());
/* 27 */     if (CollectionUtils.isEmpty(goodsList)) {
/* 28 */       return result;
     }
     
/* 31 */     for (SdwmsGoods goods : goodsList) {
/* 32 */       result.getProduct().add(Product.build(goods));
     }
/* 34 */     return result;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSkuNotify\request\Products.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */