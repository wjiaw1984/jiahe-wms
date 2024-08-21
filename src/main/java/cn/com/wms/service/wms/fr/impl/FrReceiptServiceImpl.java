 package cn.com.wms.service.wms.fr.impl;

 import cn.com.wms.model.wms.fr.FrReceipt;
 import cn.com.wms.mybaits.service.fr.IFrReceiptDataService;
 import cn.com.wms.service.wms.fr.IFrReceiptService;
 import com.best.javaSdk.wmsAsnStatusPush.request.WmsAnsStatusPushReq;
 import java.util.List;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 import org.springframework.util.CollectionUtils;


 @Service
 @Transactional(timeout = 5000)
 public class FrReceiptServiceImpl
   implements IFrReceiptService
 {
/* 21 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.service.wms.fr.impl.FrReceiptServiceImpl.class);


   @Autowired
   IFrReceiptDataService dataService;


   public void save(FrReceipt entity) {
/* 29 */     this.dataService.save(entity);
   }


   public void batchSave(List<FrReceipt> list) {
/* 34 */     this.dataService.saveBatch(list);
   }


   public void toReceipt(WmsAnsStatusPushReq entity) {
     try {
/* 40 */       List<FrReceipt> list = entity.toFrReceipt(null);
/* 41 */       if (!CollectionUtils.isEmpty(list)) {
/* 42 */         batchSave(list);
       }
/* 44 */     } catch (Exception e) {
/* 45 */       String errMsg = String.format("订货单[%s]回传处理异常: %s", new Object[] { entity.getOrderCode(), e.getMessage() });
/* 46 */       throw new RuntimeException(errMsg);
     }
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\fr\impl\FrReceiptServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */