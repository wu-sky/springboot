package com.controller;

import com.dao.DepartmentDao;
import com.dao.EmployeeDao;
import com.entity.Department;
import com.entity.Employee;
import com.mapper.IEmployeeMapper;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmpController {


	@Autowired
	IEmployeeMapper mapper;

	@Autowired
	EmployeeService service;


	@ResponseBody
	@GetMapping("/getemp/{id}")
	public Employee getEmployee(@PathVariable("id") Integer id){
		Employee employee = service.getEmp(id);
		return employee;
	}



	@GetMapping("/emps")
	public String list(Model model){

		Collection<Employee> employees= EmployeeDao.getAll();
		model.addAttribute("emps", employees);
		return "emp/list";
	}


	@Autowired
	DepartmentDao dao;

	@Autowired
	EmployeeDao employeeDao;

	//来到员工添加页面
	@GetMapping("/emp")
	public String toAddPage(Model model){
		Collection<Department> departments=DepartmentDao.getDepartments();
		model.addAttribute("depts", departments);
		return "emp/add";
	}

	//员工真正添加
	@PostMapping("/emp")
	public String add(Employee obj){
		//redirect重定向到一个地址, /代表当前项目路径
		System.out.println("saved employee: "+ obj);
		employeeDao.save(obj);
		return "redirect:/emps";
	}

	//到员工修改页面
	@GetMapping("/emp/{id}")
	public String toEditPage(@PathVariable("id") Integer id, Model model){
		Employee employee=employeeDao.get(id);
		Collection<Department> departments=dao.getDepartments();
		model.addAttribute("depts", departments);
		model.addAttribute("emp", employee);
		return "emp/add";
	}

	//员工修改, 需要提交id;
	@PutMapping("/emp")
	public String update(Employee obj){
		System.out.println("after updated :" + obj);
		employeeDao.save(obj);
		return "redirect:/emps";
	}

	//员工删除
	@DeleteMapping("/emp/{id}")
	public String delete(@PathVariable("id") Integer id){
		System.out.println("delete ");
		employeeDao.delete(id);
		return "redirect:/emps";
	}



}




/*
 *用户：sky-吴
 *日期：2019/9/11
 */