
package cn.com.wms.model.erp;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.util.StringUtils;

import java.io.Serializable;

@TableName("Sheet_PreFixString")
@Data
public class SheetPrefixstring implements Serializable {
    private static final long serialVersionUID = 8611953062111531707L;
    private String wmstype;


    public void setWmstype(String wmstype) {
        this.wmstype = wmstype;
    }

    private Integer sheetType;
    private String sheetTypeNote;
    private String fixString;

    public void setSheetType(Integer sheetType) {
        this.sheetType = sheetType;
    }

    public void setSheetTypeNote(String sheetTypeNote) {
        this.sheetTypeNote = sheetTypeNote;
    }

    public void setFixString(String fixString) {
        this.fixString = fixString;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.erp.SheetPrefixstring)) return false;
        cn.com.wms.model.erp.SheetPrefixstring other = (cn.com.wms.model.erp.SheetPrefixstring) o;
        if (!other.canEqual(this)) return false;
        Object this$wmstype = getWmstype(), other$wmstype = other.getWmstype();
        if ((this$wmstype == null) ? (other$wmstype != null) : !this$wmstype.equals(other$wmstype)) return false;
        Object this$sheetType = getSheetType(), other$sheetType = other.getSheetType();
        if ((this$sheetType == null) ? (other$sheetType != null) : !this$sheetType.equals(other$sheetType))
            return false;
        Object this$sheetTypeNote = getSheetTypeNote(), other$sheetTypeNote = other.getSheetTypeNote();
        if ((this$sheetTypeNote == null) ? (other$sheetTypeNote != null) : !this$sheetTypeNote.equals(other$sheetTypeNote))
            return false;
        Object this$fixString = getFixString(), other$fixString = other.getFixString();
        return !((this$fixString == null) ? (other$fixString != null) : !this$fixString.equals(other$fixString));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.erp.SheetPrefixstring;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $wmstype = getWmstype();
        result = result * 59 + (($wmstype == null) ? 43 : $wmstype.hashCode());
        Object $sheetType = getSheetType();
        result = result * 59 + (($sheetType == null) ? 43 : $sheetType.hashCode());
        Object $sheetTypeNote = getSheetTypeNote();
        result = result * 59 + (($sheetTypeNote == null) ? 43 : $sheetTypeNote.hashCode());
        Object $fixString = getFixString();
        return result * 59 + (($fixString == null) ? 43 : $fixString.hashCode());
    }

    public String toString() {
        return "SheetPrefixstring(wmstype=" + getWmstype() + ", sheetType=" + getSheetType() + ", sheetTypeNote=" + getSheetTypeNote() + ", fixString=" + getFixString() + ")";
    }


    public Integer getSheetType() {
        /* 19 */
        return this.sheetType;

    }


    public String getWmstype() {
        /* 30 */
        if (StringUtils.isEmpty(this.wmstype)) {
            /* 31 */
            return this.wmstype;

        }
        /* 33 */
        return this.wmstype.trim();

    }



    public String getSheetTypeNote() {
        /* 37 */
        if (StringUtils.isEmpty(this.sheetTypeNote)) {
            /* 38 */
            return this.sheetTypeNote;

        }
        /* 40 */
        return this.sheetTypeNote.trim();

    }



    public String getFixString() {
        /* 44 */
        if (StringUtils.isEmpty(this.fixString)) {
            /* 45 */
            return this.fixString;

        }
        /* 47 */
        return this.fixString.trim();

    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\erp\SheetPrefixstring.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */