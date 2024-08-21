
package com.best.javaSdk.wmsAsnStatusPush.request;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Product {
    private String itemSkuCode;
    private String providerCode;
    private String providerName;
    private BigDecimal itemQuantity;
    private BigDecimal normalQuantity;
    private BigDecimal defectiveQuantity;
    private BigDecimal decimalNormalQty;
    private BigDecimal decimalDefectiveQty;
    private String averageWeight;
    private String averageGrossWeight;


    public void setItemSkuCode(String itemSkuCode) {
        this.itemSkuCode = itemSkuCode;
    }

    private String averageNetWeight;
    private String averageVolume;
    private String averageLength;
    private String averageWidth;
    private String averageHeight;
    private String lineNo;
    private String barCode;
    private String skuUdf1;
    private String skuUdf2;
    private List<Batchs> batchs;

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
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

    public void setDefectiveQuantity(BigDecimal defectiveQuantity) {
        this.defectiveQuantity = defectiveQuantity;
    }

    public void setDecimalNormalQty(BigDecimal decimalNormalQty) {
        this.decimalNormalQty = decimalNormalQty;
    }

    public void setDecimalDefectiveQty(BigDecimal decimalDefectiveQty) {
        this.decimalDefectiveQty = decimalDefectiveQty;
    }

    public void setAverageWeight(String averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setAverageGrossWeight(String averageGrossWeight) {
        this.averageGrossWeight = averageGrossWeight;
    }

    public void setAverageNetWeight(String averageNetWeight) {
        this.averageNetWeight = averageNetWeight;
    }

    public void setAverageVolume(String averageVolume) {
        this.averageVolume = averageVolume;
    }

    public void setAverageLength(String averageLength) {
        this.averageLength = averageLength;
    }

    public void setAverageWidth(String averageWidth) {
        this.averageWidth = averageWidth;
    }

    public void setAverageHeight(String averageHeight) {
        this.averageHeight = averageHeight;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setSkuUdf1(String skuUdf1) {
        this.skuUdf1 = skuUdf1;
    }

    public void setSkuUdf2(String skuUdf2) {
        this.skuUdf2 = skuUdf2;
    }

    public void setBatchs(List<Batchs> batchs) {
        this.batchs = batchs;
    }


    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsAsnStatusPush.request.Product;
    }


    public String toString() {
        return "Product(itemSkuCode=" + getItemSkuCode() + ", providerCode=" + getProviderCode() + ", providerName=" + getProviderName() + ", itemQuantity=" + getItemQuantity() + ", normalQuantity=" + getNormalQuantity() + ", defectiveQuantity=" + getDefectiveQuantity() + ", decimalNormalQty=" + getDecimalNormalQty() + ", decimalDefectiveQty=" + getDecimalDefectiveQty() + ", averageWeight=" + getAverageWeight() + ", averageGrossWeight=" + getAverageGrossWeight() + ", averageNetWeight=" + getAverageNetWeight() + ", averageVolume=" + getAverageVolume() + ", averageLength=" + getAverageLength() + ", averageWidth=" + getAverageWidth() + ", averageHeight=" + getAverageHeight() + ", lineNo=" + getLineNo() + ", barCode=" + getBarCode() + ", skuUdf1=" + getSkuUdf1() + ", skuUdf2=" + getSkuUdf2() + ", batchs=" + getBatchs() + ")";
    }


    public String getItemSkuCode() {
        /* 14 */
        return this.itemSkuCode;

    }

    public String getProviderCode() {
        /* 16 */
        return this.providerCode;

    }

    public String getProviderName() {
        /* 18 */
        return this.providerName;

    }

    public BigDecimal getItemQuantity() {
        /* 20 */
        return this.itemQuantity;

    }

    public BigDecimal getNormalQuantity() {
        /* 22 */
        return this.normalQuantity;

    }

    public BigDecimal getDefectiveQuantity() {
        /* 24 */
        return this.defectiveQuantity;

    }

    public BigDecimal getDecimalNormalQty() {
        /* 26 */
        return this.decimalNormalQty;

    }

    public BigDecimal getDecimalDefectiveQty() {
        /* 28 */
        return this.decimalDefectiveQty;

    }

    public String getAverageWeight() {
        /* 30 */
        return this.averageWeight;

    }

    public String getAverageGrossWeight() {
        /* 32 */
        return this.averageGrossWeight;

    }

    public String getAverageNetWeight() {
        /* 34 */
        return this.averageNetWeight;

    }

    public String getAverageVolume() {
        /* 36 */
        return this.averageVolume;

    }

    public String getAverageLength() {
        /* 38 */
        return this.averageLength;

    }

    public String getAverageWidth() {
        /* 40 */
        return this.averageWidth;

    }

    public String getAverageHeight() {
        /* 42 */
        return this.averageHeight;

    }

    public String getLineNo() {
        /* 44 */
        return this.lineNo;

    }

    public String getBarCode() {
        /* 46 */
        return this.barCode;

    }

    public String getSkuUdf1() {
        /* 48 */
        return this.skuUdf1;

    }

    public String getSkuUdf2() {
        /* 50 */
        return this.skuUdf2;

    }

    public List<Batchs> getBatchs() {
        /* 52 */
        return this.batchs;

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsAsnStatusPush\request\Product.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */