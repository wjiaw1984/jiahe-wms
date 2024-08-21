 package cn.com.wms.quartz;

 import java.time.LocalDateTime;
 import org.quartz.JobExecutionContext;
 import org.quartz.JobExecutionException;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.scheduling.quartz.QuartzJobBean;

 public class SimpleJob
   extends QuartzJobBean
 {
/* 13 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.quartz.SimpleJob.class);



   protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
/* 18 */     log.info("start job...当前时间为：{}", LocalDateTime.now());
     try {
/* 20 */       Thread.sleep(3000L);
/* 21 */       log.info(context.getScheduler().getSchedulerInstanceId());
/* 22 */       log.info("task name is {}", context.getJobDetail().getKey().getName());
/* 23 */     } catch (Exception e) {
/* 24 */       e.printStackTrace();
     }
/* 26 */     log.info("end job...当前时间为：{}", LocalDateTime.now());
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\quartz\SimpleJob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */