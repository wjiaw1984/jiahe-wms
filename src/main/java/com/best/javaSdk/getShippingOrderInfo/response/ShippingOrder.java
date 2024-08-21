 package com.best.javaSdk.getShippingOrderInfo.response;

 import com.best.javaSdk.getShippingOrderInfo.response.TrackingInfoList;


 public class ShippingOrder
 {
   private String logisticsProviderCode;
   private String shippingOrderNo;
   private String status;
   private TrackingInfoList trackingInfoList;

   public String getLogisticsProviderCode() {
/* 14 */     return this.logisticsProviderCode;
   }


   public void setLogisticsProviderCode(String value) {
/* 19 */     this.logisticsProviderCode = value;
   }


   public String getShippingOrderNo() {
/* 24 */     return this.shippingOrderNo;
   }


   public void setShippingOrderNo(String value) {
/* 29 */     this.shippingOrderNo = value;
   }


   public String getStatus() {
/* 34 */     return this.status;
   }


   public void setStatus(String value) {
/* 39 */     this.status = value;
   }


   public TrackingInfoList getTrackingInfoList() {
/* 44 */     return this.trackingInfoList;
   }


   public void setTrackingInfoList(TrackingInfoList value) {
/* 49 */     this.trackingInfoList = value;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\getShippingOrderInfo\response\ShippingOrder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */