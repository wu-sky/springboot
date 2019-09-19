package com.mapper;

import com.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface IEmployeeMapper {

	public Employee getObjectById(Integer id);

	public void insert(Employee employee);

}


/*
 *用户：sky-吴
 *日期：2019/9/17
 */