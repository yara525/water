package com.df.water.safe;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * XSSHttpServletRequestWrapper针对request请求对象过滤, 并不针对GET或POST等单个请求类型
 *
 * @author <a href="mailto:limiaofei@difengshanguo.com">dainel lee</a>
 * @since 1.0.0
 * @see HttpServletRequest
 * @see HttpServletRequestWrapper
 * @see javax.servlet.ServletRequest
 */
public class XSSHttpServletRequestWrapper extends HttpServletRequestWrapper {

    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     * @throws IllegalArgumentException if the request is null
     */
    public XSSHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
    }

    /**
     * 过滤请求头
     *
     * @param name
     * @return
     */
    @Override
    public String getHeader(String name) {

        return null;
    }

    /**
     * 过滤请求参数
     *
     * @param name
     * @return
     */
    @Override
    public String getParameter(String name) {
        return super.getParameter(name);
    }

    /**
     * 过滤请求参数列表
     *
     * @param name
     * @return
     */
    @Override
    public String[] getParameterValues(String name) {
        return super.getParameterValues(name);
    }
}
