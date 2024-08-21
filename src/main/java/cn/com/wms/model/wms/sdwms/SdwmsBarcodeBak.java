/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDWMS_BARCODE_BAK")
/*     */ public class SdwmsBarcodeBak implements Serializable { private static final long serialVersionUID = 467719429017153548L; private String sheetid;
/*     */   private String goodsid;
/*     */   private String customid;
/*     */   
/*   7 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsBarcodeBak)) return false;  cn.com.wms.model.wms.sdwms.SdwmsBarcodeBak other = (cn.com.wms.model.wms.sdwms.SdwmsBarcodeBak)o; if (!other.canEqual(this)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$barcodeid = getBarcodeid(), other$barcodeid = other.getBarcodeid(); if ((this$barcodeid == null) ? (other$barcodeid != null) : !this$barcodeid.equals(other$barcodeid)) return false;  Object this$primaryFlag = getPrimaryFlag(), other$primaryFlag = other.getPrimaryFlag(); if ((this$primaryFlag == null) ? (other$primaryFlag != null) : !this$primaryFlag.equals(other$primaryFlag)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;  Object this$supno = getSupno(), other$supno = other.getSupno(); return !((this$supno == null) ? (other$supno != null) : !this$supno.equals(other$supno)); } private String barcodeid; private Integer primaryFlag; private Integer status; private String supno; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsBarcodeBak; } public int hashCode() { int PRIME = 59; result = 1; Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $barcodeid = getBarcodeid(); result = result * 59 + (($barcodeid == null) ? 43 : $barcodeid.hashCode()); Object $primaryFlag = getPrimaryFlag(); result = result * 59 + (($primaryFlag == null) ? 43 : $primaryFlag.hashCode()); Object $status = getStatus(); result = result * 59 + (($status == null) ? 43 : $status.hashCode()); Object $supno = getSupno(); return result * 59 + (($supno == null) ? 43 : $supno.hashCode()); } public String toString() { return "SdwmsBarcodeBak(sheetid=" + getSheetid() + ", goodsid=" + getGoodsid() + ", customid=" + getCustomid() + ", barcodeid=" + getBarcodeid() + ", primaryFlag=" + getPrimaryFlag() + ", status=" + getStatus() + ", supno=" + getSupno() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSheetid() {
/*  45 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  54 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/*  63 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/*  72 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/*  81 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/*  90 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getBarcodeid() {
/*  99 */     return this.barcodeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBarcodeid(String barcodeid) {
/* 108 */     this.barcodeid = barcodeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPrimaryFlag() {
/* 117 */     return this.primaryFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrimaryFlag(Integer primaryFlag) {
/* 126 */     this.primaryFlag = primaryFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 135 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 144 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSupno() {
/* 153 */     return this.supno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupno(String supno) {
/* 162 */     this.supno = supno;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsBarcodeBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */