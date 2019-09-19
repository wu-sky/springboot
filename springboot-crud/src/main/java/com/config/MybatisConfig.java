package com.config;



import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@MapperScan(value = {"com.mapper"})
@Configuration
public class MybatisConfig {

	@Bean
	public ConfigurationCustomizer configurationCustomizer(){

		return new ConfigurationCustomizer() {
			@Override
			public void customize(org.apache.ibatis.session.Configuration configuration) {
				configuration.setMapUnderscoreToCamelCase(true);//指定下划线转驼峰
			}
		};
	}
}

/*
 *用户：sky-吴
 *日期：2019/9/16
 */
