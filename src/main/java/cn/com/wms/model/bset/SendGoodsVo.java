package cn.com.wms.model.bset;

import cn.com.wms.model.bset.Product;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SendGoodsVo
        implements Serializable {
    private String providerCode;
    private List<Product> products;

    public void setProviderCode(String providerCode) {
        /* 15 */
        this.providerCode = providerCode;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.SendGoodsVo;
    }


    public String toString() {
        return "SendGoodsVo(providerCode=" + getProviderCode() + ", products=" + getProducts() + ")";
    }


    /* 18 */
    public String getProviderCode() {
        return this.providerCode;
    }

    public List<Product> getProducts() {
        /* 19 */
        return this.products;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\SendGoodsVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */