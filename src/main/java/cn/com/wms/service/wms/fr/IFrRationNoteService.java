package cn.com.wms.service.wms.fr;

import cn.com.wms.model.wms.fr.FrRationnote;
import com.best.javaSdk.wmsSoStatusPush.request.WmsSoStatusPushReq;
import java.util.List;

public interface IFrRationNoteService {
  void save(FrRationnote paramFrRationnote);
  
  void batchSave(List<FrRationnote> paramList);
  
  void toRationNote(WmsSoStatusPushReq paramWmsSoStatusPushReq);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\fr\IFrRationNoteService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */