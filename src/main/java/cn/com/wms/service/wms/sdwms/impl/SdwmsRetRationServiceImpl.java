/*    */ package BOOT-INF.classes.cn.com.wms.service.wms.sdwms.impl;
/*    */ 
/*    */ import cn.com.wms.model.wms.sdwms.SdwmsRetration;
/*    */ import cn.com.wms.mybaits.service.sdwms.ISdwmsRetrationDataService;
/*    */ import cn.com.wms.service.wms.sdwms.ISdwmsRetRationService;
/*    */ import com.baomidou.mybatisplus.core.conditions.Wrapper;
/*    */ import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*    */ import java.util.List;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class SdwmsRetRationServiceImpl
/*    */   implements ISdwmsRetRationService
/*    */ {
/* 21 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.service.wms.sdwms.impl.SdwmsRetRationServiceImpl.class);
/*    */   
/*    */   @Autowired
/*    */   ISdwmsRetrationDataService dataService;
/*    */ 
/*    */   
/*    */   public List<SdwmsRetration> listBySheetId(String sheetId) {
/* 28 */     QueryWrapper<SdwmsRetration> qw = new QueryWrapper();
/* 29 */     qw.eq("sheetid", sheetId);
/* 30 */     return this.dataService.list((Wrapper)qw);
/*    */   }
/*    */ 
/*    */   
/*    */   public void toBak(String sheetId) {
/* 35 */     this.dataService.toBak(sheetId);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\sdwms\impl\SdwmsRetRationServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */