
package cn.com.wms.model.bset;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Product implements Serializable {
    private String itemSkuCode;
    private String actionType;
    private String itemName;
    private String englishName;
    private String category;
    private String barCode;
    private String volume;
    private String length;
    private String width;
    private String height;
    private String weight;
    private BigDecimal unitPrice;
    private String lotCode;
    private String packCode;


    public void setItemSkuCode(String itemSkuCode) {
        this.itemSkuCode = itemSkuCode;
    }

    private BigDecimal shelfLife;
    private Boolean snFlag;
    private String tradeMark;
    private BigDecimal packingQty;
    private String fullContainerBarCode;
    private String baseUom;
    private String packUom;
    private String userDefined1;
    private String userDefined2;
    private String userDefined3;
    private String userDefined4;
    private String userDefined5;
    private String userDefined6;
    private String userDefined7;
    private String userDefined8;

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setLotCode(String lotCode) {
        this.lotCode = lotCode;
    }

    public void setPackCode(String packCode) {
        this.packCode = packCode;
    }

    public void setShelfLife(BigDecimal shelfLife) {
        this.shelfLife = shelfLife;
    }

    public void setSnFlag(Boolean snFlag) {
        this.snFlag = snFlag;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public void setPackingQty(BigDecimal packingQty) {
        this.packingQty = packingQty;
    }

    public void setFullContainerBarCode(String fullContainerBarCode) {
        this.fullContainerBarCode = fullContainerBarCode;
    }

    public void setBaseUom(String baseUom) {
        this.baseUom = baseUom;
    }

    public void setPackUom(String packUom) {
        this.packUom = packUom;
    }

    public void setUserDefined1(String userDefined1) {
        this.userDefined1 = userDefined1;
    }

    public void setUserDefined2(String userDefined2) {
        this.userDefined2 = userDefined2;
    }

    public void setUserDefined3(String userDefined3) {
        this.userDefined3 = userDefined3;
    }

    public void setUserDefined4(String userDefined4) {
        this.userDefined4 = userDefined4;
    }

    public void setUserDefined5(String userDefined5) {
        this.userDefined5 = userDefined5;
    }

    public void setUserDefined6(String userDefined6) {
        this.userDefined6 = userDefined6;
    }

    public void setUserDefined7(String userDefined7) {
        this.userDefined7 = userDefined7;
    }

    public void setUserDefined8(String userDefined8) {
        this.userDefined8 = userDefined8;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.bset.Product)) return false;
        cn.com.wms.model.bset.Product other = (cn.com.wms.model.bset.Product) o;
        if (!other.canEqual(this)) return false;
        Object this$itemSkuCode = getItemSkuCode(), other$itemSkuCode = other.getItemSkuCode();
        if ((this$itemSkuCode == null) ? (other$itemSkuCode != null) : !this$itemSkuCode.equals(other$itemSkuCode))
            return false;
        Object this$actionType = getActionType(), other$actionType = other.getActionType();
        if ((this$actionType == null) ? (other$actionType != null) : !this$actionType.equals(other$actionType))
            return false;
        Object this$itemName = getItemName(), other$itemName = other.getItemName();
        if ((this$itemName == null) ? (other$itemName != null) : !this$itemName.equals(other$itemName)) return false;
        Object this$englishName = getEnglishName(), other$englishName = other.getEnglishName();
        if ((this$englishName == null) ? (other$englishName != null) : !this$englishName.equals(other$englishName))
            return false;
        Object this$category = getCategory(), other$category = other.getCategory();
        if ((this$category == null) ? (other$category != null) : !this$category.equals(other$category)) return false;
        Object this$barCode = getBarCode(), other$barCode = other.getBarCode();
        if ((this$barCode == null) ? (other$barCode != null) : !this$barCode.equals(other$barCode)) return false;
        Object this$volume = getVolume(), other$volume = other.getVolume();
        if ((this$volume == null) ? (other$volume != null) : !this$volume.equals(other$volume)) return false;
        Object this$length = getLength(), other$length = other.getLength();
        if ((this$length == null) ? (other$length != null) : !this$length.equals(other$length)) return false;
        Object this$width = getWidth(), other$width = other.getWidth();
        if ((this$width == null) ? (other$width != null) : !this$width.equals(other$width)) return false;
        Object this$height = getHeight(), other$height = other.getHeight();
        if ((this$height == null) ? (other$height != null) : !this$height.equals(other$height)) return false;
        Object this$weight = getWeight(), other$weight = other.getWeight();
        if ((this$weight == null) ? (other$weight != null) : !this$weight.equals(other$weight)) return false;
        Object this$unitPrice = getUnitPrice(), other$unitPrice = other.getUnitPrice();
        if ((this$unitPrice == null) ? (other$unitPrice != null) : !this$unitPrice.equals(other$unitPrice))
            return false;
        Object this$lotCode = getLotCode(), other$lotCode = other.getLotCode();
        if ((this$lotCode == null) ? (other$lotCode != null) : !this$lotCode.equals(other$lotCode)) return false;
        Object this$packCode = getPackCode(), other$packCode = other.getPackCode();
        if ((this$packCode == null) ? (other$packCode != null) : !this$packCode.equals(other$packCode)) return false;
        Object this$shelfLife = getShelfLife(), other$shelfLife = other.getShelfLife();
        if ((this$shelfLife == null) ? (other$shelfLife != null) : !this$shelfLife.equals(other$shelfLife))
            return false;
        Object this$snFlag = getSnFlag(), other$snFlag = other.getSnFlag();
        if ((this$snFlag == null) ? (other$snFlag != null) : !this$snFlag.equals(other$snFlag)) return false;
        Object this$tradeMark = getTradeMark(), other$tradeMark = other.getTradeMark();
        if ((this$tradeMark == null) ? (other$tradeMark != null) : !this$tradeMark.equals(other$tradeMark))
            return false;
        Object this$packingQty = getPackingQty(), other$packingQty = other.getPackingQty();
        if ((this$packingQty == null) ? (other$packingQty != null) : !this$packingQty.equals(other$packingQty))
            return false;
        Object this$fullContainerBarCode = getFullContainerBarCode(), other$fullContainerBarCode = other.getFullContainerBarCode();
        if ((this$fullContainerBarCode == null) ? (other$fullContainerBarCode != null) : !this$fullContainerBarCode.equals(other$fullContainerBarCode))
            return false;
        Object this$baseUom = getBaseUom(), other$baseUom = other.getBaseUom();
        if ((this$baseUom == null) ? (other$baseUom != null) : !this$baseUom.equals(other$baseUom)) return false;
        Object this$packUom = getPackUom(), other$packUom = other.getPackUom();
        if ((this$packUom == null) ? (other$packUom != null) : !this$packUom.equals(other$packUom)) return false;
        Object this$userDefined1 = getUserDefined1(), other$userDefined1 = other.getUserDefined1();
        if ((this$userDefined1 == null) ? (other$userDefined1 != null) : !this$userDefined1.equals(other$userDefined1))
            return false;
        Object this$userDefined2 = getUserDefined2(), other$userDefined2 = other.getUserDefined2();
        if ((this$userDefined2 == null) ? (other$userDefined2 != null) : !this$userDefined2.equals(other$userDefined2))
            return false;
        Object this$userDefined3 = getUserDefined3(), other$userDefined3 = other.getUserDefined3();
        if ((this$userDefined3 == null) ? (other$userDefined3 != null) : !this$userDefined3.equals(other$userDefined3))
            return false;
        Object this$userDefined4 = getUserDefined4(), other$userDefined4 = other.getUserDefined4();
        if ((this$userDefined4 == null) ? (other$userDefined4 != null) : !this$userDefined4.equals(other$userDefined4))
            return false;
        Object this$userDefined5 = getUserDefined5(), other$userDefined5 = other.getUserDefined5();
        if ((this$userDefined5 == null) ? (other$userDefined5 != null) : !this$userDefined5.equals(other$userDefined5))
            return false;
        Object this$userDefined6 = getUserDefined6(), other$userDefined6 = other.getUserDefined6();
        if ((this$userDefined6 == null) ? (other$userDefined6 != null) : !this$userDefined6.equals(other$userDefined6))
            return false;
        Object this$userDefined7 = getUserDefined7(), other$userDefined7 = other.getUserDefined7();
        if ((this$userDefined7 == null) ? (other$userDefined7 != null) : !this$userDefined7.equals(other$userDefined7))
            return false;
        Object this$userDefined8 = getUserDefined8(), other$userDefined8 = other.getUserDefined8();
        return !((this$userDefined8 == null) ? (other$userDefined8 != null) : !this$userDefined8.equals(other$userDefined8));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.Product;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $itemSkuCode = getItemSkuCode();
        result = result * 59 + (($itemSkuCode == null) ? 43 : $itemSkuCode.hashCode());
        Object $actionType = getActionType();
        result = result * 59 + (($actionType == null) ? 43 : $actionType.hashCode());
        Object $itemName = getItemName();
        result = result * 59 + (($itemName == null) ? 43 : $itemName.hashCode());
        Object $englishName = getEnglishName();
        result = result * 59 + (($englishName == null) ? 43 : $englishName.hashCode());
        Object $category = getCategory();
        result = result * 59 + (($category == null) ? 43 : $category.hashCode());
        Object $barCode = getBarCode();
        result = result * 59 + (($barCode == null) ? 43 : $barCode.hashCode());
        Object $volume = getVolume();
        result = result * 59 + (($volume == null) ? 43 : $volume.hashCode());
        Object $length = getLength();
        result = result * 59 + (($length == null) ? 43 : $length.hashCode());
        Object $width = getWidth();
        result = result * 59 + (($width == null) ? 43 : $width.hashCode());
        Object $height = getHeight();
        result = result * 59 + (($height == null) ? 43 : $height.hashCode());
        Object $weight = getWeight();
        result = result * 59 + (($weight == null) ? 43 : $weight.hashCode());
        Object $unitPrice = getUnitPrice();
        result = result * 59 + (($unitPrice == null) ? 43 : $unitPrice.hashCode());
        Object $lotCode = getLotCode();
        result = result * 59 + (($lotCode == null) ? 43 : $lotCode.hashCode());
        Object $packCode = getPackCode();
        result = result * 59 + (($packCode == null) ? 43 : $packCode.hashCode());
        Object $shelfLife = getShelfLife();
        result = result * 59 + (($shelfLife == null) ? 43 : $shelfLife.hashCode());
        Object $snFlag = getSnFlag();
        result = result * 59 + (($snFlag == null) ? 43 : $snFlag.hashCode());
        Object $tradeMark = getTradeMark();
        result = result * 59 + (($tradeMark == null) ? 43 : $tradeMark.hashCode());
        Object $packingQty = getPackingQty();
        result = result * 59 + (($packingQty == null) ? 43 : $packingQty.hashCode());
        Object $fullContainerBarCode = getFullContainerBarCode();
        result = result * 59 + (($fullContainerBarCode == null) ? 43 : $fullContainerBarCode.hashCode());
        Object $baseUom = getBaseUom();
        result = result * 59 + (($baseUom == null) ? 43 : $baseUom.hashCode());
        Object $packUom = getPackUom();
        result = result * 59 + (($packUom == null) ? 43 : $packUom.hashCode());
        Object $userDefined1 = getUserDefined1();
        result = result * 59 + (($userDefined1 == null) ? 43 : $userDefined1.hashCode());
        Object $userDefined2 = getUserDefined2();
        result = result * 59 + (($userDefined2 == null) ? 43 : $userDefined2.hashCode());
        Object $userDefined3 = getUserDefined3();
        result = result * 59 + (($userDefined3 == null) ? 43 : $userDefined3.hashCode());
        Object $userDefined4 = getUserDefined4();
        result = result * 59 + (($userDefined4 == null) ? 43 : $userDefined4.hashCode());
        Object $userDefined5 = getUserDefined5();
        result = result * 59 + (($userDefined5 == null) ? 43 : $userDefined5.hashCode());
        Object $userDefined6 = getUserDefined6();
        result = result * 59 + (($userDefined6 == null) ? 43 : $userDefined6.hashCode());
        Object $userDefined7 = getUserDefined7();
        result = result * 59 + (($userDefined7 == null) ? 43 : $userDefined7.hashCode());
        Object $userDefined8 = getUserDefined8();
        return result * 59 + (($userDefined8 == null) ? 43 : $userDefined8.hashCode());
    }

    public String toString() {
        return "Product(itemSkuCode=" + getItemSkuCode() + ", actionType=" + getActionType() + ", itemName=" + getItemName() + ", englishName=" + getEnglishName() + ", category=" + getCategory() + ", barCode=" + getBarCode() + ", volume=" + getVolume() + ", length=" + getLength() + ", width=" + getWidth() + ", height=" + getHeight() + ", weight=" + getWeight() + ", unitPrice=" + getUnitPrice() + ", lotCode=" + getLotCode() + ", packCode=" + getPackCode() + ", shelfLife=" + getShelfLife() + ", snFlag=" + getSnFlag() + ", tradeMark=" + getTradeMark() + ", packingQty=" + getPackingQty() + ", fullContainerBarCode=" + getFullContainerBarCode() + ", baseUom=" + getBaseUom() + ", packUom=" + getPackUom() + ", userDefined1=" + getUserDefined1() + ", userDefined2=" + getUserDefined2() + ", userDefined3=" + getUserDefined3() + ", userDefined4=" + getUserDefined4() + ", userDefined5=" + getUserDefined5() + ", userDefined6=" + getUserDefined6() + ", userDefined7=" + getUserDefined7() + ", userDefined8=" + getUserDefined8() + ")";
    }

    
    
    public String getItemSkuCode() {
        /*  18 */
        return this.itemSkuCode;
        
    }

    
    public String getActionType() {
        /*  21 */
        return this.actionType;
        
    }

    
    public String getItemName() {
        /*  24 */
        return this.itemName;
        
    }

    
    public String getEnglishName() {
        /*  27 */
        return this.englishName;
        
    }

    
    public String getCategory() {
        /*  30 */
        return this.category;
        
    }

    
    public String getBarCode() {
        /*  33 */
        return this.barCode;
        
    }

    
    public String getVolume() {
        /*  36 */
        return this.volume;
        
    }

    
    public String getLength() {
        /*  39 */
        return this.length;
        
    }

    
    public String getWidth() {
        /*  42 */
        return this.width;
        
    }

    
    public String getHeight() {
        /*  45 */
        return this.height;
        
    }

    
    public String getWeight() {
        /*  48 */
        return this.weight;
        
    }

    
    public BigDecimal getUnitPrice() {
        /*  51 */
        return this.unitPrice;
        
    }

    
    public String getLotCode() {
        /*  54 */
        return this.lotCode;
        
    }

    
    public String getPackCode() {
        /*  57 */
        return this.packCode;
        
    }

    
    public BigDecimal getShelfLife() {
        /*  60 */
        return this.shelfLife;
        
    }

    
    public Boolean getSnFlag() {
        /*  63 */
        return this.snFlag;
        
    }

    
    public String getTradeMark() {
        /*  66 */
        return this.tradeMark;
        
    }

    
    public BigDecimal getPackingQty() {
        /*  69 */
        return this.packingQty;
        
    }

    
    public String getFullContainerBarCode() {
        /*  72 */
        return this.fullContainerBarCode;
        
    }

    
    public String getBaseUom() {
        /*  75 */
        return this.baseUom;
        
    }

    
    public String getPackUom() {
        /*  78 */
        return this.packUom;
        
    }

    
    public String getUserDefined1() {
        /*  81 */
        return this.userDefined1;
        
    }

    
    public String getUserDefined2() {
        /*  84 */
        return this.userDefined2;
        
    }

    
    public String getUserDefined3() {
        /*  87 */
        return this.userDefined3;
        
    }

    
    public String getUserDefined4() {
        /*  90 */
        return this.userDefined4;
        
    }

    
    public String getUserDefined5() {
        /*  93 */
        return this.userDefined5;
        
    }

    
    public String getUserDefined6() {
        /*  96 */
        return this.userDefined6;
        
    }

    
    public String getUserDefined7() {
        /*  99 */
        return this.userDefined7;
        
    }

    
    public String getUserDefined8() {
        /* 102 */
        return this.userDefined8;
        
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\Product.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */