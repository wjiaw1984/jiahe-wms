package com.best.javaSdk.wmsrmastatuspush.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private String itemSkuCode;
    private BigDecimal normalQuantity;
    private BigDecimal defectiveQuantity;

    public void setItemSkuCode(String itemSkuCode) {
        /* 12 */
        this.itemSkuCode = itemSkuCode;
    }

    private BigDecimal decimalNormalQty;
    private BigDecimal decimalDefectiveQty;
    private String lineNo;
    private Batchs batchs;

    public void setNormalQuantity(BigDecimal normalQuantity) {
        this.normalQuantity = normalQuantity;
    }

    public void setDefectiveQuantity(BigDecimal defectiveQuantity) {
        this.defectiveQuantity = defectiveQuantity;
    }

    public void setDecimalNormalQty(BigDecimal decimalNormalQty) {
        this.decimalNormalQty = decimalNormalQty;
    }

    public void setDecimalDefectiveQty(BigDecimal decimalDefectiveQty) {
        this.decimalDefectiveQty = decimalDefectiveQty;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setBatchs(Batchs batchs) {
        this.batchs = batchs;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.wmsrmastatuspush.request.Product)) return false;
        com.best.javaSdk.wmsrmastatuspush.request.Product other = (com.best.javaSdk.wmsrmastatuspush.request.Product) o;
        if (!other.canEqual(this)) return false;
        Object this$itemSkuCode = getItemSkuCode(), other$itemSkuCode = other.getItemSkuCode();
        if ((this$itemSkuCode == null) ? (other$itemSkuCode != null) : !this$itemSkuCode.equals(other$itemSkuCode))
            return false;
        Object this$normalQuantity = getNormalQuantity(), other$normalQuantity = other.getNormalQuantity();
        if ((this$normalQuantity == null) ? (other$normalQuantity != null) : !this$normalQuantity.equals(other$normalQuantity))
            return false;
        Object this$defectiveQuantity = getDefectiveQuantity(), other$defectiveQuantity = other.getDefectiveQuantity();
        if ((this$defectiveQuantity == null) ? (other$defectiveQuantity != null) : !this$defectiveQuantity.equals(other$defectiveQuantity))
            return false;
        Object this$decimalNormalQty = getDecimalNormalQty(), other$decimalNormalQty = other.getDecimalNormalQty();
        if ((this$decimalNormalQty == null) ? (other$decimalNormalQty != null) : !this$decimalNormalQty.equals(other$decimalNormalQty))
            return false;
        Object this$decimalDefectiveQty = getDecimalDefectiveQty(), other$decimalDefectiveQty = other.getDecimalDefectiveQty();
        if ((this$decimalDefectiveQty == null) ? (other$decimalDefectiveQty != null) : !this$decimalDefectiveQty.equals(other$decimalDefectiveQty))
            return false;
        Object this$lineNo = getLineNo(), other$lineNo = other.getLineNo();
        if ((this$lineNo == null) ? (other$lineNo != null) : !this$lineNo.equals(other$lineNo)) return false;
        Object this$batchs = getBatchs(), other$batchs = other.getBatchs();
        return !((this$batchs == null) ? (other$batchs != null) : !this$batchs.equals(other$batchs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsrmastatuspush.request.Product;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $itemSkuCode = getItemSkuCode();
        result = result * 59 + (($itemSkuCode == null) ? 43 : $itemSkuCode.hashCode());
        Object $normalQuantity = getNormalQuantity();
        result = result * 59 + (($normalQuantity == null) ? 43 : $normalQuantity.hashCode());
        Object $defectiveQuantity = getDefectiveQuantity();
        result = result * 59 + (($defectiveQuantity == null) ? 43 : $defectiveQuantity.hashCode());
        Object $decimalNormalQty = getDecimalNormalQty();
        result = result * 59 + (($decimalNormalQty == null) ? 43 : $decimalNormalQty.hashCode());
        Object $decimalDefectiveQty = getDecimalDefectiveQty();
        result = result * 59 + (($decimalDefectiveQty == null) ? 43 : $decimalDefectiveQty.hashCode());
        Object $lineNo = getLineNo();
        result = result * 59 + (($lineNo == null) ? 43 : $lineNo.hashCode());
        Object $batchs = getBatchs();
        return result * 59 + (($batchs == null) ? 43 : $batchs.hashCode());
    }

    public String toString() {
        return "Product(itemSkuCode=" + getItemSkuCode() + ", normalQuantity=" + getNormalQuantity() + ", defectiveQuantity=" + getDefectiveQuantity() + ", decimalNormalQty=" + getDecimalNormalQty() + ", decimalDefectiveQty=" + getDecimalDefectiveQty() + ", lineNo=" + getLineNo() + ", batchs=" + getBatchs() + ")";
    }

    /* 14 */
    public String getItemSkuCode() {
        return this.itemSkuCode;
    }

    /* 15 */
    public BigDecimal getNormalQuantity() {
        return this.normalQuantity;
    }

    /* 16 */
    public BigDecimal getDefectiveQuantity() {
        return this.defectiveQuantity;
    }

    /* 17 */
    public BigDecimal getDecimalNormalQty() {
        return this.decimalNormalQty;
    }

    /* 18 */
    public BigDecimal getDecimalDefectiveQty() {
        return this.decimalDefectiveQty;
    }

    /* 19 */
    public String getLineNo() {
        return this.lineNo;
    }

    public Batchs getBatchs() {
        /* 20 */
        return this.batchs;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsrmastatuspush\request\Product.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */