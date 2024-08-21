package cn.com.wms.mybaits.service.erp;

import cn.com.wms.model.erp.ShopContact;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IShopContactDataService extends IService<ShopContact> {
  ShopContact getByShopId(String paramString);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\erp\IShopContactDataService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */