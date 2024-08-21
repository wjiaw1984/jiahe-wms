/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSoStatusPush.response;
/*    */ 
/*    */ import cn.com.wms.model.bset.ResponseVo;
/*    */ import com.best.javaSdk.wmsSkuInventoryExtQuery.response.Errors;
/*    */ 
/*    */ public class WmsSoStatusPushRsp
/*    */   extends ResponseVo
/*    */ {
/*    */   private Errors errors;
/*    */   
/*    */   public String toString() {
/* 12 */     return "WmsSoStatusPushRsp(errors=" + getErrors() + ")"; } public int hashCode() { int PRIME = 59; result = 1; Object $errors = getErrors(); return result * 59 + (($errors == null) ? 43 : $errors.hashCode()); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsSoStatusPush.response.WmsSoStatusPushRsp; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.response.WmsSoStatusPushRsp)) return false;  com.best.javaSdk.wmsSoStatusPush.response.WmsSoStatusPushRsp other = (com.best.javaSdk.wmsSoStatusPush.response.WmsSoStatusPushRsp)o; if (!other.canEqual(this)) return false;  Object this$errors = getErrors(), other$errors = other.getErrors(); return !((this$errors == null) ? (other$errors != null) : !this$errors.equals(other$errors)); } public void setErrors(Errors errors) { this.errors = errors; }
/*    */    public Errors getErrors() {
/* 14 */     return this.errors;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\response\WmsSoStatusPushRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */