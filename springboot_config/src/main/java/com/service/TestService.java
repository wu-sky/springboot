package com.service;


//这是一个配置的测试类, 不能加spring 组件标签
public class TestService {

	public TestService(){
		System.out.println("test init...");
	}

	public void test(){
		System.out.println("test called...");
	}

}