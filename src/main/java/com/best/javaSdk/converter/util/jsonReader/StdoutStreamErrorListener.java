/*   */ package BOOT-INF.classes.com.best.javaSdk.converter.util.jsonReader;
/*   */ import com.best.javaSdk.converter.util.jsonReader.BufferErrorListener;
/*   */ 
/*   */ public class StdoutStreamErrorListener extends BufferErrorListener {
/*   */   public void end() {
/* 6 */     System.out.print(this.buffer.toString());
/*   */   }
/*   */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converte\\util\jsonReader\StdoutStreamErrorListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */