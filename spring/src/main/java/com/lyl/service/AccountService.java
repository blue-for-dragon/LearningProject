package com.lyl.service;
import com.lyl.entity.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface AccountService {

    //查询所有账户
    List<Account> findAllAccount();
    //查询单个账户
    Account findAccountById(Integer id);
    //保存操作
    void saveAccount(Account account);
    //更新
    void updateAccount(Account account);
    //删除
    void deleteAccount(Integer id);

    /**
     * 转账
     * @param sourceName 转出账户名称
     * @param targetName    转入账户名称
     * @param money 转账金额
     */
    void transfer(String sourceName,String targetName,Float money);
    void aop();
}