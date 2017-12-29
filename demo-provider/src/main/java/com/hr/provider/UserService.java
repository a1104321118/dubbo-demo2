package com.hr.provider;

import com.hr.api.api.UserApi;
import com.hr.api.mapper.UserMapper;
import com.hr.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huangrui on 2017/12/26.
 */
@Service("userService")
public class UserService implements UserApi {

    @Autowired
    private UserMapper userMapper;

    public User findByName(String name) {
        return userMapper.selectByName(name);
    }
}
