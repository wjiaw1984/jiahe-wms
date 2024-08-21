
package cn.com.wms.common.utils;



import java.text.MessageFormat;


 public class BaseException extends RuntimeException {

    public void setResult(Boolean result) {
        /*  7 */
        this.result = result;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.common.utils.BaseException)) return false;
        cn.com.wms.common.utils.BaseException other = (cn.com.wms.common.utils.BaseException) o;
        if (!other.canEqual(this)) return false;
        Object this$result = getResult(), other$result = other.getResult();
        if ((this$result == null) ? (other$result != null) : !this$result.equals(other$result)) return false;
        Object this$note = getNote(), other$note = other.getNote();
        if ((this$note == null) ? (other$note != null) : !this$note.equals(other$note)) return false;
        Object this$errorCode = getErrorCode(), other$errorCode = other.getErrorCode();
        if ((this$errorCode == null) ? (other$errorCode != null) : !this$errorCode.equals(other$errorCode))
            return false;
        Object this$errorDescription = getErrorDescription(), other$errorDescription = other.getErrorDescription();
        return !((this$errorDescription == null) ? (other$errorDescription != null) : !this$errorDescription.equals(other$errorDescription));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.common.utils.BaseException;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $result = getResult();
        result = result * 59 + (($result == null) ? 43 : $result.hashCode());
        Object $note = getNote();
        result = result * 59 + (($note == null) ? 43 : $note.hashCode());
        Object $errorCode = getErrorCode();
        result = result * 59 + (($errorCode == null) ? 43 : $errorCode.hashCode());
        Object $errorDescription = getErrorDescription();
        return result * 59 + (($errorDescription == null) ? 43 : $errorDescription.hashCode());
    }

    public String toString() {
        return "BaseException(result=" + getResult() + ", note=" + getNote() + ", errorCode=" + getErrorCode() + ", errorDescription=" + getErrorDescription() + ")";
    }


    /*  9 */   private String note;
    private String errorCode;
    private Boolean result = Boolean.valueOf(false);
    private String errorDescription;

    public Boolean getResult() {
        return this.result;
    }

    /* 10 */
    public String getNote() {
        return this.note;
    }

    /* 11 */
    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDescription() {
        /* 12 */
        return this.errorDescription;

    }






    public BaseException(String message) {
        /* 19 */
        this("-1", message, null);

    }



    public BaseException(String code, String message) {
        /* 23 */
        this(code, message, null);

    }



    public BaseException(String code, String message, Throwable cause) {
        /* 27 */
        super(MessageFormat.format("errorCode:{0},errorDescription:{1}", new Object[]{code, message}), cause);
        /* 28 */
        this.errorCode = code;
        /* 29 */
        this.errorDescription = message;

    }



    public BaseException() {
    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\commo\\utils\BaseException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */