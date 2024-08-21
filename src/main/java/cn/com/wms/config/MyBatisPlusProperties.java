package cn.com.wms.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "mybatis-plus")
@Data
public class MyBatisPlusProperties {
    private String mapperLocations;
    private String typeAliasesPackage;
    private MybatisConfiguration configuration;

    /* 19 */
    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }

    public void setTypeAliasesPackage(String typeAliasesPackage) {
        this.typeAliasesPackage = typeAliasesPackage;
    }

    public void setConfiguration(MybatisConfiguration configuration) {
        this.configuration = configuration;
    }


    /* 21 */
    public String getMapperLocations() {
        return this.mapperLocations;
    }

    /* 22 */
    public String getTypeAliasesPackage() {
        return this.typeAliasesPackage;
    }

    public MybatisConfiguration getConfiguration() {
        /* 23 */
        return this.configuration;
    }


    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        /* 32 */
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        /* 33 */
        interceptor.addInnerInterceptor((InnerInterceptor) new PaginationInnerInterceptor(DbType.SQL_SERVER2005));

        /* 35 */
        return interceptor;
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\config\MyBatisPlusProperties.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */