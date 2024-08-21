package com.best.javaSdk.twAsnNotify.request;

import cn.com.wms.common.utils.Convert;
import cn.com.wms.config.BestConfig;
import cn.com.wms.model.wms.sdwms.SdwmsPurchase;
import cn.com.wms.model.wms.sdwms.SdwmsRetration;
import com.best.javaSdk.BaseRequest;
import com.best.javaSdk.BaseResponse;
import com.best.javaSdk.Parser;
import com.best.javaSdk.twAsnNotify.response.TwAsnNotifyRsp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwAsnNotifyReq implements BaseRequest {
    private String operationFlag;
    private String customerCode;
    private String customerName;
    private String projectCode;
    private String transportMode;
    private String vehicleModel;
    private String logisticsCode;
    private String orderDescription;
    private String shippingOrderNo;
    private String orderCode;
    private String asnOrders;
    private String productCode;
    private String tradeMark;
    private double totalAmount;
    private String warehouseCode;
    private String actionType;
    private String refOrderCode;
    private String extTradeId;
    private String operationTypeCode;
    private String extOrderType;
    private String orderTime;
    private String earliestArrivalTime;
    private String latestArrivalTime;
    private String tmsCompany;
    private String tmsLinkman;

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq)) return false;
        com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq other = (com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq) o;
        if (!other.canEqual(this)) return false;
        Object this$operationFlag = getOperationFlag(), other$operationFlag = other.getOperationFlag();
        if ((this$operationFlag == null) ? (other$operationFlag != null) : !this$operationFlag.equals(other$operationFlag))
            return false;
        Object this$customerCode = getCustomerCode(), other$customerCode = other.getCustomerCode();
        if ((this$customerCode == null) ? (other$customerCode != null) : !this$customerCode.equals(other$customerCode))
            return false;
        Object this$customerName = getCustomerName(), other$customerName = other.getCustomerName();
        if ((this$customerName == null) ? (other$customerName != null) : !this$customerName.equals(other$customerName))
            return false;
        Object this$projectCode = getProjectCode(), other$projectCode = other.getProjectCode();
        if ((this$projectCode == null) ? (other$projectCode != null) : !this$projectCode.equals(other$projectCode))
            return false;
        Object this$transportMode = getTransportMode(), other$transportMode = other.getTransportMode();
        if ((this$transportMode == null) ? (other$transportMode != null) : !this$transportMode.equals(other$transportMode))
            return false;
        Object this$vehicleModel = getVehicleModel(), other$vehicleModel = other.getVehicleModel();
        if ((this$vehicleModel == null) ? (other$vehicleModel != null) : !this$vehicleModel.equals(other$vehicleModel))
            return false;
        Object this$logisticsCode = getLogisticsCode(), other$logisticsCode = other.getLogisticsCode();
        if ((this$logisticsCode == null) ? (other$logisticsCode != null) : !this$logisticsCode.equals(other$logisticsCode))
            return false;
        Object this$orderDescription = getOrderDescription(), other$orderDescription = other.getOrderDescription();
        if ((this$orderDescription == null) ? (other$orderDescription != null) : !this$orderDescription.equals(other$orderDescription))
            return false;
        Object this$shippingOrderNo = getShippingOrderNo(), other$shippingOrderNo = other.getShippingOrderNo();
        if ((this$shippingOrderNo == null) ? (other$shippingOrderNo != null) : !this$shippingOrderNo.equals(other$shippingOrderNo))
            return false;
        Object this$orderCode = getOrderCode(), other$orderCode = other.getOrderCode();
        if ((this$orderCode == null) ? (other$orderCode != null) : !this$orderCode.equals(other$orderCode))
            return false;
        Object this$asnOrders = getAsnOrders(), other$asnOrders = other.getAsnOrders();
        if ((this$asnOrders == null) ? (other$asnOrders != null) : !this$asnOrders.equals(other$asnOrders))
            return false;
        Object this$productCode = getProductCode(), other$productCode = other.getProductCode();
        if ((this$productCode == null) ? (other$productCode != null) : !this$productCode.equals(other$productCode))
            return false;
        Object this$tradeMark = getTradeMark(), other$tradeMark = other.getTradeMark();
        if ((this$tradeMark == null) ? (other$tradeMark != null) : !this$tradeMark.equals(other$tradeMark))
            return false;
        if (Double.compare(getTotalAmount(), other.getTotalAmount()) != 0) return false;
        Object this$warehouseCode = getWarehouseCode(), other$warehouseCode = other.getWarehouseCode();
        if ((this$warehouseCode == null) ? (other$warehouseCode != null) : !this$warehouseCode.equals(other$warehouseCode))
            return false;
        Object this$actionType = getActionType(), other$actionType = other.getActionType();
        if ((this$actionType == null) ? (other$actionType != null) : !this$actionType.equals(other$actionType))
            return false;
        Object this$refOrderCode = getRefOrderCode(), other$refOrderCode = other.getRefOrderCode();
        if ((this$refOrderCode == null) ? (other$refOrderCode != null) : !this$refOrderCode.equals(other$refOrderCode))
            return false;
        Object this$extTradeId = getExtTradeId(), other$extTradeId = other.getExtTradeId();
        if ((this$extTradeId == null) ? (other$extTradeId != null) : !this$extTradeId.equals(other$extTradeId))
            return false;
        Object this$operationTypeCode = getOperationTypeCode(), other$operationTypeCode = other.getOperationTypeCode();
        if ((this$operationTypeCode == null) ? (other$operationTypeCode != null) : !this$operationTypeCode.equals(other$operationTypeCode))
            return false;
        Object this$extOrderType = getExtOrderType(), other$extOrderType = other.getExtOrderType();
        if ((this$extOrderType == null) ? (other$extOrderType != null) : !this$extOrderType.equals(other$extOrderType))
            return false;
        Object this$orderTime = getOrderTime(), other$orderTime = other.getOrderTime();
        if ((this$orderTime == null) ? (other$orderTime != null) : !this$orderTime.equals(other$orderTime))
            return false;
        Object this$earliestArrivalTime = getEarliestArrivalTime(), other$earliestArrivalTime = other.getEarliestArrivalTime();
        if ((this$earliestArrivalTime == null) ? (other$earliestArrivalTime != null) : !this$earliestArrivalTime.equals(other$earliestArrivalTime))
            return false;
        Object this$latestArrivalTime = getLatestArrivalTime(), other$latestArrivalTime = other.getLatestArrivalTime();
        if ((this$latestArrivalTime == null) ? (other$latestArrivalTime != null) : !this$latestArrivalTime.equals(other$latestArrivalTime))
            return false;
        Object this$tmsCompany = getTmsCompany(), other$tmsCompany = other.getTmsCompany();
        if ((this$tmsCompany == null) ? (other$tmsCompany != null) : !this$tmsCompany.equals(other$tmsCompany))
            return false;
        Object this$tmsLinkman = getTmsLinkman(), other$tmsLinkman = other.getTmsLinkman();
        if ((this$tmsLinkman == null) ? (other$tmsLinkman != null) : !this$tmsLinkman.equals(other$tmsLinkman))
            return false;
        Object this$tmsPhone = getTmsPhone(), other$tmsPhone = other.getTmsPhone();
        if ((this$tmsPhone == null) ? (other$tmsPhone != null) : !this$tmsPhone.equals(other$tmsPhone)) return false;
        Object this$tmsLinkmanNo = getTmsLinkmanNo(), other$tmsLinkmanNo = other.getTmsLinkmanNo();
        if ((this$tmsLinkmanNo == null) ? (other$tmsLinkmanNo != null) : !this$tmsLinkmanNo.equals(other$tmsLinkmanNo))
            return false;
        Object this$tmsShippingNo = getTmsShippingNo(), other$tmsShippingNo = other.getTmsShippingNo();
        if ((this$tmsShippingNo == null) ? (other$tmsShippingNo != null) : !this$tmsShippingNo.equals(other$tmsShippingNo))
            return false;
        Object this$remark = getRemark(), other$remark = other.getRemark();
        if ((this$remark == null) ? (other$remark != null) : !this$remark.equals(other$remark)) return false;
        if (getUdfFlag() != other.getUdfFlag()) return false;
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
        if ((this$udf8 == null) ? (other$udf8 != null) : !this$udf8.equals(other$udf8)) return false;
        Object this$sender = getSender(), other$sender = other.getSender();
        if ((this$sender == null) ? (other$sender != null) : !this$sender.equals(other$sender)) return false;
        Object this$receiver = getReceiver(), other$receiver = other.getReceiver();
        if ((this$receiver == null) ? (other$receiver != null) : !this$receiver.equals(other$receiver)) return false;
        Object this$serviceList = getServiceList(), other$serviceList = other.getServiceList();
        if ((this$serviceList == null) ? (other$serviceList != null) : !this$serviceList.equals(other$serviceList))
            return false;
        Object this$itemList = getItemList(), other$itemList = other.getItemList();
        if ((this$itemList == null) ? (other$itemList != null) : !this$itemList.equals(other$itemList)) return false;
        if (Double.compare(getGoodsValue(), other.getGoodsValue()) != 0) return false;
        if (Double.compare(getCheapAmount(), other.getCheapAmount()) != 0) return false;
        Object this$referenceReqList = getReferenceReqList(), other$referenceReqList = other.getReferenceReqList();
        if ((this$referenceReqList == null) ? (other$referenceReqList != null) : !this$referenceReqList.equals(other$referenceReqList))
            return false;
        Object this$businessScenarioCode = getBusinessScenarioCode(), other$businessScenarioCode = other.getBusinessScenarioCode();
        if ((this$businessScenarioCode == null) ? (other$businessScenarioCode != null) : !this$businessScenarioCode.equals(other$businessScenarioCode))
            return false;
        Object this$boxList = getBoxList(), other$boxList = other.getBoxList();
        if ((this$boxList == null) ? (other$boxList != null) : !this$boxList.equals(other$boxList)) return false;
        Object this$labelList = getLabelList(), other$labelList = other.getLabelList();
        if ((this$labelList == null) ? (other$labelList != null) : !this$labelList.equals(other$labelList))
            return false;
        Object this$orgName = getOrgName(), other$orgName = other.getOrgName();
        if ((this$orgName == null) ? (other$orgName != null) : !this$orgName.equals(other$orgName)) return false;
        Object this$storeCode = getStoreCode(), other$storeCode = other.getStoreCode();
        return !((this$storeCode == null) ? (other$storeCode != null) : !this$storeCode.equals(other$storeCode));
    }

    private String tmsPhone;
    private String tmsLinkmanNo;
    private String tmsShippingNo;
    private String remark;
    private boolean udfFlag;
    private String udf1;
    private String udf2;
    private String udf3;
    private String udf4;
    private String udf5;
    private String udf6;
    private String udf7;
    private String udf8;
    private Sender sender;
    private Receiver receiver;
    private ServiceList serviceList;
    private ItemList itemList;
    private double goodsValue;
    private double cheapAmount;
    private ReferenceReqList referenceReqList;
    private String businessScenarioCode;
    private BoxList boxList;
    private LabelList labelList;
    private String orgName;
    private String storeCode;

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq;
    }

    public int hashCode() {
        int PRIME = 59;
        result = 1;
        Object $operationFlag = getOperationFlag();
        result = result * 59 + (($operationFlag == null) ? 43 : $operationFlag.hashCode());
        Object $customerCode = getCustomerCode();
        result = result * 59 + (($customerCode == null) ? 43 : $customerCode.hashCode());
        Object $customerName = getCustomerName();
        result = result * 59 + (($customerName == null) ? 43 : $customerName.hashCode());
        Object $projectCode = getProjectCode();
        result = result * 59 + (($projectCode == null) ? 43 : $projectCode.hashCode());
        Object $transportMode = getTransportMode();
        result = result * 59 + (($transportMode == null) ? 43 : $transportMode.hashCode());
        Object $vehicleModel = getVehicleModel();
        result = result * 59 + (($vehicleModel == null) ? 43 : $vehicleModel.hashCode());
        Object $logisticsCode = getLogisticsCode();
        result = result * 59 + (($logisticsCode == null) ? 43 : $logisticsCode.hashCode());
        Object $orderDescription = getOrderDescription();
        result = result * 59 + (($orderDescription == null) ? 43 : $orderDescription.hashCode());
        Object $shippingOrderNo = getShippingOrderNo();
        result = result * 59 + (($shippingOrderNo == null) ? 43 : $shippingOrderNo.hashCode());
        Object $orderCode = getOrderCode();
        result = result * 59 + (($orderCode == null) ? 43 : $orderCode.hashCode());
        Object $asnOrders = getAsnOrders();
        result = result * 59 + (($asnOrders == null) ? 43 : $asnOrders.hashCode());
        Object $productCode = getProductCode();
        result = result * 59 + (($productCode == null) ? 43 : $productCode.hashCode());
        Object $tradeMark = getTradeMark();
        result = result * 59 + (($tradeMark == null) ? 43 : $tradeMark.hashCode());
        long $totalAmount = Double.doubleToLongBits(getTotalAmount());
        result = result * 59 + (int) ($totalAmount >>> 32L ^ $totalAmount);
        Object $warehouseCode = getWarehouseCode();
        result = result * 59 + (($warehouseCode == null) ? 43 : $warehouseCode.hashCode());
        Object $actionType = getActionType();
        result = result * 59 + (($actionType == null) ? 43 : $actionType.hashCode());
        Object $refOrderCode = getRefOrderCode();
        result = result * 59 + (($refOrderCode == null) ? 43 : $refOrderCode.hashCode());
        Object $extTradeId = getExtTradeId();
        result = result * 59 + (($extTradeId == null) ? 43 : $extTradeId.hashCode());
        Object $operationTypeCode = getOperationTypeCode();
        result = result * 59 + (($operationTypeCode == null) ? 43 : $operationTypeCode.hashCode());
        Object $extOrderType = getExtOrderType();
        result = result * 59 + (($extOrderType == null) ? 43 : $extOrderType.hashCode());
        Object $orderTime = getOrderTime();
        result = result * 59 + (($orderTime == null) ? 43 : $orderTime.hashCode());
        Object $earliestArrivalTime = getEarliestArrivalTime();
        result = result * 59 + (($earliestArrivalTime == null) ? 43 : $earliestArrivalTime.hashCode());
        Object $latestArrivalTime = getLatestArrivalTime();
        result = result * 59 + (($latestArrivalTime == null) ? 43 : $latestArrivalTime.hashCode());
        Object $tmsCompany = getTmsCompany();
        result = result * 59 + (($tmsCompany == null) ? 43 : $tmsCompany.hashCode());
        Object $tmsLinkman = getTmsLinkman();
        result = result * 59 + (($tmsLinkman == null) ? 43 : $tmsLinkman.hashCode());
        Object $tmsPhone = getTmsPhone();
        result = result * 59 + (($tmsPhone == null) ? 43 : $tmsPhone.hashCode());
        Object $tmsLinkmanNo = getTmsLinkmanNo();
        result = result * 59 + (($tmsLinkmanNo == null) ? 43 : $tmsLinkmanNo.hashCode());
        Object $tmsShippingNo = getTmsShippingNo();
        result = result * 59 + (($tmsShippingNo == null) ? 43 : $tmsShippingNo.hashCode());
        Object $remark = getRemark();
        result = result * 59 + (($remark == null) ? 43 : $remark.hashCode());
        result = result * 59 + (getUdfFlag() ? 79 : 97);
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
        result = result * 59 + (($udf8 == null) ? 43 : $udf8.hashCode());
        Object $sender = getSender();
        result = result * 59 + (($sender == null) ? 43 : $sender.hashCode());
        Object $receiver = getReceiver();
        result = result * 59 + (($receiver == null) ? 43 : $receiver.hashCode());
        Object $serviceList = getServiceList();
        result = result * 59 + (($serviceList == null) ? 43 : $serviceList.hashCode());
        Object $itemList = getItemList();
        result = result * 59 + (($itemList == null) ? 43 : $itemList.hashCode());
        long $goodsValue = Double.doubleToLongBits(getGoodsValue());
        result = result * 59 + (int) ($goodsValue >>> 32L ^ $goodsValue);
        long $cheapAmount = Double.doubleToLongBits(getCheapAmount());
        result = result * 59 + (int) ($cheapAmount >>> 32L ^ $cheapAmount);
        Object $referenceReqList = getReferenceReqList();
        result = result * 59 + (($referenceReqList == null) ? 43 : $referenceReqList.hashCode());
        Object $businessScenarioCode = getBusinessScenarioCode();
        result = result * 59 + (($businessScenarioCode == null) ? 43 : $businessScenarioCode.hashCode());
        Object $boxList = getBoxList();
        result = result * 59 + (($boxList == null) ? 43 : $boxList.hashCode());
        Object $labelList = getLabelList();
        result = result * 59 + (($labelList == null) ? 43 : $labelList.hashCode());
        Object $orgName = getOrgName();
        result = result * 59 + (($orgName == null) ? 43 : $orgName.hashCode());
        Object $storeCode = getStoreCode();
        return result * 59 + (($storeCode == null) ? 43 : $storeCode.hashCode());
    }

    public String toString() {
        return "TwAsnNotifyReq(operationFlag=" + getOperationFlag() + ", customerCode=" + getCustomerCode() + ", customerName=" + getCustomerName() + ", projectCode=" + getProjectCode() + ", transportMode=" + getTransportMode() + ", vehicleModel=" + getVehicleModel() + ", logisticsCode=" + getLogisticsCode() + ", orderDescription=" + getOrderDescription() + ", shippingOrderNo=" + getShippingOrderNo() + ", orderCode=" + getOrderCode() + ", asnOrders=" + getAsnOrders() + ", productCode=" + getProductCode() + ", tradeMark=" + getTradeMark() + ", totalAmount=" + getTotalAmount() + ", warehouseCode=" + getWarehouseCode() + ", actionType=" + getActionType() + ", refOrderCode=" + getRefOrderCode() + ", extTradeId=" + getExtTradeId() + ", operationTypeCode=" + getOperationTypeCode() + ", extOrderType=" + getExtOrderType() + ", orderTime=" + getOrderTime() + ", earliestArrivalTime=" + getEarliestArrivalTime() + ", latestArrivalTime=" + getLatestArrivalTime() + ", tmsCompany=" + getTmsCompany() + ", tmsLinkman=" + getTmsLinkman() + ", tmsPhone=" + getTmsPhone() + ", tmsLinkmanNo=" + getTmsLinkmanNo() + ", tmsShippingNo=" + getTmsShippingNo() + ", remark=" + getRemark() + ", udfFlag=" + getUdfFlag() + ", udf1=" + getUdf1() + ", udf2=" + getUdf2() + ", udf3=" + getUdf3() + ", udf4=" + getUdf4() + ", udf5=" + getUdf5() + ", udf6=" + getUdf6() + ", udf7=" + getUdf7() + ", udf8=" + getUdf8() + ", sender=" + getSender() + ", receiver=" + getReceiver() + ", serviceList=" + getServiceList() + ", itemList=" + getItemList() + ", goodsValue=" + getGoodsValue() + ", cheapAmount=" + getCheapAmount() + ", referenceReqList=" + getReferenceReqList() + ", businessScenarioCode=" + getBusinessScenarioCode() + ", boxList=" + getBoxList() + ", labelList=" + getLabelList() + ", orgName=" + getOrgName() + ", storeCode=" + getStoreCode() + ")";
    }


    public String getOperationFlag() {
        return this.operationFlag;
    }

    public void setOperationFlag(String value) {
        this.operationFlag = value;
    }

    public String getCustomerCode() {
        return this.customerCode;
    }

    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String value) {
        this.customerName = value;
    }

    public String getProjectCode() {
        return this.projectCode;
    }

    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    public String getTransportMode() {
        return this.transportMode;
    }

    public void setTransportMode(String value) {
        this.transportMode = value;
    }

    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    public String getLogisticsCode() {
        return this.logisticsCode;
    }

    public void setLogisticsCode(String value) {
        this.logisticsCode = value;
    }

    public String getOrderDescription() {
        return this.orderDescription;
    }

    public void setOrderDescription(String value) {
        this.orderDescription = value;
    }

    public String getShippingOrderNo() {
        return this.shippingOrderNo;
    }

    public void setShippingOrderNo(String value) {
        this.shippingOrderNo = value;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String value) {
        this.orderCode = value;
    }

    public String getAsnOrders() {
        return this.asnOrders;
    }

    public void setAsnOrders(String value) {
        this.asnOrders = value;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String value) {
        this.productCode = value;
    }

    public String getTradeMark() {
        return this.tradeMark;
    }

    public void setTradeMark(String value) {
        this.tradeMark = value;
    }

    public double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(double value) {
        this.totalAmount = value;
    }

    public String getWarehouseCode() {
        return this.warehouseCode;
    }

    public void setWarehouseCode(String value) {
        this.warehouseCode = value;
    }

    public String getActionType() {
        return this.actionType;
    }

    public void setActionType(String value) {
        this.actionType = value;
    }

    public String getRefOrderCode() {
        return this.refOrderCode;
    }

    public void setRefOrderCode(String value) {
        this.refOrderCode = value;
    }

    public String getExtTradeId() {
        return this.extTradeId;
    }

    public void setExtTradeId(String value) {
        this.extTradeId = value;
    }

    public String getOperationTypeCode() {
        return this.operationTypeCode;
    }

    public void setOperationTypeCode(String value) {
        this.operationTypeCode = value;
    }

    public String getExtOrderType() {
        return this.extOrderType;
    }

    public void setExtOrderType(String value) {
        this.extOrderType = value;
    }

    public String getOrderTime() {
        return this.orderTime;
    }

    public void setOrderTime(String value) {
        this.orderTime = value;
    }

    public String getEarliestArrivalTime() {
        return this.earliestArrivalTime;
    }

    public void setEarliestArrivalTime(String value) {
        this.earliestArrivalTime = value;
    }

    public String getLatestArrivalTime() {
        return this.latestArrivalTime;
    }

    public void setLatestArrivalTime(String value) {
        this.latestArrivalTime = value;
    }

    public String getTmsCompany() {
        return this.tmsCompany;
    }

    public void setTmsCompany(String value) {
        this.tmsCompany = value;
    }

    public String getTmsLinkman() {
        return this.tmsLinkman;
    }

    public void setTmsLinkman(String value) {
        this.tmsLinkman = value;
    }

    public String getTmsPhone() {
        return this.tmsPhone;
    }

    public void setTmsPhone(String value) {
        this.tmsPhone = value;
    }

    public String getTmsLinkmanNo() {
        return this.tmsLinkmanNo;
    }

    public void setTmsLinkmanNo(String value) {
        this.tmsLinkmanNo = value;
    }

    public String getTmsShippingNo() {
        return this.tmsShippingNo;
    }

    public void setTmsShippingNo(String value) {
        this.tmsShippingNo = value;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String value) {
        this.remark = value;
    }

    public boolean getUdfFlag() {
        return this.udfFlag;
    }

    public void setUdfFlag(boolean value) {
        this.udfFlag = value;
    }

    public String getUdf1() {
        return this.udf1;
    }

    public void setUdf1(String value) {
        this.udf1 = value;
    }

    public String getUdf2() {
        return this.udf2;
    }

    public void setUdf2(String value) {
        this.udf2 = value;
    }

    public String getUdf3() {
        return this.udf3;
    }

    public void setUdf3(String value) {
        this.udf3 = value;
    }

    public String getUdf4() {
        return this.udf4;
    }

    public void setUdf4(String value) {
        this.udf4 = value;
    }

    public String getUdf5() {
        return this.udf5;
    }

    public void setUdf5(String value) {
        this.udf5 = value;
    }

    public String getUdf6() {
        return this.udf6;
    }

    public void setUdf6(String value) {
        this.udf6 = value;
    }

    public String getUdf7() {
        return this.udf7;
    }

    public void setUdf7(String value) {
        this.udf7 = value;
    }

    public String getUdf8() {
        return this.udf8;
    }

    public void setUdf8(String value) {
        this.udf8 = value;
    }

    public Sender getSender() {
        return this.sender;
    }

    public void setSender(Sender value) {
        this.sender = value;
    }

    public Receiver getReceiver() {
        return this.receiver;
    }

    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    public ServiceList getServiceList() {
        return this.serviceList;
    }

    public void setServiceList(ServiceList value) {
        this.serviceList = value;
    }

    public ItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(ItemList value) {
        this.itemList = value;
    }

    public double getGoodsValue() {
        return this.goodsValue;
    }

    public void setGoodsValue(double value) {
        this.goodsValue = value;
    }

    public double getCheapAmount() {
        return this.cheapAmount;
    }

    public void setCheapAmount(double value) {
        this.cheapAmount = value;
    }

    public ReferenceReqList getReferenceReqList() {
        return this.referenceReqList;
    }

    public void setReferenceReqList(ReferenceReqList value) {
        this.referenceReqList = value;
    }

    public String getBusinessScenarioCode() {
        return this.businessScenarioCode;
    }

    public void setBusinessScenarioCode(String value) {
        this.businessScenarioCode = value;
    }

    public BoxList getBoxList() {
        return this.boxList;
    }

    public void setBoxList(BoxList value) {
        this.boxList = value;
    }

    public LabelList getLabelList() {
        return this.labelList;
    }

    public void setLabelList(LabelList value) {
        this.labelList = value;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgName(String value) {
        this.orgName = value;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public void setStoreCode(String value) {
        this.storeCode = value;
    }

    public String obtainServiceType() {
        return "TW_ASN_NOTIFY";
    }

    public BaseResponse makeResponse(String rsp, String format) {
        if ("xml".equalsIgnoreCase(format)) {
            return (BaseResponse) Parser.coverXml2Object(rsp, TwAsnNotifyRsp.class);
        }
        return (BaseResponse) Parser.convertJson2Object(rsp, TwAsnNotifyRsp.class);
    }


    public static List<TwAsnNotifyReq> buildForPurchase(String customerCode, List<SdwmsPurchase> purchaseList) {
        if (CollectionUtils.isEmpty(purchaseList)) {
            return null;
        }

        List<com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq> result = new ArrayList<>();

        List<String> sheetStr = (List<String>) purchaseList.stream().map(SdwmsPurchase::getSheetid).distinct().collect(Collectors.toList());
        for (String sheetId : sheetStr) {
            List<SdwmsPurchase> purchases = (List<SdwmsPurchase>) purchaseList.stream().filter(p -> p.getSheetid().equals(sheetId)).collect(Collectors.toList());
            SdwmsPurchase purchase = purchases.get(0);
            com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq req = new com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq();
            req.setOperationFlag("W");
            req.setCustomerCode(customerCode);


            req.setOrderCode(sheetId);


            Sender sender = new Sender();
            sender.setName(purchase.getVenderName());
            req.setSender(sender);

            req.setWarehouseCode(BestConfig.warehouseCode);
            req.setActionType("ADD");
            req.setOperationTypeCode("ASN");
            req.setOrderTime(Convert.formatDateTime(purchase.getSdate()));
            req.setEarliestArrivalTime(Convert.formatDateTime(purchase.getPurDate()));
            req.setLatestArrivalTime(Convert.formatDateTime(purchase.getValidDate()));


            req.setItemList(ItemList.buildForPurchase(purchaseList));

            result.add(req);
        }
        return result;
    }

    public static List<com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq> buildForRetration(String customerCode, List<SdwmsRetration> retrationList) {
        if (CollectionUtils.isEmpty(retrationList)) {
            return null;
        }

        List<com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq> result = new ArrayList<>();

        List<String> sheetStr = (List<String>) retrationList.stream().map(SdwmsRetration::getSheetid).distinct().collect(Collectors.toList());
        for (String sheetId : sheetStr) {
            List<SdwmsRetration> retrations = (List<SdwmsRetration>) retrationList.stream().filter(p -> p.getSheetid().equals(sheetId)).collect(Collectors.toList());
            SdwmsRetration retRation = retrations.get(0);
            com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq req = new com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq();
            req.setOperationFlag("W");
            req.setCustomerCode(customerCode);
            req.setOrderCode(sheetId);


            Sender sender = new Sender();
            sender.setName(retRation.getShopName());
            req.setSender(sender);

            req.setWarehouseCode(BestConfig.warehouseCode);
            req.setActionType("ADD");
            req.setOperationTypeCode("DI");
            req.setOrderTime(Convert.formatDateTime(retRation.getSdate()));

            req.setItemList(ItemList.buildForRetration(retrations));

            result.add(req);
        }
        return result;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twAsnNotify\request\TwAsnNotifyReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */