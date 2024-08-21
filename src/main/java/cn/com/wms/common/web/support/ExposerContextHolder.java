/*    */ package BOOT-INF.classes.cn.com.wms.common.web.support;
/*    */ 
/*    */ import cn.com.wms.common.web.support.ExposerContext;
/*    */ 
/*    */ public class ExposerContextHolder
/*    */ {
/*  7 */   private static final ThreadLocal<ExposerContext> threadLocal = new InheritableThreadLocal<>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ExposerContext get() {
/* 14 */     return threadLocal.get();
/*    */   }
/*    */   
/*    */   public static void put(ExposerContext value) {
/* 18 */     threadLocal.set(value);
/*    */   }
/*    */   
/*    */   public static void remove() {
/* 22 */     if (get() != null)
/* 23 */       threadLocal.remove(); 
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\web\support\ExposerContextHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */