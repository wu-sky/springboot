package com.controller;

import com.entity.User;
import com.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


	@Autowired
	IUserRepository repository;

	@GetMapping("/user/{id}")
	public User getObjectById(@PathVariable("id") Integer id ){
		User obj = repository.getOne(id);
		return obj;

	}
	@GetMapping("/user")
	public User insert(User user){
		User obj = repository.save(user);
		return obj;

	}


}

/*
 *用户：sky-吴
 *日期：2019/9/17
 * 查询一条数据 localhost:8083/user?id=1
 *  插入一条数据  localhost:8083/user?username=sky吴&email=123@qq.com
 * ?带参数 /路径
 */