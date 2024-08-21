/*     */ package BOOT-INF.classes.com.best.javaSdk.twSoNotify.request;
/*     */ 
/*     */ import com.alibaba.fastjson2.annotation.JSONField;
/*     */ 
/*     */ public class Receiver {
/*     */   private String name;
/*     */   private String province;
/*     */   private String city;
/*     */   private String district;
/*     */   private String address;
/*     */   private String contactName;
/*     */   
/*  13 */   public void setReceiverId(String receiverId) { this.receiverId = receiverId; } private String phone; private String earlyDeliveryTime; private String lateDeliveryTime; private String oaId; private String street; private String contactCode; @JSONField(serialize = false) private String receiverId; public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.twSoNotify.request.Receiver)) return false;  com.best.javaSdk.twSoNotify.request.Receiver other = (com.best.javaSdk.twSoNotify.request.Receiver)o; if (!other.canEqual(this)) return false;  Object this$name = getName(), other$name = other.getName(); if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;  Object this$province = getProvince(), other$province = other.getProvince(); if ((this$province == null) ? (other$province != null) : !this$province.equals(other$province)) return false;  Object this$city = getCity(), other$city = other.getCity(); if ((this$city == null) ? (other$city != null) : !this$city.equals(other$city)) return false;  Object this$district = getDistrict(), other$district = other.getDistrict(); if ((this$district == null) ? (other$district != null) : !this$district.equals(other$district)) return false;  Object this$address = getAddress(), other$address = other.getAddress(); if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address)) return false;  Object this$contactName = getContactName(), other$contactName = other.getContactName(); if ((this$contactName == null) ? (other$contactName != null) : !this$contactName.equals(other$contactName)) return false;  Object this$phone = getPhone(), other$phone = other.getPhone(); if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone)) return false;  Object this$earlyDeliveryTime = getEarlyDeliveryTime(), other$earlyDeliveryTime = other.getEarlyDeliveryTime(); if ((this$earlyDeliveryTime == null) ? (other$earlyDeliveryTime != null) : !this$earlyDeliveryTime.equals(other$earlyDeliveryTime)) return false;  Object this$lateDeliveryTime = getLateDeliveryTime(), other$lateDeliveryTime = other.getLateDeliveryTime(); if ((this$lateDeliveryTime == null) ? (other$lateDeliveryTime != null) : !this$lateDeliveryTime.equals(other$lateDeliveryTime)) return false;  Object this$oaId = getOaId(), other$oaId = other.getOaId(); if ((this$oaId == null) ? (other$oaId != null) : !this$oaId.equals(other$oaId)) return false;  Object this$street = getStreet(), other$street = other.getStreet(); if ((this$street == null) ? (other$street != null) : !this$street.equals(other$street)) return false;  Object this$contactCode = getContactCode(), other$contactCode = other.getContactCode(); if ((this$contactCode == null) ? (other$contactCode != null) : !this$contactCode.equals(other$contactCode)) return false;  Object this$receiverId = getReceiverId(), other$receiverId = other.getReceiverId(); return !((this$receiverId == null) ? (other$receiverId != null) : !this$receiverId.equals(other$receiverId)); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.twSoNotify.request.Receiver; } public int hashCode() { int PRIME = 59; result = 1; Object $name = getName(); result = result * 59 + (($name == null) ? 43 : $name.hashCode()); Object $province = getProvince(); result = result * 59 + (($province == null) ? 43 : $province.hashCode()); Object $city = getCity(); result = result * 59 + (($city == null) ? 43 : $city.hashCode()); Object $district = getDistrict(); result = result * 59 + (($district == null) ? 43 : $district.hashCode()); Object $address = getAddress(); result = result * 59 + (($address == null) ? 43 : $address.hashCode()); Object $contactName = getContactName(); result = result * 59 + (($contactName == null) ? 43 : $contactName.hashCode()); Object $phone = getPhone(); result = result * 59 + (($phone == null) ? 43 : $phone.hashCode()); Object $earlyDeliveryTime = getEarlyDeliveryTime(); result = result * 59 + (($earlyDeliveryTime == null) ? 43 : $earlyDeliveryTime.hashCode()); Object $lateDeliveryTime = getLateDeliveryTime(); result = result * 59 + (($lateDeliveryTime == null) ? 43 : $lateDeliveryTime.hashCode()); Object $oaId = getOaId(); result = result * 59 + (($oaId == null) ? 43 : $oaId.hashCode()); Object $street = getStreet(); result = result * 59 + (($street == null) ? 43 : $street.hashCode()); Object $contactCode = getContactCode(); result = result * 59 + (($contactCode == null) ? 43 : $contactCode.hashCode()); Object $receiverId = getReceiverId(); return result * 59 + (($receiverId == null) ? 43 : $receiverId.hashCode()); } public String toString() { return "Receiver(name=" + getName() + ", province=" + getProvince() + ", city=" + getCity() + ", district=" + getDistrict() + ", address=" + getAddress() + ", contactName=" + getContactName() + ", phone=" + getPhone() + ", earlyDeliveryTime=" + getEarlyDeliveryTime() + ", lateDeliveryTime=" + getLateDeliveryTime() + ", oaId=" + getOaId() + ", street=" + getStreet() + ", contactCode=" + getContactCode() + ", receiverId=" + getReceiverId() + ")"; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getReceiverId() {
/*  29 */     return this.receiverId;
/*     */   }
/*     */   
/*     */   public String getName() {
/*  33 */     return this.name;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setName(String value) {
/*  38 */     this.name = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvince() {
/*  43 */     return this.province;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProvince(String value) {
/*  48 */     this.province = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCity() {
/*  53 */     return this.city;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCity(String value) {
/*  58 */     this.city = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDistrict() {
/*  63 */     return this.district;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDistrict(String value) {
/*  68 */     this.district = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAddress() {
/*  73 */     return this.address;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAddress(String value) {
/*  78 */     this.address = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getContactName() {
/*  83 */     return this.contactName;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setContactName(String value) {
/*  88 */     this.contactName = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPhone() {
/*  93 */     return this.phone;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPhone(String value) {
/*  98 */     this.phone = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEarlyDeliveryTime() {
/* 103 */     return this.earlyDeliveryTime;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEarlyDeliveryTime(String value) {
/* 108 */     this.earlyDeliveryTime = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLateDeliveryTime() {
/* 113 */     return this.lateDeliveryTime;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLateDeliveryTime(String value) {
/* 118 */     this.lateDeliveryTime = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getOaId() {
/* 123 */     return this.oaId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOaId(String value) {
/* 128 */     this.oaId = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStreet() {
/* 133 */     return this.street;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStreet(String value) {
/* 138 */     this.street = value;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getContactCode() {
/* 143 */     return this.contactCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setContactCode(String value) {
/* 148 */     this.contactCode = value;
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twSoNotify\request\Receiver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */