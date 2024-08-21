 package cn.com.wms.service.erp.impl;
 
 import cn.com.wms.mybaits.service.erp.IInterfaceSheetListDataService;
 import cn.com.wms.service.erp.IJobService;
 import cn.com.wms.service.wms.sdwms.ISdwmsGoodsService;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class JobServiceImpl implements IJobService {
   @Autowired
   ISdwmsGoodsService goodsService;
   @Autowired
   IInterfaceSheetListDataService interfaceSheetListDataService;
/* 17 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.service.erp.impl.JobServiceImpl.class); public void setGoodsService(ISdwmsGoodsService goodsService) {
/* 18 */     this.goodsService = goodsService; } public void setInterfaceSheetListDataService(IInterfaceSheetListDataService interfaceSheetListDataService) { this.interfaceSheetListDataService = interfaceSheetListDataService; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.service.erp.impl.JobServiceImpl)) return false;  cn.com.wms.service.erp.impl.JobServiceImpl other = (cn.com.wms.service.erp.impl.JobServiceImpl)o; if (!other.canEqual(this)) return false;  Object this$goodsService = getGoodsService(), other$goodsService = other.getGoodsService(); if ((this$goodsService == null) ? (other$goodsService != null) : !this$goodsService.equals(other$goodsService)) return false;  Object this$interfaceSheetListDataService = getInterfaceSheetListDataService(), other$interfaceSheetListDataService = other.getInterfaceSheetListDataService(); return !((this$interfaceSheetListDataService == null) ? (other$interfaceSheetListDataService != null) : !this$interfaceSheetListDataService.equals(other$interfaceSheetListDataService)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.service.erp.impl.JobServiceImpl; } public int hashCode() { int PRIME = 59; result = 1; Object $goodsService = getGoodsService(); result = result * 59 + (($goodsService == null) ? 43 : $goodsService.hashCode()); Object $interfaceSheetListDataService = getInterfaceSheetListDataService(); return result * 59 + (($interfaceSheetListDataService == null) ? 43 : $interfaceSheetListDataService.hashCode()); } public String toString() { return "JobServiceImpl(goodsService=" + getGoodsService() + ", interfaceSheetListDataService=" + getInterfaceSheetListDataService() + ")"; }
   
   public ISdwmsGoodsService getGoodsService() {
/* 21 */     return this.goodsService;
   }
   public IInterfaceSheetListDataService getInterfaceSheetListDataService() {
/* 24 */     return this.interfaceSheetListDataService;
   }
 
 
 
   
   public void doGoodsJob() {}
 
 
 
   
   public void doRationNoteJob() {}
 
 
 
   
   public void doRetJob() {}
 
 
   
   public void doRetRetrationJob() {}
 
 
   
   public void doPurchaseJob() {}
 
 
   
   public void doAllJob() {
/* 53 */     doGoodsJob();
/* 54 */     doRationNoteJob();
/* 55 */     doRetJob();
/* 56 */     doRetRetrationJob();
/* 57 */     doPurchaseJob();
     
/* 59 */     log.info("执行所有任务完成");
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\erp\impl\JobServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */