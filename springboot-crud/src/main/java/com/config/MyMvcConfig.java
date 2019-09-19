package com.config;
import com.component.LoginHandlerInterceptor;
import com.component.MyLocaleResolver;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerInterceptor;
// 这个是一个接口, 不能直接用, 先得实现它的方法才能用
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 这个类是springboot的全局配置类, 相当于我们项目以前的xml文件.
 */
@Configuration
public class MyMvcConfig {

	public MyMvcConfig() { super();	}



	@Bean //将这个组件添加到spring容器中
	public WebMvcConfigurer webMvcConfigurer(){
		System.out.println("配置生效了");
		return new WebMvcConfigurer(){
			/*添加视图控制器配置默认的欢迎页, 这个是一个内部类啊!!*/
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("common/login");
				registry.addViewController("/login").setViewName("common/login");

			}
			// 这个方法是用来配置静态资源的，比如html，js，css，等等
			@Override
			public void addResourceHandlers(ResourceHandlerRegistry registry) {
			}


			/*注册一个拦截器, 作为安全校验, 静态资源如css和js等, springboot已经给你处理个吉宝, tmd全都给拦截了, wdnmd*/
			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns(
						 "/", "/login","/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg", "/**/*.jpeg");
			}
		};
	}




	@Bean //配置i18n国际化语言
	public LocaleResolver localeResolver(){
		return new MyLocaleResolver();
	}

}
/*
 *用户：sky-吴
 *日期：2019/9/9
 */
