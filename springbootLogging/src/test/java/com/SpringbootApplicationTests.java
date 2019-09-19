package com;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	//记录器
	Logger logger =  LoggerFactory.getLogger(this.getClass());
	@Test
	public void contextLoads() {
		logger.trace("trace级别");
		logger.debug("debug级别");
		logger.info("info级别");
		logger.warn("warn级别");
		logger.error("error级别");


	}

}
