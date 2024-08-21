/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDWMS_RationCustom")
/*     */ public class SdwmsRationcustom implements Serializable { private static final long serialVersionUID = -3349000311285069408L; private String sheetid;
/*     */   private String customid;
/*     */   private String guestid;
/*     */   
/*   7 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsRationcustom)) return false;  cn.com.wms.model.wms.sdwms.SdwmsRationcustom other = (cn.com.wms.model.wms.sdwms.SdwmsRationcustom)o; if (!other.canEqual(this)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$guestid = getGuestid(), other$guestid = other.getGuestid(); if ((this$guestid == null) ? (other$guestid != null) : !this$guestid.equals(other$guestid)) return false;  Object this$guestName = getGuestName(), other$guestName = other.getGuestName(); if ((this$guestName == null) ? (other$guestName != null) : !this$guestName.equals(other$guestName)) return false;  Object this$address = getAddress(), other$address = other.getAddress(); if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address)) return false;  Object this$zipcode = getZipcode(), other$zipcode = other.getZipcode(); if ((this$zipcode == null) ? (other$zipcode != null) : !this$zipcode.equals(other$zipcode)) return false;  Object this$tele = getTele(), other$tele = other.getTele(); if ((this$tele == null) ? (other$tele != null) : !this$tele.equals(other$tele)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status)); } private String guestName; private String address; private String zipcode; private String tele; private Integer status; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsRationcustom; } public int hashCode() { int PRIME = 59; result = 1; Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $guestid = getGuestid(); result = result * 59 + (($guestid == null) ? 43 : $guestid.hashCode()); Object $guestName = getGuestName(); result = result * 59 + (($guestName == null) ? 43 : $guestName.hashCode()); Object $address = getAddress(); result = result * 59 + (($address == null) ? 43 : $address.hashCode()); Object $zipcode = getZipcode(); result = result * 59 + (($zipcode == null) ? 43 : $zipcode.hashCode()); Object $tele = getTele(); result = result * 59 + (($tele == null) ? 43 : $tele.hashCode()); Object $status = getStatus(); return result * 59 + (($status == null) ? 43 : $status.hashCode()); } public String toString() { return "SdwmsRationcustom(sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", guestid=" + getGuestid() + ", guestName=" + getGuestName() + ", address=" + getAddress() + ", zipcode=" + getZipcode() + ", tele=" + getTele() + ", status=" + getStatus() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  48 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  57 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/*  66 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/*  75 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGuestid() {
/*  84 */     return this.guestid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGuestid(String guestid) {
/*  93 */     this.guestid = guestid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGuestName() {
/* 102 */     return this.guestName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGuestName(String guestName) {
/* 111 */     this.guestName = guestName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAddress() {
/* 120 */     return this.address;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAddress(String address) {
/* 129 */     this.address = address;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getZipcode() {
/* 138 */     return this.zipcode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZipcode(String zipcode) {
/* 147 */     this.zipcode = zipcode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTele() {
/* 156 */     return this.tele;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTele(String tele) {
/* 165 */     this.tele = tele;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 174 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 183 */     this.status = status;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsRationcustom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */