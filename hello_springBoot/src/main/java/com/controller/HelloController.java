package com.controller;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(){
		return "<h1>hello springboot</h1>";
	}


	@RequestMapping("/hello.html")
	public String hello(){
		return "hello";



	}
}


/*
 *用户：sky-吴
 *日期：2019/8/30
 */