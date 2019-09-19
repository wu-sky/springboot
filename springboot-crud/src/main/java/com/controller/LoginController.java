package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
public class LoginController {

	@RequestMapping("common/index")
	public String toMain(){
		return "common/index";
	}



	//@PostMapping(value = "user/login")
	@RequestMapping(value = "/login")
	public String login(@RequestParam("username") String username,
	                    @RequestParam("password") String password,
	                    Map<String, Object> map,
	                    HttpSession session){
		if (!StringUtils.isEmpty(username)&&"123".equals(password)){

			session.setAttribute("user", username);//给用户钥匙

			return "redirect:/common/index";
			//虽然说你重定向了, 但是没有请求匹配上你的重定向, 一样找不到, 所以底下必须配一个请求
		}else {
			map.put("msg", "用户名或者密码错误! username or password is wrong!");//当然, 这句话可以使用国际化来做
			return "common/login";
		}
	}
	/*如果需要使用templates，thyleaf模版，
	  首先Spring boot项目需要添加依赖，这样才能找到templates下面的*.html文件*/

}
/*
 *用户：sky-吴
 *日期：2019/9/9
 */