
package cn.com.wms.model.wms.sdwms;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@TableName("SDWMS_PURCHASE_BAK")
@Data
public class SdwmsPurchaseBak implements Serializable {
    private static final long serialVersionUID = -424080309045633035L;
    private Integer freshflag;
    private String sheetid;
    private Integer sheetType;
    private Integer purFlag;
    private String goodsid;
    private String customid;
    private String palletZone;
    private String venderid;
    private String refsheetid;
    private Date sdate;


    /*   9 */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsPurchaseBak)) return false;
        cn.com.wms.model.wms.sdwms.SdwmsPurchaseBak other = (cn.com.wms.model.wms.sdwms.SdwmsPurchaseBak) o;
        if (!other.canEqual(this)) return false;
        Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag();
        if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag))
            return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$sheetType = getSheetType(), other$sheetType = other.getSheetType();
        if ((this$sheetType == null) ? (other$sheetType != null) : !this$sheetType.equals(other$sheetType))
            return false;
        Object this$purFlag = getPurFlag(), other$purFlag = other.getPurFlag();
        if ((this$purFlag == null) ? (other$purFlag != null) : !this$purFlag.equals(other$purFlag)) return false;
        Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid();
        if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;
        Object this$customid = getCustomid(), other$customid = other.getCustomid();
        if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;
        Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone();
        if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone))
            return false;
        Object this$venderid = getVenderid(), other$venderid = other.getVenderid();
        if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;
        Object this$refsheetid = getRefsheetid(), other$refsheetid = other.getRefsheetid();
        if ((this$refsheetid == null) ? (other$refsheetid != null) : !this$refsheetid.equals(other$refsheetid))
            return false;
        Object this$sdate = getSdate(), other$sdate = other.getSdate();
        if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;
        Object this$checker = getChecker(), other$checker = other.getChecker();
        if ((this$checker == null) ? (other$checker != null) : !this$checker.equals(other$checker)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$purDate = getPurDate(), other$purDate = other.getPurDate();
        if ((this$purDate == null) ? (other$purDate != null) : !this$purDate.equals(other$purDate)) return false;
        Object this$validDate = getValidDate(), other$validDate = other.getValidDate();
        if ((this$validDate == null) ? (other$validDate != null) : !this$validDate.equals(other$validDate))
            return false;
        Object this$serialid = getSerialid(), other$serialid = other.getSerialid();
        if ((this$serialid == null) ? (other$serialid != null) : !this$serialid.equals(other$serialid)) return false;
        Object this$pkcount = getPkcount(), other$pkcount = other.getPkcount();
        if ((this$pkcount == null) ? (other$pkcount != null) : !this$pkcount.equals(other$pkcount)) return false;
        Object this$qty = getQty(), other$qty = other.getQty();
        if ((this$qty == null) ? (other$qty != null) : !this$qty.equals(other$qty)) return false;
        Object this$cost = getCost(), other$cost = other.getCost();
        if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost)) return false;
        Object this$taxRate = getTaxRate(), other$taxRate = other.getTaxRate();
        if ((this$taxRate == null) ? (other$taxRate != null) : !this$taxRate.equals(other$taxRate)) return false;
        Object this$giftQty = getGiftQty(), other$giftQty = other.getGiftQty();
        if ((this$giftQty == null) ? (other$giftQty != null) : !this$giftQty.equals(other$giftQty)) return false;
        Object this$notes = getNotes(), other$notes = other.getNotes();
        if ((this$notes == null) ? (other$notes != null) : !this$notes.equals(other$notes)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
    }

    private String checker;
    private Integer type;
    private Date purDate;
    private Date validDate;
    private Integer serialid;
    private BigDecimal pkcount;
    private BigDecimal qty;
    private BigDecimal cost;
    private BigDecimal taxRate;
    private BigDecimal giftQty;
    private String notes;
    private Integer status;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.sdwms.SdwmsPurchaseBak;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $freshflag = getFreshflag();
        result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode());
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $sheetType = getSheetType();
        result = result * 59 + (($sheetType == null) ? 43 : $sheetType.hashCode());
        Object $purFlag = getPurFlag();
        result = result * 59 + (($purFlag == null) ? 43 : $purFlag.hashCode());
        Object $goodsid = getGoodsid();
        result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode());
        Object $customid = getCustomid();
        result = result * 59 + (($customid == null) ? 43 : $customid.hashCode());
        Object $palletZone = getPalletZone();
        result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode());
        Object $venderid = getVenderid();
        result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode());
        Object $refsheetid = getRefsheetid();
        result = result * 59 + (($refsheetid == null) ? 43 : $refsheetid.hashCode());
        Object $sdate = getSdate();
        result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode());
        Object $checker = getChecker();
        result = result * 59 + (($checker == null) ? 43 : $checker.hashCode());
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $purDate = getPurDate();
        result = result * 59 + (($purDate == null) ? 43 : $purDate.hashCode());
        Object $validDate = getValidDate();
        result = result * 59 + (($validDate == null) ? 43 : $validDate.hashCode());
        Object $serialid = getSerialid();
        result = result * 59 + (($serialid == null) ? 43 : $serialid.hashCode());
        Object $pkcount = getPkcount();
        result = result * 59 + (($pkcount == null) ? 43 : $pkcount.hashCode());
        Object $qty = getQty();
        result = result * 59 + (($qty == null) ? 43 : $qty.hashCode());
        Object $cost = getCost();
        result = result * 59 + (($cost == null) ? 43 : $cost.hashCode());
        Object $taxRate = getTaxRate();
        result = result * 59 + (($taxRate == null) ? 43 : $taxRate.hashCode());
        Object $giftQty = getGiftQty();
        result = result * 59 + (($giftQty == null) ? 43 : $giftQty.hashCode());
        Object $notes = getNotes();
        result = result * 59 + (($notes == null) ? 43 : $notes.hashCode());
        Object $status = getStatus();
        return result * 59 + (($status == null) ? 43 : $status.hashCode());
    }

    public String toString() {
        return "SdwmsPurchaseBak(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", sheetType=" + getSheetType() + ", purFlag=" + getPurFlag() + ", goodsid=" + getGoodsid() + ", customid=" + getCustomid() + ", palletZone=" + getPalletZone() + ", venderid=" + getVenderid() + ", refsheetid=" + getRefsheetid() + ", sdate=" + getSdate() + ", checker=" + getChecker() + ", type=" + getType() + ", purDate=" + getPurDate() + ", validDate=" + getValidDate() + ", serialid=" + getSerialid() + ", pkcount=" + getPkcount() + ", qty=" + getQty() + ", cost=" + getCost() + ", taxRate=" + getTaxRate() + ", giftQty=" + getGiftQty() + ", notes=" + getNotes() + ", status=" + getStatus() + ")";
    }


    public Integer getFreshflag() {
        /*  92 */
        return this.freshflag;

    }


    public void setFreshflag(Integer freshflag) {
        /* 101 */
        this.freshflag = freshflag;

    }


    public String getSheetid() {
        /* 110 */
        return this.sheetid;

    }


    public void setSheetid(String sheetid) {
        /* 119 */
        this.sheetid = sheetid;

    }


    public Integer getSheetType() {
        /* 128 */
        return this.sheetType;

    }


    public void setSheetType(Integer sheetType) {
        /* 137 */
        this.sheetType = sheetType;

    }


    public Integer getPurFlag() {
        /* 146 */
        return this.purFlag;

    }


    public void setPurFlag(Integer purFlag) {
        /* 155 */
        this.purFlag = purFlag;

    }


    public String getGoodsid() {
        /* 164 */
        return this.goodsid;

    }


    public void setGoodsid(String goodsid) {
        /* 173 */
        this.goodsid = goodsid;

    }


    public String getCustomid() {
        /* 182 */
        return this.customid;

    }


    public void setCustomid(String customid) {
        /* 191 */
        this.customid = customid;

    }


    public String getPalletZone() {
        /* 200 */
        return this.palletZone;

    }


    public void setPalletZone(String palletZone) {
        /* 209 */
        this.palletZone = palletZone;

    }


    public String getVenderid() {
        /* 218 */
        return this.venderid;

    }


    public void setVenderid(String venderid) {
        /* 227 */
        this.venderid = venderid;

    }


    public String getRefsheetid() {
        /* 236 */
        return this.refsheetid;

    }


    public void setRefsheetid(String refsheetid) {
        /* 245 */
        this.refsheetid = refsheetid;

    }


    public Date getSdate() {
        /* 254 */
        return this.sdate;

    }


    public void setSdate(Date sdate) {
        /* 263 */
        this.sdate = sdate;

    }


    public String getChecker() {
        /* 272 */
        return this.checker;

    }


    public void setChecker(String checker) {
        /* 281 */
        this.checker = checker;

    }


    public Integer getType() {
        /* 290 */
        return this.type;

    }


    public void setType(Integer type) {
        /* 299 */
        this.type = type;

    }


    public Date getPurDate() {
        /* 308 */
        return this.purDate;

    }


    public void setPurDate(Date purDate) {
        /* 317 */
        this.purDate = purDate;

    }


    public Date getValidDate() {
        /* 326 */
        return this.validDate;

    }


    public void setValidDate(Date validDate) {
        /* 335 */
        this.validDate = validDate;

    }


    public Integer getSerialid() {
        /* 344 */
        return this.serialid;

    }


    public void setSerialid(Integer serialid) {
        /* 353 */
        this.serialid = serialid;

    }


    public BigDecimal getPkcount() {
        /* 362 */
        return this.pkcount;

    }


    public void setPkcount(BigDecimal pkcount) {
        /* 371 */
        this.pkcount = pkcount;

    }


    public BigDecimal getQty() {
        /* 380 */
        return this.qty;

    }


    public void setQty(BigDecimal qty) {
        /* 389 */
        this.qty = qty;

    }


    public BigDecimal getCost() {
        /* 398 */
        return this.cost;

    }


    public void setCost(BigDecimal cost) {
        /* 407 */
        this.cost = cost;

    }


    public BigDecimal getTaxRate() {
        /* 416 */
        return this.taxRate;

    }


    public void setTaxRate(BigDecimal taxRate) {
        /* 425 */
        this.taxRate = taxRate;

    }


    public BigDecimal getGiftQty() {
        /* 434 */
        return this.giftQty;

    }


    public void setGiftQty(BigDecimal giftQty) {
        /* 443 */
        this.giftQty = giftQty;

    }


    public String getNotes() {
        /* 452 */
        return this.notes;

    }


    public void setNotes(String notes) {
        /* 461 */
        this.notes = notes;

    }


    public Integer getStatus() {
        /* 470 */
        return this.status;

    }


    public void setStatus(Integer status) {
        /* 479 */
        this.status = status;

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsPurchaseBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */