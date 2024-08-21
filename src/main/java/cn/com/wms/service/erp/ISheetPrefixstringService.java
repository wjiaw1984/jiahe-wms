package cn.com.wms.service.erp;

import cn.com.wms.model.erp.SheetPrefixstring;

public interface ISheetPrefixstringService {
  SheetPrefixstring getBySheetType(Integer paramInteger);
  
  SheetPrefixstring getByFixString(String paramString);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\erp\ISheetPrefixstringService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */