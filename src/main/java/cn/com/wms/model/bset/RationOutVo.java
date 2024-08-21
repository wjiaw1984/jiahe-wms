
package cn.com.wms.model.bset;


import cn.com.wms.model.bset.ItemVo;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class RationOutVo implements Serializable {
    private String operationFlag;
    private String customerCode;
    private String customerName;
    private String projectCode;
    private String transportMode;
    private String vehicleModel;
    private String logisticsCode;
    private String orderDescription;
    private String shippingOrderNo;


    /* 16 */
    public void setOperationFlag(String operationFlag) {
        this.operationFlag = operationFlag;
    }

    private String orderCode;
    private String productCode;
    private String tradeMark;
    private BigDecimal totalAmount;
    private Boolean isPaymentCollected;
    private BigDecimal goodsValue;
    private BigDecimal cheapAmount;
    private SenderVo sender;
    private ReceiverVo receiver;
    private List<ItemVo> itemList;

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public void setShippingOrderNo(String shippingOrderNo) {
        this.shippingOrderNo = shippingOrderNo;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setIsPaymentCollected(Boolean isPaymentCollected) {
        this.isPaymentCollected = isPaymentCollected;
    }

    public void setGoodsValue(BigDecimal goodsValue) {
        this.goodsValue = goodsValue;
    }

    public void setCheapAmount(BigDecimal cheapAmount) {
        this.cheapAmount = cheapAmount;
    }

    public void setSender(SenderVo sender) {
        this.sender = sender;
    }

    public void setReceiver(ReceiverVo receiver) {
        this.receiver = receiver;
    }

    public void setItemList(List<ItemVo> itemList) {
        this.itemList = itemList;
    }


    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.RationOutVo;
    }


    public String toString() {
        return "RationOutVo(operationFlag=" + getOperationFlag() + ", customerCode=" + getCustomerCode() + ", customerName=" + getCustomerName() + ", projectCode=" + getProjectCode() + ", transportMode=" + getTransportMode() + ", vehicleModel=" + getVehicleModel() + ", logisticsCode=" + getLogisticsCode() + ", orderDescription=" + getOrderDescription() + ", shippingOrderNo=" + getShippingOrderNo() + ", orderCode=" + getOrderCode() + ", productCode=" + getProductCode() + ", tradeMark=" + getTradeMark() + ", totalAmount=" + getTotalAmount() + ", isPaymentCollected=" + getIsPaymentCollected() + ", goodsValue=" + getGoodsValue() + ", cheapAmount=" + getCheapAmount() + ", sender=" + getSender() + ", receiver=" + getReceiver() + ", itemList=" + getItemList() + ")";
    }


    public String getOperationFlag() {
        /* 19 */
        return this.operationFlag;

    }


    public String getCustomerCode() {
        /* 22 */
        return this.customerCode;

    }


    public String getCustomerName() {
        /* 25 */
        return this.customerName;

    }


    public String getProjectCode() {
        /* 28 */
        return this.projectCode;

    }


    public String getTransportMode() {
        /* 31 */
        return this.transportMode;

    }


    public String getVehicleModel() {
        /* 34 */
        return this.vehicleModel;

    }


    public String getLogisticsCode() {
        /* 37 */
        return this.logisticsCode;

    }


    public String getOrderDescription() {
        /* 41 */
        return this.orderDescription;

    }


    public String getShippingOrderNo() {
        /* 44 */
        return this.shippingOrderNo;

    }


    public String getOrderCode() {
        /* 47 */
        return this.orderCode;

    }


    public String getProductCode() {
        /* 53 */
        return this.productCode;

    }


    public String getTradeMark() {
        /* 56 */
        return this.tradeMark;

    }


    public BigDecimal getTotalAmount() {
        /* 59 */
        return this.totalAmount;

    }


    public Boolean getIsPaymentCollected() {
        /* 62 */
        return this.isPaymentCollected;

    }


    public BigDecimal getGoodsValue() {
        /* 65 */
        return this.goodsValue;

    }


    public BigDecimal getCheapAmount() {
        /* 68 */
        return this.cheapAmount;

    }


    public SenderVo getSender() {
        /* 71 */
        return this.sender;

    }


    public ReceiverVo getReceiver() {
        /* 74 */
        return this.receiver;

    }


    public List<ItemVo> getItemList() {
        /* 77 */
        return this.itemList;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\RationOutVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */