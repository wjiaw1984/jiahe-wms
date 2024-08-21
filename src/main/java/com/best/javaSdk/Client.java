/*    */ package BOOT-INF.classes.com.best.javaSdk;
/*    */ import com.best.javaSdk.BaseRequest;
/*    */ import com.best.javaSdk.Param;
/*    */ import com.best.javaSdk.Parser;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class Client {
/*  9 */   private static final Logger log = LoggerFactory.getLogger(com.best.javaSdk.Client.class);
/*    */   
/*    */   private String url;
/*    */   
/*    */   private String partnerID;
/*    */   private String partnerKey;
/*    */   private String messageFormat;
/*    */   
/*    */   public Client(String url, String partnerID, String partnerKey, String messageFormat) {
/* 18 */     this.url = url;
/* 19 */     this.messageFormat = messageFormat;
/* 20 */     this.partnerID = partnerID;
/* 21 */     this.partnerKey = partnerKey;
/*    */   }
/*    */ 
/*    */   
/*    */   public <T extends com.best.javaSdk.BaseResponse> T executed(BaseRequest baseRequest) {
/* 26 */     String response = "";
/* 27 */     Map<String, String> params = new HashMap<>();
/* 28 */     Map<String, String> headers = new HashMap<>();
/* 29 */     Param param = new Param();
/* 30 */     param.setServiceType(baseRequest.obtainServiceType());
/* 31 */     param.setBizData(makeBizData(baseRequest));
/* 32 */     param.setPartnerID(this.partnerID);
/* 33 */     param.setPartnerKey(this.partnerKey);
/*    */     
/* 35 */     params.put("serviceType", param.getServiceType());
/* 36 */     params.put("bizData", param.getBizData());
/* 37 */     params.put("sign", Sign.makeSign(param));
/* 38 */     params.put("partnerID", param.getPartnerID());
/* 39 */     log.info("请求参数：" + JSONObject.toJSONString(params, new com.alibaba.fastjson2.JSONWriter.Feature[0]));
/*    */     try {
/* 41 */       response = HttpService.sendPost(this.url, params, headers);
/* 42 */       log.info("访问远程服务【%s】返回信息:%s", this.url, response);
/* 43 */     } catch (Exception e) {
/* 44 */       log.error("访问远程服务【%s】发生错误:%s", this.url, e.getMessage());
/* 45 */       e.printStackTrace();
/*    */     } 
/* 47 */     return (response == null) ? null : (T)baseRequest.makeResponse(response, this.messageFormat);
/*    */   }
/*    */   
/*    */   private String makeBizData(BaseRequest baseRequest) {
/* 51 */     if ("xml".equalsIgnoreCase(this.messageFormat)) {
/* 52 */       return Parser.coverObject2Xml(baseRequest);
/*    */     }
/* 54 */     return Parser.convertObject2Json(baseRequest);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\Client.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */