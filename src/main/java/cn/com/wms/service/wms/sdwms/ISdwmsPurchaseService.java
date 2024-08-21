package cn.com.wms.service.wms.sdwms;

import cn.com.wms.model.wms.sdwms.SdwmsPurchase;
import java.util.List;

public interface ISdwmsPurchaseService {
  List<SdwmsPurchase> listBySheetId(String paramString);
  
  void toBak(String paramString);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\sdwms\ISdwmsPurchaseService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */