/*    */ package BOOT-INF.classes.cn.com.wms.common.web.httpservlet;
/*    */ 
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.IOException;
/*    */ import javax.servlet.ServletOutputStream;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpServletResponseWrapper;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ResponseWrapper
/*    */   extends HttpServletResponseWrapper
/*    */ {
/*    */   private ByteArrayOutputStream buffer;
/*    */   private ServletOutputStream out;
/*    */   
/*    */   public ResponseWrapper(HttpServletResponse httpServletResponse) {
/* 20 */     super(httpServletResponse);
/* 21 */     this.buffer = new ByteArrayOutputStream();
/* 22 */     this.out = (ServletOutputStream)new WrapperOutputStream(this, this.buffer);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ServletOutputStream getOutputStream() throws IOException {
/* 28 */     return this.out;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void flushBuffer() throws IOException {
/* 34 */     if (this.out != null) {
/* 35 */       this.out.flush();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public byte[] getContent() throws IOException {
/* 41 */     flushBuffer();
/* 42 */     return this.buffer.toByteArray();
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\web\httpservlet\ResponseWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */