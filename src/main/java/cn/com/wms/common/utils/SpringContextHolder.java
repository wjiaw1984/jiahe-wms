/*    */ package BOOT-INF.classes.cn.com.wms.common.utils;
/*    */ 
/*    */ import java.util.Map;
/*    */ import org.springframework.context.ApplicationContext;
/*    */ import org.springframework.context.ApplicationContextAware;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SpringContextHolder
/*    */   implements ApplicationContextAware
/*    */ {
/*    */   private static ApplicationContext applicationContext;
/*    */   
/*    */   public void setApplicationContext(ApplicationContext applicationContext) {
/* 20 */     cn.com.wms.common.utils.SpringContextHolder.applicationContext = applicationContext;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ApplicationContext getApplicationContext() {
/* 28 */     checkApplicationContext();
/* 29 */     return applicationContext;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static <T> T getBean(String name) {
/* 40 */     checkApplicationContext();
/* 41 */     return (T)applicationContext.getBean(name);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static <T> T getBean(Class<T> clazz) {
/* 50 */     checkApplicationContext();
/*    */     
/* 52 */     Map beanMaps = applicationContext.getBeansOfType(clazz);
/* 53 */     if (beanMaps != null && !beanMaps.isEmpty()) {
/* 54 */       return beanMaps.values().iterator().next();
/*    */     }
/* 56 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   private static void checkApplicationContext() {
/* 61 */     if (applicationContext == null)
/* 62 */       throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义SpringContextHolder"); 
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\commo\\utils\SpringContextHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */