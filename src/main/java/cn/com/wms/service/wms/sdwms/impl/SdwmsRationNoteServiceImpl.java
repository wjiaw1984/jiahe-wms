 package cn.com.wms.service.wms.sdwms.impl;
 
 import cn.com.wms.model.wms.sdwms.SdwmsRationnote;
 import cn.com.wms.mybaits.service.sdwms.ISdwmsRationnoteDataService;
 import cn.com.wms.service.wms.sdwms.ISdwmsRationNoteService;
 import com.baomidou.mybatisplus.core.conditions.Wrapper;
 import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 
 @Service
 public class SdwmsRationNoteServiceImpl
   implements ISdwmsRationNoteService
 {
   @Autowired
   ISdwmsRationnoteDataService sdwmsRationnoteDataService;
   
   public List<SdwmsRationnote> listBySheetId(String sheetId) {
/* 26 */     QueryWrapper<SdwmsRationnote> qw = new QueryWrapper();
/* 27 */     qw.eq("sheetid", sheetId);
/* 28 */     return this.sdwmsRationnoteDataService.list((Wrapper)qw);
   }
 
   
   public void toBak(String sheetId) {
/* 33 */     this.sdwmsRationnoteDataService.toBak(sheetId);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\sdwms\impl\SdwmsRationNoteServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */