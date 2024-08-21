
package com.best.javaSdk.wmsSoStatusPush.request;

import lombok.Data;

@Data
public class Recipient {
    private String name;
    private String mobileNumber;
    private String province;
    private String city;
    private String district;
    private String shippingAddress;


    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.request.Recipient)) return false;
        com.best.javaSdk.wmsSoStatusPush.request.Recipient other = (com.best.javaSdk.wmsSoStatusPush.request.Recipient) o;
        if (!other.canEqual(this)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$mobileNumber = getMobileNumber(), other$mobileNumber = other.getMobileNumber();
        if ((this$mobileNumber == null) ? (other$mobileNumber != null) : !this$mobileNumber.equals(other$mobileNumber))
            return false;
        Object this$province = getProvince(), other$province = other.getProvince();
        if ((this$province == null) ? (other$province != null) : !this$province.equals(other$province)) return false;
        Object this$city = getCity(), other$city = other.getCity();
        if ((this$city == null) ? (other$city != null) : !this$city.equals(other$city)) return false;
        Object this$district = getDistrict(), other$district = other.getDistrict();
        if ((this$district == null) ? (other$district != null) : !this$district.equals(other$district)) return false;
        Object this$shippingAddress = getShippingAddress(), other$shippingAddress = other.getShippingAddress();
        return !((this$shippingAddress == null) ? (other$shippingAddress != null) : !this$shippingAddress.equals(other$shippingAddress));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsSoStatusPush.request.Recipient;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $mobileNumber = getMobileNumber();
        result = result * 59 + (($mobileNumber == null) ? 43 : $mobileNumber.hashCode());
        Object $province = getProvince();
        result = result * 59 + (($province == null) ? 43 : $province.hashCode());
        Object $city = getCity();
        result = result * 59 + (($city == null) ? 43 : $city.hashCode());
        Object $district = getDistrict();
        result = result * 59 + (($district == null) ? 43 : $district.hashCode());
        Object $shippingAddress = getShippingAddress();
        return result * 59 + (($shippingAddress == null) ? 43 : $shippingAddress.hashCode());
    }

    public String toString() {
        return "Recipient(name=" + getName() + ", mobileNumber=" + getMobileNumber() + ", province=" + getProvince() + ", city=" + getCity() + ", district=" + getDistrict() + ", shippingAddress=" + getShippingAddress() + ")";
    }


    public String getName() {
        /* 12 */
        return this.name;

    }

    public String getMobileNumber() {
        /* 14 */
        return this.mobileNumber;

    }

    public String getProvince() {
        /* 16 */
        return this.province;

    }

    public String getCity() {
        /* 18 */
        return this.city;

    }

    public String getDistrict() {
        /* 20 */
        return this.district;

    }

    public String getShippingAddress() {
        /* 22 */
        return this.shippingAddress;

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\Recipient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */