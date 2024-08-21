
package cn.com.wms.model.erp;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;


@TableName("InterfaceSheetList0")
 public class InterfaceSheetList implements Serializable {
       private static final long serialVersionUID = 8712155260485420326L;
       private String sheetid;
       private Integer sheetType;

    
    /*  8 */
    public void setSheetid(String sheetid) {
        this.sheetid = sheetid;
    }

    private String interfaceSystem;
    private Integer executeFlag;
    private Date stime;

    public void setSheetType(Integer sheetType) {
        this.sheetType = sheetType;
    }

    public void setInterfaceSystem(String interfaceSystem) {
        this.interfaceSystem = interfaceSystem;
    }

    public void setExecuteFlag(Integer executeFlag) {
        this.executeFlag = executeFlag;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.erp.InterfaceSheetList)) return false;
        cn.com.wms.model.erp.InterfaceSheetList other = (cn.com.wms.model.erp.InterfaceSheetList) o;
        if (!other.canEqual(this)) return false;
        Object this$sheetid = getSheetid(), other$sheetid = other.getSheetid();
        if ((this$sheetid == null) ? (other$sheetid != null) : !this$sheetid.equals(other$sheetid)) return false;
        Object this$sheetType = getSheetType(), other$sheetType = other.getSheetType();
        if ((this$sheetType == null) ? (other$sheetType != null) : !this$sheetType.equals(other$sheetType))
            return false;
        Object this$interfaceSystem = getInterfaceSystem(), other$interfaceSystem = other.getInterfaceSystem();
        if ((this$interfaceSystem == null) ? (other$interfaceSystem != null) : !this$interfaceSystem.equals(other$interfaceSystem))
            return false;
        Object this$executeFlag = getExecuteFlag(), other$executeFlag = other.getExecuteFlag();
        if ((this$executeFlag == null) ? (other$executeFlag != null) : !this$executeFlag.equals(other$executeFlag))
            return false;
        Object this$stime = getStime(), other$stime = other.getStime();
        return !((this$stime == null) ? (other$stime != null) : !this$stime.equals(other$stime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.erp.InterfaceSheetList;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $sheetid = getSheetid();
        result = result * 59 + (($sheetid == null) ? 43 : $sheetid.hashCode());
        Object $sheetType = getSheetType();
        result = result * 59 + (($sheetType == null) ? 43 : $sheetType.hashCode());
        Object $interfaceSystem = getInterfaceSystem();
        result = result * 59 + (($interfaceSystem == null) ? 43 : $interfaceSystem.hashCode());
        Object $executeFlag = getExecuteFlag();
        result = result * 59 + (($executeFlag == null) ? 43 : $executeFlag.hashCode());
        Object $stime = getStime();
        return result * 59 + (($stime == null) ? 43 : $stime.hashCode());
    }

    public String toString() {
        return "InterfaceSheetList(sheetid=" + getSheetid() + ", sheetType=" + getSheetType() + ", interfaceSystem=" + getInterfaceSystem() + ", executeFlag=" + getExecuteFlag() + ", stime=" + getStime() + ")";
    }

    
    
    
    
    
    
    
    public String getSheetid() {
        /* 16 */
        return this.sheetid;
        
    }

    
    public Integer getSheetType() {
        /* 19 */
        return this.sheetType;
        
    }

    
    public String getInterfaceSystem() {
        /* 22 */
        return this.interfaceSystem;
        
    }

    
    public Integer getExecuteFlag() {
        /* 25 */
        return this.executeFlag;
        
    }

    
    public Date getStime() {
        /* 28 */
        return this.stime;
        
    }
    
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\erp\InterfaceSheetList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */