package com.best.javaSdk.twAsnNotify.request;

import cn.com.wms.model.wms.sdwms.SdwmsPurchase;
import cn.com.wms.model.wms.sdwms.SdwmsRet;
import cn.com.wms.model.wms.sdwms.SdwmsRetration;

import java.math.RoundingMode;

public class Item {
    private int lineNo;
    private String itemSkuCode;
    private String itemName;
    private int itemQuantity;
    private int packageCount;
    private String uomCode;
    private double weight;
    private double volume;
    private double volumeWeight;
    private double unitPrice;
    private double declaredValue;
    private String fixStatusCode;
    private String productionDate;
    private String expiryDate;
    private String lotAtt01;
    private String lotAtt02;
    private String lotAtt03;
    private String lotAtt04;

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    private String lotAtt05;
    private String lotAtt06;
    private String providerCode;
    private String providerFrom;
    private String providerName;
    private String packCode;
    private String packageStandard;
    private String remark;
    private double decimalQuantity;
    private String packageName;
    private boolean udfFlag;
    private String udf1;
    private String udf2;
    private String udf3;
    private String udf4;
    private String udf5;
    private String udf6;
    private String udf7;
    private String udf8;

    public void setItemSkuCode(String itemSkuCode) {
        this.itemSkuCode = itemSkuCode;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setPackageCount(int packageCount) {
        this.packageCount = packageCount;
    }

    public void setUomCode(String uomCode) {
        this.uomCode = uomCode;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setVolumeWeight(double volumeWeight) {
        this.volumeWeight = volumeWeight;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setDeclaredValue(double declaredValue) {
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

    public void setLotAtt03(String lotAtt03) {
        this.lotAtt03 = lotAtt03;
    }

    public void setLotAtt04(String lotAtt04) {
        this.lotAtt04 = lotAtt04;
    }

    public void setLotAtt05(String lotAtt05) {
        this.lotAtt05 = lotAtt05;
    }

    public void setLotAtt06(String lotAtt06) {
        this.lotAtt06 = lotAtt06;
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

    public void setDecimalQuantity(double decimalQuantity) {
        this.decimalQuantity = decimalQuantity;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setUdfFlag(boolean udfFlag) {
        this.udfFlag = udfFlag;
    }

    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }

    public void setUdf2(String udf2) {
        this.udf2 = udf2;
    }

    public void setUdf3(String udf3) {
        this.udf3 = udf3;
    }

    public void setUdf4(String udf4) {
        this.udf4 = udf4;
    }

    public void setUdf5(String udf5) {
        this.udf5 = udf5;
    }

    public void setUdf6(String udf6) {
        this.udf6 = udf6;
    }

    public void setUdf7(String udf7) {
        this.udf7 = udf7;
    }

    public void setUdf8(String udf8) {
        this.udf8 = udf8;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.twAsnNotify.request.Item)) return false;
        com.best.javaSdk.twAsnNotify.request.Item other = (com.best.javaSdk.twAsnNotify.request.Item) o;
        if (!other.canEqual(this)) return false;
        if (getLineNo() != other.getLineNo()) return false;
        Object this$itemSkuCode = getItemSkuCode(), other$itemSkuCode = other.getItemSkuCode();
        if ((this$itemSkuCode == null) ? (other$itemSkuCode != null) : !this$itemSkuCode.equals(other$itemSkuCode))
            return false;
        Object this$itemName = getItemName(), other$itemName = other.getItemName();
        if ((this$itemName == null) ? (other$itemName != null) : !this$itemName.equals(other$itemName)) return false;
        if (getItemQuantity() != other.getItemQuantity()) return false;
        if (getPackageCount() != other.getPackageCount()) return false;
        Object this$uomCode = getUomCode(), other$uomCode = other.getUomCode();
        if ((this$uomCode == null) ? (other$uomCode != null) : !this$uomCode.equals(other$uomCode)) return false;
        if (Double.compare(getWeight(), other.getWeight()) != 0) return false;
        if (Double.compare(getVolume(), other.getVolume()) != 0) return false;
        if (Double.compare(getVolumeWeight(), other.getVolumeWeight()) != 0) return false;
        if (Double.compare(getUnitPrice(), other.getUnitPrice()) != 0) return false;
        if (Double.compare(getDeclaredValue(), other.getDeclaredValue()) != 0) return false;
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
        Object this$lotAtt03 = getLotAtt03(), other$lotAtt03 = other.getLotAtt03();
        if ((this$lotAtt03 == null) ? (other$lotAtt03 != null) : !this$lotAtt03.equals(other$lotAtt03)) return false;
        Object this$lotAtt04 = getLotAtt04(), other$lotAtt04 = other.getLotAtt04();
        if ((this$lotAtt04 == null) ? (other$lotAtt04 != null) : !this$lotAtt04.equals(other$lotAtt04)) return false;
        Object this$lotAtt05 = getLotAtt05(), other$lotAtt05 = other.getLotAtt05();
        if ((this$lotAtt05 == null) ? (other$lotAtt05 != null) : !this$lotAtt05.equals(other$lotAtt05)) return false;
        Object this$lotAtt06 = getLotAtt06(), other$lotAtt06 = other.getLotAtt06();
        if ((this$lotAtt06 == null) ? (other$lotAtt06 != null) : !this$lotAtt06.equals(other$lotAtt06)) return false;
        Object this$providerCode = getProviderCode(), other$providerCode = other.getProviderCode();
        if ((this$providerCode == null) ? (other$providerCode != null) : !this$providerCode.equals(other$providerCode))
            return false;
        Object this$providerFrom = getProviderFrom(), other$providerFrom = other.getProviderFrom();
        if ((this$providerFrom == null) ? (other$providerFrom != null) : !this$providerFrom.equals(other$providerFrom))
            return false;
        Object this$providerName = getProviderName(), other$providerName = other.getProviderName();
        if ((this$providerName == null) ? (other$providerName != null) : !this$providerName.equals(other$providerName))
            return false;
        Object this$packCode = getPackCode(), other$packCode = other.getPackCode();
        if ((this$packCode == null) ? (other$packCode != null) : !this$packCode.equals(other$packCode)) return false;
        Object this$packageStandard = getPackageStandard(), other$packageStandard = other.getPackageStandard();
        if ((this$packageStandard == null) ? (other$packageStandard != null) : !this$packageStandard.equals(other$packageStandard))
            return false;
        Object this$remark = getRemark(), other$remark = other.getRemark();
        if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;
        if (Double.compare(getDecimalQuantity(), other.getDecimalQuantity()) != 0) return false;
        Object this$packageName = getPackageName(), other$packageName = other.getPackageName();
        if ((this$packageName == null) ? (other$packageName != null) : !this$packageName.equals(other$packageName))
            return false;
        if (isUdfFlag() != other.isUdfFlag()) return false;
        Object this$udf1 = getUdf1(), other$udf1 = other.getUdf1();
        if ((this$udf1 == null) ? (other$udf1 != null) : !this$udf1.equals(other$udf1)) return false;
        Object this$udf2 = getUdf2(), other$udf2 = other.getUdf2();
        if ((this$udf2 == null) ? (other$udf2 != null) : !this$udf2.equals(other$udf2)) return false;
        Object this$udf3 = getUdf3(), other$udf3 = other.getUdf3();
        if ((this$udf3 == null) ? (other$udf3 != null) : !this$udf3.equals(other$udf3)) return false;
        Object this$udf4 = getUdf4(), other$udf4 = other.getUdf4();
        if ((this$udf4 == null) ? (other$udf4 != null) : !this$udf4.equals(other$udf4)) return false;
        Object this$udf5 = getUdf5(), other$udf5 = other.getUdf5();
        if ((this$udf5 == null) ? (other$udf5 != null) : !this$udf5.equals(other$udf5)) return false;
        Object this$udf6 = getUdf6(), other$udf6 = other.getUdf6();
        if ((this$udf6 == null) ? (other$udf6 != null) : !this$udf6.equals(other$udf6)) return false;
        Object this$udf7 = getUdf7(), other$udf7 = other.getUdf7();
        if ((this$udf7 == null) ? (other$udf7 != null) : !this$udf7.equals(other$udf7)) return false;
        Object this$udf8 = getUdf8(), other$udf8 = other.getUdf8();
        return !((this$udf8 == null) ? (other$udf8 != null) : !this$udf8.equals(other$udf8));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.twAsnNotify.request.Item;
    }

    public int hashCode() {
        int PRIME = 59;
        result = 1;
        result = result * 59 + getLineNo();
        Object $itemSkuCode = getItemSkuCode();
        result = result * 59 + (($itemSkuCode == null) ? 43 : $itemSkuCode.hashCode());
        Object $itemName = getItemName();
        result = result * 59 + (($itemName == null) ? 43 : $itemName.hashCode());
        result = result * 59 + getItemQuantity();
        result = result * 59 + getPackageCount();
        Object $uomCode = getUomCode();
        result = result * 59 + (($uomCode == null) ? 43 : $uomCode.hashCode());
        long $weight = Double.doubleToLongBits(getWeight());
        result = result * 59 + (int) ($weight >>> 32L ^ $weight);
        long $volume = Double.doubleToLongBits(getVolume());
        result = result * 59 + (int) ($volume >>> 32L ^ $volume);
        long $volumeWeight = Double.doubleToLongBits(getVolumeWeight());
        result = result * 59 + (int) ($volumeWeight >>> 32L ^ $volumeWeight);
        long $unitPrice = Double.doubleToLongBits(getUnitPrice());
        result = result * 59 + (int) ($unitPrice >>> 32L ^ $unitPrice);
        long $declaredValue = Double.doubleToLongBits(getDeclaredValue());
        result = result * 59 + (int) ($declaredValue >>> 32L ^ $declaredValue);
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
        Object $lotAtt03 = getLotAtt03();
        result = result * 59 + (($lotAtt03 == null) ? 43 : $lotAtt03.hashCode());
        Object $lotAtt04 = getLotAtt04();
        result = result * 59 + (($lotAtt04 == null) ? 43 : $lotAtt04.hashCode());
        Object $lotAtt05 = getLotAtt05();
        result = result * 59 + (($lotAtt05 == null) ? 43 : $lotAtt05.hashCode());
        Object $lotAtt06 = getLotAtt06();
        result = result * 59 + (($lotAtt06 == null) ? 43 : $lotAtt06.hashCode());
        Object $providerCode = getProviderCode();
        result = result * 59 + (($providerCode == null) ? 43 : $providerCode.hashCode());
        Object $providerFrom = getProviderFrom();
        result = result * 59 + (($providerFrom == null) ? 43 : $providerFrom.hashCode());
        Object $providerName = getProviderName();
        result = result * 59 + (($providerName == null) ? 43 : $providerName.hashCode());
        Object $packCode = getPackCode();
        result = result * 59 + (($packCode == null) ? 43 : $packCode.hashCode());
        Object $packageStandard = getPackageStandard();
        result = result * 59 + (($packageStandard == null) ? 43 : $packageStandard.hashCode());
        Object $remark = getRemark();
        result = result * 59 + (($remark == null) ? 43 : $remark.hashCode());
        long $decimalQuantity = Double.doubleToLongBits(getDecimalQuantity());
        result = result * 59 + (int) ($decimalQuantity >>> 32L ^ $decimalQuantity);
        Object $packageName = getPackageName();
        result = result * 59 + (($packageName == null) ? 43 : $packageName.hashCode());
        result = result * 59 + (isUdfFlag() ? 79 : 97);
        Object $udf1 = getUdf1();
        result = result * 59 + (($udf1 == null) ? 43 : $udf1.hashCode());
        Object $udf2 = getUdf2();
        result = result * 59 + (($udf2 == null) ? 43 : $udf2.hashCode());
        Object $udf3 = getUdf3();
        result = result * 59 + (($udf3 == null) ? 43 : $udf3.hashCode());
        Object $udf4 = getUdf4();
        result = result * 59 + (($udf4 == null) ? 43 : $udf4.hashCode());
        Object $udf5 = getUdf5();
        result = result * 59 + (($udf5 == null) ? 43 : $udf5.hashCode());
        Object $udf6 = getUdf6();
        result = result * 59 + (($udf6 == null) ? 43 : $udf6.hashCode());
        Object $udf7 = getUdf7();
        result = result * 59 + (($udf7 == null) ? 43 : $udf7.hashCode());
        Object $udf8 = getUdf8();
        return result * 59 + (($udf8 == null) ? 43 : $udf8.hashCode());
    }

    public String toString() {
        return "Item(lineNo=" + getLineNo() + ", itemSkuCode=" + getItemSkuCode() + ", itemName=" + getItemName() + ", itemQuantity=" + getItemQuantity() + ", packageCount=" + getPackageCount() + ", uomCode=" + getUomCode() + ", weight=" + getWeight() + ", volume=" + getVolume() + ", volumeWeight=" + getVolumeWeight() + ", unitPrice=" + getUnitPrice() + ", declaredValue=" + getDeclaredValue() + ", fixStatusCode=" + getFixStatusCode() + ", productionDate=" + getProductionDate() + ", expiryDate=" + getExpiryDate() + ", lotAtt01=" + getLotAtt01() + ", lotAtt02=" + getLotAtt02() + ", lotAtt03=" + getLotAtt03() + ", lotAtt04=" + getLotAtt04() + ", lotAtt05=" + getLotAtt05() + ", lotAtt06=" + getLotAtt06() + ", providerCode=" + getProviderCode() + ", providerFrom=" + getProviderFrom() + ", providerName=" + getProviderName() + ", packCode=" + getPackCode() + ", packageStandard=" + getPackageStandard() + ", remark=" + getRemark() + ", decimalQuantity=" + getDecimalQuantity() + ", packageName=" + getPackageName() + ", udfFlag=" + isUdfFlag() + ", udf1=" + getUdf1() + ", udf2=" + getUdf2() + ", udf3=" + getUdf3() + ", udf4=" + getUdf4() + ", udf5=" + getUdf5() + ", udf6=" + getUdf6() + ", udf7=" + getUdf7() + ", udf8=" + getUdf8() + ")";
    }

    public int getLineNo() {
        return this.lineNo;
    }

    public String getItemSkuCode() {
        return this.itemSkuCode;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public int getPackageCount() {
        return this.packageCount;
    }

    public String getUomCode() {
        return this.uomCode;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getVolumeWeight() {
        return this.volumeWeight;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public double getDeclaredValue() {
        return this.declaredValue;
    }

    public String getFixStatusCode() {
        return this.fixStatusCode;
    }

    public String getProductionDate() {
        return this.productionDate;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public String getLotAtt01() {
        return this.lotAtt01;
    }

    public String getLotAtt02() {
        return this.lotAtt02;
    }

    public String getLotAtt03() {
        return this.lotAtt03;
    }

    public String getLotAtt04() {
        return this.lotAtt04;
    }

    public String getLotAtt05() {
        return this.lotAtt05;
    }

    public String getLotAtt06() {
        return this.lotAtt06;
    }

    public String getProviderCode() {
        return this.providerCode;
    }

    public String getProviderFrom() {
        return this.providerFrom;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public String getPackCode() {
        return this.packCode;
    }

    public String getPackageStandard() {
        return this.packageStandard;
    }

    public String getRemark() {
        return this.remark;
    }

    public double getDecimalQuantity() {
        return this.decimalQuantity;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public boolean isUdfFlag() {
        return this.udfFlag;
    }

    public String getUdf1() {
        return this.udf1;
    }

    public String getUdf2() {
        return this.udf2;
    }

    public String getUdf3() {
        return this.udf3;
    }

    public String getUdf4() {
        return this.udf4;
    }

    public String getUdf5() {
        return this.udf5;
    }

    public String getUdf6() {
        return this.udf6;
    }

    public String getUdf7() {
        return this.udf7;
    }

    public String getUdf8() {
        return this.udf8;
    }

    public static com.best.javaSdk.twAsnNotify.request.Item buildForPurchase(SdwmsPurchase purchase, Integer lineNo) {
        com.best.javaSdk.twAsnNotify.request.Item result = new com.best.javaSdk.twAsnNotify.request.Item();
        if (purchase == null) {
            return result;
        }

        result.setLineNo(lineNo.intValue());
        result.setItemSkuCode(purchase.getGoodsid());
        result.setItemName(purchase.getGoodsName());


        result.setItemQuantity(purchase.getQty().setScale(0, RoundingMode.HALF_UP).intValue());
        return result;
    }

    public static com.best.javaSdk.twAsnNotify.request.Item buildForRetration(SdwmsRetration retration, Integer lineNo) {
        com.best.javaSdk.twAsnNotify.request.Item result = new com.best.javaSdk.twAsnNotify.request.Item();
        if (retration == null) {
            return result;
        }

        result.setLineNo(lineNo.intValue());
        result.setItemSkuCode(retration.getGoodsid());
        result.setItemName(retration.getGoodsName());
        result.setItemQuantity(retration.getPlanQty().setScale(0, RoundingMode.HALF_UP).intValue());
        return result;
    }

    public static com.best.javaSdk.twAsnNotify.request.Item buildForRet(SdwmsRet ret, Integer lineNo) {
        com.best.javaSdk.twAsnNotify.request.Item result = new com.best.javaSdk.twAsnNotify.request.Item();
        if (ret == null) {
            return result;
        }

        result.setLineNo(lineNo.intValue());
        result.setItemSkuCode(ret.getGoodsid());
        result.setItemName(ret.getGoodsName());
        result.setItemQuantity(ret.getPlanqty().setScale(0, RoundingMode.HALF_UP).intValue());
        return result;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twAsnNotify\request\Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */