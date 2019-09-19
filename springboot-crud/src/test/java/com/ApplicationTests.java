package com;

import com.entity.Employee;
import com.mapper.IEmployeeMapper;
import com.sun.deploy.net.HttpResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	IEmployeeMapper iEmployeeMapper;

	@Autowired
	StringRedisTemplate stringRedisTemplate; //操作 看k-v 都是String的

	@Autowired
	RedisTemplate redisTemplate; //操作k - v 都是object的

	/*redis的常见5种数据类型, 1 String 2 list 3 set 4 hash 5 zset(有序集合)  */


	//往redis放一些无用数据
	@Test
	public void test01(){
		stringRedisTemplate.opsForValue().append("msg" , "hello");
		String msg=stringRedisTemplate.opsForValue().get("msg");
		System.out.println(msg);
		stringRedisTemplate.opsForList().leftPush("mylist", "1");
		stringRedisTemplate.opsForList().leftPush("mylist", "2");
	}

	//往redis放一个对象
	@Test
	public void test02(){
		Employee obj= iEmployeeMapper.getObjectById(1);
		System.out.println(obj.toString());
		redisTemplate.opsForValue().set("employee01" , obj);

	}


	@Test
	public void contextLoads() throws SQLException {

		System.out.println("数据源>>>>>>" + dataSource.getClass());
		Connection connection = dataSource.getConnection();

		System.out.println("连接>>>>>>>>>" + connection);
		System.out.println("连接地址>>>>>" + connection.getMetaData().getURL());
		connection.close();
	}

}

//druid