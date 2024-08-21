/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDWMS_RationNote_BAK")
/*     */ public class SdwmsRationnoteBak implements Serializable { private static final long serialVersionUID = 1093800486423877182L; private Integer freshflag; private String sheetid; private String refsheetid; private String shopid;
/*     */   private String customid;
/*     */   private String palletZone;
/*     */   private Integer type;
/*     */   private Integer levelType;
/*     */   
/*   9 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsRationnoteBak)) return false;  cn.com.wms.model.wms.sdwms.SdwmsRationnoteBak other = (cn.com.wms.model.wms.sdwms.SdwmsRationnoteBak)o; if (!other.canEqual(this)) return false;  Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag(); if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$refsheetid = getRefsheetid(), other$refsheetid = other.getRefsheetid(); if ((this$refsheetid == null) ? (other$refsheetid != null) : !this$refsheetid.equals(other$refsheetid)) return false;  Object this$shopid = getShopid(), other$shopid = other.getShopid(); if ((this$shopid == null) ? (other$shopid != null) : !this$shopid.equals(other$shopid)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone(); if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone)) return false;  Object this$type = getType(), other$type = other.getType(); if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;  Object this$levelType = getLevelType(), other$levelType = other.getLevelType(); if ((this$levelType == null) ? (other$levelType != null) : !this$levelType.equals(other$levelType)) return false;  Object this$sdate = getSdate(), other$sdate = other.getSdate(); if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;  Object this$serialid = getSerialid(), other$serialid = other.getSerialid(); if ((this$serialid == null) ? (other$serialid != null) : !this$serialid.equals(other$serialid)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$cost = getCost(), other$cost = other.getCost(); if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost)) return false;  Object this$planQty = getPlanQty(), other$planQty = other.getPlanQty(); if ((this$planQty == null) ? (other$planQty != null) : !this$planQty.equals(other$planQty)) return false;  Object this$goodstype = getGoodstype(), other$goodstype = other.getGoodstype(); if ((this$goodstype == null) ? (other$goodstype != null) : !this$goodstype.equals(other$goodstype)) return false;  Object this$notes = getNotes(), other$notes = other.getNotes(); if ((this$notes == null) ? (other$notes != null) : !this$notes.equals(other$notes)) return false;  Object this$badFlag = getBadFlag(), other$badFlag = other.getBadFlag(); if ((this$badFlag == null) ? (other$badFlag != null) : !this$badFlag.equals(other$badFlag)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status)); } private Date sdate; private Integer serialid; private String goodsid; private BigDecimal cost; private BigDecimal planQty; private Integer goodstype; private String notes; private Integer badFlag; private Integer status; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsRationnoteBak; } public int hashCode() { int PRIME = 59; result = 1; Object $freshflag = getFreshflag(); result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode()); Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $refsheetid = getRefsheetid(); result = result * 59 + (($refsheetid == null) ? 43 : $refsheetid.hashCode()); Object $shopid = getShopid(); result = result * 59 + (($shopid == null) ? 43 : $shopid.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $palletZone = getPalletZone(); result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode()); Object $type = getType(); result = result * 59 + (($type == null) ? 43 : $type.hashCode()); Object $levelType = getLevelType(); result = result * 59 + (($levelType == null) ? 43 : $levelType.hashCode()); Object $sdate = getSdate(); result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode()); Object $serialid = getSerialid(); result = result * 59 + (($serialid == null) ? 43 : $serialid.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $cost = getCost(); result = result * 59 + (($cost == null) ? 43 : $cost.hashCode()); Object $planQty = getPlanQty(); result = result * 59 + (($planQty == null) ? 43 : $planQty.hashCode()); Object $goodstype = getGoodstype(); result = result * 59 + (($goodstype == null) ? 43 : $goodstype.hashCode()); Object $notes = getNotes(); result = result * 59 + (($notes == null) ? 43 : $notes.hashCode()); Object $badFlag = getBadFlag(); result = result * 59 + (($badFlag == null) ? 43 : $badFlag.hashCode()); Object $status = getStatus(); return result * 59 + (($status == null) ? 43 : $status.hashCode()); } public String toString() { return "SdwmsRationnoteBak(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", refsheetid=" + getRefsheetid() + ", shopid=" + getShopid() + ", customid=" + getCustomid() + ", palletZone=" + getPalletZone() + ", type=" + getType() + ", levelType=" + getLevelType() + ", sdate=" + getSdate() + ", serialid=" + getSerialid() + ", goodsid=" + getGoodsid() + ", cost=" + getCost() + ", planQty=" + getPlanQty() + ", goodstype=" + getGoodstype() + ", notes=" + getNotes() + ", badFlag=" + getBadFlag() + ", status=" + getStatus() + ")"; }
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
/*     */   public String getRefsheetid() {
/* 113 */     return this.refsheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRefsheetid(String refsheetid) {
/* 122 */     this.refsheetid = refsheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getShopid() {
/* 131 */     return this.shopid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShopid(String shopid) {
/* 140 */     this.shopid = shopid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/* 149 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/* 158 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPalletZone() {
/* 167 */     return this.palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPalletZone(String palletZone) {
/* 176 */     this.palletZone = palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getType() {
/* 185 */     return this.type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setType(Integer type) {
/* 194 */     this.type = type;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getLevelType() {
/* 203 */     return this.levelType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLevelType(Integer levelType) {
/* 212 */     this.levelType = levelType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getSdate() {
/* 221 */     return this.sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSdate(Date sdate) {
/* 230 */     this.sdate = sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSerialid() {
/* 239 */     return this.serialid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSerialid(Integer serialid) {
/* 248 */     this.serialid = serialid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/* 257 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/* 266 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getCost() {
/* 275 */     return this.cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCost(BigDecimal cost) {
/* 284 */     this.cost = cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getPlanQty() {
/* 293 */     return this.planQty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPlanQty(BigDecimal planQty) {
/* 302 */     this.planQty = planQty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getGoodstype() {
/* 311 */     return this.goodstype;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodstype(Integer goodstype) {
/* 320 */     this.goodstype = goodstype;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNotes() {
/* 329 */     return this.notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNotes(String notes) {
/* 338 */     this.notes = notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getBadFlag() {
/* 347 */     return this.badFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBadFlag(Integer badFlag) {
/* 356 */     this.badFlag = badFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 365 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 374 */     this.status = status;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsRationnoteBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */