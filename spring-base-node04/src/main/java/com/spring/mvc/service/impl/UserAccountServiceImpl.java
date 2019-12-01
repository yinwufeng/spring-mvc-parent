package com.spring.mvc.service.impl;

import com.spring.mvc.service.UserAccountService;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class UserAccountServiceImpl extends JdbcDaoSupport implements UserAccountService {
    // 注入事物模板
    private TransactionTemplate transactionTemplate ;
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
    @Override
    public void remittance(String remitTer, String receiver, int money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            public void doInTransactionWithoutResult(TransactionStatus arg0) {
                outMoney(remitTer,money);
                // System.out.println(1/0);
                innerMoney(receiver,money);
            }
        });
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
