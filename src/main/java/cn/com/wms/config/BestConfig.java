 package cn.com.wms.config;

 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.stereotype.Component;

 @Component
 public class BestConfig {
   public static String url;
   public static String partnerId;
   public static String partnerKey;

   public boolean equals(Object o) {
/* 13 */     if (o == this) return true;  if (!(o instanceof cn.com.wms.config.BestConfig)) return false;  cn.com.wms.config.BestConfig other = (cn.com.wms.config.BestConfig)o; return !!other.canEqual(this); } public static String customerCode; public static String providerCode; public static String warehouseCode; public static String messageFormat; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.config.BestConfig; } public int hashCode() { int result = 1; return 1; } public String toString() { return "BestConfig()"; }









   @Value("${best.partnerId}")
   public void setPartnerId(String partnerId) {
/* 25 */     cn.com.wms.config.BestConfig.partnerId = partnerId;
   }

   @Value("${best.partnerKey}")
   public void setPartnerKey(String partnerKey) {
/* 30 */     cn.com.wms.config.BestConfig.partnerKey = partnerKey;
   }

   @Value("${best.customerCode}")
   public void setCustomerCode(String customerCode) {
/* 35 */     cn.com.wms.config.BestConfig.customerCode = customerCode;
   }

   @Value("${best.providerCode}")
   public void setProviderCode(String providerCode) {
/* 40 */     cn.com.wms.config.BestConfig.providerCode = providerCode;
   }

   @Value("${best.warehouseCode}")
   public void setWarehouseCode(String warehouseCode) {
/* 45 */     cn.com.wms.config.BestConfig.warehouseCode = warehouseCode;
   }

   @Value("${best.url}")
   public void setUrl(String url) {
/* 50 */     cn.com.wms.config.BestConfig.url = url;
   }

   @Value("${best.messageFormat}")
   public static void setMessageFormat(String messageFormat) {
/* 55 */     cn.com.wms.config.BestConfig.messageFormat = messageFormat;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\config\BestConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */