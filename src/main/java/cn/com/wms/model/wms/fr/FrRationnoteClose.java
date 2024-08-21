
package cn.com.wms.model.wms.fr;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;


@TableName("FR_Rationnote_Close")
@Data
public class FrRationnoteClose implements Serializable {
    private static final long serialVersionUID = -9189521244944391460L;
    private Integer freshflag;
    private String sheetid;
    private String customid;
    private String palletZone;


    /*   8 */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.fr.FrRationnoteClose)) return false;
        cn.com.wms.model.wms.fr.FrRationnoteClose other = (cn.com.wms.model.wms.fr.FrRationnoteClose) o;
        if (!other.canEqual(this)) return false;
        Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag();
        if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag))
            return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$customid = getCustomid(), other$customid = other.getCustomid();
        if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;
        Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone();
        if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone))
            return false;
        Object this$shopid = getShopid(), other$shopid = other.getShopid();
        if ((this$shopid == null) ? (other$shopid != null) : !this$shopid.equals(other$shopid)) return false;
        Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid();
        if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;
        Object this$planQty = getPlanQty(), other$planQty = other.getPlanQty();
        if ((this$planQty == null) ? (other$planQty != null) : !this$planQty.equals(other$planQty)) return false;
        Object this$realQty = getRealQty(), other$realQty = other.getRealQty();
        if ((this$realQty == null) ? (other$realQty != null) : !this$realQty.equals(other$realQty)) return false;
        Object this$badQty = getBadQty(), other$badQty = other.getBadQty();
        return !((this$badQty == null) ? (other$badQty != null) : !this$badQty.equals(other$badQty));
    }

    private String shopid;
    private String goodsid;
    private BigDecimal planQty;
    private BigDecimal realQty;
    private BigDecimal badQty;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.fr.FrRationnoteClose;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $freshflag = getFreshflag();
        result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode());
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $customid = getCustomid();
        result = result * 59 + (($customid == null) ? 43 : $customid.hashCode());
        Object $palletZone = getPalletZone();
        result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode());
        Object $shopid = getShopid();
        result = result * 59 + (($shopid == null) ? 43 : $shopid.hashCode());
        Object $goodsid = getGoodsid();
        result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode());
        Object $planQty = getPlanQty();
        result = result * 59 + (($planQty == null) ? 43 : $planQty.hashCode());
        Object $realQty = getRealQty();
        result = result * 59 + (($realQty == null) ? 43 : $realQty.hashCode());
        Object $badQty = getBadQty();
        return result * 59 + (($badQty == null) ? 43 : $badQty.hashCode());
    }

    public String toString() {
        return "FrRationnoteClose(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", palletZone=" + getPalletZone() + ", shopid=" + getShopid() + ", goodsid=" + getGoodsid() + ", planQty=" + getPlanQty() + ", realQty=" + getRealQty() + ", badQty=" + getBadQty() + ")";
    }


    public Integer getFreshflag() {
        /*  52 */
        return this.freshflag;

    }


    public void setFreshflag(Integer freshflag) {
        /*  61 */
        this.freshflag = freshflag;

    }


    public String getSheetid() {
        /*  70 */
        return this.sheetid;

    }


    public void setSheetid(String sheetid) {
        /*  79 */
        this.sheetid = sheetid;

    }


    public String getCustomid() {
        /*  88 */
        return this.customid;

    }


    public void setCustomid(String customid) {
        /*  97 */
        this.customid = customid;

    }


    public String getPalletZone() {
        /* 106 */
        return this.palletZone;

    }


    public void setPalletZone(String palletZone) {
        /* 115 */
        this.palletZone = palletZone;

    }


    public String getShopid() {
        /* 124 */
        return this.shopid;

    }


    public void setShopid(String shopid) {
        /* 133 */
        this.shopid = shopid;

    }


    public String getGoodsid() {
        /* 142 */
        return this.goodsid;

    }


    public void setGoodsid(String goodsid) {
        /* 151 */
        this.goodsid = goodsid;

    }


    public BigDecimal getPlanQty() {
        /* 160 */
        return this.planQty;

    }


    public void setPlanQty(BigDecimal planQty) {
        /* 169 */
        this.planQty = planQty;

    }


    public BigDecimal getRealQty() {
        /* 178 */
        return this.realQty;

    }


    public void setRealQty(BigDecimal realQty) {
        /* 187 */
        this.realQty = realQty;

    }


    public BigDecimal getBadQty() {
        /* 196 */
        return this.badQty;

    }


    public void setBadQty(BigDecimal badQty) {
        /* 205 */
        this.badQty = badQty;

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrRationnoteClose.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */