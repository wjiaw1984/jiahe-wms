package com.best.javaSdk.twSoNotify.request;

import cn.com.wms.common.utils.Convert;
import cn.com.wms.config.BestConfig;
import cn.com.wms.model.wms.sdwms.SdwmsRationnote;
import cn.com.wms.model.wms.sdwms.SdwmsRet;
import com.best.javaSdk.BaseRequest;
import com.best.javaSdk.BaseResponse;
import com.best.javaSdk.Parser;
import com.best.javaSdk.twSoNotify.request.BoxList;
import com.best.javaSdk.twSoNotify.request.ItemList;
import com.best.javaSdk.twSoNotify.request.LabelList;
import com.best.javaSdk.twSoNotify.request.Receiver;
import com.best.javaSdk.twSoNotify.request.ReferenceReqList;
import com.best.javaSdk.twSoNotify.request.Sender;
import com.best.javaSdk.twSoNotify.request.ServiceList;
import com.best.javaSdk.twSoNotify.response.TwSoNotifyRsp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.CollectionUtils;

public class TwSoNotifyReq implements BaseRequest {
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
    private String productCode;
    private String tradeMark;
    private double totalAmount;
    private boolean isPaymentCollected;
    private double goodsValue;
    private double cheapAmount;
    private String warehouseCode;
    private String actionType;
    private String extTradeId;
    private String operationTypeCode;
    private String extOrderType;
    private String orderSource;
    private String orderTime;
    private String paymentTime;
    private double shippingAmount;
    private double discountAmount;
    private double actualAmount;
    private boolean isValueDeclared;
    private double declaringValueAmount;
    private String logisticsProviderCode;
    private String tmsCompany;
    private String tmsLinkman;
    private String tmsPhone;
    private String tmsLinkmanNo;
    private String tmsShippingNo;
    private String buyerName;
    private String buyerPhone;
    private String fetchGoodsLocation;
    private String sellerName;
    private String priorityCode;
    private String remark;
    private String shipmentTime;
    private String shipmentFinishTime;
    private String deliveryTime;
    private double totalWeight;
    private double totalVolume;
    private boolean udfFlag;
    private String udf1;
    private String udf2;
    private String udf3;
    private String udf4;
    private String udf5;
    private String udf6;
    private String udf7;
    private String udf8;
    private ReferenceReqList referenceReqList;
    private Sender sender;
    private Receiver receiver;
    private ServiceList serviceList;
    private ItemList itemList;
    private String businessScenarioCode;
    private String storeCode;
    private BoxList boxList;
    private double referenceCost;
    private String stagedSoState;
    private String externalFlowStatusCode;
    private String orgName;
    private LabelList labelList;
    private boolean invoiceFlag;
    private String invoiceTitle;
    private String invoiceNote;
    private String invoiceAmount;
    private String shortAddress;
    private String distributionStation;
    private String waybillData;
    private String signature;
    private String ver;
    private String templateURL;
    private String etrackTypeCode;
    private String freightPaymentAccNo;
    private String expressBillUrl;
    private String deliveryTermsCode;
    private boolean mergeOrderFlag;
    private String noStackTag;

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


    public boolean getIsPaymentCollected() {
        return this.isPaymentCollected;
    }


    public void setIsPaymentCollected(boolean value) {
        this.isPaymentCollected = value;
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


    public String getOrderSource() {
        return this.orderSource;
    }


    public void setOrderSource(String value) {
        this.orderSource = value;
    }


    public String getOrderTime() {
        return this.orderTime;
    }


    public void setOrderTime(String value) {
        this.orderTime = value;
    }


    public String getPaymentTime() {
        return this.paymentTime;
    }


    public void setPaymentTime(String value) {
        this.paymentTime = value;
    }


    public double getShippingAmount() {
        return this.shippingAmount;
    }


    public void setShippingAmount(double value) {
        this.shippingAmount = value;
    }


    public double getDiscountAmount() {
        return this.discountAmount;
    }


    public void setDiscountAmount(double value) {
        this.discountAmount = value;
    }


    public double getActualAmount() {
        return this.actualAmount;
    }


    public void setActualAmount(double value) {
        this.actualAmount = value;
    }


    public boolean getIsValueDeclared() {
        return this.isValueDeclared;
    }


    public void setIsValueDeclared(boolean value) {
        this.isValueDeclared = value;
    }


    public double getDeclaringValueAmount() {
        return this.declaringValueAmount;
    }


    public void setDeclaringValueAmount(double value) {
        this.declaringValueAmount = value;
    }


    public String getLogisticsProviderCode() {
        return this.logisticsProviderCode;
    }


    public void setLogisticsProviderCode(String value) {
        this.logisticsProviderCode = value;
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


    public String getBuyerName() {
        return this.buyerName;
    }


    public void setBuyerName(String value) {
        this.buyerName = value;
    }


    public String getBuyerPhone() {
        return this.buyerPhone;
    }


    public void setBuyerPhone(String value) {
        this.buyerPhone = value;
    }


    public String getFetchGoodsLocation() {
        return this.fetchGoodsLocation;
    }


    public void setFetchGoodsLocation(String value) {
        this.fetchGoodsLocation = value;
    }


    public String getSellerName() {
        return this.sellerName;
    }


    public void setSellerName(String value) {
        this.sellerName = value;
    }


    public String getPriorityCode() {
        return this.priorityCode;
    }


    public void setPriorityCode(String value) {
        this.priorityCode = value;
    }


    public String getRemark() {
        return this.remark;
    }


    public void setRemark(String value) {
        this.remark = value;
    }


    public String getShipmentTime() {
        return this.shipmentTime;
    }


    public void setShipmentTime(String value) {
        this.shipmentTime = value;
    }


    public String getShipmentFinishTime() {
        return this.shipmentFinishTime;
    }


    public void setShipmentFinishTime(String value) {
        this.shipmentFinishTime = value;
    }


    public String getDeliveryTime() {
        return this.deliveryTime;
    }


    public void setDeliveryTime(String value) {
        this.deliveryTime = value;
    }


    public double getTotalWeight() {
        return this.totalWeight;
    }


    public void setTotalWeight(double value) {
        this.totalWeight = value;
    }


    public double getTotalVolume() {
        return this.totalVolume;
    }


    public void setTotalVolume(double value) {
        this.totalVolume = value;
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


    public ReferenceReqList getReferenceReqList() {
        return this.referenceReqList;
    }


    public void setReferenceReqList(ReferenceReqList value) {
        this.referenceReqList = value;
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


    public String getBusinessScenarioCode() {
        return this.businessScenarioCode;
    }


    public void setBusinessScenarioCode(String value) {
        this.businessScenarioCode = value;
    }


    public String getStoreCode() {
        return this.storeCode;
    }


    public void setStoreCode(String value) {
        this.storeCode = value;
    }


    public BoxList getBoxList() {
        return this.boxList;
    }


    public void setBoxList(BoxList value) {
        this.boxList = value;
    }


    public double getReferenceCost() {
        return this.referenceCost;
    }


    public void setReferenceCost(double value) {
        this.referenceCost = value;
    }


    public String getStagedSoState() {
        return this.stagedSoState;
    }


    public void setStagedSoState(String value) {
        this.stagedSoState = value;
    }


    public String getExternalFlowStatusCode() {
        return this.externalFlowStatusCode;
    }


    public void setExternalFlowStatusCode(String value) {
        this.externalFlowStatusCode = value;
    }


    public String getOrgName() {
        return this.orgName;
    }


    public void setOrgName(String value) {
        this.orgName = value;
    }


    public LabelList getLabelList() {
        return this.labelList;
    }


    public void setLabelList(LabelList value) {
        this.labelList = value;
    }


    public boolean getInvoiceFlag() {
        return this.invoiceFlag;
    }


    public void setInvoiceFlag(boolean value) {
        this.invoiceFlag = value;
    }


    public String getInvoiceTitle() {
        return this.invoiceTitle;
    }


    public void setInvoiceTitle(String value) {
        this.invoiceTitle = value;
    }


    public String getInvoiceNote() {
        return this.invoiceNote;
    }


    public void setInvoiceNote(String value) {
        this.invoiceNote = value;
    }


    public String getInvoiceAmount() {
        return this.invoiceAmount;
    }


    public void setInvoiceAmount(String value) {
        this.invoiceAmount = value;
    }


    public String getShortAddress() {
        return this.shortAddress;
    }


    public void setShortAddress(String value) {
        this.shortAddress = value;
    }


    public String getDistributionStation() {
        return this.distributionStation;
    }


    public void setDistributionStation(String value) {
        this.distributionStation = value;
    }


    public String getWaybillData() {
        return this.waybillData;
    }


    public void setWaybillData(String value) {
        this.waybillData = value;
    }


    public String getSignature() {
        return this.signature;
    }


    public void setSignature(String value) {
        this.signature = value;
    }


    public String getVer() {
        return this.ver;
    }


    public void setVer(String value) {
        this.ver = value;
    }


    public String getTemplateURL() {
        return this.templateURL;
    }


    public void setTemplateURL(String value) {
        this.templateURL = value;
    }


    public String getEtrackTypeCode() {
        return this.etrackTypeCode;
    }


    public void setEtrackTypeCode(String value) {
        this.etrackTypeCode = value;
    }


    public String getFreightPaymentAccNo() {
        return this.freightPaymentAccNo;
    }


    public void setFreightPaymentAccNo(String value) {
        this.freightPaymentAccNo = value;
    }


    public String getExpressBillUrl() {
        return this.expressBillUrl;
    }


    public void setExpressBillUrl(String value) {
        this.expressBillUrl = value;
    }


    public String getDeliveryTermsCode() {
        return this.deliveryTermsCode;
    }


    public void setDeliveryTermsCode(String value) {
        this.deliveryTermsCode = value;
    }


    public boolean getMergeOrderFlag() {
        return this.mergeOrderFlag;
    }


    public void setMergeOrderFlag(boolean value) {
        this.mergeOrderFlag = value;
    }


    public String getNoStackTag() {
        return this.noStackTag;
    }


    public void setNoStackTag(String value) {
        this.noStackTag = value;
    }

    public String obtainServiceType() {
        return "TW_SO_NOTIFY";
    }

    public BaseResponse makeResponse(String rsp, String format) {
        if ("xml".equalsIgnoreCase(format)) {
            return (BaseResponse) Parser.coverXml2Object(rsp, TwSoNotifyRsp.class);
        }
        return (BaseResponse) Parser.convertJson2Object(rsp, TwSoNotifyRsp.class);
    }


    public static List<com.best.javaSdk.twSoNotify.request.TwSoNotifyReq> buildForRet(String customerCode, List<SdwmsRet> retList) {
        if (CollectionUtils.isEmpty(retList)) {
            return null;
        }


        List<com.best.javaSdk.twSoNotify.request.TwSoNotifyReq> result = new ArrayList<>();


        List<String> sheetStr = (List<String>) retList.stream().map(SdwmsRet::getSheetid).distinct().collect(Collectors.toList());

        for (String sheetId : sheetStr) {

            List<SdwmsRet> rets = (List<SdwmsRet>) retList.stream().filter(p -> p.getSheetid().equals(sheetId)).collect(Collectors.toList());

            SdwmsRet ret = rets.get(0);

            com.best.javaSdk.twSoNotify.request.TwSoNotifyReq req = new com.best.javaSdk.twSoNotify.request.TwSoNotifyReq();

            req.setOperationFlag("W");

            req.setCustomerCode(customerCode);

            req.setOrderCode(sheetId.trim());


            Sender sender = new Sender();
            sender.setName(ret.getShopName());
            req.setSender(sender);


            Receiver receiver = new Receiver();
            receiver.setName(ret.getVenderName().trim());
            receiver.setReceiverId(ret.getVenderid());
            req.setReceiver(receiver);


            req.setWarehouseCode(BestConfig.warehouseCode);

            req.setActionType("ADD");


            req.setOperationTypeCode("WDO");

            req.setOrderTime(Convert.formatDateTime(ret.getRetdate()));

            req.setItemList(ItemList.buildForRet(rets));

            req.setRemark("退货单生成");


            result.add(req);
        }

        return result;
    }


    public static List<com.best.javaSdk.twSoNotify.request.TwSoNotifyReq> buildForRationNote(String customerCode, List<SdwmsRationnote> retList) {
        if (CollectionUtils.isEmpty(retList)) {
            return null;
        }


        List<com.best.javaSdk.twSoNotify.request.TwSoNotifyReq> result = new ArrayList<>();


        List<String> sheetStr = (List<String>) retList.stream().map(SdwmsRationnote::getWmsSheetId).distinct().collect(Collectors.toList());

        for (String sheetId : sheetStr) {

            List<SdwmsRationnote> sheets = (List<SdwmsRationnote>) retList.stream().filter(p -> p.getWmsSheetId().equals(sheetId)).collect(Collectors.toList());

            SdwmsRationnote sheet = sheets.get(0);

            com.best.javaSdk.twSoNotify.request.TwSoNotifyReq req = new com.best.javaSdk.twSoNotify.request.TwSoNotifyReq();

            req.setOperationFlag("W");

            req.setCustomerCode(customerCode);

            req.setOrderCode(sheetId.trim());


            Sender sender = new Sender();
            req.setSender(sender);


            Receiver receiver1 = new Receiver();
            receiver1.setName(sheet.getInShopName().trim());
            receiver1.setReceiverId(sheet.getShopid().trim());
            req.setReceiver(receiver1);


            req.setWarehouseCode(BestConfig.warehouseCode);

            req.setActionType("ADD");


            req.setOperationTypeCode("WDO");

            req.setOrderTime(Convert.formatDateTime(sheet.getSdate()));

            req.setItemList(ItemList.buildForRationNote(sheets));

            req.setRemark("配送出库单生成");


            result.add(req);
        }

        return result;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twSoNotify\request\TwSoNotifyReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */