/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsAsnStatusPush.request;
/*    */ 
/*    */ import com.best.javaSdk.wmsAsnStatusPush.request.Batch;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class Batchs
/*    */ {
/*    */   private List<Batch> batch;
/*    */   
/*    */   public String toString() {
/* 12 */     return "Batchs(batch=" + getBatch() + ")"; } public int hashCode() { int PRIME = 59; result = 1; Object<Batch> $batch = (Object<Batch>)getBatch(); return result * 59 + (($batch == null) ? 43 : $batch.hashCode()); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsAsnStatusPush.request.Batchs; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsAsnStatusPush.request.Batchs)) return false;  com.best.javaSdk.wmsAsnStatusPush.request.Batchs other = (com.best.javaSdk.wmsAsnStatusPush.request.Batchs)o; if (!other.canEqual(this)) return false;  Object<Batch> this$batch = (Object<Batch>)getBatch(), other$batch = (Object<Batch>)other.getBatch(); return !((this$batch == null) ? (other$batch != null) : !this$batch.equals(other$batch)); } public void setBatch(List<Batch> batch) { this.batch = batch; }
/*    */    public List<Batch> getBatch() {
/* 14 */     return this.batch;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsAsnStatusPush\request\Batchs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */