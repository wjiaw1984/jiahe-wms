
package cn.com.wms.model.wms.sdwms;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@TableName("SDwms_ShopPrice")
public class SdwmsShopprice implements Serializable {
    private static final long serialVersionUID = -3031234092023577073L;
    private String sheetid;
    private String customid;
    private String goodsid;


    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsShopprice)) return false;
        cn.com.wms.model.wms.sdwms.SdwmsShopprice other = (cn.com.wms.model.wms.sdwms.SdwmsShopprice) o;
        if (!other.canEqual(this)) return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$customid = getCustomid(), other$customid = other.getCustomid();
        if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;
        Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid();
        if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;
        Object this$shopid = getShopid(), other$shopid = other.getShopid();
        if ((this$shopid == null) ? (other$shopid != null) : !this$shopid.equals(other$shopid)) return false;
        Object this$price = getPrice(), other$price = other.getPrice();
        if ((this$price == null) ? (other$price != null) : !this$price.equals(other$price)) return false;
        Object this$eftdate = getEftdate(), other$eftdate = other.getEftdate();
        if ((this$eftdate == null) ? (other$eftdate != null) : !this$eftdate.equals(other$eftdate)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
    }

    private String shopid;
    private BigDecimal price;
    private Date eftdate;
    private Integer status;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.sdwms.SdwmsShopprice;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $customid = getCustomid();
        result = result * 59 + (($customid == null) ? 43 : $customid.hashCode());
        Object $goodsid = getGoodsid();
        result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode());
        Object $shopid = getShopid();
        result = result * 59 + (($shopid == null) ? 43 : $shopid.hashCode());
        Object $price = getPrice();
        result = result * 59 + (($price == null) ? 43 : $price.hashCode());
        Object $eftdate = getEftdate();
        result = result * 59 + (($eftdate == null) ? 43 : $eftdate.hashCode());
        Object $status = getStatus();
        return result * 59 + (($status == null) ? 43 : $status.hashCode());
    }

    public String toString() {
        return "SdwmsShopprice(sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", goodsid=" + getGoodsid() + ", shopid=" + getShopid() + ", price=" + getPrice() + ", eftdate=" + getEftdate() + ", status=" + getStatus() + ")";
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getSheetid() {
        /*  47 */
        return this.sheetid;
        
    }

    
    
    
    
    
    
    
    public void setSheetid(String sheetid) {
        /*  56 */
        this.sheetid = sheetid;
        
    }

    
    
    
    
    
    
    
    public String getCustomid() {
        /*  65 */
        return this.customid;
        
    }

    
    
    
    
    
    
    
    public void setCustomid(String customid) {
        /*  74 */
        this.customid = customid;
        
    }

    
    
    
    
    
    
    
    public String getGoodsid() {
        /*  83 */
        return this.goodsid;
        
    }

    
    
    
    
    
    
    
    public void setGoodsid(String goodsid) {
        /*  92 */
        this.goodsid = goodsid;
        
    }

    
    
    
    
    
    
    
    public String getShopid() {
        /* 101 */
        return this.shopid;
        
    }

    
    
    
    
    
    
    
    public void setShopid(String shopid) {
        /* 110 */
        this.shopid = shopid;
        
    }

    
    
    
    
    
    
    
    public BigDecimal getPrice() {
        /* 119 */
        return this.price;
        
    }

    
    
    
    
    
    
    
    public void setPrice(BigDecimal price) {
        /* 128 */
        this.price = price;
        
    }

    
    
    
    
    
    
    
    public Date getEftdate() {
        /* 137 */
        return this.eftdate;
        
    }

    
    
    
    
    
    
    
    public void setEftdate(Date eftdate) {
        /* 146 */
        this.eftdate = eftdate;
        
    }

    
    
    
    
    
    
    
    public Integer getStatus() {
        /* 155 */
        return this.status;
        
    }

    
    
    
    
    
    
    
    public void setStatus(Integer status) {
        /* 164 */
        this.status = status;
        
    }
    
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsShopprice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */