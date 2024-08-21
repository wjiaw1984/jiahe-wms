
package cn.com.wms.model.wms.fr;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@TableName("FR_BadQtyChange")
@Data
public class FrBadqtychange implements Serializable {
    private static final long serialVersionUID = 4546758055648141139L;
    private Integer freshFlag;
    private String sheetid;
    private String customid;
    private String palletZone;


    /*   9 */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.fr.FrBadqtychange)) return false;
        cn.com.wms.model.wms.fr.FrBadqtychange other = (cn.com.wms.model.wms.fr.FrBadqtychange) o;
        if (!other.canEqual(this)) return false;
        Object this$freshFlag = getFreshFlag(), other$freshFlag = other.getFreshFlag();
        if ((this$freshFlag == null) ? (other$freshFlag != null) : !this$freshFlag.equals(other$freshFlag))
            return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$customid = getCustomid(), other$customid = other.getCustomid();
        if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;
        Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone();
        if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone))
            return false;
        Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid();
        if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;
        Object this$lotno = getLotno(), other$lotno = other.getLotno();
        if ((this$lotno == null) ? (other$lotno != null) : !this$lotno.equals(other$lotno)) return false;
        Object this$qty = getQty(), other$qty = other.getQty();
        if ((this$qty == null) ? (other$qty != null) : !this$qty.equals(other$qty)) return false;
        Object this$sdate = getSdate(), other$sdate = other.getSdate();
        if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;
        Object this$operator = getOperator(), other$operator = other.getOperator();
        return !((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator));
    }

    private String goodsid;
    private Integer lotno;
    private BigDecimal qty;
    private Date sdate;
    private String operator;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.fr.FrBadqtychange;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $freshFlag = getFreshFlag();
        result = result * 59 + (($freshFlag == null) ? 43 : $freshFlag.hashCode());
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $customid = getCustomid();
        result = result * 59 + (($customid == null) ? 43 : $customid.hashCode());
        Object $palletZone = getPalletZone();
        result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode());
        Object $goodsid = getGoodsid();
        result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode());
        Object $lotno = getLotno();
        result = result * 59 + (($lotno == null) ? 43 : $lotno.hashCode());
        Object $qty = getQty();
        result = result * 59 + (($qty == null) ? 43 : $qty.hashCode());
        Object $sdate = getSdate();
        result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode());
        Object $operator = getOperator();
        return result * 59 + (($operator == null) ? 43 : $operator.hashCode());
    }

    public String toString() {
        return "FrBadqtychange(freshFlag=" + getFreshFlag() + ", sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", palletZone=" + getPalletZone() + ", goodsid=" + getGoodsid() + ", lotno=" + getLotno() + ", qty=" + getQty() + ", sdate=" + getSdate() + ", operator=" + getOperator() + ")";
    }


    public Integer getFreshFlag() {
        /*  53 */
        return this.freshFlag;

    }


    public void setFreshFlag(Integer freshFlag) {
        /*  62 */
        this.freshFlag = freshFlag;

    }


    public String getSheetid() {
        /*  71 */
        return this.sheetid;

    }


    public void setSheetid(String sheetid) {
        /*  80 */
        this.sheetid = sheetid;

    }


    public String getCustomid() {
        /*  89 */
        return this.customid;

    }


    public void setCustomid(String customid) {
        /*  98 */
        this.customid = customid;

    }


    public String getPalletZone() {
        /* 107 */
        return this.palletZone;

    }


    public void setPalletZone(String palletZone) {
        /* 116 */
        this.palletZone = palletZone;

    }


    public String getGoodsid() {
        /* 125 */
        return this.goodsid;

    }


    public void setGoodsid(String goodsid) {
        /* 134 */
        this.goodsid = goodsid;

    }


    public Integer getLotno() {
        /* 143 */
        return this.lotno;

    }


    public void setLotno(Integer lotno) {
        /* 152 */
        this.lotno = lotno;

    }


    public BigDecimal getQty() {
        /* 161 */
        return this.qty;

    }


    public void setQty(BigDecimal qty) {
        /* 170 */
        this.qty = qty;

    }


    public Date getSdate() {
        /* 179 */
        return this.sdate;

    }


    public void setSdate(Date sdate) {
        /* 188 */
        this.sdate = sdate;

    }


    public String getOperator() {
        /* 197 */
        return this.operator;

    }


    public void setOperator(String operator) {
        /* 206 */
        this.operator = operator;

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrBadqtychange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */