package com.spring.mvc.service;

import org.springframework.transaction.annotation.Transactional;

public interface UserAccountService02 {
    /**
     * 转账操作
     * @param remitTer 汇款人
     * @param receiver 收款人
     * @param money 金额
     */
    @Transactional(rollbackFor = Exception.class)
    void remittance(String remitTer, String receiver, int money) ;
}
