package com.repository;

import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//第一个泛型参数是实体类, 第二个参数是实体类的id
public interface IUserRepository extends JpaRepository<User, Integer> {


}
/*
 *用户：sky-吴
 *日期：2019/9/17
 */