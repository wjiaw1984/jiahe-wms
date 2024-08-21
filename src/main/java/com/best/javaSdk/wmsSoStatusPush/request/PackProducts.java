
package com.best.javaSdk.wmsSoStatusPush.request;


import com.best.javaSdk.wmsSoStatusPush.request.PackProduct;
import lombok.Data;
 import java.util.List;

@Data
public class PackProducts {
    private List<PackProduct> packProduct;


    public String toString() {
        return "PackProducts(packProduct=" + getPackProduct() + ")";
    }


    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsSoStatusPush.request.PackProducts;
    }


    public void setPackProduct(List<PackProduct> packProduct) {
        this.packProduct = packProduct;
    }

    public List<PackProduct> getPackProduct() {
        return this.packProduct;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\PackProducts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */