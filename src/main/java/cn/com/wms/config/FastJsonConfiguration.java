 package cn.com.wms.config;

 import com.alibaba.fastjson2.JSONReader;
 import com.alibaba.fastjson2.JSONWriter;
 import com.alibaba.fastjson2.support.config.FastJsonConfig;
 import com.alibaba.fastjson2.support.spring.http.converter.FastJsonHttpMessageConverter;
 import com.fasterxml.jackson.databind.ObjectMapper;
 import com.fasterxml.jackson.databind.SerializationFeature;
 import java.nio.charset.StandardCharsets;
 import java.util.ArrayList;
 import java.util.List;
 import org.springframework.context.annotation.Bean;
 import org.springframework.http.MediaType;
 import org.springframework.http.converter.HttpMessageConverter;
 import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;
 import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
 import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;








 public class FastJsonConfiguration
   extends WebMvcConfigurationSupport
 {
   @Bean
   public HttpMessageConverter<?> fastJsonHttpMessageConverter() {
/* 31 */     FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
/* 32 */     FastJsonConfig fastJsonConfig = new FastJsonConfig();
/* 33 */     fastJsonConfig.setCharset(StandardCharsets.UTF_8);
/* 34 */     fastJsonConfig.setReaderFeatures(new JSONReader.Feature[] { JSONReader.Feature.SupportSmartMatch, JSONReader.Feature.FieldBased, JSONReader.Feature.TrimString });







/* 42 */     fastJsonConfig.setWriterFeatures(new JSONWriter.Feature[] { JSONWriter.Feature.FieldBased, JSONWriter.Feature.WriteLongAsString, JSONWriter.Feature.WriteMapNullValue, JSONWriter.Feature.WriteNullListAsEmpty, JSONWriter.Feature.WriteNullStringAsEmpty, JSONWriter.Feature.WriteNullBooleanAsFalse, JSONWriter.Feature.PrettyFormat, JSONWriter.Feature.NullAsDefaultValue });

















/* 60 */     List<MediaType> supportedMediaTypes = new ArrayList<>();
/* 61 */     supportedMediaTypes.add(MediaType.APPLICATION_JSON);
/* 62 */     supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
/* 63 */     supportedMediaTypes.add(MediaType.TEXT_HTML);

/* 65 */     supportedMediaTypes.add(MediaType.TEXT_XML);
/* 66 */     fastJsonHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);

/* 68 */     fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
/* 69 */     return (HttpMessageConverter<?>)fastJsonHttpMessageConverter;
   }

   @Bean
   public HttpMessageConverter<?> jackson2Converter() {
/* 74 */     Jackson2ObjectMapperFactoryBean factory = new Jackson2ObjectMapperFactoryBean();
/* 75 */     factory.setIndentOutput(true);
/* 76 */     factory.afterPropertiesSet();

/* 78 */     ObjectMapper objectMapper = factory.getObject();

/* 80 */     objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

/* 82 */     List<MediaType> supportedMediaTypes = new ArrayList<>();
/* 83 */     supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
/* 84 */     supportedMediaTypes.add(MediaType.valueOf("application/x-www-form-urlencoded; charset=utf-8"));
/* 85 */     return (HttpMessageConverter<?>)new MappingJackson2HttpMessageConverter(objectMapper);
   }




   public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
/* 92 */     converters.add(jackson2Converter());
/* 93 */     super.configureMessageConverters(converters);
   }
 }


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\config\FastJsonConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */