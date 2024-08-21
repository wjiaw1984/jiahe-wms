 package com.best.javaSdk.twSoNotify.request;
 
 import cn.com.wms.model.wms.sdwms.SdwmsRationnote;
 import cn.com.wms.model.wms.sdwms.SdwmsRet;
 import java.math.RoundingMode;
 
 
 public class Item
 {
   private int lineNo;
   private String itemSkuCode;
   private String itemName;
   private int itemQuantity;
   private int packageCount;
   private String uomCode;
   private double weight;
   private double volume;
   private double volumeWeight;
   private double unitPrice;
   private double declaredValue;
   private String fixStatusCode;
   private String productionDate;
   private String expiryDate;
   private String lotAtt01;
   private String lotAtt02;
   private String lotAtt03;
   private String lotAtt04;
   private String lotAtt05;
   private String lotAtt06;
   private String providerCode;
   private String providerFrom;
   private String providerName;
   private String packCode;
   private boolean udfFlag;
   private String udf1;
   private String udf2;
   private String udf3;
   private String udf4;
   private String udf5;
   private String udf6;
   private String udf7;
   private String udf8;
   private String packageStandard;
   private String remark;
   private double decimalQuantity;
   private String packageName;
   private String itemNote;
   
   public int getLineNo() {
/*  50 */     return this.lineNo;
   }
   
   public void setLineNo(int value) {
/*  54 */     this.lineNo = value;
   }
   
   public String getItemSkuCode() {
/*  58 */     return this.itemSkuCode;
   }
   
   public void setItemSkuCode(String value) {
/*  62 */     this.itemSkuCode = value;
   }
   
   public String getItemName() {
/*  66 */     return this.itemName;
   }
   
   public void setItemName(String value) {
/*  70 */     this.itemName = value;
   }
   
   public int getItemQuantity() {
/*  74 */     return this.itemQuantity;
   }
   
   public void setItemQuantity(int value) {
/*  78 */     this.itemQuantity = value;
   }
   
   public int getPackageCount() {
/*  82 */     return this.packageCount;
   }
   
   public void setPackageCount(int value) {
/*  86 */     this.packageCount = value;
   }
   
   public String getUomCode() {
/*  90 */     return this.uomCode;
   }
   
   public void setUomCode(String value) {
/*  94 */     this.uomCode = value;
   }
   
   public double getWeight() {
/*  98 */     return this.weight;
   }
   
   public void setWeight(double value) {
/* 102 */     this.weight = value;
   }
   
   public double getVolume() {
/* 106 */     return this.volume;
   }
   
   public void setVolume(double value) {
/* 110 */     this.volume = value;
   }
   
   public double getVolumeWeight() {
/* 114 */     return this.volumeWeight;
   }
   
   public void setVolumeWeight(double value) {
/* 118 */     this.volumeWeight = value;
   }
   
   public double getUnitPrice() {
/* 122 */     return this.unitPrice;
   }
   
   public void setUnitPrice(double value) {
/* 126 */     this.unitPrice = value;
   }
   
   public double getDeclaredValue() {
/* 130 */     return this.declaredValue;
   }
   
   public void setDeclaredValue(double value) {
/* 134 */     this.declaredValue = value;
   }
   
   public String getFixStatusCode() {
/* 138 */     return this.fixStatusCode;
   }
   
   public void setFixStatusCode(String value) {
/* 142 */     this.fixStatusCode = value;
   }
   
   public String getProductionDate() {
/* 146 */     return this.productionDate;
   }
   
   public void setProductionDate(String value) {
/* 150 */     this.productionDate = value;
   }
   
   public String getExpiryDate() {
/* 154 */     return this.expiryDate;
   }
   
   public void setExpiryDate(String value) {
/* 158 */     this.expiryDate = value;
   }
   
   public String getLotAtt01() {
/* 162 */     return this.lotAtt01;
   }
   
   public void setLotAtt01(String value) {
/* 166 */     this.lotAtt01 = value;
   }
   
   public String getLotAtt02() {
/* 170 */     return this.lotAtt02;
   }
   
   public void setLotAtt02(String value) {
/* 174 */     this.lotAtt02 = value;
   }
   
   public String getLotAtt03() {
/* 178 */     return this.lotAtt03;
   }
   
   public void setLotAtt03(String value) {
/* 182 */     this.lotAtt03 = value;
   }
   
   public String getLotAtt04() {
/* 186 */     return this.lotAtt04;
   }
   
   public void setLotAtt04(String value) {
/* 190 */     this.lotAtt04 = value;
   }
   
   public String getLotAtt05() {
/* 194 */     return this.lotAtt05;
   }
   
   public void setLotAtt05(String value) {
/* 198 */     this.lotAtt05 = value;
   }
   
   public String getLotAtt06() {
/* 202 */     return this.lotAtt06;
   }
   
   public void setLotAtt06(String value) {
/* 206 */     this.lotAtt06 = value;
   }
   
   public String getProviderCode() {
/* 210 */     return this.providerCode;
   }
   
   public void setProviderCode(String value) {
/* 214 */     this.providerCode = value;
   }
   
   public String getProviderFrom() {
/* 218 */     return this.providerFrom;
   }
   
   public void setProviderFrom(String value) {
/* 222 */     this.providerFrom = value;
   }
   
   public String getProviderName() {
/* 226 */     return this.providerName;
   }
   
   public void setProviderName(String value) {
/* 230 */     this.providerName = value;
   }
   
   public String getPackCode() {
/* 234 */     return this.packCode;
   }
   
   public void setPackCode(String value) {
/* 238 */     this.packCode = value;
   }
   
   public boolean getUdfFlag() {
/* 242 */     return this.udfFlag;
   }
   
   public void setUdfFlag(boolean value) {
/* 246 */     this.udfFlag = value;
   }
   
   public String getUdf1() {
/* 250 */     return this.udf1;
   }
   
   public void setUdf1(String value) {
/* 254 */     this.udf1 = value;
   }
   
   public String getUdf2() {
/* 258 */     return this.udf2;
   }
   
   public void setUdf2(String value) {
/* 262 */     this.udf2 = value;
   }
   
   public String getUdf3() {
/* 266 */     return this.udf3;
   }
   
   public void setUdf3(String value) {
/* 270 */     this.udf3 = value;
   }
   
   public String getUdf4() {
/* 274 */     return this.udf4;
   }
   
   public void setUdf4(String value) {
/* 278 */     this.udf4 = value;
   }
   
   public String getUdf5() {
/* 282 */     return this.udf5;
   }
   
   public void setUdf5(String value) {
/* 286 */     this.udf5 = value;
   }
   
   public String getUdf6() {
/* 290 */     return this.udf6;
   }
   
   public void setUdf6(String value) {
/* 294 */     this.udf6 = value;
   }
   
   public String getUdf7() {
/* 298 */     return this.udf7;
   }
   
   public void setUdf7(String value) {
/* 302 */     this.udf7 = value;
   }
   
   public String getUdf8() {
/* 306 */     return this.udf8;
   }
   
   public void setUdf8(String value) {
/* 310 */     this.udf8 = value;
   }
   
   public String getPackageStandard() {
/* 314 */     return this.packageStandard;
   }
   
   public void setPackageStandard(String value) {
/* 318 */     this.packageStandard = value;
   }
   
   public String getRemark() {
/* 322 */     return this.remark;
   }
   
   public void setRemark(String value) {
/* 326 */     this.remark = value;
   }
   
   public double getDecimalQuantity() {
/* 330 */     return this.decimalQuantity;
   }
   
   public void setDecimalQuantity(double value) {
/* 334 */     this.decimalQuantity = value;
   }
   
   public String getPackageName() {
/* 338 */     return this.packageName;
   }
   
   public void setPackageName(String value) {
/* 342 */     this.packageName = value;
   }
   
   public String getItemNote() {
/* 346 */     return this.itemNote;
   }
   
   public void setItemNote(String value) {
/* 350 */     this.itemNote = value;
   }
 
 
 
 
 
 
 
 
   
   public static com.best.javaSdk.twSoNotify.request.Item buildForRet(SdwmsRet ret, Integer lineNo) {
/* 362 */     com.best.javaSdk.twSoNotify.request.Item result = new com.best.javaSdk.twSoNotify.request.Item();
     
/* 364 */     if (ret == null) {
/* 365 */       return result;
     }
 
     
/* 369 */     result.setLineNo(lineNo.intValue());
     
/* 371 */     result.setItemSkuCode(ret.getGoodsid());
     
/* 373 */     result.setItemName(ret.getGoodsName());
     
/* 375 */     result.setItemQuantity(ret.getPlanqty().setScale(0, RoundingMode.HALF_UP).intValue());
     
/* 377 */     return result;
   }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
   
   public static com.best.javaSdk.twSoNotify.request.Item buildForRationNote(SdwmsRationnote sheet, Integer lineNo) {
/* 395 */     com.best.javaSdk.twSoNotify.request.Item result = new com.best.javaSdk.twSoNotify.request.Item();
/* 396 */     if (sheet == null) {
/* 397 */       return result;
     }
 
     
/* 401 */     result.setLineNo(lineNo.intValue());
     
/* 403 */     result.setItemSkuCode(sheet.getGoodsid().trim());
     
/* 405 */     result.setItemName(sheet.getGoodsName().trim());
     
/* 407 */     result.setItemQuantity(sheet.getPlanQty().setScale(0, RoundingMode.HALF_UP).intValue());
/* 408 */     return result;
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\com\best\javaSdk\twSoNotify\request\Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */