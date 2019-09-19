package com.config;

import com.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 如果你的配置类没有生效, 你就得注意你是不是写在springboot的主类下面
 * ComponentScan扫描的是通缉包或子包下的类，所以就有可能没有扫描到这个配置类了。
 * 于是只要把启动类放到同级下或让所有Java类都在启动类的子包下就可以完成基于Java注入bean的方式了。
 */

//指定当前类是一个spring boot 配置类
@Configuration
public class MyConfig {
	//对应配置文件中的<bean></bean>
	//将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
	@Bean
	public TestService testService() {
		System.out.println("通过配置类的配置方法自动注入");
		return new TestService();
	}
}
