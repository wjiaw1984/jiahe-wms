 package com.best.javaSdk.twSoNotify.request;
 
 import com.best.javaSdk.twSoNotify.request.ServiceCodeList;
 
 
 public class Service
 {
   private String serviceDefinitionCode;
   private String remark;
   private ServiceCodeList serviceCodeList;
   
   public String getServiceDefinitionCode() {
/* 13 */     return this.serviceDefinitionCode;
   }
 
   
   public void setServiceDefinitionCode(String value) {
/* 18 */     this.serviceDefinitionCode = value;
   }
 
   
   public String getRemark() {
/* 23 */     return this.remark;
   }
 
   
   public void setRemark(String value) {
/* 28 */     this.remark = value;
   }
 
   
   public ServiceCodeList getServiceCodeList() {
/* 33 */     return this.serviceCodeList;
   }
 
   
   public void setServiceCodeList(ServiceCodeList value) {
/* 38 */     this.serviceCodeList = value;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twSoNotify\request\Service.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */