package com.spring.mvc.service.impl;

import com.spring.mvc.service.UserAccountService01;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl01 extends JdbcDaoSupport implements UserAccountService01 {

    @Override
    public void remittance(String remitTer, String receiver, int money) {
        outMoney(remitTer,money);
        System.out.println(1/0);
        innerMoney(receiver,money);
    }
    private void outMoney (String remitTer, int money){
        String outSql = "update user_account set money = money - ? where username = ?";
        this.getJdbcTemplate().update(outSql, money ,remitTer);
    }
    private void innerMoney (String receiver, int money){
        String inSql = "update user_account set money = money + ? where username = ?";
        this.getJdbcTemplate().update(inSql, money,receiver);
    }
}
