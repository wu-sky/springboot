package com.controller;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 *用户：sky-吴
 *日期：2019/9/9
 */
@RequestMapping("/user")
@Controller
public class UserController {
	@RequestMapping("/list")
	public String list(Model model){
		model.addAttribute("msg", "user列表");
		List<User> list=new ArrayList<>();
		list.add(new User("sky", 1L, new Date(), true));
		list.add(new User("kkk", 2L, new Date(), false));
		model.addAttribute("list", list);
		return "list";
	}
}
