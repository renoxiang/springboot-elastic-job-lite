package com.eljob.lite.service.impl;

import com.biloba.common.dao.BaseDao;
import com.eljob.lite.domain.User;
import com.eljob.lite.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xy on 2017/8/1.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private BaseDao jpaBaseDao;

    @Override
    public User getById(Long userId) {
        return jpaBaseDao.getEntityById(User.class, userId);
    }
}
