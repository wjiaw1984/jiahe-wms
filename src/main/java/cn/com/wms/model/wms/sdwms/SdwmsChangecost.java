/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDwms_ChangeCost")
/*     */ public class SdwmsChangecost implements Serializable { private static final long serialVersionUID = 8361279616692067165L; private Integer freshflag;
/*     */   private String sheetid;
/*     */   private String customid;
/*     */   private String palletZone;
/*     */   private String goodsid;
/*     */   
/*   9 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsChangecost)) return false;  cn.com.wms.model.wms.sdwms.SdwmsChangecost other = (cn.com.wms.model.wms.sdwms.SdwmsChangecost)o; if (!other.canEqual(this)) return false;  Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag(); if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone(); if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$venderid = getVenderid(), other$venderid = other.getVenderid(); if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;  Object this$lotno = getLotno(), other$lotno = other.getLotno(); if ((this$lotno == null) ? (other$lotno != null) : !this$lotno.equals(other$lotno)) return false;  Object this$cost = getCost(), other$cost = other.getCost(); if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost)) return false;  Object this$notes = getNotes(), other$notes = other.getNotes(); if ((this$notes == null) ? (other$notes != null) : !this$notes.equals(other$notes)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;  Object this$operateDate = getOperateDate(), other$operateDate = other.getOperateDate(); return !((this$operateDate == null) ? (other$operateDate != null) : !this$operateDate.equals(other$operateDate)); } private String venderid; private Integer lotno; private BigDecimal cost; private String notes; private Integer status; private Date operateDate; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsChangecost; } public int hashCode() { int PRIME = 59; result = 1; Object $freshflag = getFreshflag(); result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode()); Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $palletZone = getPalletZone(); result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $venderid = getVenderid(); result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode()); Object $lotno = getLotno(); result = result * 59 + (($lotno == null) ? 43 : $lotno.hashCode()); Object $cost = getCost(); result = result * 59 + (($cost == null) ? 43 : $cost.hashCode()); Object $notes = getNotes(); result = result * 59 + (($notes == null) ? 43 : $notes.hashCode()); Object $status = getStatus(); result = result * 59 + (($status == null) ? 43 : $status.hashCode()); Object $operateDate = getOperateDate(); return result * 59 + (($operateDate == null) ? 43 : $operateDate.hashCode()); } public String toString() { return "SdwmsChangecost(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", palletZone=" + getPalletZone() + ", goodsid=" + getGoodsid() + ", venderid=" + getVenderid() + ", lotno=" + getLotno() + ", cost=" + getCost() + ", notes=" + getNotes() + ", status=" + getStatus() + ", operateDate=" + getOperateDate() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  59 */     return this.freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFreshflag(Integer freshflag) {
/*  68 */     this.freshflag = freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSheetid() {
/*  77 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  86 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/*  95 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/* 104 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPalletZone() {
/* 113 */     return this.palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPalletZone(String palletZone) {
/* 122 */     this.palletZone = palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/* 131 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/* 140 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVenderid() {
/* 149 */     return this.venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVenderid(String venderid) {
/* 158 */     this.venderid = venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getLotno() {
/* 167 */     return this.lotno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLotno(Integer lotno) {
/* 176 */     this.lotno = lotno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getCost() {
/* 185 */     return this.cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCost(BigDecimal cost) {
/* 194 */     this.cost = cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNotes() {
/* 203 */     return this.notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNotes(String notes) {
/* 212 */     this.notes = notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 221 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 230 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getOperateDate() {
/* 239 */     return this.operateDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOperateDate(Date operateDate) {
/* 248 */     this.operateDate = operateDate;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsChangecost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */