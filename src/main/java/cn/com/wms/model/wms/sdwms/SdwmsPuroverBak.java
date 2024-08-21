
package cn.com.wms.model.wms.sdwms;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@TableName("SDWMS_PurOver_BAK")
@Data
public class SdwmsPuroverBak implements Serializable {
    private static final long serialVersionUID = 609453100889549140L;
    private String sheetid;
    private String customid;
    private String pursheetid;


    /*   8 */
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.sdwms.SdwmsPuroverBak)) return false;
        cn.com.wms.model.wms.sdwms.SdwmsPuroverBak other = (cn.com.wms.model.wms.sdwms.SdwmsPuroverBak) o;
        if (!other.canEqual(this)) return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$customid = getCustomid(), other$customid = other.getCustomid();
        if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;
        Object this$pursheetid = getPursheetid(), other$pursheetid = other.getPursheetid();
        if ((this$pursheetid == null) ? (other$pursheetid != null) : !this$pursheetid.equals(other$pursheetid))
            return false;
        Object this$flag = getFlag(), other$flag = other.getFlag();
        if ((this$flag == null) ? (other$flag != null) : !this$flag.equals(other$flag)) return false;
        Object this$purdate = getPurdate(), other$purdate = other.getPurdate();
        if ((this$purdate == null) ? (other$purdate != null) : !this$purdate.equals(other$purdate)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag();
        return !((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag));
    }

    private Integer flag;
    private Date purdate;
    private Integer status;
    private Integer freshflag;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.sdwms.SdwmsPuroverBak;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $customid = getCustomid();
        result = result * 59 + (($customid == null) ? 43 : $customid.hashCode());
        Object $pursheetid = getPursheetid();
        result = result * 59 + (($pursheetid == null) ? 43 : $pursheetid.hashCode());
        Object $flag = getFlag();
        result = result * 59 + (($flag == null) ? 43 : $flag.hashCode());
        Object $purdate = getPurdate();
        result = result * 59 + (($purdate == null) ? 43 : $purdate.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $freshflag = getFreshflag();
        return result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode());
    }

    public String toString() {
        return "SdwmsPuroverBak(sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", pursheetid=" + getPursheetid() + ", flag=" + getFlag() + ", purdate=" + getPurdate() + ", status=" + getStatus() + ", freshflag=" + getFreshflag() + ")";
    }


    public String getSheetid() {
        /*  46 */
        return this.sheetid;

    }


    public void setSheetid(String sheetid) {
        /*  55 */
        this.sheetid = sheetid;

    }


    public String getCustomid() {
        /*  64 */
        return this.customid;

    }


    public void setCustomid(String customid) {
        /*  73 */
        this.customid = customid;

    }


    public String getPursheetid() {
        /*  82 */
        return this.pursheetid;

    }


    public void setPursheetid(String pursheetid) {
        /*  91 */
        this.pursheetid = pursheetid;

    }


    public Integer getFlag() {
        /* 100 */
        return this.flag;

    }


    public void setFlag(Integer flag) {
        /* 109 */
        this.flag = flag;

    }


    public Date getPurdate() {
        /* 118 */
        return this.purdate;

    }


    public void setPurdate(Date purdate) {
        /* 127 */
        this.purdate = purdate;

    }


    public Integer getStatus() {
        /* 136 */
        return this.status;

    }


    public void setStatus(Integer status) {
        /* 145 */
        this.status = status;

    }


    public Integer getFreshflag() {
        /* 154 */
        return this.freshflag;

    }


    public void setFreshflag(Integer freshflag) {
        /* 163 */
        this.freshflag = freshflag;

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\sdwms\SdwmsPuroverBak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */