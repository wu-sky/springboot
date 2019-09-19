package com;

import com.sky.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//用springboot的启动器去跑, 而不是直接调用junit, 意味着可以直接调用spring里面的东西直接测试
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Autowired
	Student student;
	@Test
	public void contextLoads() {		System.out.println(student.toString());	}
}
