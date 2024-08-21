/*    */ package BOOT-INF.classes.cn.com.wms.mybaits.service.sdwms.impl;
/*    */ import cn.com.wms.model.wms.sdwms.SdwmsRationnote;
/*    */ import cn.com.wms.mybaits.dao.wms.sdwms.ISdwmsRationnoteDao;
/*    */ import cn.com.wms.mybaits.service.sdwms.ISdwmsRationnoteDataService;
/*    */ import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*    */ import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
/*    */ import java.util.List;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component
/*    */ public class SdwmsRationnoteDataServiceImpl extends ServiceImpl<ISdwmsRationnoteDao, SdwmsRationnote> implements ISdwmsRationnoteDataService {
/* 14 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.mybaits.service.sdwms.impl.SdwmsRationnoteDataServiceImpl.class);
/*    */ 
/*    */   
/*    */   public List<String> listAllSheet() {
/* 18 */     QueryWrapper<SdwmsRationnote> qw = new QueryWrapper();
/* 19 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void toBak(String sheetId) {
/* 24 */     ((ISdwmsRationnoteDao)this.baseMapper).toBak(sheetId);
/* 25 */     ((ISdwmsRationnoteDao)this.baseMapper).deleteBySheetId(sheetId);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\sdwms\impl\SdwmsRationnoteDataServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */