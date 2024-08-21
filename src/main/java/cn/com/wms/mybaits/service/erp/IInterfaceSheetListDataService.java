package cn.com.wms.mybaits.service.erp;

import cn.com.wms.model.erp.InterfaceSheetList;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

public interface IInterfaceSheetListDataService extends IService<InterfaceSheetList> {
  List<InterfaceSheetList> listByExecuteFlag(Integer paramInteger);
  
  List<InterfaceSheetList> listBySheetTypeAndExecuteFlag(Integer paramInteger1, Integer paramInteger2);
  
  List<String> listSheetBySheetTypeAndExecuteFlag(Integer paramInteger1, Integer paramInteger2);
  
  List<InterfaceSheetList> listGoods();
  
  List<String> listSheetRationNoteJob();
  
  List<InterfaceSheetList> listRationNoteJob();
  
  List<InterfaceSheetList> listRetRationJob();
  
  List<InterfaceSheetList> listRetJob();
  
  List<InterfaceSheetList> listPurchaseJob();
  
  void updateExecuteFlag(String paramString, Integer paramInteger1, Integer paramInteger2);
  
  void updateExecuteFlag(List<String> paramList, Integer paramInteger1, Integer paramInteger2);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\erp\IInterfaceSheetListDataService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */