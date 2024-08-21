/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDWMS_PD")
/*     */ public class SdwmsPd implements Serializable { private static final long serialVersionUID = 6834775350628619164L;
/*     */   private String sheetid;
/*     */   private String customid;
/*     */   private String palletZone;
/*     */   
/*   8 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsPd)) return false;  cn.com.wms.model.wms.sdwms.SdwmsPd other = (cn.com.wms.model.wms.sdwms.SdwmsPd)o; if (!other.canEqual(this)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone(); if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone)) return false;  Object this$pdtype = getPdtype(), other$pdtype = other.getPdtype(); if ((this$pdtype == null) ? (other$pdtype != null) : !this$pdtype.equals(other$pdtype)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$sdate = getSdate(), other$sdate = other.getSdate(); if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status)); } private Integer pdtype; private String goodsid; private Date sdate; private Integer status; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsPd; } public int hashCode() { int PRIME = 59; result = 1; Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $palletZone = getPalletZone(); result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode()); Object $pdtype = getPdtype(); result = result * 59 + (($pdtype == null) ? 43 : $pdtype.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $sdate = getSdate(); result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode()); Object $status = getStatus(); return result * 59 + (($status == null) ? 43 : $status.hashCode()); } public String toString() { return "SdwmsPd(sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", palletZone=" + getPalletZone() + ", pdtype=" + getPdtype() + ", goodsid=" + getGoodsid() + ", sdate=" + getSdate() + ", status=" + getStatus() + ")"; }
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
/*  46 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  55 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/*  64 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/*  73 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPalletZone() {
/*  82 */     return this.palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPalletZone(String palletZone) {
/*  91 */     this.palletZone = palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPdtype() {
/* 100 */     return this.pdtype;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPdtype(Integer pdtype) {
/* 109 */     this.pdtype = pdtype;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/* 118 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/* 127 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getSdate() {
/* 136 */     return this.sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSdate(Date sdate) {
/* 145 */     this.sdate = sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 154 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 163 */     this.status = status;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsPd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */