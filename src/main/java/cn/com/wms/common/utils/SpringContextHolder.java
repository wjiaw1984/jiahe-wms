package cn.com.wms.common.utils;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class SpringContextHolder
        implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) {
        /* 20 */
        cn.com.wms.common.utils.SpringContextHolder.applicationContext = applicationContext;
    }


    public static ApplicationContext getApplicationContext() {
        /* 28 */
        checkApplicationContext();
        /* 29 */
        return applicationContext;
    }


    public static <T> T getBean(String name) {
        /* 40 */
        checkApplicationContext();
        /* 41 */
        return (T) applicationContext.getBean(name);
    }


    /**
     * 从静态变量ApplicationContext中取得Bean, 自动转型为所赋值对象的类型.
     * 如果有多个Bean符合Class, 取出第一个.
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> clazz) {
        checkApplicationContext();
        @SuppressWarnings("rawtypes")
        Map beanMaps = applicationContext.getBeansOfType(clazz);
        if (beanMaps != null && !beanMaps.isEmpty()) {
            return (T) beanMaps.values().iterator().next();
        } else {
            return null;
        }
    }


    private static void checkApplicationContext() {
        /* 61 */
        if (applicationContext == null)
            /* 62 */
            throw new IllegalStateException("applicaitonContext未注入,请在applicationContext.xml中定义SpringContextHolder");
    }
}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\commo\\utils\SpringContextHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */