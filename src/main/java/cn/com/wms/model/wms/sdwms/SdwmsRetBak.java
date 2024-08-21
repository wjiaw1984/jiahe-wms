/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDWMS_RET_BAK")
/*     */ public class SdwmsRetBak implements Serializable { private static final long serialVersionUID = -279373501946793792L; private Integer freshflag; private String sheetid;
/*     */   private Integer sheetType;
/*     */   private String customid;
/*     */   private String palletZone;
/*     */   private String venderid;
/*     */   
/*   9 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsRetBak)) return false;  cn.com.wms.model.wms.sdwms.SdwmsRetBak other = (cn.com.wms.model.wms.sdwms.SdwmsRetBak)o; if (!other.canEqual(this)) return false;  Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag(); if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$sheetType = getSheetType(), other$sheetType = other.getSheetType(); if ((this$sheetType == null) ? (other$sheetType != null) : !this$sheetType.equals(other$sheetType)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone(); if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone)) return false;  Object this$venderid = getVenderid(), other$venderid = other.getVenderid(); if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;  Object this$retdate = getRetdate(), other$retdate = other.getRetdate(); if ((this$retdate == null) ? (other$retdate != null) : !this$retdate.equals(other$retdate)) return false;  Object this$serialid = getSerialid(), other$serialid = other.getSerialid(); if ((this$serialid == null) ? (other$serialid != null) : !this$serialid.equals(other$serialid)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$planqty = getPlanqty(), other$planqty = other.getPlanqty(); if ((this$planqty == null) ? (other$planqty != null) : !this$planqty.equals(other$planqty)) return false;  Object this$badFlag = getBadFlag(), other$badFlag = other.getBadFlag(); if ((this$badFlag == null) ? (other$badFlag != null) : !this$badFlag.equals(other$badFlag)) return false;  Object this$notes = getNotes(), other$notes = other.getNotes(); if ((this$notes == null) ? (other$notes != null) : !this$notes.equals(other$notes)) return false;  Object this$reasontypeid = getReasontypeid(), other$reasontypeid = other.getReasontypeid(); if ((this$reasontypeid == null) ? (other$reasontypeid != null) : !this$reasontypeid.equals(other$reasontypeid)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status)); } private Date retdate; private Integer serialid; private String goodsid; private BigDecimal planqty; private Integer badFlag; private String notes; private Integer reasontypeid; private Integer status; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsRetBak; } public int hashCode() { int PRIME = 59; result = 1; Object $freshflag = getFreshflag(); result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode()); Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $sheetType = getSheetType(); result = result * 59 + (($sheetType == null) ? 43 : $sheetType.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $palletZone = getPalletZone(); result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode()); Object $venderid = getVenderid(); result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode()); Object $retdate = getRetdate(); result = result * 59 + (($retdate == null) ? 43 : $retdate.hashCode()); Object $serialid = getSerialid(); result = result * 59 + (($serialid == null) ? 43 : $serialid.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $planqty = getPlanqty(); result = result * 59 + (($planqty == null) ? 43 : $planqty.hashCode()); Object $badFlag = getBadFlag(); result = result * 59 + (($badFlag == null) ? 43 : $badFlag.hashCode()); Object $notes = getNotes(); result = result * 59 + (($notes == null) ? 43 : $notes.hashCode()); Object $reasontypeid = getReasontypeid(); result = result * 59 + (($reasontypeid == null) ? 43 : $reasontypeid.hashCode()); Object $status = getStatus(); return result * 59 + (($status == null) ? 43 : $status.hashCode()); } public String toString() { return "SdwmsRetBak(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", sheetType=" + getSheetType() + ", customid=" + getCustomid() + ", palletZone=" + getPalletZone() + ", venderid=" + getVenderid() + ", retdate=" + getRetdate() + ", serialid=" + getSerialid() + ", goodsid=" + getGoodsid() + ", planqty=" + getPlanqty() + ", badFlag=" + getBadFlag() + ", notes=" + getNotes() + ", reasontypeid=" + getReasontypeid() + ", status=" + getStatus() + ")"; }
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
/*     */   public Integer getFreshflag() {
/*  68 */     return this.freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFreshflag(Integer freshflag) {
/*  77 */     this.freshflag = freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSheetid() {
/*  86 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  95 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSheetType() {
/* 104 */     return this.sheetType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetType(Integer sheetType) {
/* 113 */     this.sheetType = sheetType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/* 122 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/* 131 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPalletZone() {
/* 140 */     return this.palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPalletZone(String palletZone) {
/* 149 */     this.palletZone = palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVenderid() {
/* 158 */     return this.venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVenderid(String venderid) {
/* 167 */     this.venderid = venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getRetdate() {
/* 176 */     return this.retdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRetdate(Date retdate) {
/* 185 */     this.retdate = retdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSerialid() {
/* 194 */     return this.serialid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSerialid(Integer serialid) {
/* 203 */     this.serialid = serialid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/* 212 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/* 221 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getPlanqty() {
/* 230 */     return this.planqty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPlanqty(BigDecimal planqty) {
/* 239 */     this.planqty = planqty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getBadFlag() {
/* 248 */     return this.badFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBadFlag(Integer badFlag) {
/* 257 */     this.badFlag = badFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNotes() {
/* 266 */     return this.notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNotes(String notes) {
/* 275 */     this.notes = notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getReasontypeid() {
/* 284 */     return this.reasontypeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReasontypeid(Integer reasontypeid) {
/* 293 */     this.reasontypeid = reasontypeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 302 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 311 */     this.status = status;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsRetBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */