/*     */ package BOOT-INF.classes.cn.com.wms.web.controller.bset;
/*     */ import cn.com.wms.common.utils.CheckEndDate;
/*     */ import cn.com.wms.config.BestConfig;
/*     */ import cn.com.wms.model.bset.ParamVo;
/*     */ import cn.com.wms.model.bset.ResponseErrorVo;
/*     */ import cn.com.wms.model.bset.ResponseVo;
/*     */ import cn.com.wms.model.erp.SheetPrefixstring;
/*     */ import cn.com.wms.service.erp.ISheetPrefixstringService;
/*     */ import cn.com.wms.service.wms.fr.IFrRationNoteService;
/*     */ import cn.com.wms.service.wms.fr.IFrReceiptService;
/*     */ import cn.com.wms.service.wms.fr.IFrRetRationService;
/*     */ import cn.com.wms.service.wms.fr.IFrRetService;
/*     */ import com.alibaba.fastjson2.JSONObject;
/*     */ import com.best.javaSdk.BaseResponse;
/*     */ import com.best.javaSdk.Param;
/*     */ import com.best.javaSdk.Sign;
/*     */ import com.best.javaSdk.wmsAsnStatusPush.request.WmsAnsStatusPushReq;
/*     */ import com.best.javaSdk.wmsSoStatusPush.request.WmsSoStatusPushReq;
/*     */ import com.best.javaSdk.wmsrmastatuspush.request.WmsRmaStatusPushReq;
/*     */ import java.util.Date;
/*     */ import java.util.Map;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import org.slf4j.Logger;
/*     */ import org.slf4j.LoggerFactory;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.util.MultiValueMap;
/*     */ import org.springframework.web.bind.annotation.ModelAttribute;
/*     */ import org.springframework.web.bind.annotation.RequestHeader;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.ResponseBody;
/*     */ import org.springframework.web.bind.annotation.RestController;
/*     */ 
/*     */ @RestController
/*     */ @RequestMapping({"/bset/api"})
/*     */ public class Controller {
/*  36 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.web.controller.bset.Controller.class);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   IFrRationNoteService frRationNoteService;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   IFrRetRationService frRetRationService;
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   IFrReceiptService frReceiptService;
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   IFrRetService frRetService;
/*     */ 
/*     */ 
/*     */   
/*     */   @Autowired
/*     */   ISheetPrefixstringService sheetPrefixstringService;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequestMapping({"/process"})
/*     */   @ResponseBody
/*     */   public BaseResponse process(@RequestBody(required = false) MultiValueMap<String, String> bodyStr, @ModelAttribute ParamVo params, @RequestHeader(required = false) Map<String, String> heard, HttpServletRequest httpRequest) {
/*  71 */     Thread th = Thread.currentThread();
/*  72 */     log.warn("线程【" + th.getId() + "】访问：" + httpRequest.getRequestURI());
/*     */     try {
/*  74 */       log.warn("线程【" + th.getId() + "】传入参数bodyStr：{}", bodyStr);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  80 */       log.warn("线程【" + th.getId() + "】传入参数param：{}", JSONObject.toJSONString(params, new com.alibaba.fastjson2.JSONWriter.Feature[0]));
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  85 */       if (!CheckEndDate.checkEndDate(new Date())) {
/*  86 */         String errMsg = "有效期已过！";
/*  87 */         throw new RuntimeException(errMsg);
/*     */       } 
/*     */       
/*  90 */       return process(params);
/*  91 */     } catch (Exception e) {
/*  92 */       log.error(e.getMessage());
/*  93 */       return (BaseResponse)ResponseErrorVo.buildFailure("500", "process error:" + e.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   public BaseResponse process(ParamVo entity) {
/*  98 */     Param param = new Param();
/*  99 */     param.setServiceType(entity.getServiceType());
/* 100 */     param.setBizData(entity.getBizData());
/* 101 */     param.setPartnerID(entity.getPartnerID());
/* 102 */     param.setPartnerKey(BestConfig.partnerKey);
/* 103 */     if (!entity.getSign().equalsIgnoreCase(Sign.makeSign(param))) {
/* 104 */       String errMsg = "签名错误";
/* 105 */       return (BaseResponse)ResponseErrorVo.buildFailure("500", "process error:" + errMsg);
/*     */     } 
/*     */     
/* 108 */     if (entity.getServiceType().equalsIgnoreCase("WMS_ASN_STATUS_PUSH")) {
/* 109 */       toASN(entity);
/* 110 */     } else if (entity.getServiceType().equalsIgnoreCase("WMS_RMA_STATUS_PUSH")) {
/* 111 */       toRMA(entity);
/* 112 */     } else if (entity.getServiceType().equalsIgnoreCase("WMS_SO_STATUS_PUSH")) {
/* 113 */       toSO(entity);
/*     */     } else {
/* 115 */       return (BaseResponse)ResponseErrorVo.buildFailure("10000", String.format("不识别的业务: %s", new Object[] { entity.getServiceType() }));
/*     */     } 
/* 117 */     return (BaseResponse)ResponseVo.buildSuccess("成功");
/*     */   }
/*     */   
/*     */   public void toSO(ParamVo entity) {
/* 121 */     WmsSoStatusPushReq req = (WmsSoStatusPushReq)JSONObject.parseObject(entity.getBizData(), WmsSoStatusPushReq.class);
/* 122 */     SheetPrefixstring sheetPrefixstring = this.sheetPrefixstringService.getByFixString(req.getOrderCode().substring(0, 1));
/* 123 */     if (sheetPrefixstring == null) {
/* 124 */       throw new RuntimeException(String.format("不识别的业务单据[%s]!", new Object[] { req.getOrderCode() }));
/*     */     }
/* 126 */     if (sheetPrefixstring.getSheetType().intValue() == 2331 || sheetPrefixstring.getSheetType().intValue() == 2330) {
/* 127 */       this.frRationNoteService.toRationNote(req);
/* 128 */     } else if (sheetPrefixstring.getSheetType().intValue() == 2323) {
/* 129 */       this.frRetService.toFrRet(req);
/*     */     } else {
/* 131 */       throw new RuntimeException(String.format("不识别的业务单据[%s]!", new Object[] { req.getOrderCode() }));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void toASN(ParamVo entity) {
/* 137 */     WmsAnsStatusPushReq req = (WmsAnsStatusPushReq)JSONObject.parseObject(entity.getBizData(), WmsAnsStatusPushReq.class);
/* 138 */     SheetPrefixstring sheetPrefixstring = this.sheetPrefixstringService.getByFixString(req.getOrderCode().substring(0, 1));
/* 139 */     if (sheetPrefixstring == null) {
/* 140 */       throw new RuntimeException(String.format("不识别的业务单据[%s]!", new Object[] { req.getOrderCode() }));
/*     */     }
/* 142 */     if (sheetPrefixstring.getSheetType().intValue() == 2301) {
/* 143 */       this.frReceiptService.toReceipt(req);
/*     */     } else {
/* 145 */       throw new RuntimeException(String.format("不识别的业务单据[%s]!", new Object[] { req.getOrderCode() }));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void toRMA(ParamVo entity) {
/* 150 */     WmsRmaStatusPushReq req = (WmsRmaStatusPushReq)JSONObject.parseObject(entity.getBizData(), WmsRmaStatusPushReq.class);
/* 151 */     SheetPrefixstring sheetPrefixstring = this.sheetPrefixstringService.getByFixString(req.getOrderCode().substring(0, 1));
/* 152 */     if (sheetPrefixstring == null) {
/* 153 */       throw new RuntimeException(String.format("不识别的业务单据[%s]!", new Object[] { req.getOrderCode() }));
/*     */     }
/* 155 */     if (sheetPrefixstring.getSheetType().intValue() == 2332) {
/* 156 */       this.frRetRationService.toFrRetRation(req);
/*     */     } else {
/* 158 */       throw new RuntimeException(String.format("不识别的业务单据[%s]!", new Object[] { req.getOrderCode() }));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\web\controller\bset\Controller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */