package com.ai.runner.center.balance.service.business.interfaces;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.center.balance.dao.mapper.bo.FunFundSerialByAcctIdIdx;

/**
 * 索引表管理 Date: 2015年8月18日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author lilg
 */
public interface ITableIndexManageSV {
    /**
     * 交易订单表添加新增AcctId索引
     * 
     * @param idx
     * @throws BusinessException
     * @author lilg
     * @ApiDocMethod
     */
    public void addFunFundSerialByAcctId(FunFundSerialByAcctIdIdx idx) throws BusinessException;
}
