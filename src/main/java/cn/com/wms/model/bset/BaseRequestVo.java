package cn.com.wms.model.bset;

import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Slf4j
public class BaseRequestVo
        implements Serializable {
    private ParamVo params;

    public String toString() {
        /* 12 */
        return "BaseRequestVo(params=" + getParams() + ")";
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $params = getParams();
        return result * 59 + (($params == null) ? 43 : $params.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.BaseRequestVo;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.bset.BaseRequestVo)) return false;
        cn.com.wms.model.bset.BaseRequestVo other = (cn.com.wms.model.bset.BaseRequestVo) o;
        if (!other.canEqual(this)) return false;
        Object this$params = getParams(), other$params = other.getParams();
        return !((this$params == null) ? (other$params != null) : !this$params.equals(other$params));
    }

    public void setParams(ParamVo params) {
        this.params = params;
    }

    public ParamVo getParams() {
        /* 14 */
        return this.params;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\BaseRequestVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */