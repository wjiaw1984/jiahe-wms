 package com.best.javaSdk.converter.util.jsonReader;
 
 public class JSONValidatingReader extends JSONReader {
/*  4 */   public static final Object INVALID = new Object();
   private JSONValidator validator;
   
   public JSONValidatingReader(JSONValidator validator) {
/*  8 */     this.validator = validator;
   }
   
   public JSONValidatingReader(ExceptionErrorListener listener) {
/* 12 */     this(new JSONValidator((JSONErrorListener)listener));
   }
 
 
 
 
   
   public Object read(String string) {
/* 20 */     if (!this.validator.validate(string)) return INVALID; 
/* 21 */     return super.read(string);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\converte\\util\jsonReader\JSONValidatingReader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */