 package cn.com.wms.service.wms.sdwms.impl;

 import cn.com.wms.model.wms.sdwms.SdwmsRet;
 import cn.com.wms.mybaits.service.sdwms.ISdwmsRetDataService;
 import cn.com.wms.service.wms.sdwms.ISdwmsRetService;
 import com.baomidou.mybatisplus.core.conditions.Wrapper;
 import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;





 @Service
 public class SdwmsRetServiceImpl
   implements ISdwmsRetService
 {
   @Autowired
   ISdwmsRetDataService dataService;

   public List<SdwmsRet> listBySheetIds(List<String> sheetIds) {
/* 24 */     QueryWrapper<SdwmsRet> qw = new QueryWrapper();
/* 25 */     qw.in("sheetid", sheetIds);
/* 26 */     return this.dataService.list((Wrapper)qw);
   }


   public List<SdwmsRet> listBySheetId(String sheetId) {
/* 31 */     QueryWrapper<SdwmsRet> qw = new QueryWrapper();
/* 32 */     qw.eq("sheetid", sheetId);
/* 33 */     return this.dataService.list((Wrapper)qw);
   }


   public void toBak(String sheetId) {
/* 38 */     this.dataService.toBak(sheetId);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\sdwms\impl\SdwmsRetServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */