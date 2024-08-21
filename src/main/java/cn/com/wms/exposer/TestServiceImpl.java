 package cn.com.wms.exposer;

 import cn.com.wms.service.erp.IShopContactService;
 import cn.com.wms.service.wms.sdwms.ISdwmsGoodsService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.web.bind.annotation.RequestParam;






 @Service("com.wms.test")
 public class TestServiceImpl
 {
   @Autowired
   IShopContactService testService1;
   @Autowired
   ISdwmsGoodsService testService2;

   public Object getByGoodsId(@RequestParam("shopid") String keyValue) {
/* 23 */     return this.testService2.getByGoodsId(keyValue);
   }

   public Object getByShopId(@RequestParam("shopid") String keyValue) {
/* 27 */     return this.testService1.getByShopId(keyValue);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\exposer\TestServiceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */