
package cn.com.wms.model.wms.fr;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@TableName("FR_RetRation_BAK")
 public class FrRetrationBak implements Serializable {
    private static final long serialVersionUID = -2603863766672433307L;
    private Integer freshFlag;
    private String sheetid;
    private String shopid;
    private String goodsid;
    private String venderid;
    private BigDecimal taxRate;
    private String paytypeid;


    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.fr.FrRetrationBak)) return false;
        cn.com.wms.model.wms.fr.FrRetrationBak other = (cn.com.wms.model.wms.fr.FrRetrationBak) o;
        if (!other.canEqual(this)) return false;
        Object this$freshFlag = getFreshFlag(), other$freshFlag = other.getFreshFlag();
        if ((this$freshFlag == null) ? (other$freshFlag != null) : !this$freshFlag.equals(other$freshFlag))
            return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$shopid = getShopid(), other$shopid = other.getShopid();
        if ((this$shopid == null) ? (other$shopid != null) : !this$shopid.equals(other$shopid)) return false;
        Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid();
        if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;
        Object this$venderid = getVenderid(), other$venderid = other.getVenderid();
        if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;
        Object this$taxRate = getTaxRate(), other$taxRate = other.getTaxRate();
        if ((this$taxRate == null) ? (other$taxRate != null) : !this$taxRate.equals(other$taxRate)) return false;
        Object this$paytypeid = getPaytypeid(), other$paytypeid = other.getPaytypeid();
        if ((this$paytypeid == null) ? (other$paytypeid != null) : !this$paytypeid.equals(other$paytypeid))
            return false;
        Object this$cost = getCost(), other$cost = other.getCost();
        if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost)) return false;
        Object this$promFlag = getPromFlag(), other$promFlag = other.getPromFlag();
        if ((this$promFlag == null) ? (other$promFlag != null) : !this$promFlag.equals(other$promFlag)) return false;
        Object this$lotno = getLotno(), other$lotno = other.getLotno();
        if ((this$lotno == null) ? (other$lotno != null) : !this$lotno.equals(other$lotno)) return false;
        Object this$realQty = getRealQty(), other$realQty = other.getRealQty();
        if ((this$realQty == null) ? (other$realQty != null) : !this$realQty.equals(other$realQty)) return false;
        Object this$badQty = getBadQty(), other$badQty = other.getBadQty();
        if ((this$badQty == null) ? (other$badQty != null) : !this$badQty.equals(other$badQty)) return false;
        Object this$sdate = getSdate(), other$sdate = other.getSdate();
        if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;
        Object this$operator = getOperator(), other$operator = other.getOperator();
        if ((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator)) return false;
        Object this$productDate = getProductDate(), other$productDate = other.getProductDate();
        return !((this$productDate == null) ? (other$productDate != null) : !this$productDate.equals(other$productDate));
    }

    private BigDecimal cost;
    private Integer promFlag;
    private Integer lotno;
    private BigDecimal realQty;
    private BigDecimal badQty;
    private Date sdate;
    private String operator;
    private Date productDate;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.fr.FrRetrationBak;
    }

    public int hashCode() {
        int PRIME = 59;
        result = 1;
        Object $freshFlag = getFreshFlag();
        result = result * 59 + (($freshFlag == null) ? 43 : $freshFlag.hashCode());
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $shopid = getShopid();
        result = result * 59 + (($shopid == null) ? 43 : $shopid.hashCode());
        Object $goodsid = getGoodsid();
        result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode());
        Object $venderid = getVenderid();
        result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode());
        Object $taxRate = getTaxRate();
        result = result * 59 + (($taxRate == null) ? 43 : $taxRate.hashCode());
        Object $paytypeid = getPaytypeid();
        result = result * 59 + (($paytypeid == null) ? 43 : $paytypeid.hashCode());
        Object $cost = getCost();
        result = result * 59 + (($cost == null) ? 43 : $cost.hashCode());
        Object $promFlag = getPromFlag();
        result = result * 59 + (($promFlag == null) ? 43 : $promFlag.hashCode());
        Object $lotno = getLotno();
        result = result * 59 + (($lotno == null) ? 43 : $lotno.hashCode());
        Object $realQty = getRealQty();
        result = result * 59 + (($realQty == null) ? 43 : $realQty.hashCode());
        Object $badQty = getBadQty();
        result = result * 59 + (($badQty == null) ? 43 : $badQty.hashCode());
        Object $sdate = getSdate();
        result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode());
        Object $operator = getOperator();
        result = result * 59 + (($operator == null) ? 43 : $operator.hashCode());
        Object $productDate = getProductDate();
        return result * 59 + (($productDate == null) ? 43 : $productDate.hashCode());
    }

    public String toString() {
        return "FrRetrationBak(freshFlag=" + getFreshFlag() + ", sheetid=" + getSheetid() + ", shopid=" + getShopid() + ", goodsid=" + getGoodsid() + ", venderid=" + getVenderid() + ", taxRate=" + getTaxRate() + ", paytypeid=" + getPaytypeid() + ", cost=" + getCost() + ", promFlag=" + getPromFlag() + ", lotno=" + getLotno() + ", realQty=" + getRealQty() + ", badQty=" + getBadQty() + ", sdate=" + getSdate() + ", operator=" + getOperator() + ", productDate=" + getProductDate() + ")";
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Integer getFreshFlag() {
        /*  71 */
        return this.freshFlag;
        
    }

    
    
    
    
    
    
    
    public void setFreshFlag(Integer freshFlag) {
        /*  80 */
        this.freshFlag = freshFlag;
        
    }

    
    
    
    
    
    
    
    public String getSheetid() {
        /*  89 */
        return this.sheetid;
        
    }

    
    
    
    
    
    
    
    public void setSheetid(String sheetid) {
        /*  98 */
        this.sheetid = sheetid;
        
    }

    
    
    
    
    
    
    
    public String getShopid() {
        /* 107 */
        return this.shopid;
        
    }

    
    
    
    
    
    
    
    public void setShopid(String shopid) {
        /* 116 */
        this.shopid = shopid;
        
    }

    
    
    
    
    
    
    
    public String getGoodsid() {
        /* 125 */
        return this.goodsid;
        
    }

    
    
    
    
    
    
    
    public void setGoodsid(String goodsid) {
        /* 134 */
        this.goodsid = goodsid;
        
    }

    
    
    
    
    
    
    
    public String getVenderid() {
        /* 143 */
        return this.venderid;
        
    }

    
    
    
    
    
    
    
    public void setVenderid(String venderid) {
        /* 152 */
        this.venderid = venderid;
        
    }

    
    
    
    
    
    
    
    public BigDecimal getTaxRate() {
        /* 161 */
        return this.taxRate;
        
    }

    
    
    
    
    
    
    
    public void setTaxRate(BigDecimal taxRate) {
        /* 170 */
        this.taxRate = taxRate;
        
    }

    
    
    
    
    
    
    
    public String getPaytypeid() {
        /* 179 */
        return this.paytypeid;
        
    }

    
    
    
    
    
    
    
    public void setPaytypeid(String paytypeid) {
        /* 188 */
        this.paytypeid = paytypeid;
        
    }

    
    
    
    
    
    
    
    public BigDecimal getCost() {
        /* 197 */
        return this.cost;
        
    }

    
    
    
    
    
    
    
    public void setCost(BigDecimal cost) {
        /* 206 */
        this.cost = cost;
        
    }

    
    
    
    
    
    
    
    public Integer getPromFlag() {
        /* 215 */
        return this.promFlag;
        
    }

    
    
    
    
    
    
    
    public void setPromFlag(Integer promFlag) {
        /* 224 */
        this.promFlag = promFlag;
        
    }

    
    
    
    
    
    
    
    public Integer getLotno() {
        /* 233 */
        return this.lotno;
        
    }

    
    
    
    
    
    
    
    public void setLotno(Integer lotno) {
        /* 242 */
        this.lotno = lotno;
        
    }

    
    
    
    
    
    
    
    public BigDecimal getRealQty() {
        /* 251 */
        return this.realQty;
        
    }

    
    
    
    
    
    
    
    public void setRealQty(BigDecimal realQty) {
        /* 260 */
        this.realQty = realQty;
        
    }

    
    
    
    
    
    
    
    public BigDecimal getBadQty() {
        /* 269 */
        return this.badQty;
        
    }

    
    
    
    
    
    
    
    public void setBadQty(BigDecimal badQty) {
        /* 278 */
        this.badQty = badQty;
        
    }

    
    
    
    
    
    
    
    public Date getSdate() {
        /* 287 */
        return this.sdate;
        
    }

    
    
    
    
    
    
    
    public void setSdate(Date sdate) {
        /* 296 */
        this.sdate = sdate;
        
    }

    
    
    
    
    
    
    
    public String getOperator() {
        /* 305 */
        return this.operator;
        
    }

    
    
    
    
    
    
    
    public void setOperator(String operator) {
        /* 314 */
        this.operator = operator;
        
    }

    
    
    
    
    
    
    
    public Date getProductDate() {
        /* 323 */
        return this.productDate;
        
    }

    
    
    
    
    
    
    
    public void setProductDate(Date productDate) {
        /* 332 */
        this.productDate = productDate;
        
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrRetrationBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */