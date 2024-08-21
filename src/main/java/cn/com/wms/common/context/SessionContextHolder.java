 package cn.com.wms.common.context;

 import cn.com.wms.common.context.SessionContext;

 public class SessionContextHolder
 {
/*  7 */   private static final ThreadLocal<SessionContext> sessionThreadLocal = new InheritableThreadLocal<>();





   public static SessionContext get() {
/* 14 */     return sessionThreadLocal.get();
   }

   public static void put(SessionContext value) {
/* 18 */     sessionThreadLocal.set(value);
   }

   public static void remove() {
/* 22 */     sessionThreadLocal.remove();
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\context\SessionContextHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */