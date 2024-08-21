package cn.com.wms.common.web.support;

import java.io.Serializable;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

@Data
@Slf4j
public class BaseResponse
        implements Serializable {
    public void setReturncode(String returncode) {
        /* 12 */
        this.returncode = returncode;
    }

    public void setData(Object data) {
        this.data = data;
    }


    public static String SUCCSS_MSG = "成功";
    public static String FAIL_MSG = "失败";
    private String returncode;
    private Object data;

    /* 18 */
    public String getReturncode() {
        return this.returncode;
    }

    public Object getData() {
        /* 19 */
        return this.data;
    }

    public static cn.com.wms.common.web.support.BaseResponse buildSuccess(Object obj) {
        /* 23 */
        cn.com.wms.common.web.support.BaseResponse response = new cn.com.wms.common.web.support.BaseResponse();
        /* 24 */
        response.setReturncode("0");
        /* 25 */
        response.setData(obj);
        /* 26 */
        return response;
    }


    public static cn.com.wms.common.web.support.BaseResponse buildFailure(String returncode) {
        /* 31 */
        return buildFailure(returncode, null);
    }


    public static cn.com.wms.common.web.support.BaseResponse buildFailure(String returncode, String msg) {
        cn.com.wms.common.web.support.BaseResponse response = new cn.com.wms.common.web.support.BaseResponse();
        response.setReturncode(returncode);
        response.setData(StringUtils.hasText(msg) ? msg : FAIL_MSG);
        return response;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\web\support\BaseResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */