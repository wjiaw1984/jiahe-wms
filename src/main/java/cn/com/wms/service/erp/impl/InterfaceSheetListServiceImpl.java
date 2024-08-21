/*     */ package BOOT-INF.classes.cn.com.wms.service.erp.impl;
/*     */ import cn.com.wms.config.BestConfig;
/*     */ import cn.com.wms.model.erp.InterfaceSheetList;
/*     */ import cn.com.wms.model.erp.SheetPrefixstring;
/*     */ import cn.com.wms.model.erp.ShopContact;
/*     */ import cn.com.wms.model.wms.sdwms.SdwmsGoods;
/*     */ import cn.com.wms.model.wms.sdwms.SdwmsPurchase;
/*     */ import cn.com.wms.model.wms.sdwms.SdwmsRationnote;
/*     */ import cn.com.wms.model.wms.sdwms.SdwmsRet;
/*     */ import cn.com.wms.model.wms.sdwms.SdwmsRetration;
/*     */ import cn.com.wms.mybaits.service.erp.IInterfaceSheetListDataService;
/*     */ import cn.com.wms.service.erp.ISheetPrefixstringService;
/*     */ import cn.com.wms.service.erp.IShopContactService;
/*     */ import cn.com.wms.service.wms.sdwms.ISdwmsGoodsService;
/*     */ import cn.com.wms.service.wms.sdwms.ISdwmsPurchaseService;
/*     */ import cn.com.wms.service.wms.sdwms.ISdwmsRationNoteService;
/*     */ import com.alibaba.fastjson2.JSONObject;
/*     */ import com.best.javaSdk.BaseRequest;
/*     */ import com.best.javaSdk.Client;
/*     */ import com.best.javaSdk.twAsnNotify.request.TwAsnNotifyReq;
/*     */ import com.best.javaSdk.twAsnNotify.response.TwAsnNotifyRsp;
/*     */ import com.best.javaSdk.twSoNotify.request.TwSoNotifyReq;
/*     */ import com.best.javaSdk.twSoNotify.response.TwSoNotifyRsp;
/*     */ import com.best.javaSdk.wmsSkuNotify.request.WmsSkuNotifyReq;
/*     */ import com.best.javaSdk.wmsSkuNotify.response.WmsSkuNotifyRsp;
/*     */ import java.util.List;
/*     */ import java.util.stream.Collectors;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Service;
/*     */ import org.springframework.util.CollectionUtils;
/*     */ 
/*     */ @Service
/*     */ public class InterfaceSheetListServiceImpl implements IInterfaceSheetListService {
/*  36 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.service.erp.impl.InterfaceSheetListServiceImpl.class);
/*     */   
/*     */   @Autowired
/*     */   private IInterfaceSheetListDataService dataService;
/*     */   
/*     */   @Autowired
/*     */   private ISdwmsGoodsService goodsService;
/*     */   
/*     */   @Autowired
/*     */   private ISdwmsRationNoteService sdwmsRationNoteService;
/*     */   
/*     */   @Autowired
/*     */   private ISdwmsRetService sdwmsRetService;
/*     */   
/*     */   @Autowired
/*     */   private ISheetPrefixstringService sheetPrefixstringService;
/*     */   
/*     */   @Autowired
/*     */   private ISdwmsRetRationService sdwmsRetRationService;
/*     */   
/*     */   @Autowired
/*     */   private IShopContactService shopContactService;
/*     */   
/*     */   @Autowired
/*     */   private ISdwmsPurchaseService sdwmsPurchaseService;
/*     */ 
/*     */   
/*     */   public void sendGoods() {
/*  64 */     List<InterfaceSheetList> list = this.dataService.listGoods();
/*     */     
/*  66 */     if (CollectionUtils.isEmpty(list)) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  71 */     List<String> goodsIds = (List<String>)list.stream().map(InterfaceSheetList::getSheetid).collect(Collectors.toList());
/*  72 */     log.info("发送商品信息：{}", goodsIds);
/*     */ 
/*     */ 
/*     */     
/*  76 */     List<SdwmsGoods> goodsList = this.goodsService.listByGoodsIds(goodsIds);
/*     */ 
/*     */     
/*  79 */     WmsSkuNotifyReq req = WmsSkuNotifyReq.bulid(goodsList);
/*  80 */     Client client = new Client(BestConfig.url, BestConfig.partnerId, BestConfig.partnerKey, BestConfig.messageFormat);
/*  81 */     WmsSkuNotifyRsp wmsSkuNotifyRsp = (WmsSkuNotifyRsp)client.executed((BaseRequest)req);
/*  82 */     log.info("发送商品信息结果：{}", JSONObject.toJSONString(wmsSkuNotifyRsp, new com.alibaba.fastjson2.JSONWriter.Feature[0]));
/*  83 */     log.info("发送商品信息完成");
/*     */     
/*  85 */     if (wmsSkuNotifyRsp.getResult()) {
/*  86 */       updateExecuteFlag(goodsIds, Integer.valueOf(1001));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void sendRationNote() {
/*  92 */     List<InterfaceSheetList> sheetIds = this.dataService.listRationNoteJob();
/*     */     
/*  94 */     if (CollectionUtils.isEmpty(sheetIds)) {
/*     */       return;
/*     */     }
/*  97 */     log.info("发送配送单据列表：{}", sheetIds);
/*     */ 
/*     */     
/* 100 */     for (InterfaceSheetList sheet : sheetIds) {
/*     */       try {
/* 102 */         SheetPrefixstring sheetPrefixstring = this.sheetPrefixstringService.getBySheetType(sheet.getSheetType());
/* 103 */         String wmsSheetId = sheet.getSheetid();
/* 104 */         if (sheetPrefixstring != null) {
/* 105 */           wmsSheetId = sheetPrefixstring.getFixString() + sheet.getSheetid();
/*     */         }
/* 107 */         List<SdwmsRationnote> rationnoteList = this.sdwmsRationNoteService.listBySheetId(wmsSheetId);
/* 108 */         if (CollectionUtils.isEmpty(rationnoteList)) {
/*     */           continue;
/*     */         }
/* 111 */         log.info("发送配送通知单：{}", sheet.getSheetid());
/* 112 */         List<TwSoNotifyReq> reqList = TwSoNotifyReq.buildForRationNote(BestConfig.customerCode, rationnoteList);
/* 113 */         if (CollectionUtils.isEmpty(reqList)) {
/* 114 */           log.error("发送配送通知异常:{}", "生成百世配送通知单失败！");
/*     */           
/*     */           continue;
/*     */         } 
/*     */         
/* 119 */         boolean isFinish = true;
/* 120 */         for (TwSoNotifyReq req : reqList) {
/*     */           
/* 122 */           if (req.getReceiver() != null) {
/*     */             try {
/* 124 */               ShopContact shopContact = this.shopContactService.getByShopId(req.getReceiver().getReceiverId());
/* 125 */               req.getReceiver().setProvince(shopContact.getProvince());
/* 126 */               req.getReceiver().setCity(shopContact.getCity());
/* 127 */               req.getReceiver().setDistrict(shopContact.getDistrict());
/* 128 */               req.getReceiver().setAddress(shopContact.getAddress());
/* 129 */               req.getReceiver().setPhone(shopContact.getPhone());
/* 130 */             } catch (Exception e) {
/* 131 */               String errMsg = String.format("查询不到收货人信息[%s]", new Object[] { req.getReceiver().getReceiverId() });
/* 132 */               log.error("发送配送通知异常:{}", errMsg);
/*     */               continue;
/*     */             } 
/*     */           }
/* 136 */           Client client = new Client(BestConfig.url, BestConfig.partnerId, BestConfig.partnerKey, BestConfig.messageFormat);
/* 137 */           TwSoNotifyRsp twSoNotifyRsp = (TwSoNotifyRsp)client.executed((BaseRequest)req);
/* 138 */           log.info("发送配送通知结果：{}", JSONObject.toJSONString(twSoNotifyRsp, new com.alibaba.fastjson2.JSONWriter.Feature[0]));
/* 139 */           log.info("发送配送通知完成");
/*     */           
/* 141 */           if (!twSoNotifyRsp.getResult()) {
/* 142 */             isFinish = false;
/* 143 */             log.error(String.format("发送配送通知失败，sheetId：%s, 异常信息: ", new Object[] { wmsSheetId, twSoNotifyRsp.getErrorDescription() }));
/*     */           } 
/*     */         } 
/* 146 */         if (isFinish) {
/* 147 */           log.info(String.format("发送配送通知完成，sheetId：%s,开始备份作业。", new Object[] { wmsSheetId }));
/* 148 */           updateExecuteFlag(sheet.getSheetid(), sheet.getSheetType());
/* 149 */           this.sdwmsRationNoteService.toBak(wmsSheetId);
/*     */         } 
/* 151 */       } catch (Exception e) {
/* 152 */         log.error(e.getMessage());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendRetRation() {
/* 160 */     List<InterfaceSheetList> sheetIds = this.dataService.listRetRationJob();
/*     */     
/* 162 */     if (CollectionUtils.isEmpty(sheetIds)) {
/*     */       return;
/*     */     }
/* 165 */     log.info("发送返配单据列表：{}", sheetIds);
/*     */ 
/*     */     
/* 168 */     for (InterfaceSheetList sheet : sheetIds) {
/*     */       try {
/* 170 */         SheetPrefixstring sheetPrefixstring = this.sheetPrefixstringService.getBySheetType(sheet.getSheetType());
/* 171 */         String wmsSheetId = sheet.getSheetid();
/* 172 */         if (sheetPrefixstring != null) {
/* 173 */           wmsSheetId = sheetPrefixstring.getFixString() + sheet.getSheetid();
/*     */         }
/* 175 */         List<SdwmsRetration> retrationList = this.sdwmsRetRationService.listBySheetId(wmsSheetId);
/* 176 */         if (CollectionUtils.isEmpty(retrationList)) {
/*     */           continue;
/*     */         }
/* 179 */         log.info("发送返配入库通知：{}", sheet.getSheetid());
/* 180 */         List<TwAsnNotifyReq> reqList = TwAsnNotifyReq.buildForRetration(BestConfig.customerCode, retrationList);
/* 181 */         if (CollectionUtils.isEmpty(reqList)) {
/* 182 */           log.error("发送返配单异常:{}", "生成百世配送通知单失败！");
/*     */           continue;
/*     */         } 
/* 185 */         Client client = new Client(BestConfig.url, BestConfig.partnerId, BestConfig.partnerKey, BestConfig.messageFormat);
/* 186 */         TwAsnNotifyRsp rsp = (TwAsnNotifyRsp)client.executed((BaseRequest)reqList.get(0));
/* 187 */         log.info("发送返配单结果：{}", JSONObject.toJSONString(rsp, new com.alibaba.fastjson2.JSONWriter.Feature[0]));
/* 188 */         log.info("发送返配单完成");
/*     */ 
/*     */ 
/*     */         
/* 192 */         if (rsp.getResult()) {
/* 193 */           updateExecuteFlag(sheet.getSheetid(), sheet.getSheetType());
/* 194 */           this.sdwmsRetRationService.toBak(wmsSheetId);
/*     */         } 
/* 196 */       } catch (Exception e) {
/* 197 */         log.error(e.getMessage());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendRet() {
/* 205 */     List<InterfaceSheetList> sheetIds = this.dataService.listRetJob();
/*     */     
/* 207 */     if (CollectionUtils.isEmpty(sheetIds)) {
/*     */       return;
/*     */     }
/* 210 */     log.info("发送配送单据列表：{}", sheetIds);
/*     */     
/* 212 */     for (InterfaceSheetList sheet : sheetIds) {
/*     */       try {
/* 214 */         SheetPrefixstring sheetPrefixstring = this.sheetPrefixstringService.getBySheetType(sheet.getSheetType());
/* 215 */         String wmsSheetId = sheet.getSheetid();
/* 216 */         if (sheetPrefixstring != null) {
/* 217 */           wmsSheetId = sheetPrefixstring.getFixString() + sheet.getSheetid();
/*     */         }
/* 219 */         List<SdwmsRet> retList = this.sdwmsRetService.listBySheetId(wmsSheetId);
/* 220 */         if (CollectionUtils.isEmpty(retList)) {
/*     */           continue;
/*     */         }
/*     */         
/* 224 */         log.info("发送退货通知单：{}", sheet.getSheetid());
/* 225 */         List<TwSoNotifyReq> reqList = TwSoNotifyReq.buildForRet(BestConfig.customerCode, retList);
/* 226 */         if (CollectionUtils.isEmpty(reqList)) {
/* 227 */           log.error("发送退货通知异常:{}", "生成百世退货单失败！");
/*     */           
/*     */           continue;
/*     */         } 
/*     */         
/* 232 */         for (TwSoNotifyReq req : reqList) {
/*     */           
/* 234 */           if (req.getReceiver() != null) {
/*     */             try {
/* 236 */               ShopContact shopContact = this.shopContactService.getByShopId(req.getReceiver().getReceiverId());
/* 237 */               req.getReceiver().setProvince(shopContact.getProvince());
/* 238 */               req.getReceiver().setCity(shopContact.getCity());
/* 239 */               req.getReceiver().setDistrict(shopContact.getDistrict());
/* 240 */               req.getReceiver().setAddress(shopContact.getAddress());
/* 241 */               req.getReceiver().setPhone(shopContact.getPhone());
/* 242 */             } catch (Exception e) {
/* 243 */               String errMsg = String.format("查询不到收货人信息[%s]", new Object[] { req.getReceiver().getReceiverId() });
/* 244 */               log.error("发送退货通知异常:{}", errMsg);
/*     */             } 
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 250 */         Client client = new Client(BestConfig.url, BestConfig.partnerId, BestConfig.partnerKey, BestConfig.messageFormat);
/* 251 */         TwSoNotifyRsp twSoNotifyRsp = (TwSoNotifyRsp)client.executed((BaseRequest)reqList.get(0));
/* 252 */         log.info("发送退货结果：{}", JSONObject.toJSONString(twSoNotifyRsp, new com.alibaba.fastjson2.JSONWriter.Feature[0]));
/* 253 */         log.info("发送退货完成");
/*     */ 
/*     */         
/* 256 */         if (twSoNotifyRsp.getResult()) {
/* 257 */           updateExecuteFlag(sheet.getSheetid(), sheet.getSheetType());
/* 258 */           this.sdwmsRetService.toBak(wmsSheetId);
/*     */         } 
/* 260 */       } catch (Exception e) {
/* 261 */         log.error(e.getMessage());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendPurchase() {
/* 269 */     List<InterfaceSheetList> sheetIds = this.dataService.listPurchaseJob();
/*     */     
/* 271 */     if (CollectionUtils.isEmpty(sheetIds)) {
/*     */       return;
/*     */     }
/* 274 */     log.info("发送订货单据列表：{}", sheetIds);
/*     */ 
/*     */     
/* 277 */     for (InterfaceSheetList sheet : sheetIds) {
/*     */       try {
/* 279 */         SheetPrefixstring sheetPrefixstring = this.sheetPrefixstringService.getBySheetType(sheet.getSheetType());
/* 280 */         String wmsSheetId = sheet.getSheetid();
/* 281 */         if (sheetPrefixstring != null) {
/* 282 */           wmsSheetId = sheetPrefixstring.getFixString() + sheet.getSheetid();
/*     */         }
/* 284 */         List<SdwmsPurchase> purchaseList = this.sdwmsPurchaseService.listBySheetId(wmsSheetId);
/* 285 */         if (CollectionUtils.isEmpty(purchaseList)) {
/*     */           continue;
/*     */         }
/* 288 */         log.info("发送订货通知单：{}", sheet.getSheetid());
/* 289 */         List<TwAsnNotifyReq> reqList = TwAsnNotifyReq.buildForPurchase(BestConfig.customerCode, purchaseList);
/* 290 */         if (CollectionUtils.isEmpty(reqList)) {
/* 291 */           log.error("发送订货单异常:{}", "生成百世订货单失败！");
/*     */           continue;
/*     */         } 
/* 294 */         Client client = new Client(BestConfig.url, BestConfig.partnerId, BestConfig.partnerKey, BestConfig.messageFormat);
/* 295 */         TwAsnNotifyRsp rsp = (TwAsnNotifyRsp)client.executed((BaseRequest)reqList.get(0));
/* 296 */         log.info("发送订货单结果：{}", JSONObject.toJSONString(rsp, new com.alibaba.fastjson2.JSONWriter.Feature[0]));
/* 297 */         log.info("发送订货单完成");
/*     */ 
/*     */         
/* 300 */         if (rsp.getResult()) {
/* 301 */           updateExecuteFlag(sheet.getSheetid(), sheet.getSheetType());
/* 302 */           this.sdwmsPurchaseService.toBak(wmsSheetId);
/*     */         } 
/* 304 */       } catch (Exception e) {
/* 305 */         log.error(e.getMessage());
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void updateExecuteFlag(String sheetId, Integer sheetType) {
/* 312 */     this.dataService.updateExecuteFlag(sheetId, sheetType, Integer.valueOf(60));
/*     */   }
/*     */   
/*     */   public void updateExecuteFlag(List<String> sheetIds, Integer sheetType) {
/* 316 */     this.dataService.updateExecuteFlag(sheetIds, sheetType, Integer.valueOf(60));
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\erp\impl\InterfaceSheetListServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */