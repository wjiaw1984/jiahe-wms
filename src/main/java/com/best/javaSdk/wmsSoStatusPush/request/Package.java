
package com.best.javaSdk.wmsSoStatusPush.request;

import java.math.BigDecimal;


 public class Package {
       private String packCode;
       private String packLogisticsProviderCode;
       private String packShippingOrderNo;
       private BigDecimal packWeight;
       private BigDecimal packNetWeight;
       private int packGrossWeight;

    
    /* 11 */
    public void setPackCode(String packCode) {
        this.packCode = packCode;
    }

    private BigDecimal packVolume;
    private int packLength;
    private int packWidth;
    private int packHeight;
    private String warehouseCode;
    private PackProducts packProducts;

    public void setPackLogisticsProviderCode(String packLogisticsProviderCode) {
        this.packLogisticsProviderCode = packLogisticsProviderCode;
    }

    public void setPackShippingOrderNo(String packShippingOrderNo) {
        this.packShippingOrderNo = packShippingOrderNo;
    }

    public void setPackWeight(BigDecimal packWeight) {
        this.packWeight = packWeight;
    }

    public void setPackNetWeight(BigDecimal packNetWeight) {
        this.packNetWeight = packNetWeight;
    }

    public void setPackGrossWeight(int packGrossWeight) {
        this.packGrossWeight = packGrossWeight;
    }

    public void setPackVolume(BigDecimal packVolume) {
        this.packVolume = packVolume;
    }

    public void setPackLength(int packLength) {
        this.packLength = packLength;
    }

    public void setPackWidth(int packWidth) {
        this.packWidth = packWidth;
    }

    public void setPackHeight(int packHeight) {
        this.packHeight = packHeight;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setPackProducts(PackProducts packProducts) {
        this.packProducts = packProducts;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.request.Package)) return false;
        com.best.javaSdk.wmsSoStatusPush.request.Package other = (com.best.javaSdk.wmsSoStatusPush.request.Package) o;
        if (!other.canEqual(this)) return false;
        Object this$packCode = getPackCode(), other$packCode = other.getPackCode();
        if ((this$packCode == null) ? (other$packCode != null) : !this$packCode.equals(other$packCode)) return false;
        Object this$packLogisticsProviderCode = getPackLogisticsProviderCode(), other$packLogisticsProviderCode = other.getPackLogisticsProviderCode();
        if ((this$packLogisticsProviderCode == null) ? (other$packLogisticsProviderCode != null) : !this$packLogisticsProviderCode.equals(other$packLogisticsProviderCode))
            return false;
        Object this$packShippingOrderNo = getPackShippingOrderNo(), other$packShippingOrderNo = other.getPackShippingOrderNo();
        if ((this$packShippingOrderNo == null) ? (other$packShippingOrderNo != null) : !this$packShippingOrderNo.equals(other$packShippingOrderNo))
            return false;
        Object this$packWeight = getPackWeight(), other$packWeight = other.getPackWeight();
        if ((this$packWeight == null) ? (other$packWeight != null) : !this$packWeight.equals(other$packWeight))
            return false;
        Object this$packNetWeight = getPackNetWeight(), other$packNetWeight = other.getPackNetWeight();
        if ((this$packNetWeight == null) ? (other$packNetWeight != null) : !this$packNetWeight.equals(other$packNetWeight))
            return false;
        if (getPackGrossWeight() != other.getPackGrossWeight()) return false;
        Object this$packVolume = getPackVolume(), other$packVolume = other.getPackVolume();
        if ((this$packVolume == null) ? (other$packVolume != null) : !this$packVolume.equals(other$packVolume))
            return false;
        if (getPackLength() != other.getPackLength()) return false;
        if (getPackWidth() != other.getPackWidth()) return false;
        if (getPackHeight() != other.getPackHeight()) return false;
        Object this$warehouseCode = getWarehouseCode(), other$warehouseCode = other.getWarehouseCode();
        if ((this$warehouseCode == null) ? (other$warehouseCode != null) : !this$warehouseCode.equals(other$warehouseCode))
            return false;
        Object this$packProducts = getPackProducts(), other$packProducts = other.getPackProducts();
        return !((this$packProducts == null) ? (other$packProducts != null) : !this$packProducts.equals(other$packProducts));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsSoStatusPush.request.Package;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $packCode = getPackCode();
        result = result * 59 + (($packCode == null) ? 43 : $packCode.hashCode());
        Object $packLogisticsProviderCode = getPackLogisticsProviderCode();
        result = result * 59 + (($packLogisticsProviderCode == null) ? 43 : $packLogisticsProviderCode.hashCode());
        Object $packShippingOrderNo = getPackShippingOrderNo();
        result = result * 59 + (($packShippingOrderNo == null) ? 43 : $packShippingOrderNo.hashCode());
        Object $packWeight = getPackWeight();
        result = result * 59 + (($packWeight == null) ? 43 : $packWeight.hashCode());
        Object $packNetWeight = getPackNetWeight();
        result = result * 59 + (($packNetWeight == null) ? 43 : $packNetWeight.hashCode());
        result = result * 59 + getPackGrossWeight();
        Object $packVolume = getPackVolume();
        result = result * 59 + (($packVolume == null) ? 43 : $packVolume.hashCode());
        result = result * 59 + getPackLength();
        result = result * 59 + getPackWidth();
        result = result * 59 + getPackHeight();
        Object $warehouseCode = getWarehouseCode();
        result = result * 59 + (($warehouseCode == null) ? 43 : $warehouseCode.hashCode());
        Object $packProducts = getPackProducts();
        return result * 59 + (($packProducts == null) ? 43 : $packProducts.hashCode());
    }

    public String toString() {
        return "Package(packCode=" + getPackCode() + ", packLogisticsProviderCode=" + getPackLogisticsProviderCode() + ", packShippingOrderNo=" + getPackShippingOrderNo() + ", packWeight=" + getPackWeight() + ", packNetWeight=" + getPackNetWeight() + ", packGrossWeight=" + getPackGrossWeight() + ", packVolume=" + getPackVolume() + ", packLength=" + getPackLength() + ", packWidth=" + getPackWidth() + ", packHeight=" + getPackHeight() + ", warehouseCode=" + getWarehouseCode() + ", packProducts=" + getPackProducts() + ")";
    }

    
    public String getPackCode() {
        /* 13 */
        return this.packCode;
        
    }

    public String getPackLogisticsProviderCode() {
        /* 15 */
        return this.packLogisticsProviderCode;
        
    }

    public String getPackShippingOrderNo() {
        /* 17 */
        return this.packShippingOrderNo;
        
    }

    public BigDecimal getPackWeight() {
        /* 19 */
        return this.packWeight;
        
    }

    public BigDecimal getPackNetWeight() {
        /* 21 */
        return this.packNetWeight;
        
    }

    public int getPackGrossWeight() {
        /* 23 */
        return this.packGrossWeight;
        
    }

    public BigDecimal getPackVolume() {
        /* 25 */
        return this.packVolume;
        
    }

    public int getPackLength() {
        /* 27 */
        return this.packLength;
        
    }

    public int getPackWidth() {
        /* 29 */
        return this.packWidth;
        
    }

    public int getPackHeight() {
        /* 31 */
        return this.packHeight;
        
    }

    public String getWarehouseCode() {
        /* 33 */
        return this.warehouseCode;
        
    }

    public PackProducts getPackProducts() {
        /* 35 */
        return this.packProducts;
        
    }
    
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\Package.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */