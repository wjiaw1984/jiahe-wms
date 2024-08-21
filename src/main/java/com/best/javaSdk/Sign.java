 package com.best.javaSdk;
 import com.best.javaSdk.Param;
 import java.io.UnsupportedEncodingException;
 import java.security.MessageDigest;
 import java.security.NoSuchAlgorithmException;

 public class Sign {
   public static String makeSign(Param param) {
/*  9 */     String signString = makeSignString(param);
/* 10 */     String sign = "";
     try {
/* 12 */       sign = digestEncrypte(signString.getBytes("utf-8"), "MD5");
/* 13 */     } catch (NoSuchAlgorithmException e) {
/* 14 */       e.printStackTrace();
/* 15 */     } catch (UnsupportedEncodingException e) {
/* 16 */       e.printStackTrace();
     }
/* 18 */     return sign;
   }

   public static String makeBase64Sign(Param param) {
/* 22 */     String signString = makeSignString(param);
/* 23 */     String sign = "";
     try {
/* 25 */       MessageDigest md = MessageDigest.getInstance("MD5");
/* 26 */       md.update(signString.getBytes("utf-8"));
/* 27 */       byte[] b = md.digest();
/* 28 */       sign = (new BASE64Encoder()).encode(b);
/* 29 */     } catch (Throwable e) {
/* 30 */       e.printStackTrace();
     }
/* 32 */     return sign;
   }

   private static String makeSignString(Param param) {
/* 36 */     return param.getBizData() + param.getPartnerKey();
   }

   public static String digestEncrypte(byte[] plainText, String algorithm) throws NoSuchAlgorithmException, UnsupportedEncodingException {
/* 40 */     MessageDigest md = MessageDigest.getInstance(algorithm);
/* 41 */     md.update(plainText);
/* 42 */     byte[] b = md.digest();
/* 43 */     StringBuilder output = new StringBuilder(32);
/* 44 */     for (int i = 0; i < b.length; i++) {
/* 45 */       String temp = Integer.toHexString(b[i] & 0xFF);
/* 46 */       if (temp.length() < 2) {
/* 47 */         output.append("0");
       }
/* 49 */       output.append(temp);
     }
/* 51 */     return output.toString();
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\Sign.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */