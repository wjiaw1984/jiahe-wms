 package cn.com.wms.service.erp.impl;
 
 import cn.com.wms.model.erp.ShopContact;
 import cn.com.wms.mybaits.service.erp.IShopContactDataService;
 import cn.com.wms.service.erp.IShopContactService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 
 
 
 @Service
 public class ShopContactServiceImpl
   implements IShopContactService
 {
   @Autowired
   IShopContactDataService shopContactDataService;
   
   public ShopContact getByShopId(String shopId) {
/* 22 */     return this.shopContactDataService.getByShopId(shopId);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\erp\impl\ShopContactServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */