/*    */ package BOOT-INF.classes.com.best.javaSdk.tmsWaybillApply.request;
/*    */ 
/*    */ import com.best.javaSdk.tmsWaybillApply.request.Receiver;
/*    */ import com.best.javaSdk.tmsWaybillApply.request.Sender;
/*    */ 
/*    */ 
/*    */ public class Order
/*    */ {
/*    */   private Sender sender;
/*    */   private String note;
/*    */   private double parcelWeight;
/*    */   private String customerOrderCode;
/*    */   private Receiver receiver;
/*    */   
/*    */   public Sender getSender() {
/* 16 */     return this.sender;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setSender(Sender value) {
/* 21 */     this.sender = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getNote() {
/* 26 */     return this.note;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setNote(String value) {
/* 31 */     this.note = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public double getParcelWeight() {
/* 36 */     return this.parcelWeight;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParcelWeight(double value) {
/* 41 */     this.parcelWeight = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getCustomerOrderCode() {
/* 46 */     return this.customerOrderCode;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setCustomerOrderCode(String value) {
/* 51 */     this.customerOrderCode = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public Receiver getReceiver() {
/* 56 */     return this.receiver;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setReceiver(Receiver value) {
/* 61 */     this.receiver = value;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\tmsWaybillApply\request\Order.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */