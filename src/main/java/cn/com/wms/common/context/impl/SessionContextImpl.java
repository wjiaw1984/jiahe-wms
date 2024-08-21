/*    */ package BOOT-INF.classes.cn.com.wms.common.context.impl;
/*    */ 
/*    */ import cn.com.wms.common.context.SessionResource;
/*    */ import java.util.List;
/*    */ 
/*    */ public class SessionContextImpl implements SessionContext {
/*    */   protected String entId;
/*    */   protected String entCode;
/*    */   protected String entName;
/*    */   protected String userId;
/*    */   protected String userCode;
/*    */   
/* 13 */   public void setEntId(String entId) { this.entId = entId; } protected String userName; protected String locale; protected String session; protected String token; protected Object extend; protected List<SessionResource> resources; public void setEntCode(String entCode) { this.entCode = entCode; } public void setEntName(String entName) { this.entName = entName; } public void setUserId(String userId) { this.userId = userId; } public void setUserCode(String userCode) { this.userCode = userCode; } public void setUserName(String userName) { this.userName = userName; } public void setLocale(String locale) { this.locale = locale; } public void setSession(String session) { this.session = session; } public void setToken(String token) { this.token = token; } public void setExtend(Object extend) { this.extend = extend; } public void setResources(List<SessionResource> resources) { this.resources = resources; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.common.context.impl.SessionContextImpl)) return false;  cn.com.wms.common.context.impl.SessionContextImpl other = (cn.com.wms.common.context.impl.SessionContextImpl)o; if (!other.canEqual(this)) return false;  Object this$entId = getEntId(), other$entId = other.getEntId(); if ((this$entId == null) ? (other$entId != null) : !this$entId.equals(other$entId)) return false;  Object this$entCode = getEntCode(), other$entCode = other.getEntCode(); if ((this$entCode == null) ? (other$entCode != null) : !this$entCode.equals(other$entCode)) return false;  Object this$entName = getEntName(), other$entName = other.getEntName(); if ((this$entName == null) ? (other$entName != null) : !this$entName.equals(other$entName)) return false;  Object this$userId = getUserId(), other$userId = other.getUserId(); if ((this$userId == null) ? (other$userId != null) : !this$userId.equals(other$userId)) return false;  Object this$userCode = getUserCode(), other$userCode = other.getUserCode(); if ((this$userCode == null) ? (other$userCode != null) : !this$userCode.equals(other$userCode)) return false;  Object this$userName = getUserName(), other$userName = other.getUserName(); if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName)) return false;  Object this$locale = getLocale(), other$locale = other.getLocale(); if ((this$locale == null) ? (other$locale != null) : !this$locale.equals(other$locale)) return false;  Object this$session = getSession(), other$session = other.getSession(); if ((this$session == null) ? (other$session != null) : !this$session.equals(other$session)) return false;  Object this$token = getToken(), other$token = other.getToken(); if ((this$token == null) ? (other$token != null) : !this$token.equals(other$token)) return false;  Object this$extend = getExtend(), other$extend = other.getExtend(); if ((this$extend == null) ? (other$extend != null) : !this$extend.equals(other$extend)) return false;  Object<SessionResource> this$resources = (Object<SessionResource>)getResources(), other$resources = (Object<SessionResource>)other.getResources(); return !((this$resources == null) ? (other$resources != null) : !this$resources.equals(other$resources)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.common.context.impl.SessionContextImpl; } public int hashCode() { int PRIME = 59; result = 1; Object $entId = getEntId(); result = result * 59 + (($entId == null) ? 43 : $entId.hashCode()); Object $entCode = getEntCode(); result = result * 59 + (($entCode == null) ? 43 : $entCode.hashCode()); Object $entName = getEntName(); result = result * 59 + (($entName == null) ? 43 : $entName.hashCode()); Object $userId = getUserId(); result = result * 59 + (($userId == null) ? 43 : $userId.hashCode()); Object $userCode = getUserCode(); result = result * 59 + (($userCode == null) ? 43 : $userCode.hashCode()); Object $userName = getUserName(); result = result * 59 + (($userName == null) ? 43 : $userName.hashCode()); Object $locale = getLocale(); result = result * 59 + (($locale == null) ? 43 : $locale.hashCode()); Object $session = getSession(); result = result * 59 + (($session == null) ? 43 : $session.hashCode()); Object $token = getToken(); result = result * 59 + (($token == null) ? 43 : $token.hashCode()); Object $extend = getExtend(); result = result * 59 + (($extend == null) ? 43 : $extend.hashCode()); Object<SessionResource> $resources = (Object<SessionResource>)getResources(); return result * 59 + (($resources == null) ? 43 : $resources.hashCode()); } public String toString() { return "SessionContextImpl(entId=" + getEntId() + ", entCode=" + getEntCode() + ", entName=" + getEntName() + ", userId=" + getUserId() + ", userCode=" + getUserCode() + ", userName=" + getUserName() + ", locale=" + getLocale() + ", session=" + getSession() + ", token=" + getToken() + ", extend=" + getExtend() + ", resources=" + getResources() + ")"; }
/*    */   
/* 15 */   public String getEntId() { return this.entId; }
/* 16 */   public String getEntCode() { return this.entCode; }
/* 17 */   public String getEntName() { return this.entName; }
/* 18 */   public String getUserId() { return this.userId; }
/* 19 */   public String getUserCode() { return this.userCode; }
/* 20 */   public String getUserName() { return this.userName; }
/* 21 */   public String getLocale() { return this.locale; }
/* 22 */   public String getSession() { return this.session; }
/* 23 */   public String getToken() { return this.token; } public Object getExtend() {
/* 24 */     return this.extend;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<SessionResource> getResources() {
/* 29 */     return this.resources;
/*    */   }
/*    */   public SessionContextImpl() {
/* 32 */     this.resources = new ArrayList<>();
/*    */   }
/*    */   
/*    */   public SessionContextImpl(String entId, String entCode, String entName, String userId, String userCode, String userName, String locale) {
/* 36 */     this.entId = entId;
/* 37 */     this.entCode = entCode;
/* 38 */     this.entName = entName;
/* 39 */     this.userId = userId;
/* 40 */     this.userCode = userCode;
/* 41 */     this.userName = userName;
/* 42 */     this.locale = locale;
/* 43 */     this.resources = new ArrayList<>();
/*    */   }
/*    */   
/*    */   public SessionContextImpl(String entId, String entCode, String entName, String userId, String userCode, String userName, String session, String token, String locale) {
/* 47 */     this.entId = entId;
/* 48 */     this.entCode = entCode;
/* 49 */     this.entName = entName;
/* 50 */     this.userId = userId;
/* 51 */     this.userCode = userCode;
/* 52 */     this.userName = userName;
/* 53 */     this.token = token;
/* 54 */     this.session = session;
/* 55 */     this.locale = locale;
/* 56 */     this.resources = new ArrayList<>();
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\context\impl\SessionContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */