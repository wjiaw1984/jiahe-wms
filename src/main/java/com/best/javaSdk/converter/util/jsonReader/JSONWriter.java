 package com.best.javaSdk.converter.util.jsonReader;
 import java.beans.BeanInfo;
 import java.beans.IntrospectionException;
 import java.beans.Introspector;
 import java.beans.PropertyDescriptor;
 import java.lang.reflect.Array;
 import java.lang.reflect.Field;
 import java.lang.reflect.InvocationTargetException;
 import java.lang.reflect.Method;
 import java.text.CharacterIterator;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
 import java.util.*;





 public class JSONWriter {
/*  19 */   private StringBuffer buf = new StringBuffer();
/*  20 */   private Stack<Object> calls = new Stack();
   private boolean emitClassName = true;
   private DateFormat format;
   
   public JSONWriter(boolean emitClassName) {
/*  25 */     this.emitClassName = emitClassName;
   }
   
   public JSONWriter() {
/*  29 */     this(false);
   }
   
   public JSONWriter(DateFormat format) {
/*  33 */     this(false);
/*  34 */     this.format = format;
   }
   
   public String write(Object object) {
/*  38 */     this.buf.setLength(0);
/*  39 */     value(object);
/*  40 */     return this.buf.toString();
   }
   
   public String write(long n) {
/*  44 */     return String.valueOf(n);
   }
   
   public String write(double d) {
/*  48 */     return String.valueOf(d);
   }
   
   public String write(char c) {
/*  52 */     return "\"" + c + "\"";
   }
   
   public String write(boolean b) {
/*  56 */     return String.valueOf(b);
   }
   
   private void value(Object object) {
/*  60 */     if (object == null || cyclic(object)) {
/*  61 */       add(null);
     } else {
/*  63 */       this.calls.push(object);
/*  64 */       if (object instanceof Class) { string(object); }
/*  65 */       else if (object instanceof Boolean) { bool(((Boolean)object).booleanValue()); }
/*  66 */       else if (object instanceof Number) { add(object); }
/*  67 */       else if (object instanceof String) { string(object); }
/*  68 */       else if (object instanceof Character) { string(object); }
/*  69 */       else if (object instanceof Map) { map((Map<?, ?>)object); }
/*  70 */       else if (object.getClass().isArray()) { array(object); }
/*  71 */       else if (object instanceof Iterator) { array((Iterator)object); }
/*  72 */       else if (object instanceof Collection) { array(((Collection)object).iterator()); }
/*  73 */       else if (object instanceof Date) { date((Date)object); }
/*  74 */       else { bean(object); }
/*  75 */        this.calls.pop();
     } 
   }
   
   private boolean cyclic(Object object) {
/*  80 */     Iterator<Object> it = this.calls.iterator();
/*  81 */     while (it.hasNext()) {
/*  82 */       Object called = it.next();
/*  83 */       if (object == called) return true; 
     } 
/*  85 */     return false;
   }
   
   private void bean(Object object) {
/*  89 */     add("{");
     
/*  91 */     boolean addedSomething = false;
     try {
/*  93 */       BeanInfo info = Introspector.getBeanInfo(object.getClass());
/*  94 */       PropertyDescriptor[] props = info.getPropertyDescriptors();
/*  95 */       for (int i = 0; i < props.length; i++) {
/*  96 */         PropertyDescriptor prop = props[i];
/*  97 */         String name = prop.getName();
/*  98 */         Method accessor = prop.getReadMethod();
/*  99 */         if ((this.emitClassName || !"class".equals(name)) && accessor != null) {
/* 100 */           if (!accessor.isAccessible()) accessor.setAccessible(true); 
/* 101 */           Object value = accessor.invoke(object, (Object[])null);
/* 102 */           if (value != null) {
/* 103 */             if (addedSomething) add(','); 
/* 104 */             add(name, value);
/* 105 */             addedSomething = true;
           } 
         } 
/* 108 */       }  Field[] ff = object.getClass().getFields();
/* 109 */       for (int j = 0; j < ff.length; j++) {
/* 110 */         Field field = ff[j];
/* 111 */         Object value = field.get(object);
/* 112 */         if (value != null)
/* 113 */         { if (addedSomething) add(','); 
/* 114 */           add(field.getName(), value);
/* 115 */           addedSomething = true; } 
       } 
/* 117 */     } catch (IllegalAccessException iae) {
/* 118 */       iae.printStackTrace();
/* 119 */     } catch (InvocationTargetException ite) {
/* 120 */       ite.getCause().printStackTrace();
/* 121 */       ite.printStackTrace();
/* 122 */     } catch (IntrospectionException ie) {
/* 123 */       ie.printStackTrace();
     } 
/* 125 */     add("}");
   }
   
   private void add(String name, Object value) {
/* 129 */     add('"');
/* 130 */     add(name);
/* 131 */     add("\":");
/* 132 */     value(value);
   }
   
   private void map(Map<?, ?> map) {
/* 136 */     add("{");
/* 137 */     Iterator<?> it = map.entrySet().iterator();
/* 138 */     while (it.hasNext()) {
/* 139 */       Map.Entry<?, ?> e = (Map.Entry<?, ?>)it.next();
/* 140 */       value(e.getKey());
/* 141 */       add(":");
/* 142 */       value(e.getValue());
/* 143 */       if (it.hasNext()) add(','); 
     } 
/* 145 */     add("}");
   }
   
   private void array(Iterator<?> it) {
/* 149 */     add("[");
/* 150 */     while (it.hasNext()) {
/* 151 */       value(it.next());
/* 152 */       if (it.hasNext()) add(","); 
     } 
/* 154 */     add("]");
   }
   
   private void array(Object object) {
/* 158 */     add("[");
/* 159 */     int length = Array.getLength(object);
/* 160 */     for (int i = 0; i < length; i++) {
/* 161 */       value(Array.get(object, i));
/* 162 */       if (i < length - 1) add(','); 
     } 
/* 164 */     add("]");
   }
   
   private void bool(boolean b) {
/* 168 */     add(b ? "true" : "false");
   }
   
   private void date(Date date) {
/* 172 */     if (this.format == null) {
/* 173 */       this.format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 174 */       this.format.setTimeZone(TimeZone.getTimeZone("GMT+8"));
     } 
/* 176 */     add("\"");
/* 177 */     add(this.format.format(date));
/* 178 */     add("\"");
   }
   
   private void string(Object obj) {
/* 182 */     add('"');
/* 183 */     CharacterIterator it = new StringCharacterIterator(obj.toString());
/* 184 */     for (char c = it.first(); c != Character.MAX_VALUE; c = it.next()) {
/* 185 */       if (c == '"') { add("\\\""); }
/* 186 */       else if (c == '\\') { add("\\\\"); }
/* 187 */       else if (c == '/') { add("\\/"); }
/* 188 */       else if (c == '\b') { add("\\b"); }
/* 189 */       else if (c == '\f') { add("\\f"); }
/* 190 */       else if (c == '\n') { add("\\n"); }
/* 191 */       else if (c == '\r') { add("\\r"); }
/* 192 */       else if (c == '\t') { add("\\t"); }
/* 193 */       else if (Character.isISOControl(c))
/* 194 */       { unicode(c); }
       else
/* 196 */       { add(c); }
     
     } 
/* 199 */     add('"');
   }
   
   private void add(Object obj) {
/* 203 */     this.buf.append(obj);
   }
   
   private void add(char c) {
/* 207 */     this.buf.append(c);
   }
   
/* 210 */   static char[] hex = "0123456789ABCDEF".toCharArray();
   
   private void unicode(char c) {
/* 213 */     add("\\u");
/* 214 */     int n = c;
/* 215 */     for (int i = 0; i < 4; i++) {
/* 216 */       int digit = (n & 0xF000) >> 12;
/* 217 */       add(hex[digit]);
/* 218 */       n <<= 4;
     } 
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converte\\util\jsonReader\JSONWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */