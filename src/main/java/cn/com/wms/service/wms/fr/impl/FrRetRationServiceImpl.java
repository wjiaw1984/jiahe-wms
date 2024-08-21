 package cn.com.wms.service.wms.fr.impl;
 
 import cn.com.wms.model.wms.fr.FrRetRation;
 import cn.com.wms.mybaits.service.fr.IFrRetRationDataService;
 import cn.com.wms.service.wms.fr.IFrRetRationService;
 import com.best.javaSdk.wmsrmastatuspush.request.WmsRmaStatusPushReq;
 import java.util.List;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 import org.springframework.util.CollectionUtils;
 
 
 
 
 @Service
 @Transactional(timeout = 5000)
 public class FrRetRationServiceImpl
   implements IFrRetRationService
 {
/* 23 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.service.wms.fr.impl.FrRetRationServiceImpl.class);
 
   
   @Autowired
   IFrRetRationDataService dataService;
 
   
   public void save(FrRetRation entity) {
/* 31 */     this.dataService.save(entity);
   }
 
   
   public void batchSave(List<FrRetRation> list) {
/* 36 */     this.dataService.saveBatch(list);
   }
 
   
   public void toFrRetRation(WmsRmaStatusPushReq entity) {
     try {
/* 42 */       List<FrRetRation> list = entity.toFrRetRation(null);
/* 43 */       if (!CollectionUtils.isEmpty(list)) {
/* 44 */         batchSave(list);
       }
/* 46 */     } catch (Exception e) {
/* 47 */       String errMsg = String.format("返配单[%s]回传处理异常: %s", new Object[] { entity.getOrderCode(), e.getMessage() });
/* 48 */       throw new RuntimeException(errMsg);
     } 
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\fr\impl\FrRetRationServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */