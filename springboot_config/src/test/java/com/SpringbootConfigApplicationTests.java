package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

//@ImportResource("classpath:beans.xml") ///没有生效

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConfigApplicationTests {

	@Autowired
	ApplicationContext ioc;//自动创建ioc容器

	@Test
	public void testExistService(){
		boolean existBean=ioc.containsBean("testService");
		System.out.println("testService is exist?? "+existBean);
	}
	@Test
	public void contextLoads() {
	}

}
