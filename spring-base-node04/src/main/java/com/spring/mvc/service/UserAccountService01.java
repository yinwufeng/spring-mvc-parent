package com.spring.mvc.service;

public interface UserAccountService01 {
    /**
     * 转账操作
     * @param remitTer 汇款人
     * @param receiver 收款人
     * @param money 金额
     */
    void remittance(String remitTer, String receiver, int money) ;
}
