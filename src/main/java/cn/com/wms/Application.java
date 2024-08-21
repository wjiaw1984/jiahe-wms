package cn.com.wms;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement
@MapperScan(basePackages = {"cn.com.wms.mybaits.dao"})
public class Application
        extends WebMvcConfigurationSupport {
    private static final Logger log = LoggerFactory.getLogger(cn.com.wms.Application.class);


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.warn("WMS接口服务启动成功！");
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\Application.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */