 package com.best.javaSdk;
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.PrintWriter;
 import java.net.URL;
 import java.net.URLConnection;
 import java.net.URLEncoder;
 import java.util.Map;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 
 public class HttpService {
/* 13 */   private static final Logger log = LoggerFactory.getLogger(com.best.javaSdk.HttpService.class);
   
   public static String sendPost(String url, Map<String, String> paramMap, Map<String, String> headerMap) throws Exception {
/* 16 */     StringBuffer buffer = new StringBuffer();
/* 17 */     StringBuffer result = new StringBuffer();
     
/* 19 */     URL httpUrl = new URL(url);
     
/* 21 */     URLConnection connection = httpUrl.openConnection();
/* 22 */     connection.setRequestProperty("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
/* 23 */     connection.setRequestProperty("connection", "keep-alive");
/* 24 */     connection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:34.0) Gecko/20100101 Firefox/34.0");
/* 25 */     connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
/* 26 */     connection.setDoOutput(true);
/* 27 */     connection.setDoInput(true);
/* 28 */     if (headerMap != null && !headerMap.isEmpty()) {
/* 29 */       for (Map.Entry<String, String> entry : headerMap.entrySet()) {
/* 30 */         connection.setRequestProperty(entry.getKey(), URLEncoder.encode(entry.getValue(), "utf-8"));
       }
     }
     
/* 34 */     PrintWriter printWriter = new PrintWriter(connection.getOutputStream());
/* 35 */     String request = "";
/* 36 */     if (paramMap != null && !paramMap.isEmpty()) {
/* 37 */       for (Map.Entry<String, String> entry : paramMap.entrySet()) {
/* 38 */         buffer.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), "utf-8")).append("&");
       }
       
/* 41 */       request = buffer.toString().substring(0, buffer.toString().length() - 1);
     } 
     
/* 44 */     printWriter.print(request);
/* 45 */     printWriter.flush();
/* 46 */     connection.connect();
     
/* 48 */     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
     String line;
/* 50 */     while ((line = bufferedReader.readLine()) != null) {
/* 51 */       result.append(line);
     }
/* 53 */     bufferedReader.close();
/* 54 */     return result.toString();
   }
   
   public static String sendPost(String url, Map<String, String> paramMap, Map<String, String> headerMap, String body) throws Exception {
/* 58 */     StringBuffer buffer = new StringBuffer();
/* 59 */     StringBuffer result = new StringBuffer();
/* 60 */     String request = "";
/* 61 */     if (paramMap != null && !paramMap.isEmpty()) {
/* 62 */       for (Map.Entry<String, String> entry : paramMap.entrySet()) {
/* 63 */         buffer.append(entry.getKey()).append("=").append(URLEncoder.encode(entry.getValue(), "utf-8")).append("&");
       }
       
/* 66 */       request = buffer.toString().substring(0, buffer.toString().length() - 1);
     } 
 
     
/* 70 */     URL httpUrl = new URL(url + "?" + request);
     
/* 72 */     URLConnection connection = httpUrl.openConnection();
/* 73 */     connection.setRequestProperty("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
/* 74 */     connection.setRequestProperty("connection", "keep-alive");
/* 75 */     connection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:34.0) Gecko/20100101 Firefox/34.0");
/* 76 */     connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
/* 77 */     connection.setDoOutput(true);
/* 78 */     connection.setDoInput(true);
/* 79 */     if (headerMap != null && !headerMap.isEmpty()) {
/* 80 */       for (Map.Entry<String, String> entry : headerMap.entrySet()) {
/* 81 */         connection.setRequestProperty(entry.getKey(), URLEncoder.encode(entry.getValue(), "utf-8"));
       }
     }
     
/* 85 */     PrintWriter printWriter = new PrintWriter(connection.getOutputStream());
     
/* 87 */     printWriter.print(body);
/* 88 */     printWriter.flush();
/* 89 */     connection.connect();
     
/* 91 */     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
     String line;
/* 93 */     while ((line = bufferedReader.readLine()) != null) {
/* 94 */       result.append(line);
     }
/* 96 */     bufferedReader.close();
/* 97 */     return result.toString();
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\HttpService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */