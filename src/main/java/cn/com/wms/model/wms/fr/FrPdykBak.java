/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.fr;
/*     */ @TableName("FR_PDYK_Bak")
/*     */ public class FrPdykBak implements Serializable { private static final long serialVersionUID = -3574456080619242829L; private Integer freshflag;
/*     */   private String sheetid;
/*     */   private String palletZone;
/*     */   private String goodsid;
/*     */   private String venderid;
/*     */   
/*   9 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.fr.FrPdykBak)) return false;  cn.com.wms.model.wms.fr.FrPdykBak other = (cn.com.wms.model.wms.fr.FrPdykBak)o; if (!other.canEqual(this)) return false;  Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag(); if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone(); if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$venderid = getVenderid(), other$venderid = other.getVenderid(); if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;  Object this$lotno = getLotno(), other$lotno = other.getLotno(); if ((this$lotno == null) ? (other$lotno != null) : !this$lotno.equals(other$lotno)) return false;  Object this$difQty = getDifQty(), other$difQty = other.getDifQty(); if ((this$difQty == null) ? (other$difQty != null) : !this$difQty.equals(other$difQty)) return false;  Object this$sdate = getSdate(), other$sdate = other.getSdate(); if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;  Object this$operator = getOperator(), other$operator = other.getOperator(); if ((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator)) return false;  Object this$cost = getCost(), other$cost = other.getCost(); if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost)) return false;  Object this$operateDate = getOperateDate(), other$operateDate = other.getOperateDate(); if ((this$operateDate == null) ? (other$operateDate != null) : !this$operateDate.equals(other$operateDate)) return false;  Object this$wasteType = getWasteType(), other$wasteType = other.getWasteType(); return !((this$wasteType == null) ? (other$wasteType != null) : !this$wasteType.equals(other$wasteType)); } private Integer lotno; private BigDecimal difQty; private Date sdate; private String operator; private BigDecimal cost; private Date operateDate; private Integer wasteType; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.fr.FrPdykBak; } public int hashCode() { int PRIME = 59; result = 1; Object $freshflag = getFreshflag(); result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode()); Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $palletZone = getPalletZone(); result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $venderid = getVenderid(); result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode()); Object $lotno = getLotno(); result = result * 59 + (($lotno == null) ? 43 : $lotno.hashCode()); Object $difQty = getDifQty(); result = result * 59 + (($difQty == null) ? 43 : $difQty.hashCode()); Object $sdate = getSdate(); result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode()); Object $operator = getOperator(); result = result * 59 + (($operator == null) ? 43 : $operator.hashCode()); Object $cost = getCost(); result = result * 59 + (($cost == null) ? 43 : $cost.hashCode()); Object $operateDate = getOperateDate(); result = result * 59 + (($operateDate == null) ? 43 : $operateDate.hashCode()); Object $wasteType = getWasteType(); return result * 59 + (($wasteType == null) ? 43 : $wasteType.hashCode()); } public String toString() { return "FrPdykBak(freshflag=" + getFreshflag() + ", sheetid=" + getSheetid() + ", palletZone=" + getPalletZone() + ", goodsid=" + getGoodsid() + ", venderid=" + getVenderid() + ", lotno=" + getLotno() + ", difQty=" + getDifQty() + ", sdate=" + getSdate() + ", operator=" + getOperator() + ", cost=" + getCost() + ", operateDate=" + getOperateDate() + ", wasteType=" + getWasteType() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  62 */     return this.freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFreshflag(Integer freshflag) {
/*  71 */     this.freshflag = freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSheetid() {
/*  80 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  89 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPalletZone() {
/*  98 */     return this.palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPalletZone(String palletZone) {
/* 107 */     this.palletZone = palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/* 116 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/* 125 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVenderid() {
/* 134 */     return this.venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVenderid(String venderid) {
/* 143 */     this.venderid = venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getLotno() {
/* 152 */     return this.lotno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLotno(Integer lotno) {
/* 161 */     this.lotno = lotno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getDifQty() {
/* 170 */     return this.difQty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDifQty(BigDecimal difQty) {
/* 179 */     this.difQty = difQty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getSdate() {
/* 188 */     return this.sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSdate(Date sdate) {
/* 197 */     this.sdate = sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getOperator() {
/* 206 */     return this.operator;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOperator(String operator) {
/* 215 */     this.operator = operator;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getCost() {
/* 224 */     return this.cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCost(BigDecimal cost) {
/* 233 */     this.cost = cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getOperateDate() {
/* 242 */     return this.operateDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOperateDate(Date operateDate) {
/* 251 */     this.operateDate = operateDate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getWasteType() {
/* 260 */     return this.wasteType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWasteType(Integer wasteType) {
/* 269 */     this.wasteType = wasteType;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrPdykBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */