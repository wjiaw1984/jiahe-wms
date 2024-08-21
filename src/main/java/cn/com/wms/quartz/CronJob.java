 package cn.com.wms.quartz;
 
 import cn.com.wms.common.utils.CheckEndDate;
 import cn.com.wms.common.utils.SpringContextHolder;
 import cn.com.wms.service.erp.IInterfaceSheetListService;
 import java.time.LocalDateTime;
 import java.util.Date;
 import org.quartz.DisallowConcurrentExecution;
 import org.quartz.JobExecutionContext;
 import org.quartz.JobExecutionException;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.scheduling.quartz.QuartzJobBean;
 
 
 @DisallowConcurrentExecution
 public class CronJob
   extends QuartzJobBean
 {
/* 20 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.quartz.CronJob.class);
 
 
 
   
   protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
/* 26 */     log.info("执行当前任务开始，时间为：{}", LocalDateTime.now());
     
/* 28 */     IInterfaceSheetListService interfaceSheetListService = (IInterfaceSheetListService)SpringContextHolder.getBean(IInterfaceSheetListService.class);
 
     
     try {
/* 32 */       if (!CheckEndDate.checkEndDate(new Date())) {
/* 33 */         String errMsg = "有效期已过！";
/* 34 */         throw new RuntimeException(errMsg);
       } 
       
       try {
/* 38 */         interfaceSheetListService.sendGoods();
/* 39 */       } catch (Exception e) {
/* 40 */         log.error("推送商品资料发生错误：" + e.getMessage());
       } 
       try {
/* 43 */         interfaceSheetListService.sendPurchase();
/* 44 */       } catch (Exception e) {
/* 45 */         log.error("推送订货单发生错误：" + e.getMessage());
       } 
       try {
/* 48 */         interfaceSheetListService.sendRationNote();
/* 49 */       } catch (Exception e) {
/* 50 */         log.error("推送配送通知单发生错误：" + e.getMessage());
       } 
       try {
/* 53 */         interfaceSheetListService.sendRetRation();
/* 54 */       } catch (Exception e) {
/* 55 */         log.error("推送返配单发生错误：" + e.getMessage());
       } 
       try {
/* 58 */         interfaceSheetListService.sendRet();
/* 59 */       } catch (Exception e) {
/* 60 */         log.error("推送退货发生错误：" + e.getMessage());
       } 
/* 62 */     } catch (Exception e) {
/* 63 */       log.error(e.getMessage());
     } 
     
/* 66 */     log.info("end job...当前时间为：{}", LocalDateTime.now());
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\quartz\CronJob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */