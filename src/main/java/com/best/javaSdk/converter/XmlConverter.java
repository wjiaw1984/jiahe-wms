package BOOT-INF.classes.com.best.javaSdk.converter;

import java.lang.reflect.Field;
import org.w3c.dom.Node;

public interface XmlConverter {
  Object convert(Node paramNode, Field paramField);
  
  String reverse(Object paramObject, Field paramField);
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converter\XmlConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */