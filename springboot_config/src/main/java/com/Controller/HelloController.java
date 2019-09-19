package com.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	//从application.properties文件里面读取属性来注入
	@Value("${student.name}")
	private  String name;

	@ResponseBody
	@RequestMapping("/hello")
	public String sayHello() {

		return  "hello "+ name;

	}

}
/*
 *用户：sky-吴
 *日期：2019/9/6
 */
