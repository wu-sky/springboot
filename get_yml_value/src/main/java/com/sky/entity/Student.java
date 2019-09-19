package com.sky.entity;


import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//只有加在容器中, 才能不用new 就直接从配置文件中取出值
@Component
@PropertySource("classpath:application.yml") //如果不写, 指定的就是默认的配置文件
@ConfigurationProperties("student")
public class Student {
	private String name;
	private Integer age;
	private Date birthday;
	private Teacher teacher;

	@Value("true")
	private Boolean isMale; //默认就是true

	public Boolean getMale() {
		return isMale;
	}

	public void setMale(Boolean male) {
		isMale = male;
	}

	private Map<String,Object> teachers;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Map<String, Object> getTeachers() {
		return teachers;
	}

	public void setTeachers(Map<String, Object> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", isMale='" + isMale + '\'' +
				", teacher='" + teacher + '\'' +
				", birthday=" + birthday +
				", teachers=" + teachers +
				'}';
	}
}
