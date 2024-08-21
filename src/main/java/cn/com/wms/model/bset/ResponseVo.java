/*    */ package BOOT-INF.classes.cn.com.wms.model.bset;
/*    */ 
/*    */ import com.best.javaSdk.BaseResponse;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ResponseVo
/*    */   implements BaseResponse
/*    */ {
/*    */   private Boolean result;
/*    */   
/*    */   public String toString() {
/* 15 */     return "ResponseVo(result=" + getResult() + ")"; } public int hashCode() { int PRIME = 59; result = 1; Object $result = getResult(); return result * 59 + (($result == null) ? 43 : $result.hashCode()); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.bset.ResponseVo; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.bset.ResponseVo)) return false;  cn.com.wms.model.bset.ResponseVo other = (cn.com.wms.model.bset.ResponseVo)o; if (!other.canEqual(this)) return false;  Object this$result = getResult(), other$result = other.getResult(); return !((this$result == null) ? (other$result != null) : !this$result.equals(other$result)); } public void setResult(Boolean result) { this.result = result; }
/*    */   
/*    */   public Boolean getResult() {
/* 18 */     return this.result;
/*    */   }
/*    */ 
/*    */   
/*    */   public static cn.com.wms.model.bset.ResponseVo buildSuccess(Object obj) {
/* 23 */     cn.com.wms.model.bset.ResponseVo response = new cn.com.wms.model.bset.ResponseVo();
/* 24 */     response.setResult(Boolean.valueOf(true));
/* 25 */     return response;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ResponseVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */