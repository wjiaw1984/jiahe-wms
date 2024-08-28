package cn.com.wms.config;

import cn.com.wms.quartz.CronJob;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.ScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScheduleConfig {
    @Bean
    public JobDetail cronJobDetail() {
        /* 35 */
        return JobBuilder.newJob(CronJob.class).withIdentity("cronJobDetail").storeDurably().build();
    }

    @Bean
    public Trigger cronTrigger() {
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/30 * * * * ?");
        return TriggerBuilder.newTrigger()
                .forJob(cronJobDetail())
                .withIdentity("cronTrigger")
                .withSchedule((ScheduleBuilder) scheduleBuilder)
                .build();
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\config\ScheduleConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */