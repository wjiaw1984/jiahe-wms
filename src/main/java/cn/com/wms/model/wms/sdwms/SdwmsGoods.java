/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDWMS_Goods")
/*     */ public class SdwmsGoods implements Serializable { private static final long serialVersionUID = 8778784938117658364L; private String sheetid; private String goodsid; private String sgroupid; private String customid; private String barcodeid; private String name; private String ename; private String abcid; private String unitName;
/*     */   private String spec;
/*     */   private String pkname;
/*     */   private BigDecimal pknum;
/*     */   
/*   8 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsGoods)) return false;  cn.com.wms.model.wms.sdwms.SdwmsGoods other = (cn.com.wms.model.wms.sdwms.SdwmsGoods)o; if (!other.canEqual(this)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$goodsid = getGoodsid(), other$goodsid = other.getGoodsid(); if ((this$goodsid == null) ? (other$goodsid != null) : !this$goodsid.equals(other$goodsid)) return false;  Object this$sgroupid = getSgroupid(), other$sgroupid = other.getSgroupid(); if ((this$sgroupid == null) ? (other$sgroupid != null) : !this$sgroupid.equals(other$sgroupid)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$barcodeid = getBarcodeid(), other$barcodeid = other.getBarcodeid(); if ((this$barcodeid == null) ? (other$barcodeid != null) : !this$barcodeid.equals(other$barcodeid)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$ename = getEname(), other$ename = other.getEname(); if ((this$ename == null) ? (other$ename != null) : !this$ename.equals(other$ename)) return false;  Object this$abcid = getAbcid(), other$abcid = other.getAbcid(); if ((this$abcid == null) ? (other$abcid != null) : !this$abcid.equals(other$abcid)) return false;  Object this$unitName = getUnitName(), other$unitName = other.getUnitName(); if ((this$unitName == null) ? (other$unitName != null) : !this$unitName.equals(other$unitName)) return false;  Object this$spec = getSpec(), other$spec = other.getSpec(); if ((this$spec == null) ? (other$spec != null) : !this$spec.equals(other$spec)) return false;  Object this$pkname = getPkname(), other$pkname = other.getPkname(); if ((this$pkname == null) ? (other$pkname != null) : !this$pkname.equals(other$pkname)) return false;  Object this$pknum = getPknum(), other$pknum = other.getPknum(); if ((this$pknum == null) ? (other$pknum != null) : !this$pknum.equals(other$pknum)) return false;  Object this$pkspec = getPkspec(), other$pkspec = other.getPkspec(); if ((this$pkspec == null) ? (other$pkspec != null) : !this$pkspec.equals(other$pkspec)) return false;  Object this$zbnum = getZbnum(), other$zbnum = other.getZbnum(); if ((this$zbnum == null) ? (other$zbnum != null) : !this$zbnum.equals(other$zbnum)) return false;  Object this$length = getLength(), other$length = other.getLength(); if ((this$length == null) ? (other$length != null) : !this$length.equals(other$length)) return false;  Object this$width = getWidth(), other$width = other.getWidth(); if ((this$width == null) ? (other$width != null) : !this$width.equals(other$width)) return false;  Object this$height = getHeight(), other$height = other.getHeight(); if ((this$height == null) ? (other$height != null) : !this$height.equals(other$height)) return false;  Object this$weigth = getWeigth(), other$weigth = other.getWeigth(); if ((this$weigth == null) ? (other$weigth != null) : !this$weigth.equals(other$weigth)) return false;  Object this$keepDays = getKeepDays(), other$keepDays = other.getKeepDays(); if ((this$keepDays == null) ? (other$keepDays != null) : !this$keepDays.equals(other$keepDays)) return false;  Object this$price = getPrice(), other$price = other.getPrice(); if ((this$price == null) ? (other$price != null) : !this$price.equals(other$price)) return false;  Object this$supno = getSupno(), other$supno = other.getSupno(); if ((this$supno == null) ? (other$supno != null) : !this$supno.equals(other$supno)) return false;  Object this$notes = getNotes(), other$notes = other.getNotes(); if ((this$notes == null) ? (other$notes != null) : !this$notes.equals(other$notes)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;  Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag(); if ((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag)) return false;  Object this$freshDays = getFreshDays(), other$freshDays = other.getFreshDays(); return !((this$freshDays == null) ? (other$freshDays != null) : !this$freshDays.equals(other$freshDays)); } private String pkspec; private BigDecimal zbnum; private BigDecimal length; private BigDecimal width; private BigDecimal height; private BigDecimal weigth; private Integer keepDays; private BigDecimal price; private String supno; private String notes; private Integer status; private Integer freshflag; private Integer freshDays; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsGoods; } public int hashCode() { int PRIME = 59; result = 1; Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $goodsid = getGoodsid(); result = result * 59 + (($goodsid == null) ? 43 : $goodsid.hashCode()); Object $sgroupid = getSgroupid(); result = result * 59 + (($sgroupid == null) ? 43 : $sgroupid.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $barcodeid = getBarcodeid(); result = result * 59 + (($barcodeid == null) ? 43 : $barcodeid.hashCode()); Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $ename = getEname(); result = result * 59 + (($ename == null) ? 43 : $ename.hashCode()); Object $abcid = getAbcid(); result = result * 59 + (($abcid == null) ? 43 : $abcid.hashCode()); Object $unitName = getUnitName(); result = result * 59 + (($unitName == null) ? 43 : $unitName.hashCode()); Object $spec = getSpec(); result = result * 59 + (($spec == null) ? 43 : $spec.hashCode()); Object $pkname = getPkname(); result = result * 59 + (($pkname == null) ? 43 : $pkname.hashCode()); Object $pknum = getPknum(); result = result * 59 + (($pknum == null) ? 43 : $pknum.hashCode()); Object $pkspec = getPkspec(); result = result * 59 + (($pkspec == null) ? 43 : $pkspec.hashCode()); Object $zbnum = getZbnum(); result = result * 59 + (($zbnum == null) ? 43 : $zbnum.hashCode()); Object $length = getLength(); result = result * 59 + (($length == null) ? 43 : $length.hashCode()); Object $width = getWidth(); result = result * 59 + (($width == null) ? 43 : $width.hashCode()); Object $height = getHeight(); result = result * 59 + (($height == null) ? 43 : $height.hashCode()); Object $weigth = getWeigth(); result = result * 59 + (($weigth == null) ? 43 : $weigth.hashCode()); Object $keepDays = getKeepDays(); result = result * 59 + (($keepDays == null) ? 43 : $keepDays.hashCode()); Object $price = getPrice(); result = result * 59 + (($price == null) ? 43 : $price.hashCode()); Object $supno = getSupno(); result = result * 59 + (($supno == null) ? 43 : $supno.hashCode()); Object $notes = getNotes(); result = result * 59 + (($notes == null) ? 43 : $notes.hashCode()); Object $status = getStatus(); result = result * 59 + (($status == null) ? 43 : $status.hashCode()); Object $freshflag = getFreshflag(); result = result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode()); Object $freshDays = getFreshDays(); return result * 59 + (($freshDays == null) ? 43 : $freshDays.hashCode()); } public String toString() { return "SdwmsGoods(sheetid=" + getSheetid() + ", goodsid=" + getGoodsid() + ", sgroupid=" + getSgroupid() + ", customid=" + getCustomid() + ", barcodeid=" + getBarcodeid() + ", name=" + getName() + ", ename=" + getEname() + ", abcid=" + getAbcid() + ", unitName=" + getUnitName() + ", spec=" + getSpec() + ", pkname=" + getPkname() + ", pknum=" + getPknum() + ", pkspec=" + getPkspec() + ", zbnum=" + getZbnum() + ", length=" + getLength() + ", width=" + getWidth() + ", height=" + getHeight() + ", weigth=" + getWeigth() + ", keepDays=" + getKeepDays() + ", price=" + getPrice() + ", supno=" + getSupno() + ", notes=" + getNotes() + ", status=" + getStatus() + ", freshflag=" + getFreshflag() + ", freshDays=" + getFreshDays() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 100 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/* 109 */     this.sheetid = sheetid;
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
/*     */   public String getSgroupid() {
/* 136 */     return this.sgroupid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSgroupid(String sgroupid) {
/* 145 */     this.sgroupid = sgroupid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/* 154 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/* 163 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getBarcodeid() {
/* 172 */     return this.barcodeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBarcodeid(String barcodeid) {
/* 181 */     this.barcodeid = barcodeid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 190 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setName(String name) {
/* 199 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEname() {
/* 208 */     return this.ename;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEname(String ename) {
/* 217 */     this.ename = ename;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAbcid() {
/* 226 */     return this.abcid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAbcid(String abcid) {
/* 235 */     this.abcid = abcid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUnitName() {
/* 244 */     return this.unitName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUnitName(String unitName) {
/* 253 */     this.unitName = unitName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSpec() {
/* 262 */     return this.spec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSpec(String spec) {
/* 271 */     this.spec = spec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPkname() {
/* 280 */     return this.pkname;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPkname(String pkname) {
/* 289 */     this.pkname = pkname;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getPknum() {
/* 298 */     return this.pknum;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPknum(BigDecimal pknum) {
/* 307 */     this.pknum = pknum;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPkspec() {
/* 316 */     return this.pkspec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPkspec(String pkspec) {
/* 325 */     this.pkspec = pkspec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getZbnum() {
/* 334 */     return this.zbnum;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZbnum(BigDecimal zbnum) {
/* 343 */     this.zbnum = zbnum;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getLength() {
/* 352 */     return this.length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLength(BigDecimal length) {
/* 361 */     this.length = length;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getWidth() {
/* 370 */     return this.width;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWidth(BigDecimal width) {
/* 379 */     this.width = width;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getHeight() {
/* 388 */     return this.height;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHeight(BigDecimal height) {
/* 397 */     this.height = height;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getWeigth() {
/* 406 */     return this.weigth;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWeigth(BigDecimal weigth) {
/* 415 */     this.weigth = weigth;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getKeepDays() {
/* 424 */     return this.keepDays;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKeepDays(Integer keepDays) {
/* 433 */     this.keepDays = keepDays;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getPrice() {
/* 442 */     return this.price;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrice(BigDecimal price) {
/* 451 */     this.price = price;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSupno() {
/* 460 */     return this.supno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSupno(String supno) {
/* 469 */     this.supno = supno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNotes() {
/* 478 */     return this.notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNotes(String notes) {
/* 487 */     this.notes = notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 496 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 505 */     this.status = status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFreshflag() {
/* 514 */     return this.freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFreshflag(Integer freshflag) {
/* 523 */     this.freshflag = freshflag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFreshDays() {
/* 532 */     return this.freshDays;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFreshDays(Integer freshDays) {
/* 541 */     this.freshDays = freshDays;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsGoods.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */