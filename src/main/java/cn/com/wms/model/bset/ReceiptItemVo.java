
package cn.com.wms.model.bset;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


 public class ReceiptItemVo implements Serializable {
       private String itemSkuCode;
       private String providerCode;
       private String providerFrom;
       private String providerName;
       private BigDecimal itemQuantity;
       private BigDecimal normalQuantity;
       private BigDecimal decimalNormalQty;
       private BigDecimal defectiveQuantity;
       private BigDecimal decimalDefectiveQty;
       private BigDecimal averageWeight;
       private BigDecimal averageGrossWeight;

    
    /* 16 */
    public void setItemSkuCode(String itemSkuCode) {
        this.itemSkuCode = itemSkuCode;
    }

    private BigDecimal averageNetWeight;
    private BigDecimal averageVolume;
    private BigDecimal averageLength;
    private BigDecimal averageWidth;
    private BigDecimal averageHeight;
    private Long lineNo;
    private String barCode;
    private String skuUdf1;
    private String skuUdf8;
    private String udf1;
    private String udf8;
    private List<BatchVo> batchs;

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public void setProviderFrom(String providerFrom) {
        this.providerFrom = providerFrom;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setItemQuantity(BigDecimal itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setNormalQuantity(BigDecimal normalQuantity) {
        this.normalQuantity = normalQuantity;
    }

    public void setDecimalNormalQty(BigDecimal decimalNormalQty) {
        this.decimalNormalQty = decimalNormalQty;
    }

    public void setDefectiveQuantity(BigDecimal defectiveQuantity) {
        this.defectiveQuantity = defectiveQuantity;
    }

    public void setDecimalDefectiveQty(BigDecimal decimalDefectiveQty) {
        this.decimalDefectiveQty = decimalDefectiveQty;
    }

    public void setAverageWeight(BigDecimal averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setAverageGrossWeight(BigDecimal averageGrossWeight) {
        this.averageGrossWeight = averageGrossWeight;
    }

    public void setAverageNetWeight(BigDecimal averageNetWeight) {
        this.averageNetWeight = averageNetWeight;
    }

    public void setAverageVolume(BigDecimal averageVolume) {
        this.averageVolume = averageVolume;
    }

    public void setAverageLength(BigDecimal averageLength) {
        this.averageLength = averageLength;
    }

    public void setAverageWidth(BigDecimal averageWidth) {
        this.averageWidth = averageWidth;
    }

    public void setAverageHeight(BigDecimal averageHeight) {
        this.averageHeight = averageHeight;
    }

    public void setLineNo(Long lineNo) {
        this.lineNo = lineNo;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setSkuUdf1(String skuUdf1) {
        this.skuUdf1 = skuUdf1;
    }

    public void setSkuUdf8(String skuUdf8) {
        this.skuUdf8 = skuUdf8;
    }

    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }

    public void setUdf8(String udf8) {
        this.udf8 = udf8;
    }

    public void setBatchs(List<BatchVo> batchs) {
        this.batchs = batchs;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.bset.ReceiptItemVo)) return false;
        cn.com.wms.model.bset.ReceiptItemVo other = (cn.com.wms.model.bset.ReceiptItemVo) o;
        if (!other.canEqual(this)) return false;
        Object this$itemSkuCode = getItemSkuCode(), other$itemSkuCode = other.getItemSkuCode();
        if ((this$itemSkuCode == null) ? (other$itemSkuCode != null) : !this$itemSkuCode.equals(other$itemSkuCode))
            return false;
        Object this$providerCode = getProviderCode(), other$providerCode = other.getProviderCode();
        if ((this$providerCode == null) ? (other$providerCode != null) : !this$providerCode.equals(other$providerCode))
            return false;
        Object this$providerFrom = getProviderFrom(), other$providerFrom = other.getProviderFrom();
        if ((this$providerFrom == null) ? (other$providerFrom != null) : !this$providerFrom.equals(other$providerFrom))
            return false;
        Object this$providerName = getProviderName(), other$providerName = other.getProviderName();
        if ((this$providerName == null) ? (other$providerName != null) : !this$providerName.equals(other$providerName))
            return false;
        Object this$itemQuantity = getItemQuantity(), other$itemQuantity = other.getItemQuantity();
        if ((this$itemQuantity == null) ? (other$itemQuantity != null) : !this$itemQuantity.equals(other$itemQuantity))
            return false;
        Object this$normalQuantity = getNormalQuantity(), other$normalQuantity = other.getNormalQuantity();
        if ((this$normalQuantity == null) ? (other$normalQuantity != null) : !this$normalQuantity.equals(other$normalQuantity))
            return false;
        Object this$decimalNormalQty = getDecimalNormalQty(), other$decimalNormalQty = other.getDecimalNormalQty();
        if ((this$decimalNormalQty == null) ? (other$decimalNormalQty != null) : !this$decimalNormalQty.equals(other$decimalNormalQty))
            return false;
        Object this$defectiveQuantity = getDefectiveQuantity(), other$defectiveQuantity = other.getDefectiveQuantity();
        if ((this$defectiveQuantity == null) ? (other$defectiveQuantity != null) : !this$defectiveQuantity.equals(other$defectiveQuantity))
            return false;
        Object this$decimalDefectiveQty = getDecimalDefectiveQty(), other$decimalDefectiveQty = other.getDecimalDefectiveQty();
        if ((this$decimalDefectiveQty == null) ? (other$decimalDefectiveQty != null) : !this$decimalDefectiveQty.equals(other$decimalDefectiveQty))
            return false;
        Object this$averageWeight = getAverageWeight(), other$averageWeight = other.getAverageWeight();
        if ((this$averageWeight == null) ? (other$averageWeight != null) : !this$averageWeight.equals(other$averageWeight))
            return false;
        Object this$averageGrossWeight = getAverageGrossWeight(), other$averageGrossWeight = other.getAverageGrossWeight();
        if ((this$averageGrossWeight == null) ? (other$averageGrossWeight != null) : !this$averageGrossWeight.equals(other$averageGrossWeight))
            return false;
        Object this$averageNetWeight = getAverageNetWeight(), other$averageNetWeight = other.getAverageNetWeight();
        if ((this$averageNetWeight == null) ? (other$averageNetWeight != null) : !this$averageNetWeight.equals(other$averageNetWeight))
            return false;
        Object this$averageVolume = getAverageVolume(), other$averageVolume = other.getAverageVolume();
        if ((this$averageVolume == null) ? (other$averageVolume != null) : !this$averageVolume.equals(other$averageVolume))
            return false;
        Object this$averageLength = getAverageLength(), other$averageLength = other.getAverageLength();
        if ((this$averageLength == null) ? (other$averageLength != null) : !this$averageLength.equals(other$averageLength))
            return false;
        Object this$averageWidth = getAverageWidth(), other$averageWidth = other.getAverageWidth();
        if ((this$averageWidth == null) ? (other$averageWidth != null) : !this$averageWidth.equals(other$averageWidth))
            return false;
        Object this$averageHeight = getAverageHeight(), other$averageHeight = other.getAverageHeight();
        if ((this$averageHeight == null) ? (other$averageHeight != null) : !this$averageHeight.equals(other$averageHeight))
            return false;
        Object this$lineNo = getLineNo(), other$lineNo = other.getLineNo();
        if ((this$lineNo == null) ? (other$lineNo != null) : !this$lineNo.equals(other$lineNo)) return false;
        Object this$barCode = getBarCode(), other$barCode = other.getBarCode();
        if ((this$barCode == null) ? (other$barCode != null) : !this$barCode.equals(other$barCode)) return false;
        Object this$skuUdf1 = getSkuUdf1(), other$skuUdf1 = other.getSkuUdf1();
        if ((this$skuUdf1 == null) ? (other$skuUdf1 != null) : !this$skuUdf1.equals(other$skuUdf1)) return false;
        Object this$skuUdf8 = getSkuUdf8(), other$skuUdf8 = other.getSkuUdf8();
        if ((this$skuUdf8 == null) ? (other$skuUdf8 != null) : !this$skuUdf8.equals(other$skuUdf8)) return false;
        Object this$udf1 = getUdf1(), other$udf1 = other.getUdf1();
        if ((this$udf1 == null) ? (other$udf1 != null) : !this$udf1.equals(other$udf1)) return false;
        Object this$udf8 = getUdf8(), other$udf8 = other.getUdf8();
        if ((this$udf8 == null) ? (other$udf8 != null) : !this$udf8.equals(other$udf8)) return false;
        Object<BatchVo> this$batchs = (Object<BatchVo>) getBatchs(), other$batchs = (Object<BatchVo>) other.getBatchs();
        return !((this$batchs == null) ? (other$batchs != null) : !this$batchs.equals(other$batchs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.ReceiptItemVo;
    }

    public int hashCode() {
        int PRIME = 59;
        result = 1;
        Object $itemSkuCode = getItemSkuCode();
        result = result * 59 + (($itemSkuCode == null) ? 43 : $itemSkuCode.hashCode());
        Object $providerCode = getProviderCode();
        result = result * 59 + (($providerCode == null) ? 43 : $providerCode.hashCode());
        Object $providerFrom = getProviderFrom();
        result = result * 59 + (($providerFrom == null) ? 43 : $providerFrom.hashCode());
        Object $providerName = getProviderName();
        result = result * 59 + (($providerName == null) ? 43 : $providerName.hashCode());
        Object $itemQuantity = getItemQuantity();
        result = result * 59 + (($itemQuantity == null) ? 43 : $itemQuantity.hashCode());
        Object $normalQuantity = getNormalQuantity();
        result = result * 59 + (($normalQuantity == null) ? 43 : $normalQuantity.hashCode());
        Object $decimalNormalQty = getDecimalNormalQty();
        result = result * 59 + (($decimalNormalQty == null) ? 43 : $decimalNormalQty.hashCode());
        Object $defectiveQuantity = getDefectiveQuantity();
        result = result * 59 + (($defectiveQuantity == null) ? 43 : $defectiveQuantity.hashCode());
        Object $decimalDefectiveQty = getDecimalDefectiveQty();
        result = result * 59 + (($decimalDefectiveQty == null) ? 43 : $decimalDefectiveQty.hashCode());
        Object $averageWeight = getAverageWeight();
        result = result * 59 + (($averageWeight == null) ? 43 : $averageWeight.hashCode());
        Object $averageGrossWeight = getAverageGrossWeight();
        result = result * 59 + (($averageGrossWeight == null) ? 43 : $averageGrossWeight.hashCode());
        Object $averageNetWeight = getAverageNetWeight();
        result = result * 59 + (($averageNetWeight == null) ? 43 : $averageNetWeight.hashCode());
        Object $averageVolume = getAverageVolume();
        result = result * 59 + (($averageVolume == null) ? 43 : $averageVolume.hashCode());
        Object $averageLength = getAverageLength();
        result = result * 59 + (($averageLength == null) ? 43 : $averageLength.hashCode());
        Object $averageWidth = getAverageWidth();
        result = result * 59 + (($averageWidth == null) ? 43 : $averageWidth.hashCode());
        Object $averageHeight = getAverageHeight();
        result = result * 59 + (($averageHeight == null) ? 43 : $averageHeight.hashCode());
        Object $lineNo = getLineNo();
        result = result * 59 + (($lineNo == null) ? 43 : $lineNo.hashCode());
        Object $barCode = getBarCode();
        result = result * 59 + (($barCode == null) ? 43 : $barCode.hashCode());
        Object $skuUdf1 = getSkuUdf1();
        result = result * 59 + (($skuUdf1 == null) ? 43 : $skuUdf1.hashCode());
        Object $skuUdf8 = getSkuUdf8();
        result = result * 59 + (($skuUdf8 == null) ? 43 : $skuUdf8.hashCode());
        Object $udf1 = getUdf1();
        result = result * 59 + (($udf1 == null) ? 43 : $udf1.hashCode());
        Object $udf8 = getUdf8();
        result = result * 59 + (($udf8 == null) ? 43 : $udf8.hashCode());
        Object<BatchVo> $batchs = (Object<BatchVo>) getBatchs();
        return result * 59 + (($batchs == null) ? 43 : $batchs.hashCode());
    }

    public String toString() {
        return "ReceiptItemVo(itemSkuCode=" + getItemSkuCode() + ", providerCode=" + getProviderCode() + ", providerFrom=" + getProviderFrom() + ", providerName=" + getProviderName() + ", itemQuantity=" + getItemQuantity() + ", normalQuantity=" + getNormalQuantity() + ", decimalNormalQty=" + getDecimalNormalQty() + ", defectiveQuantity=" + getDefectiveQuantity() + ", decimalDefectiveQty=" + getDecimalDefectiveQty() + ", averageWeight=" + getAverageWeight() + ", averageGrossWeight=" + getAverageGrossWeight() + ", averageNetWeight=" + getAverageNetWeight() + ", averageVolume=" + getAverageVolume() + ", averageLength=" + getAverageLength() + ", averageWidth=" + getAverageWidth() + ", averageHeight=" + getAverageHeight() + ", lineNo=" + getLineNo() + ", barCode=" + getBarCode() + ", skuUdf1=" + getSkuUdf1() + ", skuUdf8=" + getSkuUdf8() + ", udf1=" + getUdf1() + ", udf8=" + getUdf8() + ", batchs=" + getBatchs() + ")";
    }

    
    
    public String getItemSkuCode() {
        /* 19 */
        return this.itemSkuCode;
        
    }

    public String getProviderCode() {
        /* 21 */
        return this.providerCode;
        
    }

    public String getProviderFrom() {
        /* 23 */
        return this.providerFrom;
        
    }

    public String getProviderName() {
        /* 25 */
        return this.providerName;
        
    }

    public BigDecimal getItemQuantity() {
        /* 27 */
        return this.itemQuantity;
        
    }

    public BigDecimal getNormalQuantity() {
        /* 29 */
        return this.normalQuantity;
        
    }

    public BigDecimal getDecimalNormalQty() {
        /* 31 */
        return this.decimalNormalQty;
        
    }

    public BigDecimal getDefectiveQuantity() {
        /* 33 */
        return this.defectiveQuantity;
        
    }

    public BigDecimal getDecimalDefectiveQty() {
        /* 35 */
        return this.decimalDefectiveQty;
        
    }

    public BigDecimal getAverageWeight() {
        /* 37 */
        return this.averageWeight;
        
    }

    public BigDecimal getAverageGrossWeight() {
        /* 39 */
        return this.averageGrossWeight;
        
    }

    public BigDecimal getAverageNetWeight() {
        /* 41 */
        return this.averageNetWeight;
        
    }

    
    public BigDecimal getAverageVolume() {
        /* 44 */
        return this.averageVolume;
        
    }

    public BigDecimal getAverageLength() {
        /* 46 */
        return this.averageLength;
        
    }

    public BigDecimal getAverageWidth() {
        /* 48 */
        return this.averageWidth;
        
    }

    public BigDecimal getAverageHeight() {
        /* 50 */
        return this.averageHeight;
        
    }

    public Long getLineNo() {
        /* 52 */
        return this.lineNo;
        
    }

    public String getBarCode() {
        /* 54 */
        return this.barCode;
        
    }

    public String getSkuUdf1() {
        /* 56 */
        return this.skuUdf1;
        
    }

    public String getSkuUdf8() {
        /* 58 */
        return this.skuUdf8;
        
    }

    public String getUdf1() {
        /* 60 */
        return this.udf1;
        
    }

    public String getUdf8() {
        /* 62 */
        return this.udf8;
        
    }

    public List<BatchVo> getBatchs() {
        /* 64 */
        return this.batchs;
        
    }
    
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ReceiptItemVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */