package cn.com.wms.model.bset;

import lombok.Data;

import java.io.Serializable;

@Data
public class ServiceVo
        implements Serializable {
    private String serviceDefinitionCode;

    public String toString() {
        /* 14 */
        return "ServiceVo(serviceDefinitionCode=" + getServiceDefinitionCode() + ")";
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $serviceDefinitionCode = getServiceDefinitionCode();
        return result * 59 + (($serviceDefinitionCode == null) ? 43 : $serviceDefinitionCode.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.ServiceVo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.bset.ServiceVo)) return false;
        cn.com.wms.model.bset.ServiceVo other = (cn.com.wms.model.bset.ServiceVo) o;
        if (!other.canEqual(this)) return false;
        Object this$serviceDefinitionCode = getServiceDefinitionCode(), other$serviceDefinitionCode = other.getServiceDefinitionCode();
        return !((this$serviceDefinitionCode == null) ? (other$serviceDefinitionCode != null) : !this$serviceDefinitionCode.equals(other$serviceDefinitionCode));
    }

    public void setServiceDefinitionCode(String serviceDefinitionCode) {
        this.serviceDefinitionCode = serviceDefinitionCode;
    }

    public String getServiceDefinitionCode() {
        /* 16 */
        return this.serviceDefinitionCode;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ServiceVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */