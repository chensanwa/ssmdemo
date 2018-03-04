package com.ssmdemo.dao;

import com.ssmdemo.entity.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: ssmdemo06
 * @description:
 * @author: Mr.Wang
 * @create: 2018-03-01 16:35
 **/
public class IUserDaoTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp(){
        applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception{

        IUserDao userDao = (IUserDao)applicationContext.getBean("userMapper");

        User user = userDao.findUserById(1);

        System.out.println(user.getName());
    }
}
