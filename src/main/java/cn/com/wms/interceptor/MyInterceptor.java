 package cn.com.wms.interceptor;
 import cn.com.wms.common.web.httpservlet.BodyReaderHttpServletRequestWrapper;
 import com.alibaba.fastjson2.JSONObject;
 import java.io.ByteArrayInputStream;
 import java.io.ByteArrayOutputStream;
 import java.io.IOException;
 import java.io.InputStream;
 import javax.servlet.ServletInputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Component;
 import org.springframework.util.StringUtils;
 import org.springframework.web.servlet.HandlerInterceptor;
 import org.springframework.web.servlet.ModelAndView;

 @Component
 public class MyInterceptor implements HandlerInterceptor {
/* 20 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.interceptor.MyInterceptor.class);





   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
/* 27 */     Thread th = Thread.currentThread();
/* 28 */     String url = request.getRequestURI();
/* 29 */     log.warn("线程【" + th.getId() + "】请求URL:" + url);
/* 30 */     long startTime = System.currentTimeMillis();
/* 31 */     request.setAttribute("startTime", Long.valueOf(startTime));
/* 32 */     String body = (new BodyReaderHttpServletRequestWrapper(request)).getBodyString((ServletRequest)request);
/* 33 */     JSONObject jsonObject = JSONObject.parseObject(body);
/* 34 */     log.warn("线程【" + th.getId() + "】接收到的BODY:" + body);
/* 35 */     String data = body;

/* 37 */     return true;
   }


   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
/* 42 */     Thread th = Thread.currentThread();
/* 43 */     long startTime = ((Long)request.getAttribute("startTime")).longValue();
/* 44 */     long endTime = System.currentTimeMillis();
/* 45 */     long executeTime = endTime - startTime;
/* 46 */     if (!StringUtils.isEmpty(request.getParameter("method"))) {
/* 47 */       log.warn("线程【" + th.getId() + "】请求：" + request.getRequestURI() + "，执行方法：" + request.getParameter("method") + "，执行用时：" + executeTime + "ms");
/* 48 */       if (executeTime > 5000L) {
/* 49 */         log.error("线程【" + th.getId() + "】请求慢日志：" + request.getRequestURI() + "，执行方法：" + request.getParameter("method") + "，执行用时：" + executeTime + "ms");
       }
     } else {
/* 52 */       log.warn("线程【" + th.getId() + "】请求：" + request.getRequestURI() + "，执行用时：" + executeTime + "ms");
/* 53 */       if (executeTime > 5000L) {
/* 54 */         log.error("线程【" + th.getId() + "】请求慢日志：" + request.getRequestURI() + "，执行用时：" + executeTime + "ms");
       }
     }
/* 57 */     if (modelAndView != null) {
/* 58 */       log.warn("线程【" + th.getId() + "】请求响应结果:" + modelAndView.getModelMap().toString());
     }
   }







   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {}






   public static InputStream cloneInputStream(ServletInputStream inputStream) {
/* 76 */     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 77 */     byte[] buffer = new byte[1024];
     try {
       int len;
/* 80 */       while ((len = inputStream.read(buffer)) > -1) {
/* 81 */         byteArrayOutputStream.write(buffer, 0, len);
       }
/* 83 */       byteArrayOutputStream.flush();
     }
/* 85 */     catch (IOException e) {
/* 86 */       e.printStackTrace();
     }
/* 88 */     InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
/* 89 */     return byteArrayInputStream;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\interceptor\MyInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */