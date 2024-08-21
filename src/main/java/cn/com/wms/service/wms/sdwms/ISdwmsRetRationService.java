package cn.com.wms.service.wms.sdwms;

import cn.com.wms.model.wms.sdwms.SdwmsRetration;
import java.util.List;

public interface ISdwmsRetRationService {
  List<SdwmsRetration> listBySheetId(String paramString);
  
  void toBak(String paramString);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\sdwms\ISdwmsRetRationService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */