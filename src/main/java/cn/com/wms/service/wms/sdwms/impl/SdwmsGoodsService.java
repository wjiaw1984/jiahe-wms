/*    */ package BOOT-INF.classes.cn.com.wms.service.wms.sdwms.impl;
/*    */ 
/*    */ import cn.com.wms.model.wms.sdwms.SdwmsGoods;
/*    */ import cn.com.wms.mybaits.service.sdwms.ISdwmsGoodsDataService;
/*    */ import cn.com.wms.service.wms.sdwms.ISdwmsGoodsService;
/*    */ import java.util.List;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Service;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ public class SdwmsGoodsService
/*    */   implements ISdwmsGoodsService
/*    */ {
/*    */   @Autowired
/*    */   ISdwmsGoodsDataService sdwmsGoodsDataService;
/*    */   
/*    */   public SdwmsGoods getByGoodsId(String goodsId) {
/* 25 */     return this.sdwmsGoodsDataService.getGoodsInfo(goodsId);
/*    */   }
/*    */ 
/*    */   
/*    */   public List<SdwmsGoods> listByGoodsIds(List<String> goodsIds) {
/* 30 */     return this.sdwmsGoodsDataService.listByGoodsIds(goodsIds);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\service\wms\sdwms\impl\SdwmsGoodsService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */