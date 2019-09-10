package com.spring.mvc.service;

import com.spring.mvc.entity.UserInfo;

public interface UserInfoService {

    UserInfo selectByPrimaryKey(Integer id);
}
