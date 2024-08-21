
package cn.com.wms.model.wms.fr;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@TableName("FR_DPDY_Bak")
@Data
public class FrDpdyBak implements Serializable {
    private static final long serialVersionUID = 4641138903471874495L;
    private String sheetid;
    private String palletZone;
    private String customid;


    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.fr.FrDpdyBak)) return false;
        cn.com.wms.model.wms.fr.FrDpdyBak other = (cn.com.wms.model.wms.fr.FrDpdyBak) o;
        if (!other.canEqual(this)) return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone();
        if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone))
            return false;
        Object this$customid = getCustomid(), other$customid = other.getCustomid();
        if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;
        Object this$shopid = getShopid(), other$shopid = other.getShopid();
        if ((this$shopid == null) ? (other$shopid != null) : !this$shopid.equals(other$shopid)) return false;
        Object this$venderid = getVenderid(), other$venderid = other.getVenderid();
        if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;
        Object this$cost = getCost(), other$cost = other.getCost();
        if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost)) return false;
        Object this$sdate = getSdate(), other$sdate = other.getSdate();
        if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;
        Object this$moneyFlag = getMoneyFlag(), other$moneyFlag = other.getMoneyFlag();
        return !((this$moneyFlag == null) ? (other$moneyFlag != null) : !this$moneyFlag.equals(other$moneyFlag));
    }

    private String shopid;
    private String venderid;
    private BigDecimal cost;
    private Date sdate;
    private Integer moneyFlag;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.fr.FrDpdyBak;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $palletZone = getPalletZone();
        result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode());
        Object $customid = getCustomid();
        result = result * 59 + (($customid == null) ? 43 : $customid.hashCode());
        Object $shopid = getShopid();
        result = result * 59 + (($shopid == null) ? 43 : $shopid.hashCode());
        Object $venderid = getVenderid();
        result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode());
        Object $cost = getCost();
        result = result * 59 + (($cost == null) ? 43 : $cost.hashCode());
        Object $sdate = getSdate();
        result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode());
        Object $moneyFlag = getMoneyFlag();
        return result * 59 + (($moneyFlag == null) ? 43 : $moneyFlag.hashCode());
    }

    public String toString() {
        return "FrDpdyBak(sheetid=" + getSheetid() + ", palletZone=" + getPalletZone() + ", customid=" + getCustomid() + ", shopid=" + getShopid() + ", venderid=" + getVenderid() + ", cost=" + getCost() + ", sdate=" + getSdate() + ", moneyFlag=" + getMoneyFlag() + ")";
    }


    public String getSheetid() {
        /*  50 */
        return this.sheetid;

    }


    public void setSheetid(String sheetid) {
        /*  59 */
        this.sheetid = sheetid;

    }


    public String getPalletZone() {
        /*  68 */
        return this.palletZone;

    }


    public void setPalletZone(String palletZone) {
        /*  77 */
        this.palletZone = palletZone;

    }


    public String getCustomid() {
        /*  86 */
        return this.customid;

    }


    public void setCustomid(String customid) {
        /*  95 */
        this.customid = customid;

    }


    public String getShopid() {
        /* 104 */
        return this.shopid;

    }


    public void setShopid(String shopid) {
        /* 113 */
        this.shopid = shopid;

    }


    public String getVenderid() {
        /* 122 */
        return this.venderid;

    }


    public void setVenderid(String venderid) {
        /* 131 */
        this.venderid = venderid;

    }


    public BigDecimal getCost() {
        /* 140 */
        return this.cost;

    }


    public void setCost(BigDecimal cost) {
        /* 149 */
        this.cost = cost;

    }


    public Date getSdate() {
        /* 158 */
        return this.sdate;

    }


    public void setSdate(Date sdate) {
        /* 167 */
        this.sdate = sdate;

    }


    public Integer getMoneyFlag() {
        /* 176 */
        return this.moneyFlag;

    }


    public void setMoneyFlag(Integer moneyFlag) {
        /* 185 */
        this.moneyFlag = moneyFlag;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrDpdyBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */