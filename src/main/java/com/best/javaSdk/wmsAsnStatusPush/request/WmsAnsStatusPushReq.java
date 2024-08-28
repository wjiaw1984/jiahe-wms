
package com.best.javaSdk.wmsAsnStatusPush.request;


import cn.com.wms.model.wms.fr.FrReceipt;
import cn.com.wms.model.wms.fr.FrRetRation;
import com.best.javaSdk.BaseRequest;
import com.best.javaSdk.BaseResponse;
import com.best.javaSdk.Parser;
import com.best.javaSdk.wmsAsnStatusPush.request.Product;
import com.best.javaSdk.wmsAsnStatusPush.request.Products;
import com.best.javaSdk.wmsAsnStatusPush.response.WmsAnsStatusPushRsp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class WmsAnsStatusPushReq implements BaseRequest {
    private String customerCode;
    private String warehouseCode;
    private String orderCode;
    private String asnStatus;


    /*  20 */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    private Date receiveTime;
    private Date checkStartTime;
    private Date checkEndTime;
    private String skuItem;
    private Products products;

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setAsnStatus(String asnStatus) {
        this.asnStatus = asnStatus;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public void setCheckStartTime(Date checkStartTime) {
        this.checkStartTime = checkStartTime;
    }

    public void setCheckEndTime(Date checkEndTime) {
        this.checkEndTime = checkEndTime;
    }

    public void setSkuItem(String skuItem) {
        this.skuItem = skuItem;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.wmsAsnStatusPush.request.WmsAnsStatusPushReq)) return false;
        com.best.javaSdk.wmsAsnStatusPush.request.WmsAnsStatusPushReq other = (com.best.javaSdk.wmsAsnStatusPush.request.WmsAnsStatusPushReq) o;
        if (!other.canEqual(this)) return false;
        Object this$customerCode = getCustomerCode(), other$customerCode = other.getCustomerCode();
        if ((this$customerCode == null) ? (other$customerCode != null) : !this$customerCode.equals(other$customerCode))
            return false;
        Object this$warehouseCode = getWarehouseCode(), other$warehouseCode = other.getWarehouseCode();
        if ((this$warehouseCode == null) ? (other$warehouseCode != null) : !this$warehouseCode.equals(other$warehouseCode))
            return false;
        Object this$orderCode = getOrderCode(), other$orderCode = other.getOrderCode();
        if ((this$orderCode == null) ? (other$orderCode != null) : !this$orderCode.equals(other$orderCode))
            return false;
        Object this$asnStatus = getAsnStatus(), other$asnStatus = other.getAsnStatus();
        if ((this$asnStatus == null) ? (other$asnStatus != null) : !this$asnStatus.equals(other$asnStatus))
            return false;
        Object this$receiveTime = getReceiveTime(), other$receiveTime = other.getReceiveTime();
        if ((this$receiveTime == null) ? (other$receiveTime != null) : !this$receiveTime.equals(other$receiveTime))
            return false;
        Object this$checkStartTime = getCheckStartTime(), other$checkStartTime = other.getCheckStartTime();
        if ((this$checkStartTime == null) ? (other$checkStartTime != null) : !this$checkStartTime.equals(other$checkStartTime))
            return false;
        Object this$checkEndTime = getCheckEndTime(), other$checkEndTime = other.getCheckEndTime();
        if ((this$checkEndTime == null) ? (other$checkEndTime != null) : !this$checkEndTime.equals(other$checkEndTime))
            return false;
        Object this$skuItem = getSkuItem(), other$skuItem = other.getSkuItem();
        if ((this$skuItem == null) ? (other$skuItem != null) : !this$skuItem.equals(other$skuItem)) return false;
        Object this$products = getProducts(), other$products = other.getProducts();
        return !((this$products == null) ? (other$products != null) : !this$products.equals(other$products));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsAsnStatusPush.request.WmsAnsStatusPushReq;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $customerCode = getCustomerCode();
        result = result * 59 + (($customerCode == null) ? 43 : $customerCode.hashCode());
        Object $warehouseCode = getWarehouseCode();
        result = result * 59 + (($warehouseCode == null) ? 43 : $warehouseCode.hashCode());
        Object $orderCode = getOrderCode();
        result = result * 59 + (($orderCode == null) ? 43 : $orderCode.hashCode());
        Object $asnStatus = getAsnStatus();
        result = result * 59 + (($asnStatus == null) ? 43 : $asnStatus.hashCode());
        Object $receiveTime = getReceiveTime();
        result = result * 59 + (($receiveTime == null) ? 43 : $receiveTime.hashCode());
        Object $checkStartTime = getCheckStartTime();
        result = result * 59 + (($checkStartTime == null) ? 43 : $checkStartTime.hashCode());
        Object $checkEndTime = getCheckEndTime();
        result = result * 59 + (($checkEndTime == null) ? 43 : $checkEndTime.hashCode());
        Object $skuItem = getSkuItem();
        result = result * 59 + (($skuItem == null) ? 43 : $skuItem.hashCode());
        Object $products = getProducts();
        return result * 59 + (($products == null) ? 43 : $products.hashCode());
    }

    public String toString() {
        return "WmsAnsStatusPushReq(customerCode=" + getCustomerCode() + ", warehouseCode=" + getWarehouseCode() + ", orderCode=" + getOrderCode() + ", asnStatus=" + getAsnStatus() + ", receiveTime=" + getReceiveTime() + ", checkStartTime=" + getCheckStartTime() + ", checkEndTime=" + getCheckEndTime() + ", skuItem=" + getSkuItem() + ", products=" + getProducts() + ")";
    }


    public String getCustomerCode() {
        /*  22 */
        return this.customerCode;

    }

    public String getWarehouseCode() {
        /*  24 */
        return this.warehouseCode;

    }

    public String getOrderCode() {
        /*  26 */
        return this.orderCode;

    }

    public String getAsnStatus() {
        /*  28 */
        return this.asnStatus;

    }

    public Date getReceiveTime() {
        /*  30 */
        return this.receiveTime;

    }

    public Date getCheckStartTime() {
        /*  32 */
        return this.checkStartTime;

    }

    public Date getCheckEndTime() {
        /*  34 */
        return this.checkEndTime;

    }

    public String getSkuItem() {
        /*  36 */
        return this.skuItem;

    }

    public Products getProducts() {
        /*  38 */
        return this.products;

    }


    public String obtainServiceType() {
        /*  42 */
        return "WMS_ASN_STATUS_PUSH";

    }


    public BaseResponse makeResponse(String rsp, String format) {
        /*  47 */
        if ("xml".equalsIgnoreCase(format)) {
            /*  48 */
            return (BaseResponse) Parser.coverXml2Object(rsp, WmsAnsStatusPushRsp.class);

        }
        /*  50 */
        return (BaseResponse) Parser.convertJson2Object(rsp, WmsAnsStatusPushRsp.class);

    }


    public List<FrReceipt> toFrReceipt(String fixString) {
        /*  56 */
        if (this == null) {
            /*  57 */
            return null;

        }

        /*  66 */
        if (!getAsnStatus().equalsIgnoreCase("FULFILLED")) {
            /*  67 */
            return null;

        }


        /*  71 */
        List<FrReceipt> result = new ArrayList<>();

        /*  73 */
        for (Product product : this.products.getProduct()) {

            /*  75 */
            FrReceipt entity = new FrReceipt();

            /*  77 */
            entity.setSheetid(this.orderCode);

            /*  79 */
            entity.setRefsheetid(this.orderCode);

            /*  81 */
            if (this.receiveTime != null) {
                /*  82 */
                entity.setSdate(this.receiveTime);

            }

            /*  85 */
            if (this.checkEndTime != null) {
                /*  86 */
                entity.setSdate(this.checkEndTime);

            }



            /*  91 */
            entity.setGoodsid(product.getItemSkuCode());

            /*  93 */
            entity.setLotno(Integer.valueOf(-1));

            /*  95 */
            entity.setOrerqty(product.getItemQuantity());

            /*  97 */
            //良品数量逻辑
            if ((product.getNormalQuantity() != null && product.getDecimalNormalQty() == null)
                    || (product.getNormalQuantity() != null && product.getDecimalNormalQty() != null
                    && product.getNormalQuantity().compareTo(BigDecimal.ZERO) > 0)
            ) {
                entity.setQty(product.getNormalQuantity());
            }

            if ((product.getNormalQuantity() == null && product.getDecimalNormalQty() != null)
                    || (product.getNormalQuantity() != null && product.getDecimalNormalQty() != null
                    && product.getDecimalNormalQty().compareTo(BigDecimal.ZERO) > 0)
            ) {
                entity.setQty(product.getDecimalNormalQty());
            }

            if ((product.getNormalQuantity() == null && product.getDecimalNormalQty() == null)
                    || (product.getNormalQuantity().compareTo(BigDecimal.ZERO) == 0 && product.getDecimalNormalQty().compareTo(BigDecimal.ZERO) == 0)
            ){
                entity.setQty(BigDecimal.ZERO);
            }

            /*  99 */
            //不良品数量逻辑
            if ((product.getDefectiveQuantity() != null && product.getDecimalDefectiveQty() == null)
                    || (product.getDefectiveQuantity() != null && product.getDecimalDefectiveQty() != null
                    && product.getDefectiveQuantity().compareTo(BigDecimal.ZERO) > 0)
            ) {
                entity.setBadQty(product.getDefectiveQuantity());
            }

            if ((product.getDefectiveQuantity() == null && product.getDecimalDefectiveQty() != null)
                    || (product.getDefectiveQuantity() != null && product.getDecimalDefectiveQty() != null
                    && product.getDecimalDefectiveQty().compareTo(BigDecimal.ZERO) > 0)
            ) {
                entity.setBadQty(product.getDecimalDefectiveQty());
            }

            if ((product.getDefectiveQuantity() == null && product.getDecimalDefectiveQty() == null)
                    || (product.getDefectiveQuantity().compareTo(BigDecimal.ZERO) == 0 && product.getDecimalDefectiveQty().compareTo(BigDecimal.ZERO) == 0)
            ){
                entity.setBadQty(BigDecimal.ZERO);
            }

            /* 101 */
            result.add(entity);

        }


        /* 105 */
        return result;

    }


    public List<FrRetRation> toFrRetration(String fixString) {
        /* 109 */
        if (this == null) {
            /* 110 */
            return null;

        }

        /* 117 */
        if (!getAsnStatus().equalsIgnoreCase("FULFILLED")) {
            /* 118 */
            return null;

        }

        /* 121 */
        List<FrRetRation> result = new ArrayList<>();
        /* 122 */
        for (Product product : this.products.getProduct()) {
            /* 123 */
            FrRetRation entity = new FrRetRation();
            /* 124 */
            entity.setSheetid(this.orderCode);

            /* 126 */
            if (this.receiveTime != null) {
                /* 127 */
                entity.setSdate(this.receiveTime);

            }

            /* 130 */
            if (this.checkEndTime != null) {
                /* 131 */
                entity.setSdate(this.checkEndTime);

            }


            /* 135 */
            entity.setGoodsid(product.getItemSkuCode());
            /* 136 */
            entity.setLotno(Integer.valueOf(-1));

            /* 137 */
            //良品数量逻辑
            if ((product.getNormalQuantity() != null && product.getDecimalNormalQty() == null)
                    || (product.getNormalQuantity() != null && product.getDecimalNormalQty() != null
                    && product.getNormalQuantity().compareTo(BigDecimal.ZERO) > 0)
            ) {
                entity.setRealQty(product.getNormalQuantity());
            }

            if ((product.getNormalQuantity() == null && product.getDecimalNormalQty() != null)
                    || (product.getNormalQuantity() != null && product.getDecimalNormalQty() != null
                    && product.getDecimalNormalQty().compareTo(BigDecimal.ZERO) > 0)
            ) {
                entity.setRealQty(product.getDecimalNormalQty());
            }

            if ((product.getNormalQuantity() == null && product.getDecimalNormalQty() == null)
                    || (product.getNormalQuantity().compareTo(BigDecimal.ZERO) == 0 && product.getDecimalNormalQty().compareTo(BigDecimal.ZERO) == 0)
            ){
                entity.setRealQty(BigDecimal.ZERO);
            }

            /* 138 */
            //不良品数量逻辑
            if ((product.getDefectiveQuantity() != null && product.getDecimalDefectiveQty() == null)
                    || (product.getDefectiveQuantity() != null && product.getDecimalDefectiveQty() != null
                    && product.getDefectiveQuantity().compareTo(BigDecimal.ZERO) > 0)
            ) {
                entity.setBadQty(product.getDefectiveQuantity());
            }

            if ((product.getDefectiveQuantity() == null && product.getDecimalDefectiveQty() != null)
                    || (product.getDefectiveQuantity() != null && product.getDecimalDefectiveQty() != null
                    && product.getDecimalDefectiveQty().compareTo(BigDecimal.ZERO) > 0)
            ) {
                entity.setBadQty(product.getDecimalDefectiveQty());
            }

            if ((product.getDefectiveQuantity() == null && product.getDecimalDefectiveQty() == null)
                    || (product.getDefectiveQuantity().compareTo(BigDecimal.ZERO) == 0 && product.getDecimalDefectiveQty().compareTo(BigDecimal.ZERO) == 0)
            ){
                entity.setBadQty(BigDecimal.ZERO);
            }
            /* 139 */
            result.add(entity);

        }

        /* 142 */
        return result;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsAsnStatusPush\request\WmsAnsStatusPushReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */