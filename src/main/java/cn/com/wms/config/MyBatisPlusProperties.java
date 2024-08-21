/*    */ package BOOT-INF.classes.cn.com.wms.config;
/*    */ 
/*    */ import com.baomidou.mybatisplus.annotation.DbType;
/*    */ import com.baomidou.mybatisplus.core.MybatisConfiguration;
/*    */ import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
/*    */ import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
/*    */ import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
/*    */ import org.springframework.boot.context.properties.ConfigurationProperties;
/*    */ import org.springframework.context.annotation.Bean;
/*    */ import org.springframework.context.annotation.Configuration;
/*    */ 
/*    */ @Configuration
/*    */ @ConfigurationProperties(prefix = "mybatis-plus")
/*    */ public class MyBatisPlusProperties {
/*    */   private String mapperLocations;
/*    */   private String typeAliasesPackage;
/*    */   private MybatisConfiguration configuration;
/*    */   
/* 19 */   public void setMapperLocations(String mapperLocations) { this.mapperLocations = mapperLocations; } public void setTypeAliasesPackage(String typeAliasesPackage) { this.typeAliasesPackage = typeAliasesPackage; } public void setConfiguration(MybatisConfiguration configuration) { this.configuration = configuration; } public boolean equals(Object o) { if (o == this) return true;  if (!(o instanceof cn.com.wms.config.MyBatisPlusProperties)) return false;  cn.com.wms.config.MyBatisPlusProperties other = (cn.com.wms.config.MyBatisPlusProperties)o; if (!other.canEqual(this)) return false;  Object this$mapperLocations = getMapperLocations(), other$mapperLocations = other.getMapperLocations(); if ((this$mapperLocations == null) ? (other$mapperLocations != null) : !this$mapperLocations.equals(other$mapperLocations)) return false;  Object this$typeAliasesPackage = getTypeAliasesPackage(), other$typeAliasesPackage = other.getTypeAliasesPackage(); if ((this$typeAliasesPackage == null) ? (other$typeAliasesPackage != null) : !this$typeAliasesPackage.equals(other$typeAliasesPackage)) return false;  Object this$configuration = getConfiguration(), other$configuration = other.getConfiguration(); return !((this$configuration == null) ? (other$configuration != null) : !this$configuration.equals(other$configuration)); } protected boolean canEqual(Object other) { return other instanceof cn.com.wms.config.MyBatisPlusProperties; } public int hashCode() { int PRIME = 59; result = 1; Object $mapperLocations = getMapperLocations(); result = result * 59 + (($mapperLocations == null) ? 43 : $mapperLocations.hashCode()); Object $typeAliasesPackage = getTypeAliasesPackage(); result = result * 59 + (($typeAliasesPackage == null) ? 43 : $typeAliasesPackage.hashCode()); Object $configuration = getConfiguration(); return result * 59 + (($configuration == null) ? 43 : $configuration.hashCode()); } public String toString() { return "MyBatisPlusProperties(mapperLocations=" + getMapperLocations() + ", typeAliasesPackage=" + getTypeAliasesPackage() + ", configuration=" + getConfiguration() + ")"; }
/*    */   
/* 21 */   public String getMapperLocations() { return this.mapperLocations; }
/* 22 */   public String getTypeAliasesPackage() { return this.typeAliasesPackage; } public MybatisConfiguration getConfiguration() {
/* 23 */     return this.configuration;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Bean
/*    */   public MybatisPlusInterceptor mybatisPlusInterceptor() {
/* 32 */     MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
/* 33 */     interceptor.addInnerInterceptor((InnerInterceptor)new PaginationInnerInterceptor(DbType.SQL_SERVER2005));
/*    */     
/* 35 */     return interceptor;
/*    */   }
/*    */ }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\config\MyBatisPlusProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */