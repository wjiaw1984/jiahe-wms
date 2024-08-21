
package cn.com.wms.model.bset;

import java.io.Serializable;
import java.util.Date;



 public class BatchVo implements Serializable {
       private String fixStatusCode;
       private Date productionDate;
       private Date expiryDate;
       private String lotAtt01;
       private String lotAtt02;
       private String lotAtt06;
       private String packCode;
       private String uomCode;
       private Integer quantity;

    
    /* 15 */
    public void setFixStatusCode(String fixStatusCode) {
        this.fixStatusCode = fixStatusCode;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setLotAtt01(String lotAtt01) {
        this.lotAtt01 = lotAtt01;
    }

    public void setLotAtt02(String lotAtt02) {
        this.lotAtt02 = lotAtt02;
    }

    public void setLotAtt06(String lotAtt06) {
        this.lotAtt06 = lotAtt06;
    }

    public void setPackCode(String packCode) {
        this.packCode = packCode;
    }

    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.bset.BatchVo)) return false;
        cn.com.wms.model.bset.BatchVo other = (cn.com.wms.model.bset.BatchVo) o;
        if (!other.canEqual(this)) return false;
        Object this$fixStatusCode = getFixStatusCode(), other$fixStatusCode = other.getFixStatusCode();
        if ((this$fixStatusCode == null) ? (other$fixStatusCode != null) : !this$fixStatusCode.equals(other$fixStatusCode))
            return false;
        Object this$productionDate = getProductionDate(), other$productionDate = other.getProductionDate();
        if ((this$productionDate == null) ? (other$productionDate != null) : !this$productionDate.equals(other$productionDate))
            return false;
        Object this$expiryDate = getExpiryDate(), other$expiryDate = other.getExpiryDate();
        if ((this$expiryDate == null) ? (other$expiryDate != null) : !this$expiryDate.equals(other$expiryDate))
            return false;
        Object this$lotAtt01 = getLotAtt01(), other$lotAtt01 = other.getLotAtt01();
        if ((this$lotAtt01 == null) ? (other$lotAtt01 != null) : !this$lotAtt01.equals(other$lotAtt01)) return false;
        Object this$lotAtt02 = getLotAtt02(), other$lotAtt02 = other.getLotAtt02();
        if ((this$lotAtt02 == null) ? (other$lotAtt02 != null) : !this$lotAtt02.equals(other$lotAtt02)) return false;
        Object this$lotAtt06 = getLotAtt06(), other$lotAtt06 = other.getLotAtt06();
        if ((this$lotAtt06 == null) ? (other$lotAtt06 != null) : !this$lotAtt06.equals(other$lotAtt06)) return false;
        Object this$packCode = getPackCode(), other$packCode = other.getPackCode();
        if ((this$packCode == null) ? (other$packCode != null) : !this$packCode.equals(other$packCode)) return false;
        Object this$uomCode = getUomCode(), other$uomCode = other.getUomCode();
        if ((this$uomCode == null) ? (other$uomCode != null) : !this$uomCode.equals(other$uomCode)) return false;
        Object this$quantity = getQuantity(), other$quantity = other.getQuantity();
        return !((this$quantity == null) ? (other$quantity != null) : !this$quantity.equals(other$quantity));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.BatchVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $fixStatusCode = getFixStatusCode();
        result = result * 59 + (($fixStatusCode == null) ? 43 : $fixStatusCode.hashCode());
        Object $productionDate = getProductionDate();
        result = result * 59 + (($productionDate == null) ? 43 : $productionDate.hashCode());
        Object $expiryDate = getExpiryDate();
        result = result * 59 + (($expiryDate == null) ? 43 : $expiryDate.hashCode());
        Object $lotAtt01 = getLotAtt01();
        result = result * 59 + (($lotAtt01 == null) ? 43 : $lotAtt01.hashCode());
        Object $lotAtt02 = getLotAtt02();
        result = result * 59 + (($lotAtt02 == null) ? 43 : $lotAtt02.hashCode());
        Object $lotAtt06 = getLotAtt06();
        result = result * 59 + (($lotAtt06 == null) ? 43 : $lotAtt06.hashCode());
        Object $packCode = getPackCode();
        result = result * 59 + (($packCode == null) ? 43 : $packCode.hashCode());
        Object $uomCode = getUomCode();
        result = result * 59 + (($uomCode == null) ? 43 : $uomCode.hashCode());
        Object $quantity = getQuantity();
        return result * 59 + (($quantity == null) ? 43 : $quantity.hashCode());
    }

    public String toString() {
        return "BatchVo(fixStatusCode=" + getFixStatusCode() + ", productionDate=" + getProductionDate() + ", expiryDate=" + getExpiryDate() + ", lotAtt01=" + getLotAtt01() + ", lotAtt02=" + getLotAtt02() + ", lotAtt06=" + getLotAtt06() + ", packCode=" + getPackCode() + ", uomCode=" + getUomCode() + ", quantity=" + getQuantity() + ")";
    }

    
    
    public String getFixStatusCode() {
        /* 18 */
        return this.fixStatusCode;
        
    }

    
    
    
    
    public Date getExpiryDate() {
        /* 24 */
        return this.expiryDate;
        
    }

    
    public String getLotAtt01() {
        /* 27 */
        return this.lotAtt01;
        
    }

    
    public String getLotAtt02() {
        /* 30 */
        return this.lotAtt02;
        
    }

    
    public String getLotAtt06() {
        /* 33 */
        return this.lotAtt06;
        
    }

    
    public String getPackCode() {
        /* 36 */
        return this.packCode;
        
    }

    
    public String getUomCode() {
        /* 39 */
        return this.uomCode;
        
    }

    
    public Integer getQuantity() {
        /* 42 */
        return this.quantity;
        
    }

    
    public Date getProductionDate() {
        /* 45 */
        return this.productionDate;
        
    }
    
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\BatchVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */