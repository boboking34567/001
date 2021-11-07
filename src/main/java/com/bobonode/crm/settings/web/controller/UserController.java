package com.bobonode.crm.settings.web.controller;

import com.bobonode.crm.settings.service.UserService;
import com.bobonode.crm.settings.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: crm001
 * @description:
 * @author: Mr.WangBoBo
 * @create: 2021-11-07 19:42
 **/
public class UserController extends HttpServlet {
    private UserService userService=new UserServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
