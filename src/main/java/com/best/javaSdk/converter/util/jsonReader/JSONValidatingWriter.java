/*    */ package BOOT-INF.classes.com.best.javaSdk.converter.util.jsonReader;
/*    */ import com.best.javaSdk.converter.util.jsonReader.JSONErrorListener;
/*    */ import com.best.javaSdk.converter.util.jsonReader.JSONValidator;
/*    */ import com.best.javaSdk.converter.util.jsonReader.StdoutStreamErrorListener;
/*    */ 
/*    */ public class JSONValidatingWriter extends JSONWriter {
/*    */   public JSONValidatingWriter(JSONValidator validator, boolean emitClassName) {
/*  8 */     super(emitClassName);
/*  9 */     this.validator = validator;
/*    */   }
/*    */   private JSONValidator validator;
/*    */   public JSONValidatingWriter(JSONValidator validator) {
/* 13 */     this.validator = validator;
/*    */   }
/*    */   
/*    */   public JSONValidatingWriter(JSONErrorListener listener, boolean emitClassName) {
/* 17 */     this(new JSONValidator(listener), emitClassName);
/*    */   }
/*    */   
/*    */   public JSONValidatingWriter(JSONErrorListener listener) {
/* 21 */     this(new JSONValidator(listener));
/*    */   }
/*    */   
/*    */   public JSONValidatingWriter() {
/* 25 */     this((JSONErrorListener)new StdoutStreamErrorListener());
/*    */   }
/*    */   
/*    */   public JSONValidatingWriter(boolean emitClassName) {
/* 29 */     this((JSONErrorListener)new StdoutStreamErrorListener(), emitClassName);
/*    */   }
/*    */   
/*    */   private String validate(String text) {
/* 33 */     this.validator.validate(text);
/* 34 */     return text;
/*    */   }
/*    */   
/*    */   public String write(Object object) {
/* 38 */     return validate(super.write(object));
/*    */   }
/*    */   
/*    */   public String write(long n) {
/* 42 */     return validate(super.write(n));
/*    */   }
/*    */   
/*    */   public String write(double d) {
/* 46 */     return validate(super.write(d));
/*    */   }
/*    */   
/*    */   public String write(char c) {
/* 50 */     return validate(super.write(c));
/*    */   }
/*    */   
/*    */   public String write(boolean b) {
/* 54 */     return validate(super.write(b));
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converte\\util\jsonReader\JSONValidatingWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */