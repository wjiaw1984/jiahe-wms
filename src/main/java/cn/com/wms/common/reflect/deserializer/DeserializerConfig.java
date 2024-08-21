/*    */ package BOOT-INF.classes.cn.com.wms.common.reflect.deserializer;
/*    */ import cn.com.wms.common.reflect.deserializer.BeanDeserializer;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class DeserializerConfig {
/*  7 */   private static cn.com.wms.common.reflect.deserializer.DeserializerConfig global = new cn.com.wms.common.reflect.deserializer.DeserializerConfig();
/*    */   
/*  9 */   private Map<Class, BeanDeserializer> beanDeserializerMap = (Map)new HashMap<>();
/*    */   
/*    */   public static cn.com.wms.common.reflect.deserializer.DeserializerConfig getGlobalInstance() {
/* 12 */     return global;
/*    */   }
/*    */   
/*    */   public void put(Class beanClazz, BeanDeserializer beanDeserializer) {
/* 16 */     this.beanDeserializerMap.put(beanClazz, beanDeserializer);
/*    */   }
/*    */   
/*    */   public BeanDeserializer get(Class beanClazz) {
/* 20 */     return this.beanDeserializerMap.get(beanClazz);
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflect\deserializer\DeserializerConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */