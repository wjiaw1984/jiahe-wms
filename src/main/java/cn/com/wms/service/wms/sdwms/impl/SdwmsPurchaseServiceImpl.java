 package cn.com.wms.service.wms.sdwms.impl;

 import cn.com.wms.model.wms.sdwms.SdwmsPurchase;
 import cn.com.wms.mybaits.service.sdwms.ISdwmsPurchaseDataService;
 import cn.com.wms.service.wms.sdwms.ISdwmsPurchaseService;
 import com.baomidou.mybatisplus.core.conditions.Wrapper;
 import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
 import java.util.List;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;


 @Service
 public class SdwmsPurchaseServiceImpl
   implements ISdwmsPurchaseService
 {
/* 19 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.service.wms.sdwms.impl.SdwmsPurchaseServiceImpl.class);

   @Autowired
   ISdwmsPurchaseDataService dataService;


   public List<SdwmsPurchase> listBySheetId(String sheetId) {
/* 26 */     QueryWrapper<SdwmsPurchase> qw = new QueryWrapper();
/* 27 */     qw.eq("sheetid", sheetId);
/* 28 */     return this.dataService.list((Wrapper)qw);
   }


   public void toBak(String sheetId) {
/* 33 */     this.dataService.toBak(sheetId);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\sdwms\impl\SdwmsPurchaseServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */