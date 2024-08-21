package cn.com.wms.common.reflect.meta.support;

import cn.com.wms.common.reflect.meta.support.ParamInfo;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import org.springframework.util.CollectionUtils;

@Data
public class MethodInfo {
    private Class clazz;
    private Method method;

    /* 13 */
    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    private String methodName;
    private Integer paramCount;
    private List<ParamInfo> paramInfoList;

    public void setMethod(Method method) {
        this.method = method;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public void setParamCount(Integer paramCount) {
        this.paramCount = paramCount;
    }

    public void setParamInfoList(List<ParamInfo> paramInfoList) {
        this.paramInfoList = paramInfoList;
    }


    protected boolean canEqual(Object other) {
        return other instanceof cn.com.wms.common.reflect.meta.support.MethodInfo;
    }


    public String toString() {
        return "MethodInfo(clazz=" + getClazz() + ", method=" + getMethod() + ", methodName=" + getMethodName() + ", paramCount=" + getParamCount() + ", paramInfoList=" + getParamInfoList() + ")";
    }

    /* 15 */
    public Class getClazz() {
        return this.clazz;
    }

    /* 16 */
    public Method getMethod() {
        return this.method;
    }

    /* 17 */
    public String getMethodName() {
        return this.methodName;
    }

    /* 18 */
    public Integer getParamCount() {
        return this.paramCount;
    }

    public List<ParamInfo> getParamInfoList() {
        /* 19 */
        return this.paramInfoList;
    }

    public MethodInfo(Class clazz, Method method) {
        /* 22 */
        this.clazz = clazz;
        /* 23 */
        this.method = method;
        /* 24 */
        this.methodName = method.getName();

        /* 26 */
        this.paramCount = Integer.valueOf(0);
        /* 27 */
        this.paramInfoList = new ArrayList<>();
    }


    public int getRequestParamCount() {
        /* 35 */
        int requestParamCount = 0;

        /* 37 */
        if (CollectionUtils.isEmpty(this.paramInfoList)) {
            /* 38 */
            requestParamCount = 0;
        } else {
            /* 40 */
            for (ParamInfo paramInfo : this.paramInfoList) {
                /* 41 */
                if (paramInfo.hasRequestParam()) {
                    /* 42 */
                    requestParamCount++;
                }
            }
        }

        /* 47 */
        return requestParamCount;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflect\meta\support\MethodInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */