/*      */ package BOOT-INF.classes.com.best.javaSdk.twSoNotify.request;
/*      */ 
/*      */ import cn.com.wms.common.utils.Convert;
/*      */ import cn.com.wms.config.BestConfig;
/*      */ import cn.com.wms.model.wms.sdwms.SdwmsRationnote;
/*      */ import cn.com.wms.model.wms.sdwms.SdwmsRet;
/*      */ import com.best.javaSdk.BaseRequest;
/*      */ import com.best.javaSdk.BaseResponse;
/*      */ import com.best.javaSdk.Parser;
/*      */ import com.best.javaSdk.twSoNotify.request.BoxList;
/*      */ import com.best.javaSdk.twSoNotify.request.ItemList;
/*      */ import com.best.javaSdk.twSoNotify.request.LabelList;
/*      */ import com.best.javaSdk.twSoNotify.request.Receiver;
/*      */ import com.best.javaSdk.twSoNotify.request.ReferenceReqList;
/*      */ import com.best.javaSdk.twSoNotify.request.Sender;
/*      */ import com.best.javaSdk.twSoNotify.request.ServiceList;
/*      */ import com.best.javaSdk.twSoNotify.response.TwSoNotifyRsp;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import java.util.stream.Collectors;
/*      */ import org.springframework.util.CollectionUtils;
/*      */ 
/*      */ public class TwSoNotifyReq implements BaseRequest {
/*      */   private String operationFlag;
/*      */   private String customerCode;
/*      */   private String customerName;
/*      */   private String projectCode;
/*      */   private String transportMode;
/*      */   private String vehicleModel;
/*      */   private String logisticsCode;
/*      */   private String orderDescription;
/*      */   private String shippingOrderNo;
/*      */   private String orderCode;
/*      */   private String productCode;
/*      */   private String tradeMark;
/*      */   private double totalAmount;
/*      */   private boolean isPaymentCollected;
/*      */   private double goodsValue;
/*      */   private double cheapAmount;
/*      */   private String warehouseCode;
/*      */   private String actionType;
/*      */   private String extTradeId;
/*      */   private String operationTypeCode;
/*      */   private String extOrderType;
/*      */   private String orderSource;
/*      */   private String orderTime;
/*      */   private String paymentTime;
/*      */   private double shippingAmount;
/*      */   private double discountAmount;
/*      */   private double actualAmount;
/*      */   private boolean isValueDeclared;
/*      */   private double declaringValueAmount;
/*      */   private String logisticsProviderCode;
/*      */   private String tmsCompany;
/*      */   private String tmsLinkman;
/*      */   private String tmsPhone;
/*      */   private String tmsLinkmanNo;
/*      */   private String tmsShippingNo;
/*      */   private String buyerName;
/*      */   private String buyerPhone;
/*      */   private String fetchGoodsLocation;
/*      */   private String sellerName;
/*      */   private String priorityCode;
/*      */   private String remark;
/*      */   private String shipmentTime;
/*      */   private String shipmentFinishTime;
/*      */   private String deliveryTime;
/*      */   private double totalWeight;
/*      */   private double totalVolume;
/*      */   private boolean udfFlag;
/*      */   private String udf1;
/*      */   private String udf2;
/*      */   private String udf3;
/*      */   private String udf4;
/*      */   private String udf5;
/*      */   private String udf6;
/*      */   private String udf7;
/*      */   private String udf8;
/*      */   private ReferenceReqList referenceReqList;
/*      */   private Sender sender;
/*      */   private Receiver receiver;
/*      */   private ServiceList serviceList;
/*      */   private ItemList itemList;
/*      */   private String businessScenarioCode;
/*      */   private String storeCode;
/*      */   private BoxList boxList;
/*      */   private double referenceCost;
/*      */   private String stagedSoState;
/*      */   private String externalFlowStatusCode;
/*      */   private String orgName;
/*      */   private LabelList labelList;
/*      */   private boolean invoiceFlag;
/*      */   private String invoiceTitle;
/*      */   private String invoiceNote;
/*      */   private String invoiceAmount;
/*      */   private String shortAddress;
/*      */   private String distributionStation;
/*      */   private String waybillData;
/*      */   private String signature;
/*      */   private String ver;
/*      */   private String templateURL;
/*      */   private String etrackTypeCode;
/*      */   private String freightPaymentAccNo;
/*      */   private String expressBillUrl;
/*      */   private String deliveryTermsCode;
/*      */   private boolean mergeOrderFlag;
/*      */   private String noStackTag;
/*      */   
/*      */   public String getOperationFlag() {
/*  110 */     return this.operationFlag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setOperationFlag(String value) {
/*  115 */     this.operationFlag = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCustomerCode() {
/*  120 */     return this.customerCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCustomerCode(String value) {
/*  125 */     this.customerCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCustomerName() {
/*  130 */     return this.customerName;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCustomerName(String value) {
/*  135 */     this.customerName = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getProjectCode() {
/*  140 */     return this.projectCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setProjectCode(String value) {
/*  145 */     this.projectCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTransportMode() {
/*  150 */     return this.transportMode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTransportMode(String value) {
/*  155 */     this.transportMode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getVehicleModel() {
/*  160 */     return this.vehicleModel;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setVehicleModel(String value) {
/*  165 */     this.vehicleModel = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getLogisticsCode() {
/*  170 */     return this.logisticsCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setLogisticsCode(String value) {
/*  175 */     this.logisticsCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getOrderDescription() {
/*  180 */     return this.orderDescription;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setOrderDescription(String value) {
/*  185 */     this.orderDescription = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getShippingOrderNo() {
/*  190 */     return this.shippingOrderNo;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setShippingOrderNo(String value) {
/*  195 */     this.shippingOrderNo = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getOrderCode() {
/*  200 */     return this.orderCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setOrderCode(String value) {
/*  205 */     this.orderCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getProductCode() {
/*  210 */     return this.productCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setProductCode(String value) {
/*  215 */     this.productCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTradeMark() {
/*  220 */     return this.tradeMark;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTradeMark(String value) {
/*  225 */     this.tradeMark = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getTotalAmount() {
/*  230 */     return this.totalAmount;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTotalAmount(double value) {
/*  235 */     this.totalAmount = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getIsPaymentCollected() {
/*  240 */     return this.isPaymentCollected;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setIsPaymentCollected(boolean value) {
/*  245 */     this.isPaymentCollected = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getGoodsValue() {
/*  250 */     return this.goodsValue;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setGoodsValue(double value) {
/*  255 */     this.goodsValue = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getCheapAmount() {
/*  260 */     return this.cheapAmount;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCheapAmount(double value) {
/*  265 */     this.cheapAmount = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getWarehouseCode() {
/*  270 */     return this.warehouseCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setWarehouseCode(String value) {
/*  275 */     this.warehouseCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getActionType() {
/*  280 */     return this.actionType;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setActionType(String value) {
/*  285 */     this.actionType = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getExtTradeId() {
/*  290 */     return this.extTradeId;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setExtTradeId(String value) {
/*  295 */     this.extTradeId = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getOperationTypeCode() {
/*  300 */     return this.operationTypeCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setOperationTypeCode(String value) {
/*  305 */     this.operationTypeCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getExtOrderType() {
/*  310 */     return this.extOrderType;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setExtOrderType(String value) {
/*  315 */     this.extOrderType = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getOrderSource() {
/*  320 */     return this.orderSource;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setOrderSource(String value) {
/*  325 */     this.orderSource = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getOrderTime() {
/*  330 */     return this.orderTime;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setOrderTime(String value) {
/*  335 */     this.orderTime = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getPaymentTime() {
/*  340 */     return this.paymentTime;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPaymentTime(String value) {
/*  345 */     this.paymentTime = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getShippingAmount() {
/*  350 */     return this.shippingAmount;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setShippingAmount(double value) {
/*  355 */     this.shippingAmount = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getDiscountAmount() {
/*  360 */     return this.discountAmount;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDiscountAmount(double value) {
/*  365 */     this.discountAmount = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getActualAmount() {
/*  370 */     return this.actualAmount;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setActualAmount(double value) {
/*  375 */     this.actualAmount = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getIsValueDeclared() {
/*  380 */     return this.isValueDeclared;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setIsValueDeclared(boolean value) {
/*  385 */     this.isValueDeclared = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getDeclaringValueAmount() {
/*  390 */     return this.declaringValueAmount;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDeclaringValueAmount(double value) {
/*  395 */     this.declaringValueAmount = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getLogisticsProviderCode() {
/*  400 */     return this.logisticsProviderCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setLogisticsProviderCode(String value) {
/*  405 */     this.logisticsProviderCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTmsCompany() {
/*  410 */     return this.tmsCompany;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTmsCompany(String value) {
/*  415 */     this.tmsCompany = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTmsLinkman() {
/*  420 */     return this.tmsLinkman;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTmsLinkman(String value) {
/*  425 */     this.tmsLinkman = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTmsPhone() {
/*  430 */     return this.tmsPhone;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTmsPhone(String value) {
/*  435 */     this.tmsPhone = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTmsLinkmanNo() {
/*  440 */     return this.tmsLinkmanNo;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTmsLinkmanNo(String value) {
/*  445 */     this.tmsLinkmanNo = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTmsShippingNo() {
/*  450 */     return this.tmsShippingNo;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTmsShippingNo(String value) {
/*  455 */     this.tmsShippingNo = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getBuyerName() {
/*  460 */     return this.buyerName;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setBuyerName(String value) {
/*  465 */     this.buyerName = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getBuyerPhone() {
/*  470 */     return this.buyerPhone;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setBuyerPhone(String value) {
/*  475 */     this.buyerPhone = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getFetchGoodsLocation() {
/*  480 */     return this.fetchGoodsLocation;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFetchGoodsLocation(String value) {
/*  485 */     this.fetchGoodsLocation = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getSellerName() {
/*  490 */     return this.sellerName;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setSellerName(String value) {
/*  495 */     this.sellerName = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getPriorityCode() {
/*  500 */     return this.priorityCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPriorityCode(String value) {
/*  505 */     this.priorityCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getRemark() {
/*  510 */     return this.remark;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRemark(String value) {
/*  515 */     this.remark = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getShipmentTime() {
/*  520 */     return this.shipmentTime;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setShipmentTime(String value) {
/*  525 */     this.shipmentTime = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getShipmentFinishTime() {
/*  530 */     return this.shipmentFinishTime;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setShipmentFinishTime(String value) {
/*  535 */     this.shipmentFinishTime = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getDeliveryTime() {
/*  540 */     return this.deliveryTime;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDeliveryTime(String value) {
/*  545 */     this.deliveryTime = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getTotalWeight() {
/*  550 */     return this.totalWeight;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTotalWeight(double value) {
/*  555 */     this.totalWeight = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getTotalVolume() {
/*  560 */     return this.totalVolume;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTotalVolume(double value) {
/*  565 */     this.totalVolume = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getUdfFlag() {
/*  570 */     return this.udfFlag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUdfFlag(boolean value) {
/*  575 */     this.udfFlag = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getUdf1() {
/*  580 */     return this.udf1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUdf1(String value) {
/*  585 */     this.udf1 = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getUdf2() {
/*  590 */     return this.udf2;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUdf2(String value) {
/*  595 */     this.udf2 = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getUdf3() {
/*  600 */     return this.udf3;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUdf3(String value) {
/*  605 */     this.udf3 = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getUdf4() {
/*  610 */     return this.udf4;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUdf4(String value) {
/*  615 */     this.udf4 = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getUdf5() {
/*  620 */     return this.udf5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUdf5(String value) {
/*  625 */     this.udf5 = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getUdf6() {
/*  630 */     return this.udf6;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUdf6(String value) {
/*  635 */     this.udf6 = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getUdf7() {
/*  640 */     return this.udf7;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUdf7(String value) {
/*  645 */     this.udf7 = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getUdf8() {
/*  650 */     return this.udf8;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUdf8(String value) {
/*  655 */     this.udf8 = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public ReferenceReqList getReferenceReqList() {
/*  660 */     return this.referenceReqList;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setReferenceReqList(ReferenceReqList value) {
/*  665 */     this.referenceReqList = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public Sender getSender() {
/*  670 */     return this.sender;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setSender(Sender value) {
/*  675 */     this.sender = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public Receiver getReceiver() {
/*  680 */     return this.receiver;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setReceiver(Receiver value) {
/*  685 */     this.receiver = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public ServiceList getServiceList() {
/*  690 */     return this.serviceList;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setServiceList(ServiceList value) {
/*  695 */     this.serviceList = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public ItemList getItemList() {
/*  700 */     return this.itemList;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setItemList(ItemList value) {
/*  705 */     this.itemList = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getBusinessScenarioCode() {
/*  710 */     return this.businessScenarioCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setBusinessScenarioCode(String value) {
/*  715 */     this.businessScenarioCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getStoreCode() {
/*  720 */     return this.storeCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setStoreCode(String value) {
/*  725 */     this.storeCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public BoxList getBoxList() {
/*  730 */     return this.boxList;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setBoxList(BoxList value) {
/*  735 */     this.boxList = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public double getReferenceCost() {
/*  740 */     return this.referenceCost;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setReferenceCost(double value) {
/*  745 */     this.referenceCost = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getStagedSoState() {
/*  750 */     return this.stagedSoState;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setStagedSoState(String value) {
/*  755 */     this.stagedSoState = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getExternalFlowStatusCode() {
/*  760 */     return this.externalFlowStatusCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setExternalFlowStatusCode(String value) {
/*  765 */     this.externalFlowStatusCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getOrgName() {
/*  770 */     return this.orgName;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setOrgName(String value) {
/*  775 */     this.orgName = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public LabelList getLabelList() {
/*  780 */     return this.labelList;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setLabelList(LabelList value) {
/*  785 */     this.labelList = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getInvoiceFlag() {
/*  790 */     return this.invoiceFlag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setInvoiceFlag(boolean value) {
/*  795 */     this.invoiceFlag = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getInvoiceTitle() {
/*  800 */     return this.invoiceTitle;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setInvoiceTitle(String value) {
/*  805 */     this.invoiceTitle = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getInvoiceNote() {
/*  810 */     return this.invoiceNote;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setInvoiceNote(String value) {
/*  815 */     this.invoiceNote = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getInvoiceAmount() {
/*  820 */     return this.invoiceAmount;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setInvoiceAmount(String value) {
/*  825 */     this.invoiceAmount = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getShortAddress() {
/*  830 */     return this.shortAddress;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setShortAddress(String value) {
/*  835 */     this.shortAddress = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getDistributionStation() {
/*  840 */     return this.distributionStation;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDistributionStation(String value) {
/*  845 */     this.distributionStation = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getWaybillData() {
/*  850 */     return this.waybillData;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setWaybillData(String value) {
/*  855 */     this.waybillData = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getSignature() {
/*  860 */     return this.signature;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setSignature(String value) {
/*  865 */     this.signature = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getVer() {
/*  870 */     return this.ver;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setVer(String value) {
/*  875 */     this.ver = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTemplateURL() {
/*  880 */     return this.templateURL;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTemplateURL(String value) {
/*  885 */     this.templateURL = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getEtrackTypeCode() {
/*  890 */     return this.etrackTypeCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setEtrackTypeCode(String value) {
/*  895 */     this.etrackTypeCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getFreightPaymentAccNo() {
/*  900 */     return this.freightPaymentAccNo;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFreightPaymentAccNo(String value) {
/*  905 */     this.freightPaymentAccNo = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getExpressBillUrl() {
/*  910 */     return this.expressBillUrl;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setExpressBillUrl(String value) {
/*  915 */     this.expressBillUrl = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getDeliveryTermsCode() {
/*  920 */     return this.deliveryTermsCode;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDeliveryTermsCode(String value) {
/*  925 */     this.deliveryTermsCode = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean getMergeOrderFlag() {
/*  930 */     return this.mergeOrderFlag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setMergeOrderFlag(boolean value) {
/*  935 */     this.mergeOrderFlag = value;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getNoStackTag() {
/*  940 */     return this.noStackTag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setNoStackTag(String value) {
/*  945 */     this.noStackTag = value;
/*      */   }
/*      */   
/*      */   public String obtainServiceType() {
/*  949 */     return "TW_SO_NOTIFY";
/*      */   }
/*      */   
/*      */   public BaseResponse makeResponse(String rsp, String format) {
/*  953 */     if ("xml".equalsIgnoreCase(format)) {
/*  954 */       return (BaseResponse)Parser.coverXml2Object(rsp, TwSoNotifyRsp.class);
/*      */     }
/*  956 */     return (BaseResponse)Parser.convertJson2Object(rsp, TwSoNotifyRsp.class);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static List<com.best.javaSdk.twSoNotify.request.TwSoNotifyReq> buildForRet(String customerCode, List<SdwmsRet> retList) {
/*  968 */     if (CollectionUtils.isEmpty(retList)) {
/*  969 */       return null;
/*      */     }
/*      */ 
/*      */     
/*  973 */     List<com.best.javaSdk.twSoNotify.request.TwSoNotifyReq> result = new ArrayList<>();
/*      */ 
/*      */     
/*  976 */     List<String> sheetStr = (List<String>)retList.stream().map(SdwmsRet::getSheetid).distinct().collect(Collectors.toList());
/*      */     
/*  978 */     for (String sheetId : sheetStr) {
/*      */       
/*  980 */       List<SdwmsRet> rets = (List<SdwmsRet>)retList.stream().filter(p -> p.getSheetid().equals(sheetId)).collect(Collectors.toList());
/*      */       
/*  982 */       SdwmsRet ret = rets.get(0);
/*      */       
/*  984 */       com.best.javaSdk.twSoNotify.request.TwSoNotifyReq req = new com.best.javaSdk.twSoNotify.request.TwSoNotifyReq();
/*      */       
/*  986 */       req.setOperationFlag("W");
/*      */       
/*  988 */       req.setCustomerCode(customerCode);
/*      */       
/*  990 */       req.setOrderCode(sheetId.trim());
/*      */ 
/*      */       
/*  993 */       Sender sender = new Sender();
/*  994 */       sender.setName(ret.getShopName());
/*  995 */       req.setSender(sender);
/*      */ 
/*      */       
/*  998 */       Receiver receiver = new Receiver();
/*  999 */       receiver.setName(ret.getVenderName().trim());
/* 1000 */       receiver.setReceiverId(ret.getVenderid());
/* 1001 */       req.setReceiver(receiver);
/*      */ 
/*      */       
/* 1004 */       req.setWarehouseCode(BestConfig.warehouseCode);
/*      */       
/* 1006 */       req.setActionType("ADD");
/*      */ 
/*      */       
/* 1009 */       req.setOperationTypeCode("WDO");
/*      */       
/* 1011 */       req.setOrderTime(Convert.formatDateTime(ret.getRetdate()));
/*      */       
/* 1013 */       req.setItemList(ItemList.buildForRet(rets));
/*      */       
/* 1015 */       req.setRemark("退货单生成");
/*      */ 
/*      */       
/* 1018 */       result.add(req);
/*      */     } 
/*      */     
/* 1021 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static List<com.best.javaSdk.twSoNotify.request.TwSoNotifyReq> buildForRationNote(String customerCode, List<SdwmsRationnote> retList) {
/* 1032 */     if (CollectionUtils.isEmpty(retList)) {
/* 1033 */       return null;
/*      */     }
/*      */ 
/*      */     
/* 1037 */     List<com.best.javaSdk.twSoNotify.request.TwSoNotifyReq> result = new ArrayList<>();
/*      */ 
/*      */     
/* 1040 */     List<String> sheetStr = (List<String>)retList.stream().map(SdwmsRationnote::getWmsSheetId).distinct().collect(Collectors.toList());
/*      */     
/* 1042 */     for (String sheetId : sheetStr) {
/*      */       
/* 1044 */       List<SdwmsRationnote> sheets = (List<SdwmsRationnote>)retList.stream().filter(p -> p.getWmsSheetId().equals(sheetId)).collect(Collectors.toList());
/*      */       
/* 1046 */       SdwmsRationnote sheet = sheets.get(0);
/*      */       
/* 1048 */       com.best.javaSdk.twSoNotify.request.TwSoNotifyReq req = new com.best.javaSdk.twSoNotify.request.TwSoNotifyReq();
/*      */       
/* 1050 */       req.setOperationFlag("W");
/*      */       
/* 1052 */       req.setCustomerCode(customerCode);
/*      */       
/* 1054 */       req.setOrderCode(sheetId.trim());
/*      */ 
/*      */       
/* 1057 */       Sender sender = new Sender();
/* 1058 */       req.setSender(sender);
/*      */ 
/*      */       
/* 1061 */       Receiver receiver1 = new Receiver();
/* 1062 */       receiver1.setName(sheet.getInShopName().trim());
/* 1063 */       receiver1.setReceiverId(sheet.getShopid().trim());
/* 1064 */       req.setReceiver(receiver1);
/*      */ 
/*      */       
/* 1067 */       req.setWarehouseCode(BestConfig.warehouseCode);
/*      */       
/* 1069 */       req.setActionType("ADD");
/*      */ 
/*      */       
/* 1072 */       req.setOperationTypeCode("WDO");
/*      */       
/* 1074 */       req.setOrderTime(Convert.formatDateTime(sheet.getSdate()));
/*      */       
/* 1076 */       req.setItemList(ItemList.buildForRationNote(sheets));
/*      */       
/* 1078 */       req.setRemark("配送出库单生成");
/*      */ 
/*      */ 
/*      */       
/* 1082 */       result.add(req);
/*      */     } 
/*      */     
/* 1085 */     return result;
/*      */   }
/*      */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twSoNotify\request\TwSoNotifyReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */