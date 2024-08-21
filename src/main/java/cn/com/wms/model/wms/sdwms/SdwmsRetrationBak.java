/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDWMS_RetRATION_BAK")
/*     */ public class SdwmsRetrationBak implements Serializable { private static final long serialVersionUID = 3221630600182311969L; private Integer freshflag; private String sheetid; private String customid; private String palletZone; private String shopid;
/*     */   private Integer levelType;
/*     */   private Date sdate;
/*     */   private Integer serialid;
/*     */   private String goodsid;
/*     */   
/*   9 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsRetrationBak)) return false;  cn.com.wms.model.wms.sdwms.SdwmsRetrationBak other = (cn.com.wms.model.wms.sdwms.SdwmsRetrationBak)o; if (!other.canEqual(this)) return false;  Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag(); if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone(); if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone)) return false;  Object this$shopid = getShopid(), other$shopid = other.getShopid(); if ((this$shopid == null) ? (other$shopid != null) : !this$shopid.equals(other$shopid)) return false;  Object this$levelType = getLevelType(), other$levelType = other.getLevelType(); if ((this$levelType == null) ? (other$levelType != null) : !this$levelType.equals(other$levelType)) return false;  Object this$sdate = getSdate(), other$sdate = other.getSdate(); if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;  Object this$serialid = getSerialid(), other$serialid = other.getSerialid(); if ((this$serialid == null) ? (other$serialid != null) : !this$serialid.equals(other$serialid)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$pkcount = getPkcount(), other$pkcount = other.getPkcount(); if ((this$pkcount == null) ? (other$pkcount != null) : !this$pkcount.equals(other$pkcount)) return false;  Object this$planQty = getPlanQty(), other$planQty = other.getPlanQty(); if ((this$planQty == null) ? (other$planQty != null) : !this$planQty.equals(other$planQty)) return false;  Object this$badFlag = getBadFlag(), other$badFlag = other.getBadFlag(); if ((this$badFlag == null) ? (other$badFlag != null) : !this$badFlag.equals(other$badFlag)) return false;  Object this$reasontypeid = getReasontypeid(), other$reasontypeid = other.getReasontypeid(); if ((this$reasontypeid == null) ? (other$reasontypeid != null) : !this$reasontypeid.equals(other$reasontypeid)) return false;  Object this$venderid = getVenderid(), other$venderid = other.getVenderid(); if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;  Object this$cost = getCost(), other$cost = other.getCost(); if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost)) return false;  Object this$notes = getNotes(), other$notes = other.getNotes(); if ((this$notes == null) ? (other$notes != null) : !this$notes.equals(other$notes)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;  Object this$taxRate = getTaxRate(), other$taxRate = other.getTaxRate(); if ((this$taxRate == null) ? (other$taxRate != null) : !this$taxRate.equals(other$taxRate)) return false;  Object this$paytypeid = getPaytypeid(), other$paytypeid = other.getPaytypeid(); if ((this$paytypeid == null) ? (other$paytypeid != null) : !this$paytypeid.equals(other$paytypeid)) return false;  Object this$promFlag = getPromFlag(), other$promFlag = other.getPromFlag(); return !((this$promFlag == null) ? (other$promFlag != null) : !this$promFlag.equals(other$promFlag)); } private BigDecimal pkcount; private BigDecimal planQty; private Integer badFlag; private Integer reasontypeid; private String venderid; private BigDecimal cost; private String notes; private Integer status; private BigDecimal taxRate; private String paytypeid; private Integer promFlag; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsRetrationBak; } public int hashCode() { int PRIME = 59; result = 1; Object $freshflag = getFreshflag(); result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode()); Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $palletZone = getPalletZone(); result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode()); Object $shopid = getShopid(); result = result * 59 + (($shopid == null) ? 43 : $shopid.hashCode()); Object $levelType = getLevelType(); result = result * 59 + (($levelType == null) ? 43 : $levelType.hashCode()); Object $sdate = getSdate(); result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode()); Object $serialid = getSerialid(); result = result * 59 + (($serialid == null) ? 43 : $serialid.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $pkcount = getPkcount(); result = result * 59 + (($pkcount == null) ? 43 : $pkcount.hashCode()); Object $planQty = getPlanQty(); result = result * 59 + (($planQty == null) ? 43 : $planQty.hashCode()); Object $badFlag = getBadFlag(); result = result * 59 + (($badFlag == null) ? 43 : $badFlag.hashCode()); Object $reasontypeid = getReasontypeid(); result = result * 59 + (($reasontypeid == null) ? 43 : $reasontypeid.hashCode()); Object $venderid = getVenderid(); result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode()); Object $cost = getCost(); result = result * 59 + (($cost == null) ? 43 : $cost.hashCode()); Object $notes = getNotes(); result = result * 59 + (($notes == null) ? 43 : $notes.hashCode()); Object $status = getStatus(); result = result * 59 + (($status == null) ? 43 : $status.hashCode()); Object $taxRate = getTaxRate(); result = result * 59 + (($taxRate == null) ? 43 : $taxRate.hashCode()); Object $paytypeid = getPaytypeid(); result = result * 59 + (($paytypeid == null) ? 43 : $paytypeid.hashCode()); Object $promFlag = getPromFlag(); return result * 59 + (($promFlag == null) ? 43 : $promFlag.hashCode()); } public String toString() { return "SdwmsRetrationBak(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", palletZone=" + getPalletZone() + ", shopid=" + getShopid() + ", levelType=" + getLevelType() + ", sdate=" + getSdate() + ", serialid=" + getSerialid() + ", goodsid=" + getGoodsid() + ", pkcount=" + getPkcount() + ", planQty=" + getPlanQty() + ", badFlag=" + getBadFlag() + ", reasontypeid=" + getReasontypeid() + ", venderid=" + getVenderid() + ", cost=" + getCost() + ", notes=" + getNotes() + ", status=" + getStatus() + ", taxRate=" + getTaxRate() + ", paytypeid=" + getPaytypeid() + ", promFlag=" + getPromFlag() + ")"; }
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
/*  86 */     return this.freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFreshflag(Integer freshflag) {
/*  95 */     this.freshflag = freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSheetid() {
/* 104 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/* 113 */     this.sheetid = sheetid;
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
/*     */   public String getShopid() {
/* 158 */     return this.shopid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShopid(String shopid) {
/* 167 */     this.shopid = shopid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getLevelType() {
/* 176 */     return this.levelType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLevelType(Integer levelType) {
/* 185 */     this.levelType = levelType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getSdate() {
/* 194 */     return this.sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSdate(Date sdate) {
/* 203 */     this.sdate = sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSerialid() {
/* 212 */     return this.serialid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSerialid(Integer serialid) {
/* 221 */     this.serialid = serialid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/* 230 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/* 239 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getPkcount() {
/* 248 */     return this.pkcount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPkcount(BigDecimal pkcount) {
/* 257 */     this.pkcount = pkcount;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getPlanQty() {
/* 266 */     return this.planQty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPlanQty(BigDecimal planQty) {
/* 275 */     this.planQty = planQty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getBadFlag() {
/* 284 */     return this.badFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBadFlag(Integer badFlag) {
/* 293 */     this.badFlag = badFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getReasontypeid() {
/* 302 */     return this.reasontypeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReasontypeid(Integer reasontypeid) {
/* 311 */     this.reasontypeid = reasontypeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVenderid() {
/* 320 */     return this.venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVenderid(String venderid) {
/* 329 */     this.venderid = venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getCost() {
/* 338 */     return this.cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCost(BigDecimal cost) {
/* 347 */     this.cost = cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNotes() {
/* 356 */     return this.notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNotes(String notes) {
/* 365 */     this.notes = notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 374 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 383 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getTaxRate() {
/* 392 */     return this.taxRate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTaxRate(BigDecimal taxRate) {
/* 401 */     this.taxRate = taxRate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPaytypeid() {
/* 410 */     return this.paytypeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPaytypeid(String paytypeid) {
/* 419 */     this.paytypeid = paytypeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPromFlag() {
/* 428 */     return this.promFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPromFlag(Integer promFlag) {
/* 437 */     this.promFlag = promFlag;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsRetrationBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */