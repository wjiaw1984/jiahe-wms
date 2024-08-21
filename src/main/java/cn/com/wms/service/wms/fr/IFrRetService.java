package cn.com.wms.service.wms.fr;

import cn.com.wms.model.wms.fr.FrRet;
import com.best.javaSdk.wmsSoStatusPush.request.WmsSoStatusPushReq;
import java.util.List;

public interface IFrRetService {
  void save(FrRet paramFrRet);
  
  void batchSave(List<FrRet> paramList);
  
  void toFrRet(WmsSoStatusPushReq paramWmsSoStatusPushReq);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\fr\IFrRetService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */