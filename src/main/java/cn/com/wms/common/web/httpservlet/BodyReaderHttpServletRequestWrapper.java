 package cn.com.wms.common.web.httpservlet;

 import java.io.BufferedReader;
 import java.io.ByteArrayInputStream;
 import java.io.ByteArrayOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.InputStreamReader;
 import java.nio.charset.Charset;
 import javax.servlet.ServletInputStream;
 import javax.servlet.ServletRequest;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletRequestWrapper;

 public class BodyReaderHttpServletRequestWrapper extends HttpServletRequestWrapper {
   private final byte[] body;

   public BodyReaderHttpServletRequestWrapper(HttpServletRequest request) throws IOException {
/* 19 */     super(request);
/* 20 */     String sessionStream = getBodyString((ServletRequest)request);
/* 21 */     this.body = sessionStream.getBytes(Charset.forName("UTF-8"));
   }







   public String getBodyString(ServletRequest request) {
/* 31 */     StringBuilder sb = new StringBuilder();
/* 32 */     InputStream inputStream = null;
/* 33 */     BufferedReader reader = null;
     try {
/* 35 */       inputStream = cloneInputStream(request.getInputStream());
/* 36 */       reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
/* 37 */       String line = "";
/* 38 */       while ((line = reader.readLine()) != null) {
/* 39 */         sb.append(line);
       }
/* 41 */     } catch (IOException e) {
/* 42 */       e.printStackTrace();
     } finally {
/* 44 */       if (inputStream != null) {
         try {
/* 46 */           inputStream.close();
/* 47 */         } catch (IOException e) {
/* 48 */           e.printStackTrace();
         }
       }
/* 51 */       if (reader != null) {
         try {
/* 53 */           reader.close();
/* 54 */         } catch (IOException e) {
/* 55 */           e.printStackTrace();
         }
       }
     }
/* 59 */     return sb.toString();
   }







   public InputStream cloneInputStream(ServletInputStream inputStream) {
/* 69 */     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
     try {
/* 71 */       byte[] buffer = new byte[1024];

       int len;
/* 74 */       while ((len = inputStream.read(buffer)) > -1) {
/* 75 */         byteArrayOutputStream.write(buffer, 0, len);
       }
/* 77 */       byteArrayOutputStream.flush();
/* 78 */     } catch (IOException e) {
/* 79 */       e.printStackTrace();
     }
/* 81 */     InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
/* 82 */     return byteArrayInputStream;
   }


   public BufferedReader getReader() throws IOException {
/* 87 */     return new BufferedReader(new InputStreamReader((InputStream)getInputStream()));
   }



   public ServletInputStream getInputStream() throws IOException {
/* 93 */     ByteArrayInputStream bais = new ByteArrayInputStream(this.body);

/* 95 */     return (ServletInputStream)new Object(this, bais);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\web\httpservlet\BodyReaderHttpServletRequestWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */