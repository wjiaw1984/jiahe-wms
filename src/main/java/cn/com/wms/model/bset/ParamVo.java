package cn.com.wms.model.bset;

import lombok.Data;

import java.io.Serializable;

@Data
public class ParamVo implements Serializable {
    private String serviceType;
    private String sign;
    private String partnerID;
    private String bizData;

    public void setServiceType(String serviceType) {
        /* 12 */
        this.serviceType = serviceType;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setPartnerID(String partnerID) {
        this.partnerID = partnerID;
    }

    public void setBizData(String bizData) {
        this.bizData = bizData;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.bset.ParamVo)) return false;
        cn.com.wms.model.bset.ParamVo other = (cn.com.wms.model.bset.ParamVo) o;
        if (!other.canEqual(this)) return false;
        Object this$serviceType = getServiceType(), other$serviceType = other.getServiceType();
        if ((this$serviceType == null) ? (other$serviceType != null) : !this$serviceType.equals(other$serviceType))
            return false;
        Object this$sign = getSign(), other$sign = other.getSign();
        if ((this$sign == null) ? (other$sign != null) : !this$sign.equals(other$sign)) return false;
        Object this$partnerID = getPartnerID(), other$partnerID = other.getPartnerID();
        if ((this$partnerID == null) ? (other$partnerID != null) : !this$partnerID.equals(other$partnerID))
            return false;
        Object this$bizData = getBizData(), other$bizData = other.getBizData();
        return !((this$bizData == null) ? (other$bizData != null) : !this$bizData.equals(other$bizData));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.ParamVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $serviceType = getServiceType();
        result = result * 59 + (($serviceType == null) ? 43 : $serviceType.hashCode());
        Object $sign = getSign();
        result = result * 59 + (($sign == null) ? 43 : $sign.hashCode());
        Object $partnerID = getPartnerID();
        result = result * 59 + (($partnerID == null) ? 43 : $partnerID.hashCode());
        Object $bizData = getBizData();
        return result * 59 + (($bizData == null) ? 43 : $bizData.hashCode());
    }

    public String toString() {
        return "ParamVo(serviceType=" + getServiceType() + ", sign=" + getSign() + ", partnerID=" + getPartnerID() + ", bizData=" + getBizData() + ")";
    }

    /* 14 */
    public String getServiceType() {
        return this.serviceType;
    }

    /* 15 */
    public String getSign() {
        return this.sign;
    }

    /* 16 */
    public String getPartnerID() {
        return this.partnerID;
    }

    public String getBizData() {
        /* 17 */
        return this.bizData;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ParamVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */