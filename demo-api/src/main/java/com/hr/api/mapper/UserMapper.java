package com.hr.api.mapper;

import com.hr.api.model.User;

/**
 * Created by huangrui on 2017/12/26.
 */
public interface UserMapper {

    User selectByName(String name);
}
