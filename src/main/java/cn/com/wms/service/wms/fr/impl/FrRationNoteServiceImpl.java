 package cn.com.wms.service.wms.fr.impl;
 
 import cn.com.wms.model.wms.fr.FrRationnote;
 import cn.com.wms.mybaits.service.fr.IFrRationnoteDataService;
 import cn.com.wms.service.erp.ISheetPrefixstringService;
 import cn.com.wms.service.wms.fr.IFrRationNoteService;
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
 public class FrRationNoteServiceImpl
   implements IFrRationNoteService
 {
/* 24 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.service.wms.fr.impl.FrRationNoteServiceImpl.class);
 
   
   @Autowired
   IFrRationnoteDataService dataService;
   
   @Autowired
   ISheetPrefixstringService sheetPrefixstringService;
 
   
   public void save(FrRationnote entity) {
/* 35 */     this.dataService.save(entity);
   }
 
   
   public void batchSave(List<FrRationnote> list) {
/* 40 */     this.dataService.saveBatch(list);
   }
 
   
   public void toRationNote(WmsSoStatusPushReq entity) {
     try {
/* 46 */       List<FrRationnote> list = entity.toRationNote(null);
/* 47 */       if (!CollectionUtils.isEmpty(list)) {
/* 48 */         batchSave(list);
       }
/* 50 */     } catch (Exception e) {
/* 51 */       String errMsg = String.format("配送出库单[%s]回传处理异常: %s", new Object[] { entity.getOrderCode(), e.getMessage() });
/* 52 */       throw new RuntimeException(errMsg);
     } 
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\fr\impl\FrRationNoteServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */