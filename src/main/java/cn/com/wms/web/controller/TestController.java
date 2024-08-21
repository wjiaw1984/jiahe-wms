package cn.com.wms.web.controller;

import cn.com.wms.common.context.SessionContextHolder;
import cn.com.wms.common.reflect.ComponentInvoker;
import cn.com.wms.common.utils.BaseException;
import cn.com.wms.common.web.support.ExposerContextHolder;
import cn.com.wms.model.bset.ResponseErrorVo;
import cn.com.wms.model.bset.ResponseVo;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping({"/test"})
@Slf4j
public class TestController {


    @Autowired
    protected ComponentInvoker componentInvoker;


    @RequestMapping(value = {"/rest"}, method = {RequestMethod.POST})
    public ResponseVo onRest(@RequestParam(value = "method", required = false) String method, @RequestParam(value = "ent_id", required = false) String ent_id, @RequestParam(value = "token", required = false) String token, @RequestBody String body) {
        ResponseErrorVo responseErrorVo;
        /* 39 */
        ResponseVo baseResponse = null;

        try {
            if (StringUtils.isEmpty(body)) {
                throw new BaseException("10", "缺少必要参数");
            }
            /* 44 */
            JSONObject jsonObject = JSONObject.parseObject(body);
            /* 45 */
            Object result = this.componentInvoker.invoke(method, jsonObject);

            /* 62 */
            return ResponseVo.buildSuccess(result);
        } catch (BaseException e) {
            log.error("BaseException:" + e.getMessage());
            String code = StringUtils.hasText(e.getErrorCode()) ? e.getErrorCode() : "10000";
            String msg = e.getMessage();
            return ResponseErrorVo.buildFailure(code, msg);
        } catch (RuntimeException e) {
            log.error(e.getMessage());
            return ResponseErrorVo.buildFailure("10000", e.getMessage());
        } finally {
            Exception exception = null;
            SessionContextHolder.remove();
            ExposerContextHolder.remove();
        }

    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\web\controller\TestController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */