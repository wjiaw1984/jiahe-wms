
package cn.com.wms.model.wms.fr;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@TableName("FR_RationNote_BAK")
@Data
public class FrRationnoteBak implements Serializable {
    private static final long serialVersionUID = 2693341852373718111L;
    private Integer freshflag;
    private String sheetid;
    private String refSheetid;
    private String shopid;
    private String goodsid;


    /*   9 */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.fr.FrRationnoteBak)) return false;
        cn.com.wms.model.wms.fr.FrRationnoteBak other = (cn.com.wms.model.wms.fr.FrRationnoteBak) o;
        if (!other.canEqual(this)) return false;
        Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag();
        if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag))
            return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$refSheetid = getRefSheetid(), other$refSheetid = other.getRefSheetid();
        if ((this$refSheetid == null) ? (other$refSheetid != null) : !this$refSheetid.equals(other$refSheetid))
            return false;
        Object this$shopid = getShopid(), other$shopid = other.getShopid();
        if ((this$shopid == null) ? (other$shopid != null) : !this$shopid.equals(other$shopid)) return false;
        Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid();
        if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;
        Object this$venderid = getVenderid(), other$venderid = other.getVenderid();
        if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;
        Object this$lotno = getLotno(), other$lotno = other.getLotno();
        if ((this$lotno == null) ? (other$lotno != null) : !this$lotno.equals(other$lotno)) return false;
        Object this$realqty = getRealqty(), other$realqty = other.getRealqty();
        if ((this$realqty == null) ? (other$realqty != null) : !this$realqty.equals(other$realqty)) return false;
        Object this$badQty = getBadQty(), other$badQty = other.getBadQty();
        if ((this$badQty == null) ? (other$badQty != null) : !this$badQty.equals(other$badQty)) return false;
        Object this$sdate = getSdate(), other$sdate = other.getSdate();
        if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;
        Object this$operator = getOperator(), other$operator = other.getOperator();
        return !((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator));
    }

    private String venderid;
    private Integer lotno;
    private BigDecimal realqty;
    private BigDecimal badQty;
    private Date sdate;
    private String operator;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.fr.FrRationnoteBak;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $freshflag = getFreshflag();
        result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode());
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $refSheetid = getRefSheetid();
        result = result * 59 + (($refSheetid == null) ? 43 : $refSheetid.hashCode());
        Object $shopid = getShopid();
        result = result * 59 + (($shopid == null) ? 43 : $shopid.hashCode());
        Object $goodsid = getGoodsid();
        result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode());
        Object $venderid = getVenderid();
        result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode());
        Object $lotno = getLotno();
        result = result * 59 + (($lotno == null) ? 43 : $lotno.hashCode());
        Object $realqty = getRealqty();
        result = result * 59 + (($realqty == null) ? 43 : $realqty.hashCode());
        Object $badQty = getBadQty();
        result = result * 59 + (($badQty == null) ? 43 : $badQty.hashCode());
        Object $sdate = getSdate();
        result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode());
        Object $operator = getOperator();
        return result * 59 + (($operator == null) ? 43 : $operator.hashCode());
    }

    public String toString() {
        return "FrRationnoteBak(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", refSheetid=" + getRefSheetid() + ", shopid=" + getShopid() + ", goodsid=" + getGoodsid() + ", venderid=" + getVenderid() + ", lotno=" + getLotno() + ", realqty=" + getRealqty() + ", badQty=" + getBadQty() + ", sdate=" + getSdate() + ", operator=" + getOperator() + ")";
    }


    public Integer getFreshflag() {
        /*  59 */
        return this.freshflag;

    }


    public void setFreshflag(Integer freshflag) {
        /*  68 */
        this.freshflag = freshflag;

    }


    public String getSheetid() {
        /*  77 */
        return this.sheetid;

    }


    public void setSheetid(String sheetid) {
        /*  86 */
        this.sheetid = sheetid;

    }


    public String getRefSheetid() {
        /*  95 */
        return this.refSheetid;

    }


    public void setRefSheetid(String refSheetid) {
        /* 104 */
        this.refSheetid = refSheetid;

    }


    public String getShopid() {
        /* 113 */
        return this.shopid;

    }


    public void setShopid(String shopid) {
        /* 122 */
        this.shopid = shopid;

    }


    public String getGoodsid() {
        /* 131 */
        return this.goodsid;

    }


    public void setGoodsid(String goodsid) {
        /* 140 */
        this.goodsid = goodsid;

    }


    public String getVenderid() {
        /* 149 */
        return this.venderid;

    }


    public void setVenderid(String venderid) {
        /* 158 */
        this.venderid = venderid;

    }


    public Integer getLotno() {
        /* 167 */
        return this.lotno;

    }


    public void setLotno(Integer lotno) {
        /* 176 */
        this.lotno = lotno;

    }


    public BigDecimal getRealqty() {
        /* 185 */
        return this.realqty;

    }


    public void setRealqty(BigDecimal realqty) {
        /* 194 */
        this.realqty = realqty;

    }


    public BigDecimal getBadQty() {
        /* 203 */
        return this.badQty;

    }


    public void setBadQty(BigDecimal badQty) {
        /* 212 */
        this.badQty = badQty;

    }


    public Date getSdate() {
        /* 221 */
        return this.sdate;

    }


    public void setSdate(Date sdate) {
        /* 230 */
        this.sdate = sdate;

    }


    public String getOperator() {
        /* 239 */
        return this.operator;

    }


    public void setOperator(String operator) {
        /* 248 */
        this.operator = operator;

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrRationnoteBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */