/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDwms_Purchase_Price")
/*     */ public class SdwmsPurchasePrice implements Serializable { private static final long serialVersionUID = -5993431017401973926L; private String sheetid;
/*     */   private String customid;
/*     */   private String goodsid;
/*     */   private String venderid;
/*     */   
/*   8 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsPurchasePrice)) return false;  cn.com.wms.model.wms.sdwms.SdwmsPurchasePrice other = (cn.com.wms.model.wms.sdwms.SdwmsPurchasePrice)o; if (!other.canEqual(this)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$venderid = getVenderid(), other$venderid = other.getVenderid(); if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;  Object this$shopid = getShopid(), other$shopid = other.getShopid(); if ((this$shopid == null) ? (other$shopid != null) : !this$shopid.equals(other$shopid)) return false;  Object this$cost = getCost(), other$cost = other.getCost(); if ((this$cost == null) ? (other$cost != null) : !this$cost.equals(other$cost)) return false;  Object this$taxRate = getTaxRate(), other$taxRate = other.getTaxRate(); if ((this$taxRate == null) ? (other$taxRate != null) : !this$taxRate.equals(other$taxRate)) return false;  Object this$clearFlag = getClearFlag(), other$clearFlag = other.getClearFlag(); if ((this$clearFlag == null) ? (other$clearFlag != null) : !this$clearFlag.equals(other$clearFlag)) return false;  Object this$flag = getFlag(), other$flag = other.getFlag(); if ((this$flag == null) ? (other$flag != null) : !this$flag.equals(other$flag)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status)); } private String shopid; private BigDecimal cost; private BigDecimal taxRate; private Integer clearFlag; private Integer flag; private Integer status; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsPurchasePrice; } public int hashCode() { int PRIME = 59; result = 1; Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $venderid = getVenderid(); result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode()); Object $shopid = getShopid(); result = result * 59 + (($shopid == null) ? 43 : $shopid.hashCode()); Object $cost = getCost(); result = result * 59 + (($cost == null) ? 43 : $cost.hashCode()); Object $taxRate = getTaxRate(); result = result * 59 + (($taxRate == null) ? 43 : $taxRate.hashCode()); Object $clearFlag = getClearFlag(); result = result * 59 + (($clearFlag == null) ? 43 : $clearFlag.hashCode()); Object $flag = getFlag(); result = result * 59 + (($flag == null) ? 43 : $flag.hashCode()); Object $status = getStatus(); return result * 59 + (($status == null) ? 43 : $status.hashCode()); } public String toString() { return "SdwmsPurchasePrice(sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", goodsid=" + getGoodsid() + ", venderid=" + getVenderid() + ", shopid=" + getShopid() + ", cost=" + getCost() + ", taxRate=" + getTaxRate() + ", clearFlag=" + getClearFlag() + ", flag=" + getFlag() + ", status=" + getStatus() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  55 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  64 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/*  73 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/*  82 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGoodsid() {
/*  91 */     return this.goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGoodsid(String goodsid) {
/* 100 */     this.goodsid = goodsid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVenderid() {
/* 109 */     return this.venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVenderid(String venderid) {
/* 118 */     this.venderid = venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getShopid() {
/* 127 */     return this.shopid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShopid(String shopid) {
/* 136 */     this.shopid = shopid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getCost() {
/* 145 */     return this.cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCost(BigDecimal cost) {
/* 154 */     this.cost = cost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getTaxRate() {
/* 163 */     return this.taxRate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTaxRate(BigDecimal taxRate) {
/* 172 */     this.taxRate = taxRate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getClearFlag() {
/* 181 */     return this.clearFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setClearFlag(Integer clearFlag) {
/* 190 */     this.clearFlag = clearFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlag() {
/* 199 */     return this.flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlag(Integer flag) {
/* 208 */     this.flag = flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 217 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 226 */     this.status = status;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsPurchasePrice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */