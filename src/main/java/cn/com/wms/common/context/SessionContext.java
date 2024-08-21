package cn.com.wms.common.context;

import cn.com.wms.common.context.SessionResource;
import java.util.List;

public interface SessionContext {
  String getEntId();
  
  String getEntCode();
  
  String getEntName();
  
  String getUserId();
  
  String getUserCode();
  
  String getUserName();
  
  String getLocale();
  
  String getSession();
  
  String getToken();
  
  Object getExtend();
  
  List<SessionResource> getResources();
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\context\SessionContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */