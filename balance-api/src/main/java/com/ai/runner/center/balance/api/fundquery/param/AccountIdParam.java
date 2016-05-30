package com.ai.runner.center.balance.api.fundquery.param;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 账号查询请求参数
 * Date: 2015年8月4日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author lilg
 */
public class AccountIdParam extends BaseInfo{
    
    /**
     * 账户ID，必填
     */
    private long accountId;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

}
