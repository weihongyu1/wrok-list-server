package com.why.worklistserver.user.repository;

import com.why.worklistserver.pojo.Account;

/**
 * @InterfaceName：UserRepository
 * @Description：用户数据接口
 * @Author: why
 * @Date：2022/3/21
 **/
public interface UserRepository {
    /**
     * 新增用户数据
     * @param account
     */
    void save(Account account);

    /**
     * 根据账号删除数据
     * @param account
     */
    void deleteByAccount(String account);

    /**
     * 更新数据
     * @param account
     */
    void update(Account account);

    /**
     * 根据账号id查询数据
     * @param id
     */
    Account getByAccountId(Integer id);

    /**
     * 根据账号查询数据
     * @param account
     * @return
     */
    Account getByAccount(String account);
}
