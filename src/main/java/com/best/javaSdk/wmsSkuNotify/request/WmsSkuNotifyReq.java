 package com.best.javaSdk.wmsSkuNotify.request;

 import cn.com.wms.config.BestConfig;
 import cn.com.wms.model.wms.sdwms.SdwmsGoods;
 import com.best.javaSdk.BaseRequest;
 import com.best.javaSdk.BaseResponse;
 import com.best.javaSdk.Parser;
 import com.best.javaSdk.wmsSkuNotify.request.Products;
 import com.best.javaSdk.wmsSkuNotify.response.WmsSkuNotifyRsp;
 import java.util.List;





 public class WmsSkuNotifyReq
   implements BaseRequest
 {
   private String providerCode;
   private Products products;

   public String getProviderCode() {
/* 23 */     return this.providerCode;
   }


   public void setProviderCode(String value) {
/* 28 */     this.providerCode = value;
   }


   public Products getProducts() {
/* 33 */     return this.products;
   }


   public void setProducts(Products value) {
/* 38 */     this.products = value;
   }

   public String obtainServiceType() {
/* 42 */     return "WMS_SKU_NOTIFY";
   }

   public BaseResponse makeResponse(String rsp, String format) {
/* 46 */     if ("xml".equalsIgnoreCase(format)) {
/* 47 */       return (BaseResponse)Parser.coverXml2Object(rsp, WmsSkuNotifyRsp.class);
     }
/* 49 */     return (BaseResponse)Parser.convertJson2Object(rsp, WmsSkuNotifyRsp.class);
   }










   public static com.best.javaSdk.wmsSkuNotify.request.WmsSkuNotifyReq bulid(List<SdwmsGoods> goodsList) {
/* 62 */     com.best.javaSdk.wmsSkuNotify.request.WmsSkuNotifyReq result = new com.best.javaSdk.wmsSkuNotify.request.WmsSkuNotifyReq();
/* 63 */     result.setProviderCode(BestConfig.providerCode);
/* 64 */     result.setProducts(Products.build(goodsList));
/* 65 */     return result;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSkuNotify\request\WmsSkuNotifyReq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */