
package com.best.javaSdk.wmsSoStatusPush.request;



import com.best.javaSdk.wmsSoStatusPush.request.Product;
import lombok.Data;
 import java.util.List;

@Data
public class Products {
    private List<Product> product;

    public String toString() {
        /* 12 */
        return "Products(product=" + getProduct() + ")";
    }


    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsSoStatusPush.request.Products;
    }


    public void setProduct(List<Product> product) {
        this.product = product;
    }

    
    public List<Product> getProduct() {
        /* 14 */
        return this.product;
        
    }
    
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\Products.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */