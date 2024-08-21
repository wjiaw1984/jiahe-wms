
package cn.com.wms.filter;


import cn.com.wms.common.web.httpservlet.BodyReaderHttpServletRequestWrapper;
 import cn.com.wms.common.web.httpservlet.ResponseWrapper;
 import java.io.IOException;
 import javax.servlet.*;




 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.util.StringUtils;


 public class WMSFilter implements Filter {
    /* 17 */   private static final Logger log = LoggerFactory.getLogger(cn.com.wms.filter.WMSFilter.class);

       private String checkword;

       private boolean issign;




    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /* 25 */
        Thread th = Thread.currentThread();

        /* 27 */
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        /* 28 */
        String origin = servletRequest.getRemoteHost() + ":" + servletRequest.getRemotePort();



        /* 32 */
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        /* 33 */
        log.warn("线程【" + th.getId() + "】访问：" + httpServletRequest.getRequestURI());
        /* 34 */
        long startTime = System.currentTimeMillis();


        /* 37 */
        BodyReaderHttpServletRequestWrapper bodyReaderHttpServletRequestWrapper = new BodyReaderHttpServletRequestWrapper(httpServletRequest);
        /* 38 */
        response.setCharacterEncoding("UTF-8");
        /* 39 */
        response.setContentType("application/json;charset=UTF-8");
        /* 40 */
        ResponseWrapper wrapperResponse = new ResponseWrapper(response);

        /* 42 */
        if ("OPTIONS".equalsIgnoreCase(((HttpServletRequest) servletRequest).getMethod())) {
            /* 43 */
            response.setStatus(200);

        } else {
            /* 45 */
            filterChain.doFilter((ServletRequest) bodyReaderHttpServletRequestWrapper, (ServletResponse) wrapperResponse);

        }
        /* 47 */
        long endTime = System.currentTimeMillis();
        /* 48 */
        long executeTime = endTime - startTime;

        /* 50 */
        byte[] content = wrapperResponse.getContent();
        /* 51 */
        if (content.length > 0) {
            /* 52 */
            String str = new String(content, "UTF-8");
            /* 53 */
            response.getWriter().print(str);
            /* 54 */
            log.warn("线程【" + th.getId() + "】返回信息：" + str);

        }

        /* 57 */
        if (!StringUtils.isEmpty(httpServletRequest.getParameter("method"))) {
            /* 58 */
            log.warn("线程【" + th.getId() + "】请求：" + httpServletRequest.getRequestURI() + "，执行方法：" + httpServletRequest.getParameter("method") + "，执行用时：" + executeTime + "ms");
            /* 59 */
            if (executeTime > 5000L) {
                /* 60 */
                log.error("线程【" + th.getId() + "】请求慢日志：" + httpServletRequest.getRequestURI() + "，执行方法：" + httpServletRequest.getParameter("method") + "，执行用时：" + executeTime + "ms");

            }

        } else {
            /* 63 */
            log.warn("线程【" + th.getId() + "】请求：" + httpServletRequest.getRequestURI() + "，执行用时：" + executeTime + "ms");
            /* 64 */
            if (executeTime > 5000L)
                /* 65 */
                log.error("线程【" + th.getId() + "】请求慢日志：" + httpServletRequest.getRequestURI() + "，执行用时：" + executeTime + "ms");

        }

    }



    public void init(FilterConfig filterConfig) throws ServletException {
    }



    public void destroy() {
    }

}


/* Location:              D:\wjw\Workspace\jiahe\wms-api.jar!\BOOT-INF\classes\cn\com\wms\filter\WMSFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */