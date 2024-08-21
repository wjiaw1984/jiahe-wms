/*    */ package BOOT-INF.classes.cn.com.wms.model.bset;
/*    */ public class RationOutStatusVo implements Serializable {
/*    */   private String customerCode;
/*    */   private String warehouseCode;
/*    */   private String orderCode;
/*    */   private String extTradeId;
/*    */   private String orderType;
/*    */   private String orderStatus;
/*    */   private String extOrderType;
/*    */   private String operator;
/*    */   private String operatorTime;
/*    */   
/* 13 */   public void setCustomerCode(String customerCode) { this.customerCode = customerCode; } private String logisticsProviderCode; private String shippingOrderNo; private String remark; private String skuItem; private Integer totalVolume; private Double totalWeight; private Double totalNetWeight; private ReceiverVo recipient; private List<ItemVo> products; public void setWarehouseCode(String warehouseCode) { this.warehouseCode = warehouseCode; } public void setOrderCode(String orderCode) { this.orderCode = orderCode; } public void setExtTradeId(String extTradeId) { this.extTradeId = extTradeId; } public void setOrderType(String orderType) { this.orderType = orderType; } public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; } public void setExtOrderType(String extOrderType) { this.extOrderType = extOrderType; } public void setOperator(String operator) { this.operator = operator; } public void setOperatorTime(String operatorTime) { this.operatorTime = operatorTime; } public void setLogisticsProviderCode(String logisticsProviderCode) { this.logisticsProviderCode = logisticsProviderCode; } public void setShippingOrderNo(String shippingOrderNo) { this.shippingOrderNo = shippingOrderNo; } public void setRemark(String remark) { this.remark = remark; } public void setSkuItem(String skuItem) { this.skuItem = skuItem; } public void setTotalVolume(Integer totalVolume) { this.totalVolume = totalVolume; } public void setTotalWeight(Double totalWeight) { this.totalWeight = totalWeight; } public void setTotalNetWeight(Double totalNetWeight) { this.totalNetWeight = totalNetWeight; } public void setRecipient(ReceiverVo recipient) { this.recipient = recipient; } public void setProducts(List<ItemVo> products) { this.products = products; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.bset.RationOutStatusVo)) return false;  cn.com.wms.model.bset.RationOutStatusVo other = (cn.com.wms.model.bset.RationOutStatusVo)o; if (!other.canEqual(this)) return false;  Object this$customerCode = getCustomerCode(), other$customerCode = other.getCustomerCode(); if ((this$customerCode == null) ? (other$customerCode != null) : !this$customerCode.equals(other$customerCode)) return false;  Object this$warehouseCode = getWarehouseCode(), other$warehouseCode = other.getWarehouseCode(); if ((this$warehouseCode == null) ? (other$warehouseCode != null) : !this$warehouseCode.equals(other$warehouseCode)) return false;  Object this$orderCode = getOrderCode(), other$orderCode = other.getOrderCode(); if ((this$orderCode == null) ? (other$orderCode != null) : !this$orderCode.equals(other$orderCode)) return false;  Object this$extTradeId = getExtTradeId(), other$extTradeId = other.getExtTradeId(); if ((this$extTradeId == null) ? (other$extTradeId != null) : !this$extTradeId.equals(other$extTradeId)) return false;  Object this$orderType = getOrderType(), other$orderType = other.getOrderType(); if ((this$orderType == null) ? (other$orderType != null) : !this$orderType.equals(other$orderType)) return false;  Object this$orderStatus = getOrderStatus(), other$orderStatus = other.getOrderStatus(); if ((this$orderStatus == null) ? (other$orderStatus != null) : !this$orderStatus.equals(other$orderStatus)) return false;  Object this$extOrderType = getExtOrderType(), other$extOrderType = other.getExtOrderType(); if ((this$extOrderType == null) ? (other$extOrderType != null) : !this$extOrderType.equals(other$extOrderType)) return false;  Object this$operator = getOperator(), other$operator = other.getOperator(); if ((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator)) return false;  Object this$operatorTime = getOperatorTime(), other$operatorTime = other.getOperatorTime(); if ((this$operatorTime == null) ? (other$operatorTime != null) : !this$operatorTime.equals(other$operatorTime)) return false;  Object this$logisticsProviderCode = getLogisticsProviderCode(), other$logisticsProviderCode = other.getLogisticsProviderCode(); if ((this$logisticsProviderCode == null) ? (other$logisticsProviderCode != null) : !this$logisticsProviderCode.equals(other$logisticsProviderCode)) return false;  Object this$shippingOrderNo = getShippingOrderNo(), other$shippingOrderNo = other.getShippingOrderNo(); if ((this$shippingOrderNo == null) ? (other$shippingOrderNo != null) : !this$shippingOrderNo.equals(other$shippingOrderNo)) return false;  Object this$remark = getRemark(), other$remark = other.getRemark(); if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;  Object this$skuItem = getSkuItem(), other$skuItem = other.getSkuItem(); if ((this$skuItem == null) ? (other$skuItem != null) : !this$skuItem.equals(other$skuItem)) return false;  Object this$totalVolume = getTotalVolume(), other$totalVolume = other.getTotalVolume(); if ((this$totalVolume == null) ? (other$totalVolume != null) : !this$totalVolume.equals(other$totalVolume)) return false;  Object this$totalWeight = getTotalWeight(), other$totalWeight = other.getTotalWeight(); if ((this$totalWeight == null) ? (other$totalWeight != null) : !this$totalWeight.equals(other$totalWeight)) return false;  Object this$totalNetWeight = getTotalNetWeight(), other$totalNetWeight = other.getTotalNetWeight(); if ((this$totalNetWeight == null) ? (other$totalNetWeight != null) : !this$totalNetWeight.equals(other$totalNetWeight)) return false;  Object this$recipient = getRecipient(), other$recipient = other.getRecipient(); if ((this$recipient == null) ? (other$recipient != null) : !this$recipient.equals(other$recipient)) return false;  Object<ItemVo> this$products = (Object<ItemVo>)getProducts(), other$products = (Object<ItemVo>)other.getProducts(); return !((this$products == null) ? (other$products != null) : !this$products.equals(other$products)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.bset.RationOutStatusVo; } public int hashCode() { int PRIME = 59; result = 1; Object $customerCode = getCustomerCode(); result = result * 59 + (($customerCode == null) ? 43 : $customerCode.hashCode()); Object $warehouseCode = getWarehouseCode(); result = result * 59 + (($warehouseCode == null) ? 43 : $warehouseCode.hashCode()); Object $orderCode = getOrderCode(); result = result * 59 + (($orderCode == null) ? 43 : $orderCode.hashCode()); Object $extTradeId = getExtTradeId(); result = result * 59 + (($extTradeId == null) ? 43 : $extTradeId.hashCode()); Object $orderType = getOrderType(); result = result * 59 + (($orderType == null) ? 43 : $orderType.hashCode()); Object $orderStatus = getOrderStatus(); result = result * 59 + (($orderStatus == null) ? 43 : $orderStatus.hashCode()); Object $extOrderType = getExtOrderType(); result = result * 59 + (($extOrderType == null) ? 43 : $extOrderType.hashCode()); Object $operator = getOperator(); result = result * 59 + (($operator == null) ? 43 : $operator.hashCode()); Object $operatorTime = getOperatorTime(); result = result * 59 + (($operatorTime == null) ? 43 : $operatorTime.hashCode()); Object $logisticsProviderCode = getLogisticsProviderCode(); result = result * 59 + (($logisticsProviderCode == null) ? 43 : $logisticsProviderCode.hashCode()); Object $shippingOrderNo = getShippingOrderNo(); result = result * 59 + (($shippingOrderNo == null) ? 43 : $shippingOrderNo.hashCode()); Object $remark = getRemark(); result = result * 59 + (($remark == null) ? 43 : $remark.hashCode()); Object $skuItem = getSkuItem(); result = result * 59 + (($skuItem == null) ? 43 : $skuItem.hashCode()); Object $totalVolume = getTotalVolume(); result = result * 59 + (($totalVolume == null) ? 43 : $totalVolume.hashCode()); Object $totalWeight = getTotalWeight(); result = result * 59 + (($totalWeight == null) ? 43 : $totalWeight.hashCode()); Object $totalNetWeight = getTotalNetWeight(); result = result * 59 + (($totalNetWeight == null) ? 43 : $totalNetWeight.hashCode()); Object $recipient = getRecipient(); result = result * 59 + (($recipient == null) ? 43 : $recipient.hashCode()); Object<ItemVo> $products = (Object<ItemVo>)getProducts(); return result * 59 + (($products == null) ? 43 : $products.hashCode()); } public String toString() { return "RationOutStatusVo(customerCode=" + getCustomerCode() + ", warehouseCode=" + getWarehouseCode() + ", orderCode=" + getOrderCode() + ", extTradeId=" + getExtTradeId() + ", orderType=" + getOrderType() + ", orderStatus=" + getOrderStatus() + ", extOrderType=" + getExtOrderType() + ", operator=" + getOperator() + ", operatorTime=" + getOperatorTime() + ", logisticsProviderCode=" + getLogisticsProviderCode() + ", shippingOrderNo=" + getShippingOrderNo() + ", remark=" + getRemark() + ", skuItem=" + getSkuItem() + ", totalVolume=" + getTotalVolume() + ", totalWeight=" + getTotalWeight() + ", totalNetWeight=" + getTotalNetWeight() + ", recipient=" + getRecipient() + ", products=" + getProducts() + ")"; }
/*    */   
/*    */   public String getCustomerCode() {
/* 16 */     return this.customerCode;
/*    */   } public String getWarehouseCode() {
/* 18 */     return this.warehouseCode;
/*    */   } public String getOrderCode() {
/* 20 */     return this.orderCode;
/*    */   } public String getExtTradeId() {
/* 22 */     return this.extTradeId;
/*    */   }
/*    */   
/*    */   public String getOrderType() {
/* 26 */     return this.orderType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getOrderStatus() {
/* 36 */     return this.orderStatus;
/*    */   } public String getExtOrderType() {
/* 38 */     return this.extOrderType;
/*    */   } public String getOperator() {
/* 40 */     return this.operator;
/*    */   } public String getOperatorTime() {
/* 42 */     return this.operatorTime;
/*    */   } public String getLogisticsProviderCode() {
/* 44 */     return this.logisticsProviderCode;
/*    */   } public String getShippingOrderNo() {
/* 46 */     return this.shippingOrderNo;
/*    */   } public String getRemark() {
/* 48 */     return this.remark;
/*    */   } public String getSkuItem() {
/* 50 */     return this.skuItem;
/*    */   } public Integer getTotalVolume() {
/* 52 */     return this.totalVolume;
/*    */   } public Double getTotalWeight() {
/* 54 */     return this.totalWeight;
/*    */   } public Double getTotalNetWeight() {
/* 56 */     return this.totalNetWeight;
/*    */   } public ReceiverVo getRecipient() {
/* 58 */     return this.recipient;
/*    */   } public List<ItemVo> getProducts() {
/* 60 */     return this.products;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\RationOutStatusVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */