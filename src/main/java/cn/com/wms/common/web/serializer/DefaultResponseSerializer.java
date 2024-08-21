 package cn.com.wms.common.web.serializer;

 import cn.com.wms.common.web.serializer.ResponseSerializer;
 import cn.com.wms.common.web.support.ExposerContext;
 import cn.com.wms.common.web.support.ExposerContextHolder;
 import cn.com.wms.model.bset.ResponseVo;
 import com.alibaba.fastjson2.JSONObject;


 public class DefaultResponseSerializer
   implements ResponseSerializer
 {
   public String serialize(ResponseVo baseResponse) {
/* 14 */     ExposerContext exposerContext = ExposerContextHolder.get();
/* 15 */     return JSONObject.toJSONString(baseResponse, new com.alibaba.fastjson2.JSONWriter.Feature[0]);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\web\serializer\DefaultResponseSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */