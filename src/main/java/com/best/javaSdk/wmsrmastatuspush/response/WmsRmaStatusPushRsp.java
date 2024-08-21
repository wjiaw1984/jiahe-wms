package com.best.javaSdk.wmsrmastatuspush.response;

import cn.com.wms.model.bset.ResponseVo;
import com.best.javaSdk.wmsSkuInventoryExtQuery.response.Errors;
import lombok.Data;

@Data
public class WmsRmaStatusPushRsp
        extends ResponseVo {
    private Errors errors;

    public String toString() {
        /* 12 */
        return "WmsRmaStatusPushRsp(errors=" + getErrors() + ")";
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $errors = getErrors();
        return result * 59 + (($errors == null) ? 43 : $errors.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsrmastatuspush.response.WmsRmaStatusPushRsp;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.wmsrmastatuspush.response.WmsRmaStatusPushRsp)) return false;
        com.best.javaSdk.wmsrmastatuspush.response.WmsRmaStatusPushRsp other = (com.best.javaSdk.wmsrmastatuspush.response.WmsRmaStatusPushRsp) o;
        if (!other.canEqual(this)) return false;
        Object this$errors = getErrors(), other$errors = other.getErrors();
        return !((this$errors == null) ? (other$errors != null) : !this$errors.equals(other$errors));
    }

    public void setErrors(Errors errors) {
        this.errors = errors;
    }

    public Errors getErrors() {
        /* 14 */
        return this.errors;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsrmastatuspush\response\WmsRmaStatusPushRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */