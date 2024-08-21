/*    */ package BOOT-INF.classes.cn.com.wms.config;
/*    */ 
/*    */ import cn.com.wms.interceptor.MyInterceptor;
/*    */ import org.springframework.web.servlet.HandlerInterceptor;
/*    */ import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
/*    */ import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InterceptorConfig
/*    */   implements WebMvcConfigurer
/*    */ {
/*    */   public MyInterceptor selfInterceptor() {
/* 20 */     return new MyInterceptor();
/*    */   }
/*    */ 
/*    */   
/*    */   public void addInterceptors(InterceptorRegistry registry) {
/* 25 */     registry.addInterceptor((HandlerInterceptor)selfInterceptor()).addPathPatterns(new String[] { "/**" });
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\config\InterceptorConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */