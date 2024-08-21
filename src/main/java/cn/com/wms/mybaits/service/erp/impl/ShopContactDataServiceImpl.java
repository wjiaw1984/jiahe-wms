 package cn.com.wms.mybaits.service.erp.impl;

 import cn.com.wms.model.erp.ShopContact;
 import cn.com.wms.mybaits.dao.erp.IShopContactDao;
 import cn.com.wms.mybaits.service.erp.IShopContactDataService;
 import com.baomidou.mybatisplus.core.conditions.Wrapper;
 import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
 import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Component;

 @Component
 public class ShopContactDataServiceImpl
   extends ServiceImpl<IShopContactDao, ShopContact> implements IShopContactDataService {
/* 16 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.mybaits.service.erp.impl.ShopContactDataServiceImpl.class);



   public ShopContact getByShopId(String shopId) {
/* 21 */     QueryWrapper<ShopContact> qw = new QueryWrapper();
/* 22 */     qw.eq("shopid", shopId);
/* 23 */     return (ShopContact)getOne((Wrapper)qw);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\mybaits\service\erp\impl\ShopContactDataServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */