package cn.com.wms.common.reflect.meta.support;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import javax.validation.Valid;

import lombok.Data;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class ParamInfo {
    private Class type;
    private Class actualType;
    private Type[] actualTypeList;
    private RequestParam requestParam;

    public void setType(Class type) {
        this.type = type;
    }

    private Validated validated;
    private Valid valid;
    private Annotation[] annotations;
    private String paramName;

    public void setActualType(Class actualType) {
        this.actualType = actualType;
    }

    public void setActualTypeList(Type[] actualTypeList) {
        this.actualTypeList = actualTypeList;
    }

    public void setRequestParam(RequestParam requestParam) {
        this.requestParam = requestParam;
    }

    public void setValidated(Validated validated) {
        this.validated = validated;
    }

    public void setValid(Valid valid) {
        this.valid = valid;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof cn.com.wms.common.reflect.meta.support.ParamInfo)) return false;
        cn.com.wms.common.reflect.meta.support.ParamInfo other = (cn.com.wms.common.reflect.meta.support.ParamInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$type = getType(), other$type = other.getType();
        if ((this$type == null) ? (other$type != null) : !this$type.equals(other$type)) return false;
        Object this$actualType = getActualType(), other$actualType = other.getActualType();
        if ((this$actualType == null) ? (other$actualType != null) : !this$actualType.equals(other$actualType))
            return false;
        if (!Arrays.deepEquals((Object[]) getActualTypeList(), (Object[]) other.getActualTypeList())) return false;
        Object this$requestParam = getRequestParam(), other$requestParam = other.getRequestParam();
        if ((this$requestParam == null) ? (other$requestParam != null) : !this$requestParam.equals(other$requestParam))
            return false;
        Object this$validated = getValidated(), other$validated = other.getValidated();
        if ((this$validated == null) ? (other$validated != null) : !this$validated.equals(other$validated))
            return false;
        Object this$valid = getValid(), other$valid = other.getValid();
        if ((this$valid == null) ? (other$valid != null) : !this$valid.equals(other$valid)) return false;
        if (!Arrays.deepEquals((Object[]) getAnnotations(), (Object[]) other.getAnnotations())) return false;
        Object this$paramName = getParamName(), other$paramName = other.getParamName();
        return !((this$paramName == null) ? (other$paramName != null) : !this$paramName.equals(other$paramName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.common.reflect.meta.support.ParamInfo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $type = getType();
        result = result * 59 + (($type == null) ? 43 : $type.hashCode());
        Object $actualType = getActualType();
        result = result * 59 + (($actualType == null) ? 43 : $actualType.hashCode());
        result = result * 59 + Arrays.deepHashCode((Object[]) getActualTypeList());
        Object $requestParam = getRequestParam();
        result = result * 59 + (($requestParam == null) ? 43 : $requestParam.hashCode());
        Object $validated = getValidated();
        result = result * 59 + (($validated == null) ? 43 : $validated.hashCode());
        Object $valid = getValid();
        result = result * 59 + (($valid == null) ? 43 : $valid.hashCode());
        result = result * 59 + Arrays.deepHashCode((Object[]) getAnnotations());
        Object $paramName = getParamName();
        return result * 59 + (($paramName == null) ? 43 : $paramName.hashCode());
    }

    public String toString() {
        return "ParamInfo(type=" + getType() + ", actualType=" + getActualType() + ", actualTypeList=" + Arrays.deepToString((Object[]) getActualTypeList()) + ", requestParam=" + getRequestParam() + ", validated=" + getValidated() + ", valid=" + getValid() + ", annotations=" + Arrays.deepToString((Object[]) getAnnotations()) + ", paramName=" + getParamName() + ")";
    }

    public Class getType() {
        return this.type;
    }

    public Class getActualType() {
        return this.actualType;
    }

    public Type[] getActualTypeList() {
        return this.actualTypeList;
    }

    public RequestParam getRequestParam() {
        return this.requestParam;
    }

    public Validated getValidated() {
        return this.validated;
    }

    public Valid getValid() {
        return this.valid;
    }

    public Annotation[] getAnnotations() {
        return this.annotations;
    }

    public String getParamName() {
        if (this.paramName != null) {
            return this.paramName;
        }

        if (this.requestParam == null) {
            return null;
        }

        if (StringUtils.hasText(this.requestParam.value())) {
            this.paramName = this.requestParam.value();
        } else if (StringUtils.hasText(this.requestParam.name())) {
            this.paramName = this.requestParam.name();
        }

        return this.paramName;
    }

    public boolean hasRequestParam() {
        return (this.requestParam != null);
    }

    public boolean hasValidated() {
        return (this.valid != null || this.validated != null);
    }

    public void setAnnotations(Annotation[] annotations) {
        this.annotations = annotations;

        if (annotations == null || annotations.length == 0) {
            return;
        }

        for (int i = 0; i < annotations.length; i++) {
            Annotation annotation = annotations[i];

            if (annotation.annotationType().equals(RequestParam.class)) {
                this.requestParam = (RequestParam) annotation;
            } else if (annotation.annotationType().equals(Validated.class)) {
                this.validated = (Validated) annotation;
            } else if (annotation.annotationType().equals(Valid.class)) {
                this.valid = (Valid) annotation;
            }
        }
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflect\meta\support\ParamInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */