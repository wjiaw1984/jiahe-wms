package BOOT-INF.classes.cn.com.wms.common.reflect.deserializer;

import com.alibaba.fastjson2.JSONObject;

public interface BeanDeserializer {
  Object deserializer(JSONObject paramJSONObject);
  
  Class supportType();
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflect\deserializer\BeanDeserializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */