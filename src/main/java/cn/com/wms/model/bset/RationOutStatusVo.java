
package cn.com.wms.model.bset;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RationOutStatusVo implements Serializable {
    private String customerCode;
    private String warehouseCode;
    private String orderCode;
    private String extTradeId;
    private String orderType;
    private String orderStatus;
    private String extOrderType;
    private String operator;
    private String operatorTime;


    /* 13 */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    private String logisticsProviderCode;
    private String shippingOrderNo;
    private String remark;
    private String skuItem;
    private Integer totalVolume;
    private Double totalWeight;
    private Double totalNetWeight;
    private ReceiverVo recipient;
    private List<ItemVo> products;

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setExtTradeId(String extTradeId) {
        this.extTradeId = extTradeId;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setExtOrderType(String extOrderType) {
        this.extOrderType = extOrderType;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setOperatorTime(String operatorTime) {
        this.operatorTime = operatorTime;
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

    public void setSkuItem(String skuItem) {
        this.skuItem = skuItem;
    }

    public void setTotalVolume(Integer totalVolume) {
        this.totalVolume = totalVolume;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public void setTotalNetWeight(Double totalNetWeight) {
        this.totalNetWeight = totalNetWeight;
    }

    public void setRecipient(ReceiverVo recipient) {
        this.recipient = recipient;
    }

    public void setProducts(List<ItemVo> products) {
        this.products = products;
    }


    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.RationOutStatusVo;
    }

    public String toString() {
        return "RationOutStatusVo(customerCode=" + getCustomerCode() + ", warehouseCode=" + getWarehouseCode() + ", orderCode=" + getOrderCode() + ", extTradeId=" + getExtTradeId() + ", orderType=" + getOrderType() + ", orderStatus=" + getOrderStatus() + ", extOrderType=" + getExtOrderType() + ", operator=" + getOperator() + ", operatorTime=" + getOperatorTime() + ", logisticsProviderCode=" + getLogisticsProviderCode() + ", shippingOrderNo=" + getShippingOrderNo() + ", remark=" + getRemark() + ", skuItem=" + getSkuItem() + ", totalVolume=" + getTotalVolume() + ", totalWeight=" + getTotalWeight() + ", totalNetWeight=" + getTotalNetWeight() + ", recipient=" + getRecipient() + ", products=" + getProducts() + ")";
    }


    public String getCustomerCode() {
        /* 16 */
        return this.customerCode;

    }

    public String getWarehouseCode() {
        /* 18 */
        return this.warehouseCode;

    }

    public String getOrderCode() {
        /* 20 */
        return this.orderCode;

    }

    public String getExtTradeId() {
        /* 22 */
        return this.extTradeId;

    }


    public String getOrderType() {
        /* 26 */
        return this.orderType;

    }


    public String getOrderStatus() {
        /* 36 */
        return this.orderStatus;

    }

    public String getExtOrderType() {
        /* 38 */
        return this.extOrderType;

    }

    public String getOperator() {
        /* 40 */
        return this.operator;

    }

    public String getOperatorTime() {
        /* 42 */
        return this.operatorTime;

    }

    public String getLogisticsProviderCode() {
        /* 44 */
        return this.logisticsProviderCode;

    }

    public String getShippingOrderNo() {
        /* 46 */
        return this.shippingOrderNo;

    }

    public String getRemark() {
        /* 48 */
        return this.remark;

    }

    public String getSkuItem() {
        /* 50 */
        return this.skuItem;

    }

    public Integer getTotalVolume() {
        /* 52 */
        return this.totalVolume;

    }

    public Double getTotalWeight() {
        /* 54 */
        return this.totalWeight;

    }

    public Double getTotalNetWeight() {
        /* 56 */
        return this.totalNetWeight;

    }

    public ReceiverVo getRecipient() {
        /* 58 */
        return this.recipient;

    }

    public List<ItemVo> getProducts() {
        /* 60 */
        return this.products;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\RationOutStatusVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */