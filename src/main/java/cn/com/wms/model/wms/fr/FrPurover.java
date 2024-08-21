
package cn.com.wms.model.wms.fr;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;


@TableName("FR_PurOver")
public class FrPurover implements Serializable {
    private static final long serialVersionUID = 2618580895963948404L;
    private String sheetid;
    private String customid;


    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.wms.fr.FrPurover)) return false;
        cn.com.wms.model.wms.fr.FrPurover other = (cn.com.wms.model.wms.fr.FrPurover) o;
        if (!other.canEqual(this)) return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$customid = getCustomid(), other$customid = other.getCustomid();
        if ((this$customid == null) ? (other$customid != null) : !this$customid.equals(other$customid)) return false;
        Object this$pursheetid = getPursheetid(), other$pursheetid = other.getPursheetid();
        if ((this$pursheetid == null) ? (other$pursheetid != null) : !this$pursheetid.equals(other$pursheetid))
            return false;
        Object this$checkFlag = getCheckFlag(), other$checkFlag = other.getCheckFlag();
        if ((this$checkFlag == null) ? (other$checkFlag != null) : !this$checkFlag.equals(other$checkFlag))
            return false;
        Object this$freshflag = getFreshflag(), other$freshflag = other.getFreshflag();
        return !((this$freshflag == null) ? (other$freshflag != null) : !this$freshflag.equals(other$freshflag));
    }

    private String pursheetid;
    private Integer checkFlag;
    private Integer freshflag;

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.wms.fr.FrPurover;
    }

    public int hashCode() {
        int PRIME = 59;
        result = 1;
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $customid = getCustomid();
        result = result * 59 + (($customid == null) ? 43 : $customid.hashCode());
        Object $pursheetid = getPursheetid();
        result = result * 59 + (($pursheetid == null) ? 43 : $pursheetid.hashCode());
        Object $checkFlag = getCheckFlag();
        result = result * 59 + (($checkFlag == null) ? 43 : $checkFlag.hashCode());
        Object $freshflag = getFreshflag();
        return result * 59 + (($freshflag == null) ? 43 : $freshflag.hashCode());
    }

    public String toString() {
        return "FrPurover(sheetid=" + getSheetid() + ", customid=" + getCustomid() + ", pursheetid=" + getPursheetid() + ", checkFlag=" + getCheckFlag() + ", freshflag=" + getFreshflag() + ")";
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getSheetid() {
        /*  39 */
        return this.sheetid;
        
    }

    
    
    
    
    
    
    
    public void setSheetid(String sheetid) {
        /*  48 */
        this.sheetid = sheetid;
        
    }

    
    
    
    
    
    
    
    public String getCustomid() {
        /*  57 */
        return this.customid;
        
    }

    
    
    
    
    
    
    
    public void setCustomid(String customid) {
        /*  66 */
        this.customid = customid;
        
    }

    
    
    
    
    
    
    
    public String getPursheetid() {
        /*  75 */
        return this.pursheetid;
        
    }

    
    
    
    
    
    
    
    public void setPursheetid(String pursheetid) {
        /*  84 */
        this.pursheetid = pursheetid;
        
    }

    
    
    
    
    
    
    
    public Integer getCheckFlag() {
        /*  93 */
        return this.checkFlag;
        
    }

    
    
    
    
    
    
    
    public void setCheckFlag(Integer checkFlag) {
        /* 102 */
        this.checkFlag = checkFlag;
        
    }

    
    
    
    
    
    
    
    public Integer getFreshflag() {
        /* 111 */
        return this.freshflag;
        
    }

    
    
    
    
    
    
    
    public void setFreshflag(Integer freshflag) {
        /* 120 */
        this.freshflag = freshflag;
        
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\wms\fr\FrPurover.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */