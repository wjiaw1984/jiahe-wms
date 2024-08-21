package cn.com.wms.common.reflect;

import com.alibaba.fastjson2.JSONObject;

public interface ComponentInvoker {
  Object invoke(String paramString1, String paramString2, Object... paramVarArgs);
  
  Object invoke(String paramString, JSONObject paramJSONObject);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflect\ComponentInvoker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */