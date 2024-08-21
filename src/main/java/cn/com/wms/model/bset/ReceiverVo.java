
package cn.com.wms.model.bset;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ReceiverVo implements Serializable {
    private String name;
    private String province;
    private String city;
    private String district;
    private String address;
    private String contactName;
    private String phone;
    private Date earlyDeliveryTime;
    private Date lateDeliveryTime;


    /* 15 */
    public void setName(String name) {
        this.name = name;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEarlyDeliveryTime(Date earlyDeliveryTime) {
        this.earlyDeliveryTime = earlyDeliveryTime;
    }

    public void setLateDeliveryTime(Date lateDeliveryTime) {
        this.lateDeliveryTime = lateDeliveryTime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.bset.ReceiverVo)) return false;
        cn.com.wms.model.bset.ReceiverVo other = (cn.com.wms.model.bset.ReceiverVo) o;
        if (!other.canEqual(this)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$province = getProvince(), other$province = other.getProvince();
        if ((this$province == null) ? (other$province != null) : !this$province.equals(other$province)) return false;
        Object this$city = getCity(), other$city = other.getCity();
        if ((this$city == null) ? (other$city != null) : !this$city.equals(other$city)) return false;
        Object this$district = getDistrict(), other$district = other.getDistrict();
        if ((this$district == null) ? (other$district != null) : !this$district.equals(other$district)) return false;
        Object this$address = getAddress(), other$address = other.getAddress();
        if ((this$address == null) ? (other$address != null) : !this$address.equals(other$address)) return false;
        Object this$contactName = getContactName(), other$contactName = other.getContactName();
        if ((this$contactName == null) ? (other$contactName != null) : !this$contactName.equals(other$contactName))
            return false;
        Object this$phone = getPhone(), other$phone = other.getPhone();
        if ((this$phone == null) ? (other$phone != null) : !this$phone.equals(other$phone)) return false;
        Object this$earlyDeliveryTime = getEarlyDeliveryTime(), other$earlyDeliveryTime = other.getEarlyDeliveryTime();
        if ((this$earlyDeliveryTime == null) ? (other$earlyDeliveryTime != null) : !this$earlyDeliveryTime.equals(other$earlyDeliveryTime))
            return false;
        Object this$lateDeliveryTime = getLateDeliveryTime(), other$lateDeliveryTime = other.getLateDeliveryTime();
        return !((this$lateDeliveryTime == null) ? (other$lateDeliveryTime != null) : !this$lateDeliveryTime.equals(other$lateDeliveryTime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.ReceiverVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $province = getProvince();
        result = result * 59 + (($province == null) ? 43 : $province.hashCode());
        Object $city = getCity();
        result = result * 59 + (($city == null) ? 43 : $city.hashCode());
        Object $district = getDistrict();
        result = result * 59 + (($district == null) ? 43 : $district.hashCode());
        Object $address = getAddress();
        result = result * 59 + (($address == null) ? 43 : $address.hashCode());
        Object $contactName = getContactName();
        result = result * 59 + (($contactName == null) ? 43 : $contactName.hashCode());
        Object $phone = getPhone();
        result = result * 59 + (($phone == null) ? 43 : $phone.hashCode());
        Object $earlyDeliveryTime = getEarlyDeliveryTime();
        result = result * 59 + (($earlyDeliveryTime == null) ? 43 : $earlyDeliveryTime.hashCode());
        Object $lateDeliveryTime = getLateDeliveryTime();
        return result * 59 + (($lateDeliveryTime == null) ? 43 : $lateDeliveryTime.hashCode());
    }

    public String toString() {
        return "ReceiverVo(name=" + getName() + ", province=" + getProvince() + ", city=" + getCity() + ", district=" + getDistrict() + ", address=" + getAddress() + ", contactName=" + getContactName() + ", phone=" + getPhone() + ", earlyDeliveryTime=" + getEarlyDeliveryTime() + ", lateDeliveryTime=" + getLateDeliveryTime() + ")";
    }

    
    
    public String getName() {
        /* 18 */
        return this.name;
        
    }

    public String getProvince() {
        /* 20 */
        return this.province;
        
    }

    public String getCity() {
        /* 22 */
        return this.city;
        
    }

    public String getDistrict() {
        /* 24 */
        return this.district;
        
    }

    public String getAddress() {
        /* 26 */
        return this.address;
        
    }

    public String getContactName() {
        /* 28 */
        return this.contactName;
        
    }

    public String getPhone() {
        /* 30 */
        return this.phone;
        
    }

    public Date getEarlyDeliveryTime() {
        /* 32 */
        return this.earlyDeliveryTime;
        
    }

    public Date getLateDeliveryTime() {
        /* 34 */
        return this.lateDeliveryTime;
        
    }
    
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ReceiverVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */