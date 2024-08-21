/*    */ package BOOT-INF.classes.cn.com.wms.model.erp;
/*    */ @TableName("shopcontact")
/*    */ public class ShopContact implements Serializable { private static final long serialVersionUID = 4845704943415739451L; private Long id;
/*    */   private String shopid;
/*    */   private String province;
/*    */   
/*  7 */   public void setId(Long id) { this.id = id; } private String city; private String district; private String address; private String contactName; private String phone; public void setShopid(String shopid) { this.shopid = shopid; } public void setProvince(String province) { this.province = province; } public void setCity(String city) { this.city = city; } public void setDistrict(String district) { this.district = district; } public void setAddress(String address) { this.address = address; } public void setContactName(String contactName) { this.contactName = contactName; } public void setPhone(String phone) { this.phone = phone; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.model.erp.ShopContact)) return false;  cn.com.wms.model.erp.ShopContact other = (cn.com.wms.model.erp.ShopContact)o; if (!other.canEqual(this)) return false;  Object this$id = getId(), other$id = other.getId(); if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;  Object this$shopid = getShopid(), other$shopid = other.getShopid(); if ((this$shopid == null) ? (other$shopid != null) : !this$shopid.equals(other$shopid)) return false;  Object this$province = getProvince(), other$province = other.getProvince(); if ((this$province == null) ? (other$province != null) : !this$province.equals(other$province)) return false;  Object this$city = getCity(), other$city = other.getCity(); if ((this$city == null) ? (other$city != null) : !this$city.equals(other$city)) return false;  Object this$district = getDistrict(), other$district = other.getDistrict(); if ((this$district == null) ? (other$district != null) : !this$district.equals(other$district)) return false;  Object this$address = getAddress(), other$address = other.getAddress(); if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address)) return false;  Object this$contactName = getContactName(), other$contactName = other.getContactName(); if ((this$contactName == null) ? (other$contactName != null) : !this$contactName.equals(other$contactName)) return false;  Object this$phone = getPhone(), other$phone = other.getPhone(); return !((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.model.erp.ShopContact; } public int hashCode() { int PRIME = 59; result = 1; Object $id = getId(); result = result * 59 + (($id == null) ? 43 : $id.hashCode()); Object $shopid = getShopid(); result = result * 59 + (($shopid == null) ? 43 : $shopid.hashCode()); Object $province = getProvince(); result = result * 59 + (($province == null) ? 43 : $province.hashCode()); Object $city = getCity(); result = result * 59 + (($city == null) ? 43 : $city.hashCode()); Object $district = getDistrict(); result = result * 59 + (($district == null) ? 43 : $district.hashCode()); Object $address = getAddress(); result = result * 59 + (($address == null) ? 43 : $address.hashCode()); Object $contactName = getContactName(); result = result * 59 + (($contactName == null) ? 43 : $contactName.hashCode()); Object $phone = getPhone(); return result * 59 + (($phone == null) ? 43 : $phone.hashCode()); } public String toString() { return "ShopContact(id=" + getId() + ", shopid=" + getShopid() + ", province=" + getProvince() + ", city=" + getCity() + ", district=" + getDistrict() + ", address=" + getAddress() + ", contactName=" + getContactName() + ", phone=" + getPhone() + ")"; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Long getId() {
/* 15 */     return this.id;
/*    */   }
/*    */   public String getShopid() {
/* 18 */     return this.shopid;
/*    */   }
/*    */   public String getProvince() {
/* 21 */     return this.province;
/*    */   }
/*    */   public String getCity() {
/* 24 */     return this.city;
/*    */   }
/*    */   public String getDistrict() {
/* 27 */     return this.district;
/*    */   }
/*    */   public String getAddress() {
/* 30 */     return this.address;
/*    */   }
/*    */   public String getContactName() {
/* 33 */     return this.contactName;
/*    */   }
/*    */   public String getPhone() {
/* 36 */     return this.phone;
/*    */   } }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\erp\ShopContact.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */