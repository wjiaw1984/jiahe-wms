 package cn.com.wms.mybaits.service.sdwms.impl;
 
 import cn.com.wms.model.wms.sdwms.SdwmsRet;
 import cn.com.wms.mybaits.dao.wms.sdwms.ISdwmsRetDao;
 import cn.com.wms.mybaits.service.sdwms.ISdwmsRetDataService;
 import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Component;
 
 @Component
 public class SdwmsRetDataServiceImpl
   extends ServiceImpl<ISdwmsRetDao, SdwmsRet> implements ISdwmsRetDataService {
/* 14 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.mybaits.service.sdwms.impl.SdwmsRetDataServiceImpl.class);
 
 
   
   public void toBak(String sheetId) {
/* 19 */     ((ISdwmsRetDao)this.baseMapper).toBak(sheetId);
/* 20 */     ((ISdwmsRetDao)this.baseMapper).deleteBySheetId(sheetId);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\sdwms\impl\SdwmsRetDataServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */