package com.hr.api.api;

import com.hr.api.model.User;

/**
 * Created by huangrui on 2017/12/26.
 */
public interface UserApi {

    User findByName(String name);
}
