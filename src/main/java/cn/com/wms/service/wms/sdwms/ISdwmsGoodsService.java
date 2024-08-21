package BOOT-INF.classes.cn.com.wms.service.wms.sdwms;

import cn.com.wms.model.wms.sdwms.SdwmsGoods;
import java.util.List;

public interface ISdwmsGoodsService {
  SdwmsGoods getByGoodsId(String paramString);
  
  List<SdwmsGoods> listByGoodsIds(List<String> paramList);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\sdwms\ISdwmsGoodsService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */