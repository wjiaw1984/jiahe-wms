/*    */ package BOOT-INF.classes.cn.com.wms.common.web.support;
/*    */ 
/*    */ import cn.com.wms.common.web.annotation.ExposerFormat;
/*    */ import cn.com.wms.common.web.support.ExposerContext;
/*    */ import cn.com.wms.common.web.support.ExposerContextHolder;
/*    */ import org.aspectj.lang.JoinPoint;
/*    */ import org.aspectj.lang.annotation.After;
/*    */ import org.aspectj.lang.annotation.Aspect;
/*    */ import org.aspectj.lang.annotation.Before;
/*    */ import org.aspectj.lang.annotation.Pointcut;
/*    */ import org.aspectj.lang.reflect.MethodSignature;
/*    */ import org.springframework.core.annotation.Order;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Aspect
/*    */ @Component
/*    */ @Order(0)
/*    */ public class ExposerFormatAop
/*    */ {
/*    */   @Pointcut("@annotation(cn.com.wms.common.web.annotation.ExposerFormat)")
/*    */   public void exposerFormatHandle() {}
/*    */   
/*    */   @Before("exposerFormatHandle()")
/*    */   public void doBefore(JoinPoint joinPoint) {
/* 25 */     ExposerFormat exposerFormat = ((MethodSignature)joinPoint.getSignature()).getMethod().<ExposerFormat>getAnnotation(ExposerFormat.class);
/*    */     
/* 27 */     ExposerContext context = new ExposerContext();
/* 28 */     context.setDateFormat(exposerFormat.dateFormat());
/*    */     
/* 30 */     ExposerContextHolder.put(context);
/*    */   }
/*    */   
/*    */   @After("exposerFormatHandle()")
/*    */   public void doAfter() {}
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\web\support\ExposerFormatAop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */