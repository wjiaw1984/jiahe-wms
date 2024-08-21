
package cn.com.wms.model.wms.sdwms;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


@TableName("SDWMS_SGROUP_BAK")
@Data
public class SdwmsSgroupBak implements Serializable {
    private static final long serialVersionUID = 6477039133999937737L;
    private String sheetid;
    private String sgroupid;


    /*   7 */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsSgroupBak)) return false;
        cn.com.wms.model.wms.sdwms.SdwmsSgroupBak other = (cn.com.wms.model.wms.sdwms.SdwmsSgroupBak) o;
        if (!other.canEqual(this)) return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$sgroupid = getSgroupid(), other$sgroupid = other.getSgroupid();
        if ((this$sgroupid == null) ? (other$sgroupid != null) : !this$sgroupid.equals(other$sgroupid)) return false;
        Object this$sgroupname = getSgroupname(), other$sgroupname = other.getSgroupname();
        if ((this$sgroupname == null) ? (other$sgroupname != null) : !this$sgroupname.equals(other$sgroupname))
            return false;
        Object this$customid = getCustomid(), other$customid = other.getCustomid();
        if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        return !((this$status == null) ? (other$status != null) : !this$status.equals(other$status));
    }

    private String sgroupname;
    private String customid;
    private Integer status;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.sdwms.SdwmsSgroupBak;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $sgroupid = getSgroupid();
        result = result * 59 + (($sgroupid == null) ? 43 : $sgroupid.hashCode());
        Object $sgroupname = getSgroupname();
        result = result * 59 + (($sgroupname == null) ? 43 : $sgroupname.hashCode());
        Object $customid = getCustomid();
        result = result * 59 + (($customid == null) ? 43 : $customid.hashCode());
        Object $status = getStatus();
        return result * 59 + (($status == null) ? 43 : $status.hashCode());
    }

    public String toString() {
        return "SdwmsSgroupBak(sheetid=" + getSheetid() + ", sgroupid=" + getSgroupid() + ", sgroupname=" + getSgroupname() + ", customid=" + getCustomid() + ", status=" + getStatus() + ")";
    }


    public String getSheetid() {
        /*  39 */
        return this.sheetid;

    }


    public void setSheetid(String sheetid) {
        /*  48 */
        this.sheetid = sheetid;

    }


    public String getSgroupid() {
        /*  57 */
        return this.sgroupid;

    }


    public void setSgroupid(String sgroupid) {
        /*  66 */
        this.sgroupid = sgroupid;

    }


    public String getSgroupname() {
        /*  75 */
        return this.sgroupname;

    }


    public void setSgroupname(String sgroupname) {
        /*  84 */
        this.sgroupname = sgroupname;

    }


    public String getCustomid() {
        /*  93 */
        return this.customid;

    }


    public void setCustomid(String customid) {
        /* 102 */
        this.customid = customid;

    }


    public Integer getStatus() {
        /* 111 */
        return this.status;

    }


    public void setStatus(Integer status) {
        /* 120 */
        this.status = status;

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsSgroupBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */