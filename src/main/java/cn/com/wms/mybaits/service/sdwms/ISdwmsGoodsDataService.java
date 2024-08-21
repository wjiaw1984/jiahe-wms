package BOOT-INF.classes.cn.com.wms.mybaits.service.sdwms;

import cn.com.wms.model.wms.sdwms.SdwmsGoods;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

public interface ISdwmsGoodsDataService extends IService<SdwmsGoods> {
  SdwmsGoods getGoodsInfo(String paramString);
  
  List<SdwmsGoods> listByGoodsIds(List<String> paramList);
  
  void toBak(List<SdwmsGoods> paramList);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\sdwms\ISdwmsGoodsDataService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */