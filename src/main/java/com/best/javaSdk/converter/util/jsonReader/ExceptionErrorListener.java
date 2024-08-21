/*   */ package BOOT-INF.classes.com.best.javaSdk.converter.util.jsonReader;
/*   */ import com.best.javaSdk.converter.util.jsonReader.BufferErrorListener;
/*   */ 
/*   */ public class ExceptionErrorListener extends BufferErrorListener {
/*   */   public void error(String type, int col) {
/* 6 */     super.error(type, col);
/* 7 */     throw new IllegalArgumentException(this.buffer.toString());
/*   */   }
/*   */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converte\\util\jsonReader\ExceptionErrorListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */