/*    */ package BOOT-INF.classes.cn.com.wms.common.web.support;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import org.slf4j.Logger;
/*    */ import org.slf4j.LoggerFactory;
/*    */ import org.springframework.util.StringUtils;
/*    */ 
/*    */ public class BaseResponse
/*    */   implements Serializable
/*    */ {
/*    */   public void setReturncode(String returncode) {
/* 12 */     this.returncode = returncode; } public void setData(Object data) { this.data = data; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.common.web.support.BaseResponse)) return false;  cn.com.wms.common.web.support.BaseResponse other = (cn.com.wms.common.web.support.BaseResponse)o; if (!other.canEqual(this)) return false;  Object this$returncode = getReturncode(), other$returncode = other.getReturncode(); if ((this$returncode == null) ? (other$returncode != null) : !this$returncode.equals(other$returncode)) return false;  Object this$data = getData(), other$data = other.getData(); return !((this$data == null) ? (other$data != null) : !this$data.equals(other$data)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.common.web.support.BaseResponse; } public int hashCode() { int PRIME = 59; result = 1; Object $returncode = getReturncode(); result = result * 59 + (($returncode == null) ? 43 : $returncode.hashCode()); Object $data = getData(); return result * 59 + (($data == null) ? 43 : $data.hashCode()); } public String toString() { return "BaseResponse(returncode=" + getReturncode() + ", data=" + getData() + ")"; }
/* 13 */    private static final Logger log = LoggerFactory.getLogger(cn.com.wms.common.web.support.BaseResponse.class);
/*    */   
/* 15 */   public static String SUCCSS_MSG = "成功";
/* 16 */   public static String FAIL_MSG = "失败";
/*    */   private String returncode; private Object data;
/* 18 */   public String getReturncode() { return this.returncode; } public Object getData() {
/* 19 */     return this.data;
/*    */   }
/*    */   
/*    */   public static cn.com.wms.common.web.support.BaseResponse buildSuccess(Object obj) {
/* 23 */     cn.com.wms.common.web.support.BaseResponse response = new cn.com.wms.common.web.support.BaseResponse();
/* 24 */     response.setReturncode("0");
/* 25 */     response.setData(obj);
/* 26 */     return response;
/*    */   }
/*    */ 
/*    */   
/*    */   public static cn.com.wms.common.web.support.BaseResponse buildFailure(String returncode) {
/* 31 */     return buildFailure(returncode, null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static cn.com.wms.common.web.support.BaseResponse buildFailure(String returncode, String msg) {
/* 48 */     cn.com.wms.common.web.support.BaseResponse response = new cn.com.wms.common.web.support.BaseResponse();
/* 49 */     response.setReturncode(returncode);
/* 50 */     response.setData(StringUtils.hasText(msg) ? msg : FAIL_MSG);
/* 51 */     return response;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\web\support\BaseResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */