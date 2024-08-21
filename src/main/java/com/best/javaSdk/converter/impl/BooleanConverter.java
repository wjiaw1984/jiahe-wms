 package com.best.javaSdk.converter.impl;

 import com.best.javaSdk.Parser;
 import com.best.javaSdk.converter.Converter;
 import java.lang.reflect.Field;
 import org.w3c.dom.Node;

 public class BooleanConverter
   implements Converter {
   public Object convertXml(Node node, Field field) {
/* 11 */     Node firstChild = node.getFirstChild();
/* 12 */     return Boolean.valueOf(Boolean.parseBoolean(firstChild.getNodeValue()));
   }


   public String xmlReverse(Object propValue, Field prop) {
/* 17 */     String propName = prop.getName();
/* 18 */     return Parser.appendXmlNode(propName, propValue.toString());
   }


   public Object convertJson(Object value, Field field) {
/* 23 */     return Boolean.valueOf(Boolean.parseBoolean(value.toString()));
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converter\impl\BooleanConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */