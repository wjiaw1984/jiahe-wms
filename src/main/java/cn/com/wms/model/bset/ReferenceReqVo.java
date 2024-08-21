package cn.com.wms.model.bset;

import lombok.Data;

import java.io.Serializable;

@Data
public class ReferenceReqVo
        implements Serializable {
    private String outorderType;
    private String outorderValue;

    public void setOutorderType(String outorderType) {
        /* 14 */
        this.outorderType = outorderType;
    }

    public void setOutorderValue(String outorderValue) {
        this.outorderValue = outorderValue;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.bset.ReferenceReqVo)) return false;
        cn.com.wms.model.bset.ReferenceReqVo other = (cn.com.wms.model.bset.ReferenceReqVo) o;
        if (!other.canEqual(this)) return false;
        Object this$outorderType = getOutorderType(), other$outorderType = other.getOutorderType();
        if ((this$outorderType == null) ? (other$outorderType != null) : !this$outorderType.equals(other$outorderType))
            return false;
        Object this$outorderValue = getOutorderValue(), other$outorderValue = other.getOutorderValue();
        return !((this$outorderValue == null) ? (other$outorderValue != null) : !this$outorderValue.equals(other$outorderValue));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.ReferenceReqVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $outorderType = getOutorderType();
        result = result * 59 + (($outorderType == null) ? 43 : $outorderType.hashCode());
        Object $outorderValue = getOutorderValue();
        return result * 59 + (($outorderValue == null) ? 43 : $outorderValue.hashCode());
    }

    public String toString() {
        return "ReferenceReqVo(outorderType=" + getOutorderType() + ", outorderValue=" + getOutorderValue() + ")";
    }


    public String getOutorderType() {
        /* 24 */
        return this.outorderType;
    }

    public String getOutorderValue() {
        /* 26 */
        return this.outorderValue;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ReferenceReqVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */