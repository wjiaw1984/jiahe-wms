package com.best.javaSdk.wmsAsnStatusPush.response;

import cn.com.wms.model.bset.ResponseVo;
import com.best.javaSdk.wmsSkuInventoryExtQuery.response.Errors;
import lombok.Data;

@Data
public class WmsAnsStatusPushRsp
        extends ResponseVo {
    private Errors errors;

    public String toString() {
        /* 12 */
        return "WmsAnsStatusPushRsp(errors=" + getErrors() + ")";
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $errors = getErrors();
        return result * 59 + (($errors == null) ? 43 : $errors.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.best.javaSdk.wmsAsnStatusPush.response.WmsAnsStatusPushRsp;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.best.javaSdk.wmsAsnStatusPush.response.WmsAnsStatusPushRsp)) return false;
        com.best.javaSdk.wmsAsnStatusPush.response.WmsAnsStatusPushRsp other = (com.best.javaSdk.wmsAsnStatusPush.response.WmsAnsStatusPushRsp) o;
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


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsAsnStatusPush\response\WmsAnsStatusPushRsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */