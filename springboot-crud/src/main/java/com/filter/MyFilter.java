package com.filter;

import javax.servlet.*;
import java.io.IOException;

/*
 *用户：sky-吴
 *日期：2019/9/15
 */
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter 初始化");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		System.out.println("filter 被执行");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("filter 被摧毁");
	}
}
