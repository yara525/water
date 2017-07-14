package com.df.water.safe;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * This class filters parts of XSS attacks which usually occur on
 * <em>POST</em> request form parameters or <em>GET</em> url.
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 * @see javax.servlet.Filter
 */
@Configuration
@WebFilter(urlPatterns = "/*", displayName = "xSSFilter", filterName = "xSSFilter")
public class XSSFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(XSSFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("Initialized the cross-site scripting filter {} successfully.", filterConfig.getFilterName());
    }

    /**
     * XSS过滤器链
     *
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        XSSHttpServletRequestWrapper xssHttpServletRequestWrapper = new XSSHttpServletRequestWrapper((HttpServletRequest) request);
        chain.doFilter(xssHttpServletRequestWrapper, response);
    }

    @Override
    public void destroy() {
        logger.info("Destroyed the cross-site scripting filter successfully.");
    }
}
