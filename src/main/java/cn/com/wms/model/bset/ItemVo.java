
package cn.com.wms.model.bset;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class ItemVo implements Serializable {
    private Long lineNo;
    private String itemSkuCode;
    private String itemName;
    private Integer itemQuantity;
    private Integer packageCount;
    private String uomCode;
    private BigDecimal weight;
    private BigDecimal volume;
    private BigDecimal volumeWeight;
    private BigDecimal unitPrice;
    private BigDecimal declaredValue;
    private String fixStatusCode;
    private String productionDate;

    public void setLineNo(Long lineNo) {
        this.lineNo = lineNo;
    }

    private String expiryDate;
    private String lotAtt01;
    private String lotAtt02;
    private String lotAtt12;
    private String providerCode;
    private String providerFrom;
    private String providerName;
    private String packCode;
    private String packageStandard;
    private String remark;
    private Integer defectiveQuantity;
    private BigDecimal averageWeight;
    private List<BatchVo> batchs;

    public void setItemSkuCode(String itemSkuCode) {
        this.itemSkuCode = itemSkuCode;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }

    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setVolumeWeight(BigDecimal volumeWeight) {
        this.volumeWeight = volumeWeight;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDeclaredValue(BigDecimal declaredValue) {
        this.declaredValue = declaredValue;
    }

    public void setFixStatusCode(String fixStatusCode) {
        this.fixStatusCode = fixStatusCode;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setLotAtt01(String lotAtt01) {
        this.lotAtt01 = lotAtt01;
    }

    public void setLotAtt02(String lotAtt02) {
        this.lotAtt02 = lotAtt02;
    }

    public void setLotAtt12(String lotAtt12) {
        this.lotAtt12 = lotAtt12;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public void setProviderFrom(String providerFrom) {
        this.providerFrom = providerFrom;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setPackCode(String packCode) {
        this.packCode = packCode;
    }

    public void setPackageStandard(String packageStandard) {
        this.packageStandard = packageStandard;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setDefectiveQuantity(Integer defectiveQuantity) {
        this.defectiveQuantity = defectiveQuantity;
    }

    public void setAverageWeight(BigDecimal averageWeight) {
        this.averageWeight = averageWeight;
    }

    public void setBatchs(List<BatchVo> batchs) {
        this.batchs = batchs;
    }


    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.ItemVo;
    }


    public String toString() {
        return "ItemVo(lineNo=" + getLineNo() + ", itemSkuCode=" + getItemSkuCode() + ", itemName=" + getItemName() + ", itemQuantity=" + getItemQuantity() + ", packageCount=" + getPackageCount() + ", uomCode=" + getUomCode() + ", weight=" + getWeight() + ", volume=" + getVolume() + ", volumeWeight=" + getVolumeWeight() + ", unitPrice=" + getUnitPrice() + ", declaredValue=" + getDeclaredValue() + ", fixStatusCode=" + getFixStatusCode() + ", productionDate=" + getProductionDate() + ", expiryDate=" + getExpiryDate() + ", lotAtt01=" + getLotAtt01() + ", lotAtt02=" + getLotAtt02() + ", lotAtt12=" + getLotAtt12() + ", providerCode=" + getProviderCode() + ", providerFrom=" + getProviderFrom() + ", providerName=" + getProviderName() + ", packCode=" + getPackCode() + ", packageStandard=" + getPackageStandard() + ", remark=" + getRemark() + ", defectiveQuantity=" + getDefectiveQuantity() + ", averageWeight=" + getAverageWeight() + ", batchs=" + getBatchs() + ")";
    }

    
    
    public Long getLineNo() {
        /* 19 */
        return this.lineNo;
        
    }

    
    public String getItemSkuCode() {
        /* 22 */
        return this.itemSkuCode;
        
    }

    
    public String getItemName() {
        /* 25 */
        return this.itemName;
        
    }

    
    public Integer getItemQuantity() {
        /* 28 */
        return this.itemQuantity;
        
    }

    
    public Integer getPackageCount() {
        /* 31 */
        return this.packageCount;
        
    }

    
    public String getUomCode() {
        /* 34 */
        return this.uomCode;
        
    }

    
    public BigDecimal getWeight() {
        /* 37 */
        return this.weight;
        
    }

    
    public BigDecimal getVolume() {
        /* 40 */
        return this.volume;
        
    }

    
    public BigDecimal getVolumeWeight() {
        /* 43 */
        return this.volumeWeight;
        
    }

    
    public BigDecimal getUnitPrice() {
        /* 46 */
        return this.unitPrice;
        
    }

    
    public BigDecimal getDeclaredValue() {
        /* 49 */
        return this.declaredValue;
        
    }

    
    public String getFixStatusCode() {
        /* 52 */
        return this.fixStatusCode;
        
    }

    
    public String getProductionDate() {
        /* 55 */
        return this.productionDate;
        
    }

    
    public String getExpiryDate() {
        /* 58 */
        return this.expiryDate;
        
    }

    
    public String getLotAtt01() {
        /* 61 */
        return this.lotAtt01;
        
    }

    
    public String getLotAtt02() {
        /* 64 */
        return this.lotAtt02;
        
    }

    
    public String getLotAtt12() {
        /* 67 */
        return this.lotAtt12;
        
    }

    
    public String getProviderCode() {
        /* 70 */
        return this.providerCode;
        
    }

    
    public String getProviderFrom() {
        /* 73 */
        return this.providerFrom;
        
    }

    
    public String getProviderName() {
        /* 76 */
        return this.providerName;
        
    }

    
    public String getPackCode() {
        /* 79 */
        return this.packCode;
        
    }

    
    public String getPackageStandard() {
        /* 82 */
        return this.packageStandard;
        
    }

    
    public String getRemark() {
        /* 85 */
        return this.remark;
        
    }

    
    public Integer getDefectiveQuantity() {
        /* 88 */
        return this.defectiveQuantity;
        
    }

    public BigDecimal getAverageWeight() {
        /* 90 */
        return this.averageWeight;
        
    }

    
    public List<BatchVo> getBatchs() {
        /* 93 */
        return this.batchs;
        
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ItemVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */