package com.controller;


import com.entity.Department;
import com.mapper.IDepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeptController {

	@Autowired
	IDepartmentMapper mapper;

	@GetMapping("/dept/{id}")
	public Department getObject(@PathVariable("id") Integer id){
		return mapper.getObjectById(id);
	}

	@GetMapping("/dept")
	public Department insert(Department department){
		mapper.insert(department);
		return department;
	}
}



/*
 *用户：sky-吴
 *日期：2019/9/16
 */