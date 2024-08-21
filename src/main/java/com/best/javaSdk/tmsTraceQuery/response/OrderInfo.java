 package com.best.javaSdk.tmsTraceQuery.response;
 
 import com.best.javaSdk.tmsTraceQuery.response.Items;
 import com.best.javaSdk.tmsTraceQuery.response.OrderTraces;
 import com.best.javaSdk.tmsTraceQuery.response.Shippings;
 
 
 public class OrderInfo
 {
   private String portalUrl;
   private String tmsCode;
   private OrderTraces orderTraces;
   private Items items;
   private Shippings shippings;
   private String currentStatusUpdator;
   private String currentStatusDescription;
   private String currentStatusDatetime;
   private String customerCode;
   private String customerName;
   private String projectCode;
   private String orderCode;
   private String status;
   private String currentStatusLocation;
   
   public String getPortalUrl() {
/*  26 */     return this.portalUrl;
   }
 
   
   public void setPortalUrl(String value) {
/*  31 */     this.portalUrl = value;
   }
 
   
   public String getTmsCode() {
/*  36 */     return this.tmsCode;
   }
 
   
   public void setTmsCode(String value) {
/*  41 */     this.tmsCode = value;
   }
 
   
   public OrderTraces getOrderTraces() {
/*  46 */     return this.orderTraces;
   }
 
   
   public void setOrderTraces(OrderTraces value) {
/*  51 */     this.orderTraces = value;
   }
 
   
   public Items getItems() {
/*  56 */     return this.items;
   }
 
   
   public void setItems(Items value) {
/*  61 */     this.items = value;
   }
 
   
   public Shippings getShippings() {
/*  66 */     return this.shippings;
   }
 
   
   public void setShippings(Shippings value) {
/*  71 */     this.shippings = value;
   }
 
   
   public String getCurrentStatusUpdator() {
/*  76 */     return this.currentStatusUpdator;
   }
 
   
   public void setCurrentStatusUpdator(String value) {
/*  81 */     this.currentStatusUpdator = value;
   }
 
   
   public String getCurrentStatusDescription() {
/*  86 */     return this.currentStatusDescription;
   }
 
   
   public void setCurrentStatusDescription(String value) {
/*  91 */     this.currentStatusDescription = value;
   }
 
   
   public String getCurrentStatusDatetime() {
/*  96 */     return this.currentStatusDatetime;
   }
 
   
   public void setCurrentStatusDatetime(String value) {
/* 101 */     this.currentStatusDatetime = value;
   }
 
   
   public String getCustomerCode() {
/* 106 */     return this.customerCode;
   }
 
   
   public void setCustomerCode(String value) {
/* 111 */     this.customerCode = value;
   }
 
   
   public String getCustomerName() {
/* 116 */     return this.customerName;
   }
 
   
   public void setCustomerName(String value) {
/* 121 */     this.customerName = value;
   }
 
   
   public String getProjectCode() {
/* 126 */     return this.projectCode;
   }
 
   
   public void setProjectCode(String value) {
/* 131 */     this.projectCode = value;
   }
 
   
   public String getOrderCode() {
/* 136 */     return this.orderCode;
   }
 
   
   public void setOrderCode(String value) {
/* 141 */     this.orderCode = value;
   }
 
   
   public String getStatus() {
/* 146 */     return this.status;
   }
 
   
   public void setStatus(String value) {
/* 151 */     this.status = value;
   }
 
   
   public String getCurrentStatusLocation() {
/* 156 */     return this.currentStatusLocation;
   }
 
   
   public void setCurrentStatusLocation(String value) {
/* 161 */     this.currentStatusLocation = value;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\tmsTraceQuery\response\OrderInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */