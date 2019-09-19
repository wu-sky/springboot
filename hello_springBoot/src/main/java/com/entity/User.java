package com.entity;

import java.util.Date;

/*
 *用户：sky-吴
 *日期：2019/9/5
 */
public class User {

	private String name;
	private Long id;
	private Date createDay;
	private Boolean isActive;

	public User(String name, Long id, Date createDay, Boolean isActive) {
		this.name = name;
		this.id = id;
		this.createDay = createDay;
		this.isActive=isActive;
	}

	public User(String name) {
		this.name = name;
	}

	public User() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDay() {
		return createDay;
	}

	public void setCreateDay(Date createDay) {
		this.createDay = createDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return isActive;
	}

	public void setActive(Boolean active) {
		isActive = active;
	}
}
