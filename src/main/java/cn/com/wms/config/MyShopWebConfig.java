 package cn.com.wms.config;
 
 import cn.com.wms.common.reflect.ComponentInvoker;
 import cn.com.wms.common.reflect.impl.SpringComponentInvoker;
 import cn.com.wms.common.session.SessionContextBuilder;
 import cn.com.wms.common.session.impl.DefaultSessionContextBuilder;
 import cn.com.wms.common.utils.SpringContextHolder;
 import cn.com.wms.common.web.serializer.DefaultResponseSerializer;
 import cn.com.wms.common.web.serializer.ResponseSerializer;
 import cn.com.wms.common.web.support.ExposerFormatAop;
 import javax.annotation.PostConstruct;
 import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 
 
 
 
 
 
 @Configuration
 public class MyShopWebConfig
 {
   @PostConstruct
   public void init() {}
   
   @Bean
   @ConditionalOnMissingBean
   public SessionContextBuilder sessionContextBuilder() {
/* 30 */     return (SessionContextBuilder)new DefaultSessionContextBuilder();
   }
   
   @Bean
   @ConditionalOnMissingBean
   public ExposerFormatAop exposerFormatAop() {
/* 36 */     return new ExposerFormatAop();
   }
   
   @Bean
   @ConditionalOnMissingBean
   public ResponseSerializer responseSerializer() {
/* 42 */     return (ResponseSerializer)new DefaultResponseSerializer();
   }
   
   @ConditionalOnMissingBean
   @Bean
   public ComponentInvoker componentInvoker() {
/* 48 */     return (ComponentInvoker)new SpringComponentInvoker();
   }
   
   @Bean
   public SpringContextHolder springContextHolder() {
/* 53 */     return new SpringContextHolder();
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\config\MyShopWebConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */