/*    */ package BOOT-INF.classes.cn.com.wms.common.reflect.utils;
/*    */ 
/*    */ import java.beans.PropertyDescriptor;
/*    */ import java.lang.reflect.Field;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashSet;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ReflectUtils
/*    */ {
/*    */   public static final Class getClass(Object obj) {
/* 29 */     Class<?> clazz = obj.getClass();
/* 30 */     String className = clazz.getName();
/*    */ 
/*    */     
/* 33 */     if (className.contains("$$")) {
/* 34 */       String realClazzName = className.substring(0, className.indexOf("$$"));
/*    */       
/*    */       try {
/* 37 */         clazz = Class.forName(realClazzName);
/* 38 */       } catch (ClassNotFoundException e) {
/* 39 */         throw new RuntimeException(e.getMessage(), e);
/*    */       } 
/*    */     } 
/*    */     
/* 43 */     return clazz;
/*    */   }
/*    */   
/*    */   public static List<Field> getAllFields(Class clazz) {
/* 47 */     List<Field> fieldList = new ArrayList<>();
/*    */     
/* 49 */     Class tempClass = clazz;
/*    */ 
/*    */     
/* 52 */     while (tempClass != null) {
/* 53 */       Field[] tmpFieldList = tempClass.getDeclaredFields();
/*    */       
/* 55 */       for (Field field : tmpFieldList) {
/* 56 */         String str = field.toString();
/*    */ 
/*    */         
/* 59 */         if (!str.contains("final ") && !str.contains("static "))
/*    */         {
/*    */ 
/*    */           
/* 63 */           fieldList.add(field);
/*    */         }
/*    */       } 
/* 66 */       tempClass = tempClass.getSuperclass();
/*    */     } 
/*    */     
/* 69 */     return fieldList;
/*    */   }
/*    */   
/*    */   public static Set<String> getAllFieldName(Class clazz) {
/* 73 */     List<Field> fieldList = getAllFields(clazz);
/*    */     
/* 75 */     Set<String> fieleNameSet = new HashSet<>();
/* 76 */     fieldList.forEach(item -> fieleNameSet.add(item.getName()));
/*    */ 
/*    */     
/* 79 */     return fieleNameSet;
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean isJavaBean(Class<?> clazz) {
/* 84 */     if ((clazz.getConstructors()).length != 1) {
/* 85 */       return false;
/*    */     }
/*    */ 
/*    */     
/*    */     try {
/* 90 */       PropertyDescriptor pd = new PropertyDescriptor("propertyName", clazz);
/* 91 */       return (pd != null);
/* 92 */     } catch (Exception e) {
/*    */       
/* 94 */       return false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\common\reflec\\utils\ReflectUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */