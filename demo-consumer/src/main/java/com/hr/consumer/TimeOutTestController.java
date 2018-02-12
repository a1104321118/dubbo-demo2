package com.hr.consumer;

import com.hr.api.api.TimeOutApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangrui on 2018/1/19.
 */
@RestController
@RequestMapping("/timeout")
public class TimeOutTestController {

    @Autowired
    TimeOutApi timeOutApi;

    @RequestMapping("/test")
    public void test() {
        try {
            timeOutApi.testTimeOut();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getClass().getName());

        }
    }
}
