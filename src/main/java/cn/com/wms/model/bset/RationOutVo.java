/*    */ package BOOT-INF.classes.cn.com.wms.model.bset;
/*    */ 
/*    */ import cn.com.wms.model.bset.ItemVo;
/*    */ 
/*    */ public class RationOutVo implements Serializable {
/*    */   private String operationFlag;
/*    */   private String customerCode;
/*    */   private String customerName;
/*    */   private String projectCode;
/*    */   private String transportMode;
/*    */   private String vehicleModel;
/*    */   private String logisticsCode;
/*    */   private String orderDescription;
/*    */   private String shippingOrderNo;
/*    */   
/* 16 */   public void setOperationFlag(String operationFlag) { this.operationFlag = operationFlag; } private String orderCode; private String productCode; private String tradeMark; private BigDecimal totalAmount; private Boolean isPaymentCollected; private BigDecimal goodsValue; private BigDecimal cheapAmount; private SenderVo sender; private ReceiverVo receiver; private List<ItemVo> itemList; public void setCustomerCode(String customerCode) { this.customerCode = customerCode; } public void setCustomerName(String customerName) { this.customerName = customerName; } public void setProjectCode(String projectCode) { this.projectCode = projectCode; } public void setTransportMode(String transportMode) { this.transportMode = transportMode; } public void setVehicleModel(String vehicleModel) { this.vehicleModel = vehicleModel; } public void setLogisticsCode(String logisticsCode) { this.logisticsCode = logisticsCode; } public void setOrderDescription(String orderDescription) { this.orderDescription = orderDescription; } public void setShippingOrderNo(String shippingOrderNo) { this.shippingOrderNo = shippingOrderNo; } public void setOrderCode(String orderCode) { this.orderCode = orderCode; } public void setProductCode(String productCode) { this.productCode = productCode; } public void setTradeMark(String tradeMark) { this.tradeMark = tradeMark; } public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; } public void setIsPaymentCollected(Boolean isPaymentCollected) { this.isPaymentCollected = isPaymentCollected; } public void setGoodsValue(BigDecimal goodsValue) { this.goodsValue = goodsValue; } public void setCheapAmount(BigDecimal cheapAmount) { this.cheapAmount = cheapAmount; } public void setSender(SenderVo sender) { this.sender = sender; } public void setReceiver(ReceiverVo receiver) { this.receiver = receiver; } public void setItemList(List<ItemVo> itemList) { this.itemList = itemList; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.bset.RationOutVo)) return false;  cn.com.wms.model.bset.RationOutVo other = (cn.com.wms.model.bset.RationOutVo)o; if (!other.canEqual(this)) return false;  Object this$operationFlag = getOperationFlag(), other$operationFlag = other.getOperationFlag(); if ((this$operationFlag == null) ? (other$operationFlag != null) : !this$operationFlag.equals(other$operationFlag)) return false;  Object this$customerCode = getCustomerCode(), other$customerCode = other.getCustomerCode(); if ((this$customerCode == null) ? (other$customerCode != null) : !this$customerCode.equals(other$customerCode)) return false;  Object this$customerName = getCustomerName(), other$customerName = other.getCustomerName(); if ((this$customerName == null) ? (other$customerName != null) : !this$customerName.equals(other$customerName)) return false;  Object this$projectCode = getProjectCode(), other$projectCode = other.getProjectCode(); if ((this$projectCode == null) ? (other$projectCode != null) : !this$projectCode.equals(other$projectCode)) return false;  Object this$transportMode = getTransportMode(), other$transportMode = other.getTransportMode(); if ((this$transportMode == null) ? (other$transportMode != null) : !this$transportMode.equals(other$transportMode)) return false;  Object this$vehicleModel = getVehicleModel(), other$vehicleModel = other.getVehicleModel(); if ((this$vehicleModel == null) ? (other$vehicleModel != null) : !this$vehicleModel.equals(other$vehicleModel)) return false;  Object this$logisticsCode = getLogisticsCode(), other$logisticsCode = other.getLogisticsCode(); if ((this$logisticsCode == null) ? (other$logisticsCode != null) : !this$logisticsCode.equals(other$logisticsCode)) return false;  Object this$orderDescription = getOrderDescription(), other$orderDescription = other.getOrderDescription(); if ((this$orderDescription == null) ? (other$orderDescription != null) : !this$orderDescription.equals(other$orderDescription)) return false;  Object this$shippingOrderNo = getShippingOrderNo(), other$shippingOrderNo = other.getShippingOrderNo(); if ((this$shippingOrderNo == null) ? (other$shippingOrderNo != null) : !this$shippingOrderNo.equals(other$shippingOrderNo)) return false;  Object this$orderCode = getOrderCode(), other$orderCode = other.getOrderCode(); if ((this$orderCode == null) ? (other$orderCode != null) : !this$orderCode.equals(other$orderCode)) return false;  Object this$productCode = getProductCode(), other$productCode = other.getProductCode(); if ((this$productCode == null) ? (other$productCode != null) : !this$productCode.equals(other$productCode)) return false;  Object this$tradeMark = getTradeMark(), other$tradeMark = other.getTradeMark(); if ((this$tradeMark == null) ? (other$tradeMark != null) : !this$tradeMark.equals(other$tradeMark)) return false;  Object this$totalAmount = getTotalAmount(), other$totalAmount = other.getTotalAmount(); if ((this$totalAmount == null) ? (other$totalAmount != null) : !this$totalAmount.equals(other$totalAmount)) return false;  Object this$isPaymentCollected = getIsPaymentCollected(), other$isPaymentCollected = other.getIsPaymentCollected(); if ((this$isPaymentCollected == null) ? (other$isPaymentCollected != null) : !this$isPaymentCollected.equals(other$isPaymentCollected)) return false;  Object this$goodsValue = getGoodsValue(), other$goodsValue = other.getGoodsValue(); if ((this$goodsValue == null) ? (other$goodsValue != null) : !this$goodsValue.equals(other$goodsValue)) return false;  Object this$cheapAmount = getCheapAmount(), other$cheapAmount = other.getCheapAmount(); if ((this$cheapAmount == null) ? (other$cheapAmount != null) : !this$cheapAmount.equals(other$cheapAmount)) return false;  Object this$sender = getSender(), other$sender = other.getSender(); if ((this$sender == null) ? (other$sender != null) : !this$sender.equals(other$sender)) return false;  Object this$receiver = getReceiver(), other$receiver = other.getReceiver(); if ((this$receiver == null) ? (other$receiver != null) : !this$receiver.equals(other$receiver)) return false;  Object<ItemVo> this$itemList = (Object<ItemVo>)getItemList(), other$itemList = (Object<ItemVo>)other.getItemList(); return !((this$itemList == null) ? (other$itemList != null) : !this$itemList.equals(other$itemList)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.bset.RationOutVo; } public int hashCode() { int PRIME = 59; result = 1; Object $operationFlag = getOperationFlag(); result = result * 59 + (($operationFlag == null) ? 43 : $operationFlag.hashCode()); Object $customerCode = getCustomerCode(); result = result * 59 + (($customerCode == null) ? 43 : $customerCode.hashCode()); Object $customerName = getCustomerName(); result = result * 59 + (($customerName == null) ? 43 : $customerName.hashCode()); Object $projectCode = getProjectCode(); result = result * 59 + (($projectCode == null) ? 43 : $projectCode.hashCode()); Object $transportMode = getTransportMode(); result = result * 59 + (($transportMode == null) ? 43 : $transportMode.hashCode()); Object $vehicleModel = getVehicleModel(); result = result * 59 + (($vehicleModel == null) ? 43 : $vehicleModel.hashCode()); Object $logisticsCode = getLogisticsCode(); result = result * 59 + (($logisticsCode == null) ? 43 : $logisticsCode.hashCode()); Object $orderDescription = getOrderDescription(); result = result * 59 + (($orderDescription == null) ? 43 : $orderDescription.hashCode()); Object $shippingOrderNo = getShippingOrderNo(); result = result * 59 + (($shippingOrderNo == null) ? 43 : $shippingOrderNo.hashCode()); Object $orderCode = getOrderCode(); result = result * 59 + (($orderCode == null) ? 43 : $orderCode.hashCode()); Object $productCode = getProductCode(); result = result * 59 + (($productCode == null) ? 43 : $productCode.hashCode()); Object $tradeMark = getTradeMark(); result = result * 59 + (($tradeMark == null) ? 43 : $tradeMark.hashCode()); Object $totalAmount = getTotalAmount(); result = result * 59 + (($totalAmount == null) ? 43 : $totalAmount.hashCode()); Object $isPaymentCollected = getIsPaymentCollected(); result = result * 59 + (($isPaymentCollected == null) ? 43 : $isPaymentCollected.hashCode()); Object $goodsValue = getGoodsValue(); result = result * 59 + (($goodsValue == null) ? 43 : $goodsValue.hashCode()); Object $cheapAmount = getCheapAmount(); result = result * 59 + (($cheapAmount == null) ? 43 : $cheapAmount.hashCode()); Object $sender = getSender(); result = result * 59 + (($sender == null) ? 43 : $sender.hashCode()); Object $receiver = getReceiver(); result = result * 59 + (($receiver == null) ? 43 : $receiver.hashCode()); Object<ItemVo> $itemList = (Object<ItemVo>)getItemList(); return result * 59 + (($itemList == null) ? 43 : $itemList.hashCode()); } public String toString() { return "RationOutVo(operationFlag=" + getOperationFlag() + ", customerCode=" + getCustomerCode() + ", customerName=" + getCustomerName() + ", projectCode=" + getProjectCode() + ", transportMode=" + getTransportMode() + ", vehicleModel=" + getVehicleModel() + ", logisticsCode=" + getLogisticsCode() + ", orderDescription=" + getOrderDescription() + ", shippingOrderNo=" + getShippingOrderNo() + ", orderCode=" + getOrderCode() + ", productCode=" + getProductCode() + ", tradeMark=" + getTradeMark() + ", totalAmount=" + getTotalAmount() + ", isPaymentCollected=" + getIsPaymentCollected() + ", goodsValue=" + getGoodsValue() + ", cheapAmount=" + getCheapAmount() + ", sender=" + getSender() + ", receiver=" + getReceiver() + ", itemList=" + getItemList() + ")"; }
/*    */   
/*    */   public String getOperationFlag() {
/* 19 */     return this.operationFlag;
/*    */   }
/*    */   public String getCustomerCode() {
/* 22 */     return this.customerCode;
/*    */   }
/*    */   public String getCustomerName() {
/* 25 */     return this.customerName;
/*    */   }
/*    */   public String getProjectCode() {
/* 28 */     return this.projectCode;
/*    */   }
/*    */   public String getTransportMode() {
/* 31 */     return this.transportMode;
/*    */   }
/*    */   public String getVehicleModel() {
/* 34 */     return this.vehicleModel;
/*    */   }
/*    */   public String getLogisticsCode() {
/* 37 */     return this.logisticsCode;
/*    */   }
/*    */   
/*    */   public String getOrderDescription() {
/* 41 */     return this.orderDescription;
/*    */   }
/*    */   public String getShippingOrderNo() {
/* 44 */     return this.shippingOrderNo;
/*    */   }
/*    */   public String getOrderCode() {
/* 47 */     return this.orderCode;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getProductCode() {
/* 53 */     return this.productCode;
/*    */   }
/*    */   public String getTradeMark() {
/* 56 */     return this.tradeMark;
/*    */   }
/*    */   public BigDecimal getTotalAmount() {
/* 59 */     return this.totalAmount;
/*    */   }
/*    */   public Boolean getIsPaymentCollected() {
/* 62 */     return this.isPaymentCollected;
/*    */   }
/*    */   public BigDecimal getGoodsValue() {
/* 65 */     return this.goodsValue;
/*    */   }
/*    */   public BigDecimal getCheapAmount() {
/* 68 */     return this.cheapAmount;
/*    */   }
/*    */   public SenderVo getSender() {
/* 71 */     return this.sender;
/*    */   }
/*    */   public ReceiverVo getReceiver() {
/* 74 */     return this.receiver;
/*    */   }
/*    */   public List<ItemVo> getItemList() {
/* 77 */     return this.itemList;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\RationOutVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */