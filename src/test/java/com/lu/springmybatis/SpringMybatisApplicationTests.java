package com.lu.springmybatis;

import com.lu.springmybatis.entity.User;
import com.lu.springmybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringMybatisApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Test
    void Test1() {
        userMapper.insert(new User("luoyu","123456",8L,2));
    }
    @Test
    void test2(){
        User user = userMapper.get(8L);
        System.out.println("usrName:"+user.getUsrName());
    }

}
