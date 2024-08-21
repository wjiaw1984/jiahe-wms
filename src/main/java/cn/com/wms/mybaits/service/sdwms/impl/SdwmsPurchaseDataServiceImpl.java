 package cn.com.wms.mybaits.service.sdwms.impl;
 
 import cn.com.wms.model.wms.sdwms.SdwmsPurchase;
 import cn.com.wms.mybaits.dao.wms.sdwms.ISdwmsPurchaseDao;
 import cn.com.wms.mybaits.service.sdwms.ISdwmsPurchaseDataService;
 import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Component;
 
 @Component
 public class SdwmsPurchaseDataServiceImpl
   extends ServiceImpl<ISdwmsPurchaseDao, SdwmsPurchase> implements ISdwmsPurchaseDataService {
/* 14 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.mybaits.service.sdwms.impl.SdwmsPurchaseDataServiceImpl.class);
 
 
   
   public void toBak(String sheetId) {
/* 19 */     ((ISdwmsPurchaseDao)this.baseMapper).toBak(sheetId);
/* 20 */     ((ISdwmsPurchaseDao)this.baseMapper).deleteBySheetId(sheetId);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\sdwms\impl\SdwmsPurchaseDataServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */