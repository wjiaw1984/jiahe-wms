/*    */ package BOOT-INF.classes.cn.com.wms.service.erp.impl;
/*    */ 
/*    */ import cn.com.wms.model.erp.SheetPrefixstring;
/*    */ import cn.com.wms.mybaits.service.erp.ISheetPrefixstringDataService;
/*    */ import cn.com.wms.service.erp.ISheetPrefixstringService;
/*    */ import com.baomidou.mybatisplus.core.conditions.Wrapper;
/*    */ import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class SheetPrefixstringServiceImpl
/*    */   implements ISheetPrefixstringService
/*    */ {
/*    */   @Autowired
/*    */   private ISheetPrefixstringDataService dataService;
/*    */   
/*    */   public SheetPrefixstring getBySheetType(Integer sheetType) {
/* 22 */     QueryWrapper<SheetPrefixstring> qw = new QueryWrapper();
/* 23 */     qw.eq("sheetType", sheetType);
/* 24 */     return (SheetPrefixstring)this.dataService.getOne((Wrapper)qw);
/*    */   }
/*    */ 
/*    */   
/*    */   public SheetPrefixstring getByFixString(String fixString) {
/* 29 */     QueryWrapper<SheetPrefixstring> qw = new QueryWrapper();
/* 30 */     qw.eq("fixString", fixString);
/* 31 */     return (SheetPrefixstring)this.dataService.getOne((Wrapper)qw);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\erp\impl\SheetPrefixstringServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */