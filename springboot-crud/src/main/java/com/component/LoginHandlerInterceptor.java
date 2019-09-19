package com.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginHandlerInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("interceptor 拦截器 前置通知 ");
		System.out.println("用户"+request.getSession().getAttribute("user"));
		if (request.getSession().getAttribute("user") == null) {
			request.setAttribute("msg", "亲, 请先登录再来访问哦!");
			request.getRequestDispatcher("/login").forward(request, response);
			System.out.println("访问已拦截");
			return false;
		} else {
		    return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("interceptor 拦截器 后置通知 ");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}
}


/*
 *用户：sky-吴
 *日期：2019/9/10
 */
