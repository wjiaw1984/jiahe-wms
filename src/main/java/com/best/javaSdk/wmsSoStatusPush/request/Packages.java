/*    */ package BOOT-INF.classes.com.best.javaSdk.wmsSoStatusPush.request;
/*    */ 
/*    */ import com.alibaba.fastjson2.annotation.JSONField;
/*    */ import com.best.javaSdk.wmsSoStatusPush.request.Package;
/*    */ import java.util.List;
/*    */ 
/*    */ public class Packages {
/*    */   @JSONField(name = "package")
/*    */   private List<Package> items;
/*    */   
/*    */   public String toString() {
/* 12 */     return "Packages(items=" + getItems() + ")"; } public int hashCode() { int PRIME = 59; result = 1; Object<Package> $items = (Object<Package>)getItems(); return result * 59 + (($items == null) ? 43 : $items.hashCode()); } protected boolean canEqual(Object other) { return other instanceof com.best.javaSdk.wmsSoStatusPush.request.Packages; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof com.best.javaSdk.wmsSoStatusPush.request.Packages)) return false;  com.best.javaSdk.wmsSoStatusPush.request.Packages other = (com.best.javaSdk.wmsSoStatusPush.request.Packages)o; if (!other.canEqual(this)) return false;  Object<Package> this$items = (Object<Package>)getItems(), other$items = (Object<Package>)other.getItems(); return !((this$items == null) ? (other$items != null) : !this$items.equals(other$items)); } public void setItems(List<Package> items) { this.items = items; }
/*    */   
/*    */   public List<Package> getItems() {
/* 15 */     return this.items;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\wmsSoStatusPush\request\Packages.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */