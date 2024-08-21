/*    */ package BOOT-INF.classes.com.best.javaSdk.twAsnNotify.request;
/*    */ 
/*    */ import cn.com.wms.model.wms.sdwms.SdwmsPurchase;
/*    */ import cn.com.wms.model.wms.sdwms.SdwmsRet;
/*    */ import cn.com.wms.model.wms.sdwms.SdwmsRetration;
/*    */ import com.best.javaSdk.twAsnNotify.request.Item;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import org.springframework.util.CollectionUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ItemList
/*    */ {
/*    */   private List<Item> item;
/*    */   
/*    */   public List<Item> getItem() {
/* 19 */     return this.item;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setItem(List<Item> value) {
/* 24 */     this.item = value;
/*    */   }
/*    */   
/*    */   public ItemList() {
/* 28 */     this.item = new ArrayList<>();
/*    */   }
/*    */   
/*    */   public static com.best.javaSdk.twAsnNotify.request.ItemList buildForPurchase(List<SdwmsPurchase> purchaseList) {
/* 32 */     com.best.javaSdk.twAsnNotify.request.ItemList result = new com.best.javaSdk.twAsnNotify.request.ItemList();
/* 33 */     if (CollectionUtils.isEmpty(purchaseList)) {
/* 34 */       return result;
/*    */     }
/* 36 */     Integer lineNo = Integer.valueOf(1);
/* 37 */     for (SdwmsPurchase purchase : purchaseList) {
/* 38 */       Item item = Item.buildForPurchase(purchase, lineNo);
/* 39 */       result.getItem().add(item);
/* 40 */       Integer integer1 = lineNo, integer2 = lineNo = Integer.valueOf(lineNo.intValue() + 1);
/*    */     } 
/*    */     
/* 43 */     return result;
/*    */   }
/*    */   
/*    */   public static com.best.javaSdk.twAsnNotify.request.ItemList buildForRetration(List<SdwmsRetration> retrationList) {
/* 47 */     com.best.javaSdk.twAsnNotify.request.ItemList result = new com.best.javaSdk.twAsnNotify.request.ItemList();
/* 48 */     if (CollectionUtils.isEmpty(retrationList)) {
/* 49 */       return result;
/*    */     }
/* 51 */     Integer lineNo = Integer.valueOf(1);
/* 52 */     for (SdwmsRetration retration : retrationList) {
/* 53 */       Item item = Item.buildForRetration(retration, lineNo);
/* 54 */       result.getItem().add(item);
/* 55 */       Integer integer1 = lineNo, integer2 = lineNo = Integer.valueOf(lineNo.intValue() + 1);
/*    */     } 
/*    */     
/* 58 */     return result;
/*    */   }
/*    */   
/*    */   public static com.best.javaSdk.twAsnNotify.request.ItemList buildForRet(List<SdwmsRet> retList) {
/* 62 */     com.best.javaSdk.twAsnNotify.request.ItemList result = new com.best.javaSdk.twAsnNotify.request.ItemList();
/* 63 */     if (CollectionUtils.isEmpty(retList)) {
/* 64 */       return result;
/*    */     }
/* 66 */     Integer lineNo = Integer.valueOf(1);
/* 67 */     for (SdwmsRet ret : retList) {
/* 68 */       Item item = Item.buildForRet(ret, lineNo);
/* 69 */       result.getItem().add(item);
/* 70 */       Integer integer1 = lineNo, integer2 = lineNo = Integer.valueOf(lineNo.intValue() + 1);
/*    */     } 
/*    */     
/* 73 */     return result;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twAsnNotify\request\ItemList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */