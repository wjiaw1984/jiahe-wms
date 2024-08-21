
package cn.com.wms.model.bset;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
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


    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.ReceiptItemVo;
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