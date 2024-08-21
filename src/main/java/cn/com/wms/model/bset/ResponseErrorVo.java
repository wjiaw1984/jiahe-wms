package cn.com.wms.model.bset;

import cn.com.wms.model.bset.ResponseVo;
import lombok.Data;
import org.springframework.util.StringUtils;

@Data
public class ResponseErrorVo
        extends ResponseVo {
    public void setNote(String note) {
        this.note = note;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.model.bset.ResponseErrorVo)) return false;
        cn.com.wms.model.bset.ResponseErrorVo other = (cn.com.wms.model.bset.ResponseErrorVo) o;
        if (!other.canEqual(this)) return false;
        Object this$note = getNote(), other$note = other.getNote();
        if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note)) return false;
        Object this$errorCode = getErrorCode(), other$errorCode = other.getErrorCode();
        if ((this$errorCode == null) ? (other$errorCode != null) : !this$errorCode.equals(other$errorCode))
            return false;
        Object this$errorDescription = getErrorDescription(), other$errorDescription = other.getErrorDescription();
        if ((this$errorDescription == null) ? (other$errorDescription != null) : !this$errorDescription.equals(other$errorDescription))
            return false;
        Object this$data = getData(), other$data = other.getData();
        return !((this$data == null) ? (other$data != null) : !this$data.equals(other$data));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.model.bset.ResponseErrorVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $note = getNote();
        result = result * 59 + (($note == null) ? 43 : $note.hashCode());
        Object $errorCode = getErrorCode();
        result = result * 59 + (($errorCode == null) ? 43 : $errorCode.hashCode());
        Object $errorDescription = getErrorDescription();
        result = result * 59 + (($errorDescription == null) ? 43 : $errorDescription.hashCode());
        Object $data = getData();
        return result * 59 + (($data == null) ? 43 : $data.hashCode());
    }

    public String toString() {
        return "ResponseErrorVo(note=" + getNote() + ", errorCode=" + getErrorCode() + ", errorDescription=" + getErrorDescription() + ", data=" + getData() + ")";
    }

    /* 13 */   public static String SUCCSS_MSG = "成功";
    private String note;
    private String errorCode;
    /* 14 */   public static String FAIL_MSG = "失败";
    private String errorDescription;
    private Object data;

    public String getNote() {
        /* 16 */
        return this.note;
    }

    /* 17 */
    public String getErrorCode() {
        return this.errorCode;
    }

    /* 18 */
    public String getErrorDescription() {
        return this.errorDescription;
    }

    public Object getData() {
        /* 19 */
        return this.data;
    }

    public static cn.com.wms.model.bset.ResponseErrorVo buildFailure(String returncode, String msg) {
        /* 23 */
        cn.com.wms.model.bset.ResponseErrorVo response = new cn.com.wms.model.bset.ResponseErrorVo();
        /* 24 */
        response.setResult(Boolean.valueOf(false));
        /* 25 */
        response.setErrorCode(returncode);
        /* 26 */
        response.setErrorDescription(StringUtils.hasText(msg) ? msg : FAIL_MSG);
        /* 27 */
        return response;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\model\bset\ResponseErrorVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */