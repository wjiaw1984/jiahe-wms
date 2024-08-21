/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDWMS_RET")
/*     */ public class SdwmsRet implements Serializable { private static final long serialVersionUID = 1098571433742535623L; private Integer freshflag; private String sheetid; private Integer sheetType;
/*     */   private String customid;
/*     */   private String palletZone;
/*     */   private String venderid;
/*     */   private Date retdate;
/*     */   private Integer serialid;
/*     */   
/*  10 */   public void setGoodsName(String goodsName) { this.goodsName = goodsName; } private String goodsid; private BigDecimal planqty; private Integer badFlag; private String notes; private Integer reasontypeid; private Integer status; private String goodsName; private String venderName; private String shopId; private String shopName; public void setVenderName(String venderName) { this.venderName = venderName; } public void setShopId(String shopId) { this.shopId = shopId; } public void setShopName(String shopName) { this.shopName = shopName; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsRet)) return false;  cn.com.wms.model.wms.sdwms.SdwmsRet other = (cn.com.wms.model.wms.sdwms.SdwmsRet)o; if (!other.canEqual(this)) return false;  Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag(); if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$sheetType = getSheetType(), other$sheetType = other.getSheetType(); if ((this$sheetType == null) ? (other$sheetType != null) : !this$sheetType.equals(other$sheetType)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone(); if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone)) return false;  Object this$venderid = getVenderid(), other$venderid = other.getVenderid(); if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;  Object this$retdate = getRetdate(), other$retdate = other.getRetdate(); if ((this$retdate == null) ? (other$retdate != null) : !this$retdate.equals(other$retdate)) return false;  Object this$serialid = getSerialid(), other$serialid = other.getSerialid(); if ((this$serialid == null) ? (other$serialid != null) : !this$serialid.equals(other$serialid)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$planqty = getPlanqty(), other$planqty = other.getPlanqty(); if ((this$planqty == null) ? (other$planqty != null) : !this$planqty.equals(other$planqty)) return false;  Object this$badFlag = getBadFlag(), other$badFlag = other.getBadFlag(); if ((this$badFlag == null) ? (other$badFlag != null) : !this$badFlag.equals(other$badFlag)) return false;  Object this$notes = getNotes(), other$notes = other.getNotes(); if ((this$notes == null) ? (other$notes != null) : !this$notes.equals(other$notes)) return false;  Object this$reasontypeid = getReasontypeid(), other$reasontypeid = other.getReasontypeid(); if ((this$reasontypeid == null) ? (other$reasontypeid != null) : !this$reasontypeid.equals(other$reasontypeid)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;  Object this$goodsName = getGoodsName(), other$goodsName = other.getGoodsName(); if ((this$goodsName == null) ? (other$goodsName != null) : !this$goodsName.equals(other$goodsName)) return false;  Object this$venderName = getVenderName(), other$venderName = other.getVenderName(); if ((this$venderName == null) ? (other$venderName != null) : !this$venderName.equals(other$venderName)) return false;  Object this$shopId = getShopId(), other$shopId = other.getShopId(); if ((this$shopId == null) ? (other$shopId != null) : !this$shopId.equals(other$shopId)) return false;  Object this$shopName = getShopName(), other$shopName = other.getShopName(); return !((this$shopName == null) ? (other$shopName != null) : !this$shopName.equals(other$shopName)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsRet; } public int hashCode() { int PRIME = 59; result = 1; Object $freshflag = getFreshflag(); result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode()); Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $sheetType = getSheetType(); result = result * 59 + (($sheetType == null) ? 43 : $sheetType.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $palletZone = getPalletZone(); result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode()); Object $venderid = getVenderid(); result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode()); Object $retdate = getRetdate(); result = result * 59 + (($retdate == null) ? 43 : $retdate.hashCode()); Object $serialid = getSerialid(); result = result * 59 + (($serialid == null) ? 43 : $serialid.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $planqty = getPlanqty(); result = result * 59 + (($planqty == null) ? 43 : $planqty.hashCode()); Object $badFlag = getBadFlag(); result = result * 59 + (($badFlag == null) ? 43 : $badFlag.hashCode()); Object $notes = getNotes(); result = result * 59 + (($notes == null) ? 43 : $notes.hashCode()); Object $reasontypeid = getReasontypeid(); result = result * 59 + (($reasontypeid == null) ? 43 : $reasontypeid.hashCode()); Object $status = getStatus(); result = result * 59 + (($status == null) ? 43 : $status.hashCode()); Object $goodsName = getGoodsName(); result = result * 59 + (($goodsName == null) ? 43 : $goodsName.hashCode()); Object $venderName = getVenderName(); result = result * 59 + (($venderName == null) ? 43 : $venderName.hashCode()); Object $shopId = getShopId(); result = result * 59 + (($shopId == null) ? 43 : $shopId.hashCode()); Object $shopName = getShopName(); return result * 59 + (($shopName == null) ? 43 : $shopName.hashCode()); } public String toString() { return "SdwmsRet(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", sheetType=" + getSheetType() + ", customid=" + getCustomid() + ", palletZone=" + getPalletZone() + ", venderid=" + getVenderid() + ", retdate=" + getRetdate() + ", serialid=" + getSerialid() + ", goodsid=" + getGoodsid() + ", planqty=" + getPlanqty() + ", badFlag=" + getBadFlag() + ", notes=" + getNotes() + ", reasontypeid=" + getReasontypeid() + ", status=" + getStatus() + ", goodsName=" + getGoodsName() + ", venderName=" + getVenderName() + ", shopId=" + getShopId() + ", shopName=" + getShopName() + ")"; }
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
/*     */   public String getGoodsName() {
/*  59 */     return this.goodsName;
/*     */   } public String getVenderName() {
/*  61 */     return this.venderName;
/*     */   } public String getShopId() {
/*  63 */     return this.shopId;
/*     */   } public String getShopName() {
/*  65 */     return this.shopName;
/*     */   }
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
/*  77 */     return this.freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFreshflag(Integer freshflag) {
/*  86 */     this.freshflag = freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSheetid() {
/*  95 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/* 104 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSheetType() {
/* 113 */     return this.sheetType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetType(Integer sheetType) {
/* 122 */     this.sheetType = sheetType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/* 131 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/* 140 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPalletZone() {
/* 149 */     return this.palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPalletZone(String palletZone) {
/* 158 */     this.palletZone = palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVenderid() {
/* 167 */     return this.venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVenderid(String venderid) {
/* 176 */     this.venderid = venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getRetdate() {
/* 185 */     return this.retdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRetdate(Date retdate) {
/* 194 */     this.retdate = retdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSerialid() {
/* 203 */     return this.serialid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSerialid(Integer serialid) {
/* 212 */     this.serialid = serialid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/* 221 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/* 230 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getPlanqty() {
/* 239 */     return this.planqty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPlanqty(BigDecimal planqty) {
/* 248 */     this.planqty = planqty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getBadFlag() {
/* 257 */     return this.badFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBadFlag(Integer badFlag) {
/* 266 */     this.badFlag = badFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNotes() {
/* 275 */     return this.notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNotes(String notes) {
/* 284 */     this.notes = notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getReasontypeid() {
/* 293 */     return this.reasontypeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReasontypeid(Integer reasontypeid) {
/* 302 */     this.reasontypeid = reasontypeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 311 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 320 */     this.status = status;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getWmsSheetId() {
/* 325 */     return this.sheetid.trim();
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsRet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */