package com.hr.provider;

import com.hr.api.api.TimeOutApi;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by huangrui on 2018/1/19.
 */
@Service("timeOutService")
public class TimeOutService implements TimeOutApi{

    //等待一分钟，测试超时
    public void testTimeOut() {
        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
