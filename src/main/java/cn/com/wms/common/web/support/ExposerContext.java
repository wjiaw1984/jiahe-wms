package cn.com.wms.common.web.support;

import lombok.Data;

@Data
public class ExposerContext {
    private String dateFormat;

    public String toString() {
        /*  8 */
        return "ExposerContext(dateFormat=" + getDateFormat() + ")";
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $dateFormat = getDateFormat();
        return result * 59 + (($dateFormat == null) ? 43 : $dateFormat.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.common.web.support.ExposerContext;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.common.web.support.ExposerContext)) return false;
        cn.com.wms.common.web.support.ExposerContext other = (cn.com.wms.common.web.support.ExposerContext) o;
        if (!other.canEqual(this)) return false;
        Object this$dateFormat = getDateFormat(), other$dateFormat = other.getDateFormat();
        return !((this$dateFormat == null) ? (other$dateFormat != null) : !this$dateFormat.equals(other$dateFormat));
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getDateFormat() {
        /* 10 */
        return this.dateFormat;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\web\support\ExposerContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */