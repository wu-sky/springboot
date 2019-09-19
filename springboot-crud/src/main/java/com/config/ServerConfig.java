package com.config;
import	java.util.Arrays;

import com.Listener.MyListener;
import com.filter.MyFilter;
import com.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;

/**
 * 配置服务器信息, 就是老情人web.xml
 *
 */
@Configuration
public class ServerConfig {

	//在SpringBoot2.0以上版本中,EmbeddedServletContainerCustomizer被WebServerFactoryCustomizer代替
	@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryWebServerFactoryCustomizer(){
		return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
			@Override
			public void customize(ConfigurableWebServerFactory factory) {
				//在这里配置
				//factory.setPort(8083);
			}
		};
	}

	//配置三大组件之一servlet
	@Bean
	public ServletRegistrationBean myServlet(){
		ServletRegistrationBean registration = new ServletRegistrationBean(new MyServlet(), "/myServlet");
		return registration;
	}
	//配置三大组件之一filter
	@Bean
	public FilterRegistrationBean myFilter(){
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter());
		registration.setUrlPatterns(Arrays.<String> asList("/MyServlet" ));
		return registration;
	}

	@Bean
	public ServletListenerRegistrationBean myServletListenerRegistrationBean() {
		ServletListenerRegistrationBean servletListenerRegistrationBean
				= new ServletListenerRegistrationBean<MyListener>(new MyListener());
		return servletListenerRegistrationBean;
	}


}
/*
 *用户：sky-吴
 *日期：2019/9/15
 */