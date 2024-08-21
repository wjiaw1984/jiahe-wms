 package cn.com.wms.service.wms.fr.impl;
 
 import cn.com.wms.model.wms.fr.FrRet;
 import cn.com.wms.mybaits.service.fr.IFrRetDataService;
 import cn.com.wms.service.erp.ISheetPrefixstringService;
 import cn.com.wms.service.wms.fr.IFrRetService;
 import com.best.javaSdk.wmsSoStatusPush.request.WmsSoStatusPushReq;
 import java.util.List;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 import org.springframework.util.CollectionUtils;
 
 
 
 
 @Service
 @Transactional(timeout = 5000)
 public class FrRetServiceImpl
   implements IFrRetService
 {
/* 24 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.service.wms.fr.impl.FrRetServiceImpl.class);
 
   
   @Autowired
   IFrRetDataService dataService;
   
   @Autowired
   ISheetPrefixstringService sheetPrefixstringService;
 
   
   public void save(FrRet entity) {
/* 35 */     this.dataService.save(entity);
   }
 
   
   public void batchSave(List<FrRet> list) {
/* 40 */     this.dataService.saveBatch(list);
   }
 
 
   
   public void toFrRet(WmsSoStatusPushReq entity) {
     try {
/* 47 */       List<FrRet> frRets = entity.toFrRet(null);
/* 48 */       if (!CollectionUtils.isEmpty(frRets)) {
/* 49 */         batchSave(frRets);
       }
/* 51 */     } catch (Exception e) {
/* 52 */       String errMsg = String.format("退货单[%s]回传处理异常: %s", new Object[] { entity.getOrderCode(), e.getMessage() });
/* 53 */       throw new RuntimeException(errMsg);
     } 
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\fr\impl\FrRetServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */