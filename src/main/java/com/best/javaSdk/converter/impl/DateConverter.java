 package com.best.javaSdk.converter.impl;
 
 import com.best.javaSdk.Parser;
 import com.best.javaSdk.converter.Converter;
 import java.lang.reflect.Field;
 import java.text.DateFormat;
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.TimeZone;
 import org.w3c.dom.Node;
 
 
 
 public class DateConverter
   implements Converter
 {
/* 17 */   private static DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); static {
/* 18 */     format.setTimeZone(TimeZone.getTimeZone("GMT+8"));
   }
 
   
   public Object convertXml(Node node, Field field) {
/* 23 */     Node firstChild = node.getFirstChild();
     try {
/* 25 */       return format.parse(firstChild.getNodeValue().toString());
/* 26 */     } catch (ParseException e) {
/* 27 */       e.printStackTrace();
       
/* 29 */       return null;
     } 
   }
   
   public String xmlReverse(Object propValue, Field prop) {
/* 34 */     String propName = prop.getName();
/* 35 */     return Parser.appendXmlNode(propName, propValue.toString());
   }
 
   
   public Object convertJson(Object value, Field field) {
     try {
/* 41 */       return format.parse(value.toString());
/* 42 */     } catch (ParseException e) {
/* 43 */       e.printStackTrace();
       
/* 45 */       return null;
     } 
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converter\impl\DateConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */