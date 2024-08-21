/*    */ package BOOT-INF.classes.com.best.javaSdk.converter.util.jsonReader;
/*    */ 
/*    */ import com.best.javaSdk.converter.util.jsonReader.JSONErrorListener;
/*    */ 
/*    */ public class BufferErrorListener implements JSONErrorListener {
/*    */   protected StringBuffer buffer;
/*    */   
/*    */   public BufferErrorListener(StringBuffer buffer) {
/*  9 */     this.buffer = buffer;
/*    */   }
/*    */   private String input;
/*    */   public BufferErrorListener() {
/* 13 */     this(new StringBuffer());
/*    */   }
/*    */   
/*    */   public void start(String input) {
/* 17 */     this.input = input;
/* 18 */     this.buffer.setLength(0);
/*    */   }
/*    */   
/*    */   public void error(String type, int col) {
/* 22 */     this.buffer.append("expected ");
/* 23 */     this.buffer.append(type);
/* 24 */     this.buffer.append(" at column ");
/* 25 */     this.buffer.append(col);
/* 26 */     this.buffer.append("\n");
/* 27 */     this.buffer.append(this.input);
/* 28 */     this.buffer.append("\n");
/* 29 */     indent(col - 1, this.buffer);
/* 30 */     this.buffer.append("^");
/*    */   }
/*    */   
/*    */   private void indent(int n, StringBuffer ret) {
/* 34 */     for (int i = 0; i < n; i++)
/* 35 */       ret.append(' '); 
/*    */   }
/*    */   
/*    */   public void end() {}
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converte\\util\jsonReader\BufferErrorListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */