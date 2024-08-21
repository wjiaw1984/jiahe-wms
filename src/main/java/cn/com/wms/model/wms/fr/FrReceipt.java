
package cn.com.wms.model.wms.fr;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@TableName("FR_RECEIPT")
@Data
public class FrReceipt implements Serializable {
    private static final long serialVersionUID = -8167226037306793264L;
    private Integer freshflag;
    private String sheetid;
    private String refsheetid;
    private Date sdate;
    private String goodsid;
    private String venderid;


    /*   9 */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.fr.FrReceipt)) return false;
        cn.com.wms.model.wms.fr.FrReceipt other = (cn.com.wms.model.wms.fr.FrReceipt) o;
        if (!other.canEqual(this)) return false;
        Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag();
        if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag))
            return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$refsheetid = getRefsheetid(), other$refsheetid = other.getRefsheetid();
        if ((this$refsheetid == null) ? (other$refsheetid != null) : !this$refsheetid.equals(other$refsheetid))
            return false;
        Object this$sdate = getSdate(), other$sdate = other.getSdate();
        if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;
        Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid();
        if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;
        Object this$venderid = getVenderid(), other$venderid = other.getVenderid();
        if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;
        Object this$lotno = getLotno(), other$lotno = other.getLotno();
        if ((this$lotno == null) ? (other$lotno != null) : !this$lotno.equals(other$lotno)) return false;
        Object this$orerqty = getOrerqty(), other$orerqty = other.getOrerqty();
        if ((this$orerqty == null) ? (other$orerqty != null) : !this$orerqty.equals(other$orerqty)) return false;
        Object this$qty = getQty(), other$qty = other.getQty();
        if ((this$qty == null) ? (other$qty != null) : !this$qty.equals(other$qty)) return false;
        Object this$badQty = getBadQty(), other$badQty = other.getBadQty();
        if ((this$badQty == null) ? (other$badQty != null) : !this$badQty.equals(other$badQty)) return false;
        Object this$operator = getOperator(), other$operator = other.getOperator();
        if ((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator)) return false;
        Object this$cost = getCost(), other$cost = other.getCost();
        if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost)) return false;
        Object this$productDate = getProductDate(), other$productDate = other.getProductDate();
        return !((this$productDate == null) ? (other$productDate != null) : !this$productDate.equals(other$productDate));
    }

    private Integer lotno;
    private BigDecimal orerqty;
    private BigDecimal qty;
    private BigDecimal badQty;
    private String operator;
    private BigDecimal cost;
    private Date productDate;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.fr.FrReceipt;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $freshflag = getFreshflag();
        result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode());
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $refsheetid = getRefsheetid();
        result = result * 59 + (($refsheetid == null) ? 43 : $refsheetid.hashCode());
        Object $sdate = getSdate();
        result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode());
        Object $goodsid = getGoodsid();
        result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode());
        Object $venderid = getVenderid();
        result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode());
        Object $lotno = getLotno();
        result = result * 59 + (($lotno == null) ? 43 : $lotno.hashCode());
        Object $orerqty = getOrerqty();
        result = result * 59 + (($orerqty == null) ? 43 : $orerqty.hashCode());
        Object $qty = getQty();
        result = result * 59 + (($qty == null) ? 43 : $qty.hashCode());
        Object $badQty = getBadQty();
        result = result * 59 + (($badQty == null) ? 43 : $badQty.hashCode());
        Object $operator = getOperator();
        result = result * 59 + (($operator == null) ? 43 : $operator.hashCode());
        Object $cost = getCost();
        result = result * 59 + (($cost == null) ? 43 : $cost.hashCode());
        Object $productDate = getProductDate();
        return result * 59 + (($productDate == null) ? 43 : $productDate.hashCode());
    }

    public String toString() {
        return "FrReceipt(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", refsheetid=" + getRefsheetid() + ", sdate=" + getSdate() + ", goodsid=" + getGoodsid() + ", venderid=" + getVenderid() + ", lotno=" + getLotno() + ", orerqty=" + getOrerqty() + ", qty=" + getQty() + ", badQty=" + getBadQty() + ", operator=" + getOperator() + ", cost=" + getCost() + ", productDate=" + getProductDate() + ")";
    }


    public Integer getFreshflag() {
        /*  65 */
        return this.freshflag;

    }


    public void setFreshflag(Integer freshflag) {
        /*  74 */
        this.freshflag = freshflag;

    }


    public String getSheetid() {
        /*  83 */
        return this.sheetid;

    }


    public void setSheetid(String sheetid) {
        /*  92 */
        this.sheetid = sheetid;

    }


    public String getRefsheetid() {
        /* 101 */
        return this.refsheetid;

    }


    public void setRefsheetid(String refsheetid) {
        /* 110 */
        this.refsheetid = refsheetid;

    }


    public Date getSdate() {
        /* 119 */
        return this.sdate;

    }


    public void setSdate(Date sdate) {
        /* 128 */
        this.sdate = sdate;

    }


    public String getGoodsid() {
        /* 137 */
        return this.goodsid;

    }


    public void setGoodsid(String goodsid) {
        /* 146 */
        this.goodsid = goodsid;

    }


    public String getVenderid() {
        /* 155 */
        return this.venderid;

    }


    public void setVenderid(String venderid) {
        /* 164 */
        this.venderid = venderid;

    }


    public Integer getLotno() {
        /* 173 */
        return this.lotno;

    }


    public void setLotno(Integer lotno) {
        /* 182 */
        this.lotno = lotno;

    }


    public BigDecimal getOrerqty() {
        /* 191 */
        return this.orerqty;

    }


    public void setOrerqty(BigDecimal orerqty) {
        /* 200 */
        this.orerqty = orerqty;

    }


    public BigDecimal getQty() {
        /* 209 */
        return this.qty;

    }


    public void setQty(BigDecimal qty) {
        /* 218 */
        this.qty = qty;

    }


    public BigDecimal getBadQty() {
        /* 227 */
        return this.badQty;

    }


    public void setBadQty(BigDecimal badQty) {
        /* 236 */
        this.badQty = badQty;

    }


    public String getOperator() {
        /* 245 */
        return this.operator;

    }


    public void setOperator(String operator) {
        /* 254 */
        this.operator = operator;

    }


    public BigDecimal getCost() {
        /* 263 */
        return this.cost;

    }


    public void setCost(BigDecimal cost) {
        /* 272 */
        this.cost = cost;

    }


    public Date getProductDate() {
        /* 281 */
        return this.productDate;

    }


    public void setProductDate(Date productDate) {
        /* 290 */
        this.productDate = productDate;

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrReceipt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */