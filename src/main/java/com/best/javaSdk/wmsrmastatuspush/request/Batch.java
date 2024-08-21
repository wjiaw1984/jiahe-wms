
package com.best.javaSdk.wmsrmastatuspush.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Batch {
    private String fixStatusCode;
    private String productionDate;
    private String expiryDate;
    private String packCode;
    private String uomCode;
    private int quantity;
    private BigDecimal decimalQuantity;


    /* 12 */
    public void setFixStatusCode(String fixStatusCode) {
        this.fixStatusCode = fixStatusCode;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setPackCode(String packCode) {
        this.packCode = packCode;
    }

    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDecimalQuantity(BigDecimal decimalQuantity) {
        this.decimalQuantity = decimalQuantity;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.wmsrmastatuspush.request.Batch)) return false;
        com.best.javaSdk.wmsrmastatuspush.request.Batch other = (com.best.javaSdk.wmsrmastatuspush.request.Batch) o;
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
        Object this$packCode = getPackCode(), other$packCode = other.getPackCode();
        if ((this$packCode == null) ? (other$packCode != null) : !this$packCode.equals(other$packCode)) return false;
        Object this$uomCode = getUomCode(), other$uomCode = other.getUomCode();
        if ((this$uomCode == null) ? (other$uomCode != null) : !this$uomCode.equals(other$uomCode)) return false;
        if (getQuantity() != other.getQuantity()) return false;
        Object this$decimalQuantity = getDecimalQuantity(), other$decimalQuantity = other.getDecimalQuantity();
        return !((this$decimalQuantity == null) ? (other$decimalQuantity != null) : !this$decimalQuantity.equals(other$decimalQuantity));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsrmastatuspush.request.Batch;
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
        Object $packCode = getPackCode();
        result = result * 59 + (($packCode == null) ? 43 : $packCode.hashCode());
        Object $uomCode = getUomCode();
        result = result * 59 + (($uomCode == null) ? 43 : $uomCode.hashCode());
        result = result * 59 + getQuantity();
        Object $decimalQuantity = getDecimalQuantity();
        return result * 59 + (($decimalQuantity == null) ? 43 : $decimalQuantity.hashCode());
    }

    public String toString() {
        return "Batch(fixStatusCode=" + getFixStatusCode() + ", productionDate=" + getProductionDate() + ", expiryDate=" + getExpiryDate() + ", packCode=" + getPackCode() + ", uomCode=" + getUomCode() + ", quantity=" + getQuantity() + ", decimalQuantity=" + getDecimalQuantity() + ")";
    }


    /* 14 */
    public String getFixStatusCode() {
        return this.fixStatusCode;
    }

    /* 15 */
    public String getProductionDate() {
        return this.productionDate;
    }

    /* 16 */
    public String getExpiryDate() {
        return this.expiryDate;
    }

    /* 17 */
    public String getPackCode() {
        return this.packCode;
    }

    /* 18 */
    public String getUomCode() {
        return this.uomCode;
    }

    /* 19 */
    public int getQuantity() {
        return this.quantity;
    }

    public BigDecimal getDecimalQuantity() {
        /* 20 */
        return this.decimalQuantity;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsrmastatuspush\request\Batch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */