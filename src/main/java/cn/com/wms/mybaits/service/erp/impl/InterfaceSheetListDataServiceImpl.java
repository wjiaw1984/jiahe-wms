/*    */ package BOOT-INF.classes.cn.com.wms.mybaits.service.erp.impl;
/*    */ import cn.com.wms.model.erp.InterfaceSheetList;
/*    */ import cn.com.wms.mybaits.service.erp.IInterfaceSheetListDataService;
/*    */ import com.baomidou.mybatisplus.core.conditions.Wrapper;
/*    */ import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
/*    */ import com.baomidou.mybatisplus.core.metadata.IPage;
/*    */ import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
/*    */ import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
/*    */ import java.util.List;
/*    */ import java.util.stream.Collectors;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component
/*    */ public class InterfaceSheetListDataServiceImpl extends ServiceImpl<IInterfaceSheetListDao, InterfaceSheetList> implements IInterfaceSheetListDataService {
/* 17 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.mybaits.service.erp.impl.InterfaceSheetListDataServiceImpl.class);
/*    */ 
/*    */   
/*    */   public List<InterfaceSheetList> listByExecuteFlag(Integer executeFlag) {
/* 21 */     QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
/* 22 */     qw.eq("executeFlag", executeFlag);
/* 23 */     return list((Wrapper)qw);
/*    */   }
/*    */ 
/*    */   
/*    */   public List<InterfaceSheetList> listBySheetTypeAndExecuteFlag(Integer sheetType, Integer executeFlag) {
/* 28 */     QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
/* 29 */     ((QueryWrapper)qw.eq("sheetType", sheetType)).eq("executeFlag", executeFlag);
/* 30 */     Page<InterfaceSheetList> page = new Page(1L, 500L);
/* 31 */     IPage<InterfaceSheetList> iPage = page((IPage)page, (Wrapper)qw);
/* 32 */     return iPage.getRecords();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<InterfaceSheetList> listGoods() {
/* 38 */     return listBySheetTypeAndExecuteFlag(Integer.valueOf(1001), Integer.valueOf(1));
/*    */   }
/*    */ 
/*    */   
/*    */   public List<String> listSheetRationNoteJob() {
/* 43 */     QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
/* 44 */     ((QueryWrapper)((QueryWrapper)qw.select((Object[])new String[] { "distinct sheetid" })).eq("executeFlag", Integer.valueOf(1))).in("sheetType", new Object[] { Integer.valueOf(2330), Integer.valueOf(2331), Integer.valueOf(2342) });
/* 45 */     return (List<String>)list((Wrapper)qw).stream().map(InterfaceSheetList::getSheetid).collect(Collectors.toList());
/*    */   }
/*    */ 
/*    */   
/*    */   public List<InterfaceSheetList> listRetRationJob() {
/* 50 */     QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
/* 51 */     ((QueryWrapper)qw.eq("executeFlag", Integer.valueOf(1))).in("sheetType", new Object[] { Integer.valueOf(2332), Integer.valueOf(2344) });
/* 52 */     return list((Wrapper)qw);
/*    */   }
/*    */ 
/*    */   
/*    */   public List<InterfaceSheetList> listRetJob() {
/* 57 */     return listBySheetTypeAndExecuteFlag(Integer.valueOf(2323), Integer.valueOf(1));
/*    */   }
/*    */ 
/*    */   
/*    */   public List<InterfaceSheetList> listPurchaseJob() {
/* 62 */     return listBySheetTypeAndExecuteFlag(Integer.valueOf(2301), Integer.valueOf(1));
/*    */   }
/*    */ 
/*    */   
/*    */   public List<String> listSheetBySheetTypeAndExecuteFlag(Integer sheetType, Integer executeFlag) {
/* 67 */     QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
/* 68 */     ((QueryWrapper)((QueryWrapper)qw.select((Object[])new String[] { "distinct sheetid" })).eq("executeFlag", Integer.valueOf(1))).eq("sheetType", sheetType);
/* 69 */     List<String> result = (List<String>)list((Wrapper)qw).stream().map(InterfaceSheetList::getSheetid).collect(Collectors.toList());
/* 70 */     return result;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<InterfaceSheetList> listRationNoteJob() {
/* 75 */     QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
/* 76 */     ((QueryWrapper)qw.eq("executeFlag", Integer.valueOf(1))).in("sheetType", new Object[] { Integer.valueOf(2330), Integer.valueOf(2331), Integer.valueOf(2342) });
/* 77 */     return list((Wrapper)qw);
/*    */   }
/*    */ 
/*    */   
/*    */   public void updateExecuteFlag(String sheetId, Integer sheetType, Integer executeFlag) {
/* 82 */     QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
/* 83 */     ((QueryWrapper)qw.eq("sheetType", sheetType)).eq("sheetId", sheetId);
/* 84 */     InterfaceSheetList entity = new InterfaceSheetList();
/* 85 */     entity.setExecuteFlag(executeFlag);
/* 86 */     update(entity, (Wrapper)qw);
/*    */   }
/*    */ 
/*    */   
/*    */   public void updateExecuteFlag(List<String> sheetIds, Integer sheetType, Integer executeFlag) {
/* 91 */     QueryWrapper<InterfaceSheetList> qw = new QueryWrapper();
/* 92 */     ((QueryWrapper)qw.eq("sheetType", sheetType)).in("sheetId", sheetIds);
/* 93 */     InterfaceSheetList entity = new InterfaceSheetList();
/* 94 */     entity.setExecuteFlag(executeFlag);
/* 95 */     update(entity, (Wrapper)qw);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\erp\impl\InterfaceSheetListDataServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */