package BOOT-INF.classes.cn.com.wms.mybaits.service.sdwms;

import cn.com.wms.model.wms.sdwms.SdwmsRationnote;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

public interface ISdwmsRationnoteDataService extends IService<SdwmsRationnote> {
  List<String> listAllSheet();
  
  void toBak(String paramString);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\sdwms\ISdwmsRationnoteDataService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */