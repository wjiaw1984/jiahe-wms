
package cn.com.wms.model.wms.fr;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@TableName("FR_RET")
@Data
 public class FrRet implements Serializable {
    private static final long serialVersionUID = 774502841665505556L;
       private Integer freshFlag;
       private String sheetid;
       private String venderid;
       private String goodsid;

    
    /*   9 */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.fr.FrRet)) return false;
        cn.com.wms.model.wms.fr.FrRet other = (cn.com.wms.model.wms.fr.FrRet) o;
        if (!other.canEqual(this)) return false;
        Object this$freshFlag = getFreshFlag(), other$freshFlag = other.getFreshFlag();
        if ((this$freshFlag == null) ? (other$freshFlag != null) : !this$freshFlag.equals(other$freshFlag))
            return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$venderid = getVenderid(), other$venderid = other.getVenderid();
        if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;
        Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid();
        if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;
        Object this$lotno = getLotno(), other$lotno = other.getLotno();
        if ((this$lotno == null) ? (other$lotno != null) : !this$lotno.equals(other$lotno)) return false;
        Object this$planQty = getPlanQty(), other$planQty = other.getPlanQty();
        if ((this$planQty == null) ? (other$planQty != null) : !this$planQty.equals(other$planQty)) return false;
        Object this$realQty = getRealQty(), other$realQty = other.getRealQty();
        if ((this$realQty == null) ? (other$realQty != null) : !this$realQty.equals(other$realQty)) return false;
        Object this$badQty = getBadQty(), other$badQty = other.getBadQty();
        if ((this$badQty == null) ? (other$badQty != null) : !this$badQty.equals(other$badQty)) return false;
        Object this$sdate = getSdate(), other$sdate = other.getSdate();
        if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;
        Object this$operator = getOperator(), other$operator = other.getOperator();
        return !((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator));
    }

    private Integer lotno;
    private BigDecimal planQty;
    private BigDecimal realQty;
    private BigDecimal badQty;
    private Date sdate;
    private String operator;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.fr.FrRet;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $freshFlag = getFreshFlag();
        result = result * 59 + (($freshFlag == null) ? 43 : $freshFlag.hashCode());
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $venderid = getVenderid();
        result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode());
        Object $goodsid = getGoodsid();
        result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode());
        Object $lotno = getLotno();
        result = result * 59 + (($lotno == null) ? 43 : $lotno.hashCode());
        Object $planQty = getPlanQty();
        result = result * 59 + (($planQty == null) ? 43 : $planQty.hashCode());
        Object $realQty = getRealQty();
        result = result * 59 + (($realQty == null) ? 43 : $realQty.hashCode());
        Object $badQty = getBadQty();
        result = result * 59 + (($badQty == null) ? 43 : $badQty.hashCode());
        Object $sdate = getSdate();
        result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode());
        Object $operator = getOperator();
        return result * 59 + (($operator == null) ? 43 : $operator.hashCode());
    }

    public String toString() {
        return "FrRet(freshFlag=" + getFreshFlag() + ", sheetid=" + getSheetid() + ", venderid=" + getVenderid() + ", goodsid=" + getGoodsid() + ", lotno=" + getLotno() + ", planQty=" + getPlanQty() + ", realQty=" + getRealQty() + ", badQty=" + getBadQty() + ", sdate=" + getSdate() + ", operator=" + getOperator() + ")";
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Integer getFreshFlag() {
        /*  56 */
        return this.freshFlag;
        
    }

    
    
    
    
    
    
    
    public void setFreshFlag(Integer freshFlag) {
        /*  65 */
        this.freshFlag = freshFlag;
        
    }

    
    
    
    
    
    
    
    public String getSheetid() {
        /*  74 */
        return this.sheetid;
        
    }

    
    
    
    
    
    
    
    public void setSheetid(String sheetid) {
        /*  83 */
        this.sheetid = sheetid;
        
    }

    
    
    
    
    
    
    
    public String getVenderid() {
        /*  92 */
        return this.venderid;
        
    }

    
    
    
    
    
    
    
    public void setVenderid(String venderid) {
        /* 101 */
        this.venderid = venderid;
        
    }

    
    
    
    
    
    
    
    public String getGoodsid() {
        /* 110 */
        return this.goodsid;
        
    }

    
    
    
    
    
    
    
    public void setGoodsid(String goodsid) {
        /* 119 */
        this.goodsid = goodsid;
        
    }

    
    
    
    
    
    
    
    public Integer getLotno() {
        /* 128 */
        return this.lotno;
        
    }

    
    
    
    
    
    
    
    public void setLotno(Integer lotno) {
        /* 137 */
        this.lotno = lotno;
        
    }

    
    
    
    
    
    
    
    public BigDecimal getPlanQty() {
        /* 146 */
        return this.planQty;
        
    }

    
    
    
    
    
    
    
    public void setPlanQty(BigDecimal planQty) {
        /* 155 */
        this.planQty = planQty;
        
    }

    
    
    
    
    
    
    
    public BigDecimal getRealQty() {
        /* 164 */
        return this.realQty;
        
    }

    
    
    
    
    
    
    
    public void setRealQty(BigDecimal realQty) {
        /* 173 */
        this.realQty = realQty;
        
    }

    
    
    
    
    
    
    
    public BigDecimal getBadQty() {
        /* 182 */
        return this.badQty;
        
    }

    
    
    
    
    
    
    
    public void setBadQty(BigDecimal badQty) {
        /* 191 */
        this.badQty = badQty;
        
    }

    
    
    
    
    
    
    
    public Date getSdate() {
        /* 200 */
        return this.sdate;
        
    }

    
    
    
    
    
    
    
    public void setSdate(Date sdate) {
        /* 209 */
        this.sdate = sdate;
        
    }

    
    
    
    
    
    
    
    public String getOperator() {
        /* 218 */
        return this.operator;
        
    }

    
    
    
    
    
    
    
    public void setOperator(String operator) {
        /* 227 */
        this.operator = operator;
        
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrRet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */