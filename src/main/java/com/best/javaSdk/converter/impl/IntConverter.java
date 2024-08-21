/*    */ package BOOT-INF.classes.com.best.javaSdk.converter.impl;
/*    */ 
/*    */ import com.best.javaSdk.Parser;
/*    */ import com.best.javaSdk.converter.Converter;
/*    */ import java.lang.reflect.Field;
/*    */ import org.w3c.dom.Node;
/*    */ 
/*    */ public class IntConverter implements Converter {
/*    */   public Object convertXml(Node node, Field field) {
/* 10 */     Node firstChild = node.getFirstChild();
/* 11 */     return Integer.valueOf(Integer.parseInt(firstChild.getNodeValue()));
/*    */   }
/*    */ 
/*    */   
/*    */   public String xmlReverse(Object propValue, Field prop) {
/* 16 */     String propName = prop.getName();
/* 17 */     return Parser.appendXmlNode(propName, propValue.toString());
/*    */   }
/*    */ 
/*    */   
/*    */   public Object convertJson(Object value, Field field) {
/* 22 */     return Integer.valueOf(Integer.parseInt(value.toString()));
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converter\impl\IntConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */