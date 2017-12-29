package com.hr.consumer;

import com.hr.api.api.UserApi;
import com.hr.api.model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangrui on 2017/12/27.
 */
@RestController
@RequestMapping("/dubbo")
public class DubboController {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private UserApi userApi;

    @RequestMapping("/test")
    public User test(String name){
        logger.info("测试");
        return userApi.findByName(name);
    }
}
