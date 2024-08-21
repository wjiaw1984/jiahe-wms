
package com.best.javaSdk.wmsrmastatuspush.request;



import cn.com.wms.model.wms.fr.FrRetRation;
 import com.best.javaSdk.BaseRequest;
import com.best.javaSdk.BaseResponse;
 import com.best.javaSdk.Parser;
 import com.best.javaSdk.wmsrmastatuspush.request.Product;
 import com.best.javaSdk.wmsrmastatuspush.request.Products;
 import com.best.javaSdk.wmsrmastatuspush.response.WmsRmaStatusPushRsp;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
 import java.util.List;

@Data
 public class WmsRmaStatusPushReq implements BaseRequest {
       private String customerCode;
       private String wareHouseCode;
       private String orderCode;
       private String rmaStatus;
       private String extOrderType;
       private String logisticsProviderCode;


    /* 20 */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    private String shippingOrderNo;
    private Date receiveTime;
    private Date checkStartTime;
    private Date checkEndTime;
    private String note;
    private Products products;

    public void setWareHouseCode(String wareHouseCode) {
        this.wareHouseCode = wareHouseCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setRmaStatus(String rmaStatus) {
        this.rmaStatus = rmaStatus;
    }

    public void setExtOrderType(String extOrderType) {
        this.extOrderType = extOrderType;
    }

    public void setLogisticsProviderCode(String logisticsProviderCode) {
        this.logisticsProviderCode = logisticsProviderCode;
    }

    public void setShippingOrderNo(String shippingOrderNo) {
        this.shippingOrderNo = shippingOrderNo;
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

    public void setNote(String note) {
        this.note = note;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.wmsrmastatuspush.request.WmsRmaStatusPushReq)) return false;
        com.best.javaSdk.wmsrmastatuspush.request.WmsRmaStatusPushReq other = (com.best.javaSdk.wmsrmastatuspush.request.WmsRmaStatusPushReq) o;
        if (!other.canEqual(this)) return false;
        Object this$customerCode = getCustomerCode(), other$customerCode = other.getCustomerCode();
        if ((this$customerCode == null) ? (other$customerCode != null) : !this$customerCode.equals(other$customerCode))
            return false;
        Object this$wareHouseCode = getWareHouseCode(), other$wareHouseCode = other.getWareHouseCode();
        if ((this$wareHouseCode == null) ? (other$wareHouseCode != null) : !this$wareHouseCode.equals(other$wareHouseCode))
            return false;
        Object this$orderCode = getOrderCode(), other$orderCode = other.getOrderCode();
        if ((this$orderCode == null) ? (other$orderCode != null) : !this$orderCode.equals(other$orderCode))
            return false;
        Object this$rmaStatus = getRmaStatus(), other$rmaStatus = other.getRmaStatus();
        if ((this$rmaStatus == null) ? (other$rmaStatus != null) : !this$rmaStatus.equals(other$rmaStatus))
            return false;
        Object this$extOrderType = getExtOrderType(), other$extOrderType = other.getExtOrderType();
        if ((this$extOrderType == null) ? (other$extOrderType != null) : !this$extOrderType.equals(other$extOrderType))
            return false;
        Object this$logisticsProviderCode = getLogisticsProviderCode(), other$logisticsProviderCode = other.getLogisticsProviderCode();
        if ((this$logisticsProviderCode == null) ? (other$logisticsProviderCode != null) : !this$logisticsProviderCode.equals(other$logisticsProviderCode))
            return false;
        Object this$shippingOrderNo = getShippingOrderNo(), other$shippingOrderNo = other.getShippingOrderNo();
        if ((this$shippingOrderNo == null) ? (other$shippingOrderNo != null) : !this$shippingOrderNo.equals(other$shippingOrderNo))
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
        Object this$note = getNote(), other$note = other.getNote();
        if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note)) return false;
        Object this$products = getProducts(), other$products = other.getProducts();
        return !((this$products == null) ? (other$products != null) : !this$products.equals(other$products));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsrmastatuspush.request.WmsRmaStatusPushReq;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $customerCode = getCustomerCode();
        result = result * 59 + (($customerCode == null) ? 43 : $customerCode.hashCode());
        Object $wareHouseCode = getWareHouseCode();
        result = result * 59 + (($wareHouseCode == null) ? 43 : $wareHouseCode.hashCode());
        Object $orderCode = getOrderCode();
        result = result * 59 + (($orderCode == null) ? 43 : $orderCode.hashCode());
        Object $rmaStatus = getRmaStatus();
        result = result * 59 + (($rmaStatus == null) ? 43 : $rmaStatus.hashCode());
        Object $extOrderType = getExtOrderType();
        result = result * 59 + (($extOrderType == null) ? 43 : $extOrderType.hashCode());
        Object $logisticsProviderCode = getLogisticsProviderCode();
        result = result * 59 + (($logisticsProviderCode == null) ? 43 : $logisticsProviderCode.hashCode());
        Object $shippingOrderNo = getShippingOrderNo();
        result = result * 59 + (($shippingOrderNo == null) ? 43 : $shippingOrderNo.hashCode());
        Object $receiveTime = getReceiveTime();
        result = result * 59 + (($receiveTime == null) ? 43 : $receiveTime.hashCode());
        Object $checkStartTime = getCheckStartTime();
        result = result * 59 + (($checkStartTime == null) ? 43 : $checkStartTime.hashCode());
        Object $checkEndTime = getCheckEndTime();
        result = result * 59 + (($checkEndTime == null) ? 43 : $checkEndTime.hashCode());
        Object $note = getNote();
        result = result * 59 + (($note == null) ? 43 : $note.hashCode());
        Object $products = getProducts();
        return result * 59 + (($products == null) ? 43 : $products.hashCode());
    }

    public String toString() {
        return "WmsRmaStatusPushReq(customerCode=" + getCustomerCode() + ", wareHouseCode=" + getWareHouseCode() + ", orderCode=" + getOrderCode() + ", rmaStatus=" + getRmaStatus() + ", extOrderType=" + getExtOrderType() + ", logisticsProviderCode=" + getLogisticsProviderCode() + ", shippingOrderNo=" + getShippingOrderNo() + ", receiveTime=" + getReceiveTime() + ", checkStartTime=" + getCheckStartTime() + ", checkEndTime=" + getCheckEndTime() + ", note=" + getNote() + ", products=" + getProducts() + ")";
    }


    /* 22 */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /* 23 */
    public String getWareHouseCode() {
        return this.wareHouseCode;
    }

    /* 24 */
    public String getOrderCode() {
        return this.orderCode;
    }

    /* 25 */
    public String getRmaStatus() {
        return this.rmaStatus;
    }

    /* 26 */
    public String getExtOrderType() {
        return this.extOrderType;
    }

    /* 27 */
    public String getLogisticsProviderCode() {
        return this.logisticsProviderCode;
    }

    /* 28 */
    public String getShippingOrderNo() {
        return this.shippingOrderNo;
    }

    /* 29 */
    public Date getReceiveTime() {
        return this.receiveTime;
    }

    /* 30 */
    public Date getCheckStartTime() {
        return this.checkStartTime;
    }

    /* 31 */
    public Date getCheckEndTime() {
        return this.checkEndTime;
    }

    /* 32 */
    public String getNote() {
        return this.note;
    }

    public Products getProducts() {
        /* 33 */
        return this.products;

    }



    public String obtainServiceType() {
        /* 37 */
        return "WMS_RMA_STATUS_PUSH";

    }




    public BaseResponse makeResponse(String rsp, String format) {
        /* 42 */
        if ("xml".equalsIgnoreCase(format)) {
            /* 43 */
            return (BaseResponse) Parser.coverXml2Object(rsp, WmsRmaStatusPushRsp.class);

        }
        /* 45 */
        return (BaseResponse) Parser.convertJson2Object(rsp, WmsRmaStatusPushRsp.class);

    }




    public List<FrRetRation> toFrRetRation(String fixString) {
        /* 50 */
        if (this == null) {
            /* 51 */
            return null;

        }






        /* 59 */
        if (!getRmaStatus().equalsIgnoreCase("FULFILLED")) {
            /* 60 */
            return null;

        }

        /* 63 */
        List<FrRetRation> result = new ArrayList<>();

        /* 65 */
        for (Product product : this.products.getProduct()) {
            /* 66 */
            FrRetRation entity = new FrRetRation();
            /* 67 */
            entity.setSheetid(this.orderCode);
            /* 68 */
            entity.setSdate(this.checkEndTime);
            /* 69 */
            entity.setShopid("WMS");
            /* 70 */
            entity.setVenderid(Integer.valueOf(0));


            /* 73 */
            entity.setGoodsid(product.getItemSkuCode());
            /* 74 */
            entity.setLotno(Integer.valueOf(-1));

            /* 76 */
            entity.setRealQty(product.getNormalQuantity());
            /* 77 */
            entity.setBadQty(product.getDefectiveQuantity());
            /* 78 */
            result.add(entity);

        }


        /* 82 */
        return result;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsrmastatuspush\request\WmsRmaStatusPushReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */