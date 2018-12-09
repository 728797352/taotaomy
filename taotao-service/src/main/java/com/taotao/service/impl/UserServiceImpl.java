package com.taotao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.UserMapper;
import com.taotao.pojo.User;
import com.taotao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper UserMapper;
    @Override
    public void save() {
        System.out.println("success save");
    }

    @Override
    public List<User> sellectAll() {

        return UserMapper.selectAll();
    }

    @Override
    public PageInfo<User> findByPage(int currentPage,int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<User> list=UserMapper.select(null);
        return new PageInfo<>(list);
    }


}
