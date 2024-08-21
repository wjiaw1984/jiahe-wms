/*    */ package BOOT-INF.classes.cn.com.wms.common.session.impl;
/*    */ 
/*    */ import cn.com.wms.common.context.SessionContext;
/*    */ import cn.com.wms.common.context.impl.SessionContextImpl;
/*    */ import cn.com.wms.common.session.SessionContextBuilder;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DefaultSessionContextBuilder
/*    */   implements SessionContextBuilder
/*    */ {
/*    */   public SessionContext build(String ent_id, String user_id, String user_code, String user_name, String locale, String session, String token, Object... exts) {
/* 13 */     SessionContextImpl sessionContext = new SessionContextImpl();
/* 14 */     sessionContext.setEntId(ent_id);
/* 15 */     sessionContext.setUserId(user_id);
/* 16 */     sessionContext.setUserName(user_name);
/* 17 */     sessionContext.setUserCode(user_code);
/* 18 */     sessionContext.setLocale(locale);
/* 19 */     sessionContext.setSession(session);
/* 20 */     sessionContext.setToken(token);
/*    */     
/* 22 */     return (SessionContext)sessionContext;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\session\impl\DefaultSessionContextBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */