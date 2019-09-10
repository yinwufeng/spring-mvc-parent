package com.spring.mvc.service.impl;

import com.spring.mvc.entity.UserInfo;
import com.spring.mvc.mapper.UserInfoMapper;
import com.spring.mvc.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper ;

    @Override
    public UserInfo selectByPrimaryKey(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
