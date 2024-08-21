package BOOT-INF.classes.cn.com.wms.service.wms.fr;

import cn.com.wms.model.wms.fr.FrRetRation;
import com.best.javaSdk.wmsrmastatuspush.request.WmsRmaStatusPushReq;
import java.util.List;

public interface IFrRetRationService {
  void save(FrRetRation paramFrRetRation);
  
  void batchSave(List<FrRetRation> paramList);
  
  void toFrRetRation(WmsRmaStatusPushReq paramWmsRmaStatusPushReq);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\fr\IFrRetRationService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */