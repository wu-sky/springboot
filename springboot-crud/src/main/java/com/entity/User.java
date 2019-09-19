package com.entity;

/*
 *用户：sky-吴
 *日期：2019/9/17
 */

import javax.persistence.*;

@Entity  //告诉jpa这是这是一个实体类
@Table(name = "t_user") //省略默认类名小写
public class User {
	@Id //告诉jpa这是一个PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)//告诉jpa这个PK自增
	private Integer id;
	@Column(name = "username" , length = 50)
	private String username;
	@Column //默认列命就是属性名
	private String email;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
