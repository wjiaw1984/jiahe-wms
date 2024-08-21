/*     */ package BOOT-INF.classes.com.best.javaSdk.converter.util.jsonReader;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import java.text.CharacterIterator;
/*     */ import java.text.StringCharacterIterator;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class JSONReader
/*     */ {
/*  17 */   private static final Object OBJECT_END = new Object();
/*  18 */   private static final Object ARRAY_END = new Object();
/*  19 */   private static final Object COLON = new Object();
/*  20 */   private static final Object COMMA = new Object();
/*     */   
/*     */   public static final int FIRST = 0;
/*     */   public static final int CURRENT = 1;
/*     */   public static final int NEXT = 2;
/*  25 */   private static Map<Character, Character> escapes = new HashMap<>(); private CharacterIterator it; private char c; private Object token;
/*     */   static {
/*  27 */     escapes.put(Character.valueOf('"'), Character.valueOf('"'));
/*  28 */     escapes.put(Character.valueOf('\\'), Character.valueOf('\\'));
/*  29 */     escapes.put(Character.valueOf('/'), Character.valueOf('/'));
/*  30 */     escapes.put(Character.valueOf('b'), Character.valueOf('\b'));
/*  31 */     escapes.put(Character.valueOf('f'), Character.valueOf('\f'));
/*  32 */     escapes.put(Character.valueOf('n'), Character.valueOf('\n'));
/*  33 */     escapes.put(Character.valueOf('r'), Character.valueOf('\r'));
/*  34 */     escapes.put(Character.valueOf('t'), Character.valueOf('\t'));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  40 */   private StringBuffer buf = new StringBuffer();
/*     */   
/*     */   private char next() {
/*  43 */     this.c = this.it.next();
/*  44 */     return this.c;
/*     */   }
/*     */   
/*     */   private void skipWhiteSpace() {
/*  48 */     while (Character.isWhitespace(this.c)) {
/*  49 */       next();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object read(CharacterIterator ci, int start) {
/*  60 */     this.it = ci;
/*  61 */     switch (start) {
/*     */       case 0:
/*  63 */         this.c = this.it.first();
/*     */         break;
/*     */       case 1:
/*  66 */         this.c = this.it.current();
/*     */         break;
/*     */       case 2:
/*  69 */         this.c = this.it.next();
/*     */         break;
/*     */     } 
/*  72 */     return read();
/*     */   }
/*     */   
/*     */   public Object read(CharacterIterator it) {
/*  76 */     return read(it, 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object read(String string) {
/*  85 */     return read(new StringCharacterIterator(string), 0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object read() {
/*  93 */     skipWhiteSpace();
/*  94 */     char ch = this.c;
/*  95 */     next();
/*  96 */     switch (ch) { case '"':
/*  97 */         this.token = string();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 123 */         return this.token;case '[': this.token = array(); return this.token;case ']': this.token = ARRAY_END; return this.token;case ',': this.token = COMMA; return this.token;case '{': this.token = object(); return this.token;case '}': this.token = OBJECT_END; return this.token;case ':': this.token = COLON; return this.token;case 't': next(); next(); next(); this.token = Boolean.TRUE; return this.token;case 'f': next(); next(); next(); next(); this.token = Boolean.FALSE; return this.token;case 'n': next(); next(); next(); this.token = null; return this.token; }  this.c = this.it.previous(); if (Character.isDigit(this.c) || this.c == '-') this.token = number();  return this.token;
/*     */   }
/*     */   
/*     */   private Object object() {
/* 127 */     Map<Object, Object> ret = new HashMap<>();
/* 128 */     Object key = read();
/* 129 */     while (this.token != OBJECT_END) {
/* 130 */       read();
/* 131 */       if (this.token != OBJECT_END) {
/* 132 */         ret.put(key, read());
/* 133 */         if (read() == COMMA) {
/* 134 */           key = read();
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 139 */     return ret;
/*     */   }
/*     */   
/*     */   private Object array() {
/* 143 */     List<Object> ret = new ArrayList();
/* 144 */     Object value = read();
/* 145 */     while (this.token != ARRAY_END) {
/* 146 */       ret.add(value);
/* 147 */       if (read() == COMMA) {
/* 148 */         value = read();
/*     */       }
/*     */     } 
/* 151 */     return ret;
/*     */   }
/*     */   
/*     */   private Object number() {
/* 155 */     int length = 0;
/* 156 */     boolean isFloatingPoint = false;
/* 157 */     this.buf.setLength(0);
/*     */     
/* 159 */     if (this.c == '-') {
/* 160 */       add();
/*     */     }
/* 162 */     length += addDigits();
/* 163 */     if (this.c == '.') {
/* 164 */       add();
/* 165 */       length += addDigits();
/* 166 */       isFloatingPoint = true;
/*     */     } 
/* 168 */     if (this.c == 'e' || this.c == 'E') {
/* 169 */       add();
/* 170 */       if (this.c == '+' || this.c == '-') {
/* 171 */         add();
/*     */       }
/* 173 */       addDigits();
/* 174 */       isFloatingPoint = true;
/*     */     } 
/*     */     
/* 177 */     String s = this.buf.toString();
/* 178 */     return isFloatingPoint ? ((length < 17) ? Double.valueOf(s) : new BigDecimal(s)) : ((length < 19) ? Long.valueOf(s) : new BigInteger(s));
/*     */   }
/*     */   
/*     */   private int addDigits() {
/*     */     int ret;
/* 183 */     for (ret = 0; Character.isDigit(this.c); ret++) {
/* 184 */       add();
/*     */     }
/* 186 */     return ret;
/*     */   }
/*     */   
/*     */   private Object string() {
/* 190 */     this.buf.setLength(0);
/* 191 */     while (this.c != '"') {
/* 192 */       if (this.c == '\\') {
/* 193 */         next();
/* 194 */         if (this.c == 'u') {
/* 195 */           add(unicode()); continue;
/*     */         } 
/* 197 */         Object value = escapes.get(Character.valueOf(this.c));
/* 198 */         if (value != null) {
/* 199 */           add(((Character)value).charValue());
/*     */         }
/*     */         continue;
/*     */       } 
/* 203 */       add();
/*     */     } 
/*     */     
/* 206 */     next();
/*     */     
/* 208 */     return this.buf.toString();
/*     */   }
/*     */   
/*     */   private void add(char cc) {
/* 212 */     this.buf.append(cc);
/* 213 */     next();
/*     */   }
/*     */   
/*     */   private void add() {
/* 217 */     add(this.c);
/*     */   }
/*     */   
/*     */   private char unicode() {
/* 221 */     int value = 0;
/* 222 */     for (int i = 0; i < 4; i++) {
/* 223 */       switch (next()) { case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7':
/*     */         case '8':
/*     */         case '9':
/* 226 */           value = (value << 4) + this.c - 48; break;
/*     */         case 'a': case 'b': case 'c': case 'd': case 'e':
/*     */         case 'f':
/* 229 */           value = (value << 4) + this.c - 107; break;
/*     */         case 'A': case 'B': case 'C': case 'D': case 'E':
/*     */         case 'F':
/* 232 */           value = (value << 4) + this.c - 75;
/*     */           break; }
/*     */     
/*     */     } 
/* 236 */     return (char)value;
/*     */   }
/*     */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converte\\util\jsonReader\JSONReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */