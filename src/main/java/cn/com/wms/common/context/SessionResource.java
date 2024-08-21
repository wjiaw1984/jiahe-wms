/*    */ package BOOT-INF.classes.cn.com.wms.common.context;
/*    */ 
/*    */ import java.util.Set;
/*    */ 
/*    */ public class SessionResource {
/*    */   private String type;
/*    */   private Set<String> codes;
/*    */   
/*    */   public void setType(String type) {
/* 10 */     this.type = type; } public void setCodes(Set<String> codes) { this.codes = codes; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.common.context.SessionResource)) return false;  cn.com.wms.common.context.SessionResource other = (cn.com.wms.common.context.SessionResource)o; if (!other.canEqual(this)) return false;  Object this$type = getType(), other$type = other.getType(); if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;  Object<String> this$codes = (Object<String>)getCodes(), other$codes = (Object<String>)other.getCodes(); return !((this$codes == null) ? (other$codes != null) : !this$codes.equals(other$codes)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.common.context.SessionResource; } public int hashCode() { int PRIME = 59; result = 1; Object $type = getType(); result = result * 59 + (($type == null) ? 43 : $type.hashCode()); Object<String> $codes = (Object<String>)getCodes(); return result * 59 + (($codes == null) ? 43 : $codes.hashCode()); } public String toString() { return "SessionResource(type=" + getType() + ", codes=" + getCodes() + ")"; }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getType() {
/* 15 */     return this.type;
/*    */   }
/*    */   
/*    */   public Set<String> getCodes() {
/* 19 */     return this.codes;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\context\SessionResource.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */