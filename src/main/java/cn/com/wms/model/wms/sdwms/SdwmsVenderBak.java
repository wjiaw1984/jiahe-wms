/*     */ package BOOT-INF.classes.cn.com.wms.model.wms.sdwms;
/*     */ @TableName("SDWMS_Vender_BAK")
/*     */ public class SdwmsVenderBak implements Serializable { private static final long serialVersionUID = -98516943370532956L; private String sheetid; private String venderid; private String customid; private String name;
/*     */   private String manager;
/*     */   private String linkMan;
/*     */   
/*   7 */   public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsVenderBak)) return false;  cn.com.wms.model.wms.sdwms.SdwmsVenderBak other = (cn.com.wms.model.wms.sdwms.SdwmsVenderBak)o; if (!other.canEqual(this)) return false;  Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid(); if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;  Object this$venderid = getVenderid(), other$venderid = other.getVenderid(); if ((this$venderid == null) ? (other$venderid != null) : !this$venderid.equals(other$venderid)) return false;  Object this$customid = getCustomid(), other$customid = other.getCustomid(); if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$manager = getManager(), other$manager = other.getManager(); if ((this$manager == null) ? (other$manager != null) : !this$manager.equals(other$manager)) return false;  Object this$linkMan = getLinkMan(), other$linkMan = other.getLinkMan(); if ((this$linkMan == null) ? (other$linkMan != null) : !this$linkMan.equals(other$linkMan)) return false;  Object this$address = getAddress(), other$address = other.getAddress(); if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address)) return false;  Object this$zipcode = getZipcode(), other$zipcode = other.getZipcode(); if ((this$zipcode == null) ? (other$zipcode != null) : !this$zipcode.equals(other$zipcode)) return false;  Object this$tele = getTele(), other$tele = other.getTele(); if ((this$tele == null) ? (other$tele != null) : !this$tele.equals(other$tele)) return false;  Object this$fax = getFax(), other$fax = other.getFax(); if ((this$fax == null) ? (other$fax != null) : !this$fax.equals(other$fax)) return false;  Object this$eMail = getEMail(), other$eMail = other.getEMail(); if ((this$eMail == null) ? (other$eMail != null) : !this$eMail.equals(other$eMail)) return false;  Object this$notes = getNotes(), other$notes = other.getNotes(); if ((this$notes == null) ? (other$notes != null) : !this$notes.equals(other$notes)) return false;  Object this$orderFlag = getOrderFlag(), other$orderFlag = other.getOrderFlag(); if ((this$orderFlag == null) ? (other$orderFlag != null) : !this$orderFlag.equals(other$orderFlag)) return false;  Object this$status = getStatus(), other$status = other.getStatus(); return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status)); } private String address; private String zipcode; private String tele; private String fax; private String eMail; private String notes; private Integer orderFlag; private Integer status; protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.wms.sdwms.SdwmsVenderBak; } public int hashCode() { int PRIME = 59; result = 1; Object $sheetid = getSheetid(); result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode()); Object $venderid = getVenderid(); result = result * 59 + (($venderid == null) ? 43 : $venderid.hashCode()); Object $customid = getCustomid(); result = result * 59 + (($customid == null) ? 43 : $customid.hashCode()); Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $manager = getManager(); result = result * 59 + (($manager == null) ? 43 : $manager.hashCode()); Object $linkMan = getLinkMan(); result = result * 59 + (($linkMan == null) ? 43 : $linkMan.hashCode()); Object $address = getAddress(); result = result * 59 + (($address == null) ? 43 : $address.hashCode()); Object $zipcode = getZipcode(); result = result * 59 + (($zipcode == null) ? 43 : $zipcode.hashCode()); Object $tele = getTele(); result = result * 59 + (($tele == null) ? 43 : $tele.hashCode()); Object $fax = getFax(); result = result * 59 + (($fax == null) ? 43 : $fax.hashCode()); Object $eMail = getEMail(); result = result * 59 + (($eMail == null) ? 43 : $eMail.hashCode()); Object $notes = getNotes(); result = result * 59 + (($notes == null) ? 43 : $notes.hashCode()); Object $orderFlag = getOrderFlag(); result = result * 59 + (($orderFlag == null) ? 43 : $orderFlag.hashCode()); Object $status = getStatus(); return result * 59 + (($status == null) ? 43 : $status.hashCode()); } public String toString() { return "SdwmsVenderBak(sheetid=" + getSheetid() + ", venderid=" + getVenderid() + ", customid=" + getCustomid() + ", name=" + getName() + ", manager=" + getManager() + ", linkMan=" + getLinkMan() + ", address=" + getAddress() + ", zipcode=" + getZipcode() + ", tele=" + getTele() + ", fax=" + getFax() + ", eMail=" + getEMail() + ", notes=" + getNotes() + ", orderFlag=" + getOrderFlag() + ", status=" + getStatus() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  66 */     return this.sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSheetid(String sheetid) {
/*  75 */     this.sheetid = sheetid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVenderid() {
/*  84 */     return this.venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVenderid(String venderid) {
/*  93 */     this.venderid = venderid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustomid() {
/* 102 */     return this.customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustomid(String customid) {
/* 111 */     this.customid = customid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 120 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setName(String name) {
/* 129 */     this.name = name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getManager() {
/* 138 */     return this.manager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setManager(String manager) {
/* 147 */     this.manager = manager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLinkMan() {
/* 156 */     return this.linkMan;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLinkMan(String linkMan) {
/* 165 */     this.linkMan = linkMan;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAddress() {
/* 174 */     return this.address;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAddress(String address) {
/* 183 */     this.address = address;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getZipcode() {
/* 192 */     return this.zipcode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZipcode(String zipcode) {
/* 201 */     this.zipcode = zipcode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTele() {
/* 210 */     return this.tele;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTele(String tele) {
/* 219 */     this.tele = tele;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFax() {
/* 228 */     return this.fax;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFax(String fax) {
/* 237 */     this.fax = fax;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEMail() {
/* 246 */     return this.eMail;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEMail(String eMail) {
/* 255 */     this.eMail = eMail;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNotes() {
/* 264 */     return this.notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNotes(String notes) {
/* 273 */     this.notes = notes;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getOrderFlag() {
/* 282 */     return this.orderFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrderFlag(Integer orderFlag) {
/* 291 */     this.orderFlag = orderFlag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatus() {
/* 300 */     return this.status;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatus(Integer status) {
/* 309 */     this.status = status;
/*     */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsVenderBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */