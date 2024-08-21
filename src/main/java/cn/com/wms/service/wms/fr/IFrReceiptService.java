package cn.com.wms.service.wms.fr;

import cn.com.wms.model.wms.fr.FrReceipt;
import com.best.javaSdk.wmsAsnStatusPush.request.WmsAnsStatusPushReq;
import java.util.List;

public interface IFrReceiptService {
  void save(FrReceipt paramFrReceipt);
  
  void batchSave(List<FrReceipt> paramList);
  
  void toReceipt(WmsAnsStatusPushReq paramWmsAnsStatusPushReq);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\fr\IFrReceiptService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */