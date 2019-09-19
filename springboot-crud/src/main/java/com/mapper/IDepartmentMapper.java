package com.mapper;

import com.entity.Department;
import org.apache.ibatis.annotations.*;


//指定这是一个数据库的mapper
@Mapper
public interface IDepartmentMapper {

	@Options(useGeneratedKeys = true, keyProperty = "id")
	@Insert("insert into department (departmentName) values (#{departmentName})")
	public int insert(Department department);

	@Update("update department set departmentName=#{departmentName} where id=#(id)")
	public int update(Department department);

	@Select("select * from department where id=#{id}")
	public Department getObjectById(Integer id);



	@Delete("delete from department where id=#{id}")
	public int deleteObjectById(Integer id);
}


/*
 *用户：sky-吴
 *日期：2019/9/16
 */