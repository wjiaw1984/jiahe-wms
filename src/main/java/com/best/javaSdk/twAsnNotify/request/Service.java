 package com.best.javaSdk.twAsnNotify.request;
 
 import com.best.javaSdk.twAsnNotify.request.ServiceCodeList;
 
 
 public class Service
 {
   private String serviceDefinitionCode;
   private ServiceCodeList serviceCodeList;
   
   public String getServiceDefinitionCode() {
/* 12 */     return this.serviceDefinitionCode;
   }
 
   
   public void setServiceDefinitionCode(String value) {
/* 17 */     this.serviceDefinitionCode = value;
   }
 
   
   public ServiceCodeList getServiceCodeList() {
/* 22 */     return this.serviceCodeList;
   }
 
   
   public void setServiceCodeList(ServiceCodeList value) {
/* 27 */     this.serviceCodeList = value;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twAsnNotify\request\Service.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */