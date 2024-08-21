
package cn.com.wms.model.bset;

import cn.com.wms.model.wms.fr.FrReceipt;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Data
public class ReceiptVo implements Serializable {
    private String customerCode;
    private String warehouseCode;
    private String orderCode;
    private String asnStatus;
    private String refOrderCode;
    private String extOrderType;
    private String logisticsProviderCode;
    private String shippingOrderNo;
    private String remark;
    private Date receiveTime;
    private Date checkStartTime;


    /*  17 */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    private Date checkEndTime;
    private Date orderTime;
    private Boolean udfFlag;
    private String udf1;
    private String udf2;
    private String udf8;
    private BigDecimal totalVolume;
    private BigDecimal totalWeight;
    private BigDecimal totalNetWeight;
    private Boolean wmsCreatedFlag;
    private String skuItem;
    private List<ReceiptItemVo> products;

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setAsnStatus(String asnStatus) {
        this.asnStatus = asnStatus;
    }

    public void setRefOrderCode(String refOrderCode) {
        this.refOrderCode = refOrderCode;
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

    public void setRemark(String remark) {
        this.remark = remark;
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

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public void setUdfFlag(Boolean udfFlag) {
        this.udfFlag = udfFlag;
    }

    public void setUdf1(String udf1) {
        this.udf1 = udf1;
    }

    public void setUdf2(String udf2) {
        this.udf2 = udf2;
    }

    public void setUdf8(String udf8) {
        this.udf8 = udf8;
    }

    public void setTotalVolume(BigDecimal totalVolume) {
        this.totalVolume = totalVolume;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setTotalNetWeight(BigDecimal totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }

    public void setWmsCreatedFlag(Boolean wmsCreatedFlag) {
        this.wmsCreatedFlag = wmsCreatedFlag;
    }

    public void setSkuItem(String skuItem) {
        this.skuItem = skuItem;
    }

    public void setProducts(List<ReceiptItemVo> products) {
        this.products = products;
    }

    
    public String toString() {
        return "ReceiptVo(customerCode=" + getCustomerCode() + ", warehouseCode=" + getWarehouseCode() + ", orderCode=" + getOrderCode() + ", asnStatus=" + getAsnStatus() + ", refOrderCode=" + getRefOrderCode() + ", extOrderType=" + getExtOrderType() + ", logisticsProviderCode=" + getLogisticsProviderCode() + ", shippingOrderNo=" + getShippingOrderNo() + ", remark=" + getRemark() + ", receiveTime=" + getReceiveTime() + ", checkStartTime=" + getCheckStartTime() + ", checkEndTime=" + getCheckEndTime() + ", orderTime=" + getOrderTime() + ", udfFlag=" + getUdfFlag() + ", udf1=" + getUdf1() + ", udf2=" + getUdf2() + ", udf8=" + getUdf8() + ", totalVolume=" + getTotalVolume() + ", totalWeight=" + getTotalWeight() + ", totalNetWeight=" + getTotalNetWeight() + ", wmsCreatedFlag=" + getWmsCreatedFlag() + ", skuItem=" + getSkuItem() + ", products=" + getProducts() + ")";
    }


    public String getCustomerCode() {
        /*  20 */
        return this.customerCode;

    }


    public String getWarehouseCode() {
        /*  23 */
        return this.warehouseCode;

    }


    public String getOrderCode() {
        /*  26 */
        return this.orderCode;

    }


    public String getAsnStatus() {
        /*  33 */
        return this.asnStatus;

    }


    public String getRefOrderCode() {
        /*  36 */
        return this.refOrderCode;

    }


    public String getExtOrderType() {
        /*  39 */
        return this.extOrderType;

    }


    public String getLogisticsProviderCode() {
        /*  42 */
        return this.logisticsProviderCode;

    }


    public String getShippingOrderNo() {
        /*  45 */
        return this.shippingOrderNo;

    }


    public String getRemark() {
        /*  48 */
        return this.remark;

    }


    public Date getReceiveTime() {
        /*  51 */
        return this.receiveTime;

    }


    public Date getCheckStartTime() {
        /*  54 */
        return this.checkStartTime;

    }


    public Date getCheckEndTime() {
        /*  57 */
        return this.checkEndTime;

    }


    public Date getOrderTime() {
        /*  60 */
        return this.orderTime;

    }


    public Boolean getUdfFlag() {
        /*  63 */
        return this.udfFlag;

    }


    public String getUdf1() {
        /*  66 */
        return this.udf1;

    }


    public String getUdf2() {
        /*  69 */
        return this.udf2;

    }


    public String getUdf8() {
        /*  72 */
        return this.udf8;

    }


    public BigDecimal getTotalVolume() {
        /*  75 */
        return this.totalVolume;

    }


    public BigDecimal getTotalWeight() {
        /*  78 */
        return this.totalWeight;

    }


    public BigDecimal getTotalNetWeight() {
        /*  81 */
        return this.totalNetWeight;

    }


    public Boolean getWmsCreatedFlag() {
        /*  84 */
        return this.wmsCreatedFlag;

    }


    public String getSkuItem() {
        /*  87 */
        return this.skuItem;

    }

    public List<ReceiptItemVo> getProducts() {
        /*  89 */
        return this.products;

    }


    public List<FrReceipt> toFrReceipt() {
        /*  93 */
        List<FrReceipt> result = new ArrayList<>();


        /*  96 */
        for (ReceiptItemVo item : this.products) {
            /*  97 */
            if (item.getNormalQuantity().compareTo(new BigDecimal(0)) == 0) {

                /*  99 */
                FrReceipt frReceipt = new FrReceipt();

                /* 101 */
                frReceipt.setSheetid(getOrderCode());

                /* 103 */
                frReceipt.setRefsheetid(getOrderCode());

                /* 105 */
                frReceipt.setOperator("best");

                /* 107 */
                frReceipt.setSdate(this.checkEndTime);

                /* 109 */
                frReceipt.setGoodsid(item.getItemSkuCode());

                /* 111 */
                frReceipt.setFreshflag(Integer.valueOf(0));

                /* 113 */
                frReceipt.setLotno(Integer.valueOf(-1));

                /* 115 */
                frReceipt.setQty(item.getNormalQuantity());

                /* 117 */
                frReceipt.setBadQty(item.getDefectiveQuantity());

                /* 119 */
                frReceipt.setOrerqty(item.getItemQuantity());

                /* 121 */
                Optional<BatchVo> minBatch = item.getBatchs().stream().min((e1, e2) -> e1.getProductionDate().compareTo(e2.getProductionDate()));

                /* 123 */
                frReceipt.setProductDate(((BatchVo) minBatch.get()).getProductionDate());

                /* 125 */
                result.add(frReceipt);

            }

        }
        /* 128 */
        return result;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ReceiptVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */