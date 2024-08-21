/*    */ package BOOT-INF.classes.cn.com.wms.model.bset;
/*    */ 
/*    */ public class StorageVo implements Serializable {
/*    */   private String warehouseCode;
/*    */   private String actionType;
/*    */   private String refOrderCode;
/*    */   private String extTradeId;
/*    */   private String operationTypeCode;
/*    */   private String extOrderType;
/*    */   private String orderTime;
/*    */   private String earliestArrivalTime;
/*    */   private String latestArrivalTime;
/*    */   
/* 14 */   public void setWarehouseCode(String warehouseCode) { this.warehouseCode = warehouseCode; } private String tmsCompany; private String tmsLinkman; private String tmsPhone; private String tmsLinkmanNo; private String tmsShippingNo; private String remark; private String udfFlag; private String udf1; private String udf2; public void setActionType(String actionType) { this.actionType = actionType; } public void setRefOrderCode(String refOrderCode) { this.refOrderCode = refOrderCode; } public void setExtTradeId(String extTradeId) { this.extTradeId = extTradeId; } public void setOperationTypeCode(String operationTypeCode) { this.operationTypeCode = operationTypeCode; } public void setExtOrderType(String extOrderType) { this.extOrderType = extOrderType; } public void setOrderTime(String orderTime) { this.orderTime = orderTime; } public void setEarliestArrivalTime(String earliestArrivalTime) { this.earliestArrivalTime = earliestArrivalTime; } public void setLatestArrivalTime(String latestArrivalTime) { this.latestArrivalTime = latestArrivalTime; } public void setTmsCompany(String tmsCompany) { this.tmsCompany = tmsCompany; } public void setTmsLinkman(String tmsLinkman) { this.tmsLinkman = tmsLinkman; } public void setTmsPhone(String tmsPhone) { this.tmsPhone = tmsPhone; } public void setTmsLinkmanNo(String tmsLinkmanNo) { this.tmsLinkmanNo = tmsLinkmanNo; } public void setTmsShippingNo(String tmsShippingNo) { this.tmsShippingNo = tmsShippingNo; } public void setRemark(String remark) { this.remark = remark; } public void setUdfFlag(String udfFlag) { this.udfFlag = udfFlag; } public void setUdf1(String udf1) { this.udf1 = udf1; } public void setUdf2(String udf2) { this.udf2 = udf2; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.bset.StorageVo)) return false;  cn.com.wms.model.bset.StorageVo other = (cn.com.wms.model.bset.StorageVo)o; if (!other.canEqual(this)) return false;  Object this$warehouseCode = getWarehouseCode(), other$warehouseCode = other.getWarehouseCode(); if ((this$warehouseCode == null) ? (other$warehouseCode != null) : !this$warehouseCode.equals(other$warehouseCode)) return false;  Object this$actionType = getActionType(), other$actionType = other.getActionType(); if ((this$actionType == null) ? (other$actionType != null) : !this$actionType.equals(other$actionType)) return false;  Object this$refOrderCode = getRefOrderCode(), other$refOrderCode = other.getRefOrderCode(); if ((this$refOrderCode == null) ? (other$refOrderCode != null) : !this$refOrderCode.equals(other$refOrderCode)) return false;  Object this$extTradeId = getExtTradeId(), other$extTradeId = other.getExtTradeId(); if ((this$extTradeId == null) ? (other$extTradeId != null) : !this$extTradeId.equals(other$extTradeId)) return false;  Object this$operationTypeCode = getOperationTypeCode(), other$operationTypeCode = other.getOperationTypeCode(); if ((this$operationTypeCode == null) ? (other$operationTypeCode != null) : !this$operationTypeCode.equals(other$operationTypeCode)) return false;  Object this$extOrderType = getExtOrderType(), other$extOrderType = other.getExtOrderType(); if ((this$extOrderType == null) ? (other$extOrderType != null) : !this$extOrderType.equals(other$extOrderType)) return false;  Object this$orderTime = getOrderTime(), other$orderTime = other.getOrderTime(); if ((this$orderTime == null) ? (other$orderTime != null) : !this$orderTime.equals(other$orderTime)) return false;  Object this$earliestArrivalTime = getEarliestArrivalTime(), other$earliestArrivalTime = other.getEarliestArrivalTime(); if ((this$earliestArrivalTime == null) ? (other$earliestArrivalTime != null) : !this$earliestArrivalTime.equals(other$earliestArrivalTime)) return false;  Object this$latestArrivalTime = getLatestArrivalTime(), other$latestArrivalTime = other.getLatestArrivalTime(); if ((this$latestArrivalTime == null) ? (other$latestArrivalTime != null) : !this$latestArrivalTime.equals(other$latestArrivalTime)) return false;  Object this$tmsCompany = getTmsCompany(), other$tmsCompany = other.getTmsCompany(); if ((this$tmsCompany == null) ? (other$tmsCompany != null) : !this$tmsCompany.equals(other$tmsCompany)) return false;  Object this$tmsLinkman = getTmsLinkman(), other$tmsLinkman = other.getTmsLinkman(); if ((this$tmsLinkman == null) ? (other$tmsLinkman != null) : !this$tmsLinkman.equals(other$tmsLinkman)) return false;  Object this$tmsPhone = getTmsPhone(), other$tmsPhone = other.getTmsPhone(); if ((this$tmsPhone == null) ? (other$tmsPhone != null) : !this$tmsPhone.equals(other$tmsPhone)) return false;  Object this$tmsLinkmanNo = getTmsLinkmanNo(), other$tmsLinkmanNo = other.getTmsLinkmanNo(); if ((this$tmsLinkmanNo == null) ? (other$tmsLinkmanNo != null) : !this$tmsLinkmanNo.equals(other$tmsLinkmanNo)) return false;  Object this$tmsShippingNo = getTmsShippingNo(), other$tmsShippingNo = other.getTmsShippingNo(); if ((this$tmsShippingNo == null) ? (other$tmsShippingNo != null) : !this$tmsShippingNo.equals(other$tmsShippingNo)) return false;  Object this$remark = getRemark(), other$remark = other.getRemark(); if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;  Object this$udfFlag = getUdfFlag(), other$udfFlag = other.getUdfFlag(); if ((this$udfFlag == null) ? (other$udfFlag != null) : !this$udfFlag.equals(other$udfFlag)) return false;  Object this$udf1 = getUdf1(), other$udf1 = other.getUdf1(); if ((this$udf1 == null) ? (other$udf1 != null) : !this$udf1.equals(other$udf1)) return false;  Object this$udf2 = getUdf2(), other$udf2 = other.getUdf2(); return !((this$udf2 == null) ? (other$udf2 != null) : !this$udf2.equals(other$udf2)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.bset.StorageVo; } public int hashCode() { int PRIME = 59; result = 1; Object $warehouseCode = getWarehouseCode(); result = result * 59 + (($warehouseCode == null) ? 43 : $warehouseCode.hashCode()); Object $actionType = getActionType(); result = result * 59 + (($actionType == null) ? 43 : $actionType.hashCode()); Object $refOrderCode = getRefOrderCode(); result = result * 59 + (($refOrderCode == null) ? 43 : $refOrderCode.hashCode()); Object $extTradeId = getExtTradeId(); result = result * 59 + (($extTradeId == null) ? 43 : $extTradeId.hashCode()); Object $operationTypeCode = getOperationTypeCode(); result = result * 59 + (($operationTypeCode == null) ? 43 : $operationTypeCode.hashCode()); Object $extOrderType = getExtOrderType(); result = result * 59 + (($extOrderType == null) ? 43 : $extOrderType.hashCode()); Object $orderTime = getOrderTime(); result = result * 59 + (($orderTime == null) ? 43 : $orderTime.hashCode()); Object $earliestArrivalTime = getEarliestArrivalTime(); result = result * 59 + (($earliestArrivalTime == null) ? 43 : $earliestArrivalTime.hashCode()); Object $latestArrivalTime = getLatestArrivalTime(); result = result * 59 + (($latestArrivalTime == null) ? 43 : $latestArrivalTime.hashCode()); Object $tmsCompany = getTmsCompany(); result = result * 59 + (($tmsCompany == null) ? 43 : $tmsCompany.hashCode()); Object $tmsLinkman = getTmsLinkman(); result = result * 59 + (($tmsLinkman == null) ? 43 : $tmsLinkman.hashCode()); Object $tmsPhone = getTmsPhone(); result = result * 59 + (($tmsPhone == null) ? 43 : $tmsPhone.hashCode()); Object $tmsLinkmanNo = getTmsLinkmanNo(); result = result * 59 + (($tmsLinkmanNo == null) ? 43 : $tmsLinkmanNo.hashCode()); Object $tmsShippingNo = getTmsShippingNo(); result = result * 59 + (($tmsShippingNo == null) ? 43 : $tmsShippingNo.hashCode()); Object $remark = getRemark(); result = result * 59 + (($remark == null) ? 43 : $remark.hashCode()); Object $udfFlag = getUdfFlag(); result = result * 59 + (($udfFlag == null) ? 43 : $udfFlag.hashCode()); Object $udf1 = getUdf1(); result = result * 59 + (($udf1 == null) ? 43 : $udf1.hashCode()); Object $udf2 = getUdf2(); return result * 59 + (($udf2 == null) ? 43 : $udf2.hashCode()); } public String toString() { return "StorageVo(warehouseCode=" + getWarehouseCode() + ", actionType=" + getActionType() + ", refOrderCode=" + getRefOrderCode() + ", extTradeId=" + getExtTradeId() + ", operationTypeCode=" + getOperationTypeCode() + ", extOrderType=" + getExtOrderType() + ", orderTime=" + getOrderTime() + ", earliestArrivalTime=" + getEarliestArrivalTime() + ", latestArrivalTime=" + getLatestArrivalTime() + ", tmsCompany=" + getTmsCompany() + ", tmsLinkman=" + getTmsLinkman() + ", tmsPhone=" + getTmsPhone() + ", tmsLinkmanNo=" + getTmsLinkmanNo() + ", tmsShippingNo=" + getTmsShippingNo() + ", remark=" + getRemark() + ", udfFlag=" + getUdfFlag() + ", udf1=" + getUdf1() + ", udf2=" + getUdf2() + ")"; }
/*    */   
/*    */   public String getWarehouseCode() {
/* 17 */     return this.warehouseCode;
/*    */   }
/*    */   
/*    */   public String getActionType() {
/* 21 */     return this.actionType;
/*    */   }
/*    */   public String getRefOrderCode() {
/* 24 */     return this.refOrderCode;
/*    */   }
/*    */   public String getExtTradeId() {
/* 27 */     return this.extTradeId;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getOperationTypeCode() {
/* 33 */     return this.operationTypeCode;
/*    */   }
/*    */   
/*    */   public String getExtOrderType() {
/* 37 */     return this.extOrderType;
/*    */   }
/*    */   public String getOrderTime() {
/* 40 */     return this.orderTime;
/*    */   }
/*    */   public String getEarliestArrivalTime() {
/* 43 */     return this.earliestArrivalTime;
/*    */   }
/*    */   public String getLatestArrivalTime() {
/* 46 */     return this.latestArrivalTime;
/*    */   }
/*    */   public String getTmsCompany() {
/* 49 */     return this.tmsCompany;
/*    */   }
/*    */   public String getTmsLinkman() {
/* 52 */     return this.tmsLinkman;
/*    */   }
/*    */   public String getTmsPhone() {
/* 55 */     return this.tmsPhone;
/*    */   }
/*    */   public String getTmsLinkmanNo() {
/* 58 */     return this.tmsLinkmanNo;
/*    */   }
/*    */   public String getTmsShippingNo() {
/* 61 */     return this.tmsShippingNo;
/*    */   }
/*    */   public String getRemark() {
/* 64 */     return this.remark;
/*    */   }
/*    */   public String getUdfFlag() {
/* 67 */     return this.udfFlag;
/*    */   }
/*    */   public String getUdf1() {
/* 70 */     return this.udf1;
/*    */   }
/*    */   public String getUdf2() {
/* 73 */     return this.udf2;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\StorageVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */