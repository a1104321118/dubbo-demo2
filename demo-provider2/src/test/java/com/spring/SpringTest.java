package com.spring;

import com.hr.api.api.UserApi;
import com.hr.api.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by huangrui on 2018/1/23.
 */
public class SpringTest {

    public static void main(String[] args) {
        ClassPathResource res = new ClassPathResource("spring/spring-context.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-context.xml");
        UserApi userApi = (UserApi)ctx.getBean("userService");
        User a = userApi.findByName("a");
        System.out.println(a);
    }
}
