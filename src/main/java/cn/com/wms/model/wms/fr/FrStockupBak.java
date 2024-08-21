
package cn.com.wms.model.wms.fr;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@TableName("FR_StockUp_bak")
@Data
public class FrStockupBak implements Serializable {
    private static final long serialVersionUID = 1862268279550531097L;
    private Integer freshflag;
    private String wmsid;
    private Date sdate;
    private Integer goodsid;


    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.fr.FrStockupBak)) return false;
        cn.com.wms.model.wms.fr.FrStockupBak other = (cn.com.wms.model.wms.fr.FrStockupBak) o;
        if (!other.canEqual(this)) return false;
        Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag();
        if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag))
            return false;
        Object this$wmsid = getWmsid(), other$wmsid = other.getWmsid();
        if ((this$wmsid == null) ? (other$wmsid != null) : !this$wmsid.equals(other$wmsid)) return false;
        Object this$sdate = getSdate(), other$sdate = other.getSdate();
        if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;
        Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid();
        if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;
        Object this$qty = getQty(), other$qty = other.getQty();
        if ((this$qty == null) ? (other$qty != null) : !this$qty.equals(other$qty)) return false;
        Object this$badQty = getBadQty(), other$badQty = other.getBadQty();
        if ((this$badQty == null) ? (other$badQty != null) : !this$badQty.equals(other$badQty)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$notes = getNotes(), other$notes = other.getNotes();
        if ((this$notes == null) ? (other$notes != null) : !this$notes.equals(other$notes)) return false;
        Object this$operateDate = getOperateDate(), other$operateDate = other.getOperateDate();
        return !((this$operateDate == null) ? (other$operateDate != null) : !this$operateDate.equals(other$operateDate));
    }

    private BigDecimal qty;
    private BigDecimal badQty;
    private Integer status;
    private String notes;
    private Date operateDate;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.fr.FrStockupBak;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $freshflag = getFreshflag();
        result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode());
        Object $wmsid = getWmsid();
        result = result * 59 + (($wmsid == null) ? 43 : $wmsid.hashCode());
        Object $sdate = getSdate();
        result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode());
        Object $goodsid = getGoodsid();
        result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode());
        Object $qty = getQty();
        result = result * 59 + (($qty == null) ? 43 : $qty.hashCode());
        Object $badQty = getBadQty();
        result = result * 59 + (($badQty == null) ? 43 : $badQty.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $notes = getNotes();
        result = result * 59 + (($notes == null) ? 43 : $notes.hashCode());
        Object $operateDate = getOperateDate();
        return result * 59 + (($operateDate == null) ? 43 : $operateDate.hashCode());
    }

    public String toString() {
        return "FrStockupBak(freshflag=" + getFreshflag() + ", wmsid=" + getWmsid() + ", sdate=" + getSdate() + ", goodsid=" + getGoodsid() + ", qty=" + getQty() + ", badQty=" + getBadQty() + ", status=" + getStatus() + ", notes=" + getNotes() + ", operateDate=" + getOperateDate() + ")";
    }


    public Integer getFreshflag() {
        /*  53 */
        return this.freshflag;

    }


    public void setFreshflag(Integer freshflag) {
        /*  62 */
        this.freshflag = freshflag;

    }


    public String getWmsid() {
        /*  71 */
        return this.wmsid;

    }


    public void setWmsid(String wmsid) {
        /*  80 */
        this.wmsid = wmsid;

    }


    public Date getSdate() {
        /*  89 */
        return this.sdate;

    }


    public void setSdate(Date sdate) {
        /*  98 */
        this.sdate = sdate;

    }


    public Integer getGoodsid() {
        /* 107 */
        return this.goodsid;

    }


    public void setGoodsid(Integer goodsid) {
        /* 116 */
        this.goodsid = goodsid;

    }


    public BigDecimal getQty() {
        /* 125 */
        return this.qty;

    }


    public void setQty(BigDecimal qty) {
        /* 134 */
        this.qty = qty;

    }


    public BigDecimal getBadQty() {
        /* 143 */
        return this.badQty;

    }


    public void setBadQty(BigDecimal badQty) {
        /* 152 */
        this.badQty = badQty;

    }


    public Integer getStatus() {
        /* 161 */
        return this.status;

    }


    public void setStatus(Integer status) {
        /* 170 */
        this.status = status;

    }


    public String getNotes() {
        /* 179 */
        return this.notes;

    }


    public void setNotes(String notes) {
        /* 188 */
        this.notes = notes;

    }


    public Date getOperateDate() {
        /* 197 */
        return this.operateDate;

    }


    public void setOperateDate(Date operateDate) {
        /* 206 */
        this.operateDate = operateDate;

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrStockupBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */