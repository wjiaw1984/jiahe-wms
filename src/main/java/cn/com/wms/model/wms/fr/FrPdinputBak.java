/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.fr;
/*     */ @TableName("FR_PDInPut_BAK")
/*     */ public class FrPdinputBak implements Serializable {
/*     */   private static final long serialVersionUID = 7792606124981482837L;
/*     */   private Integer freshFlag;
/*     */   private String sheetid;
/*     */   private String palletZone;
/*     */   
/*   9 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.fr.FrPdinputBak)) return false;  cn.com.wms.model.wms.fr.FrPdinputBak other = (cn.com.wms.model.wms.fr.FrPdinputBak)o; if (!other.canEqual(this)) return false;  Object this$freshFlag = getFreshFlag(), other$freshFlag = other.getFreshFlag(); if ((this$freshFlag == null) ? (other$freshFlag != null) : !this$freshFlag.equals(other$freshFlag)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$palletZone = getPalletZone(), other$palletZone = other.getPalletZone(); if ((this$palletZone == null) ? (other$palletZone != null) : !this$palletZone.equals(other$palletZone)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$lotno = getLotno(), other$lotno = other.getLotno(); if ((this$lotno == null) ? (other$lotno != null) : !this$lotno.equals(other$lotno)) return false;  Object this$qty = getQty(), other$qty = other.getQty(); if ((this$qty == null) ? (other$qty != null) : !this$qty.equals(other$qty)) return false;  Object this$sdate = getSdate(), other$sdate = other.getSdate(); if ((this$sdate == null) ? (other$sdate != null) : !this$sdate.equals(other$sdate)) return false;  Object this$operator = getOperator(), other$operator = other.getOperator(); return !((this$operator == null) ? (other$operator != null) : !this$operator.equals(other$operator)); } private String goodsid; private Integer lotno; private BigDecimal qty; private Date sdate; private String operator; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.fr.FrPdinputBak; } public int hashCode() { int PRIME = 59; result = 1; Object $freshFlag = getFreshFlag(); result = result * 59 + (($freshFlag == null) ? 43 : $freshFlag.hashCode()); Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $palletZone = getPalletZone(); result = result * 59 + (($palletZone == null) ? 43 : $palletZone.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $lotno = getLotno(); result = result * 59 + (($lotno == null) ? 43 : $lotno.hashCode()); Object $qty = getQty(); result = result * 59 + (($qty == null) ? 43 : $qty.hashCode()); Object $sdate = getSdate(); result = result * 59 + (($sdate == null) ? 43 : $sdate.hashCode()); Object $operator = getOperator(); return result * 59 + (($operator == null) ? 43 : $operator.hashCode()); } public String toString() { return "FrPdinputBak(freshFlag=" + getFreshFlag() + ", sheetid=" + getSheetid() + ", palletZone=" + getPalletZone() + ", goodsid=" + getGoodsid() + ", lotno=" + getLotno() + ", qty=" + getQty() + ", sdate=" + getSdate() + ", operator=" + getOperator() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFreshFlag() {
/*  50 */     return this.freshFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFreshFlag(Integer freshFlag) {
/*  59 */     this.freshFlag = freshFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSheetid() {
/*  68 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  77 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPalletZone() {
/*  86 */     return this.palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPalletZone(String palletZone) {
/*  95 */     this.palletZone = palletZone;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/* 104 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/* 113 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getLotno() {
/* 122 */     return this.lotno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLotno(Integer lotno) {
/* 131 */     this.lotno = lotno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getQty() {
/* 140 */     return this.qty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQty(BigDecimal qty) {
/* 149 */     this.qty = qty;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getSdate() {
/* 158 */     return this.sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSdate(Date sdate) {
/* 167 */     this.sdate = sdate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getOperator() {
/* 176 */     return this.operator;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOperator(String operator) {
/* 185 */     this.operator = operator;
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrPdinputBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */