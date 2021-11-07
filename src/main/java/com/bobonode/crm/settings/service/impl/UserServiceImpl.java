package com.bobonode.crm.settings.service.impl;

import com.bobonode.crm.settings.dao.UserDao;
import com.bobonode.crm.settings.service.UserService;
import com.bobonode.crm.utils.SqlSessionUtil;

/**
 * @program: crm001
 * @description:
 * @author: Mr.WangBoBo
 * @create: 2021-11-07 19:39
 **/
public class UserServiceImpl implements UserService {
    private UserDao userDao= SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
}
