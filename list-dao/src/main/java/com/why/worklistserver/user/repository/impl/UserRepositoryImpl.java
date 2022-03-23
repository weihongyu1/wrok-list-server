package com.why.worklistserver.user.repository.impl;

import com.why.worklistserver.pojo.Account;
import com.why.worklistserver.user.mapper.UserMapper;
import com.why.worklistserver.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @ClassName：UserRepositoryImpl
 * @Description：todo用户数据接口实现类
 * @Author: why
 * @DateTime：2022/3/21 15:11
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(Account account) {
        userMapper.save(account);
    }

    @Override
    public void deleteByAccount(String account) {
        userMapper.deleteByAccount(account);
    }

    @Override
    public void update(Account account) {
        userMapper.update(account);
    }

    @Override
    public Account getByAccountId(Integer id) {
        return userMapper.getByAccountId(id);
    }

    @Override
    public Account getByAccount(String account) {
        return userMapper.getByAccount(account);
    }
}
