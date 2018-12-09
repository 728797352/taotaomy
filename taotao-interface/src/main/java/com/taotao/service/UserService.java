package com.taotao.service;

import com.github.pagehelper.PageInfo;
import com.taotao.pojo.User;

import java.util.List;

public interface UserService {
    void save();
    List<User> sellectAll();
    PageInfo<User> findByPage(int curretPage,int pageSize);
}
