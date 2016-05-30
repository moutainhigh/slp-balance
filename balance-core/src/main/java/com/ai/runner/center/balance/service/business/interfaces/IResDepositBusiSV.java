package com.ai.runner.center.balance.service.business.interfaces;

import com.ai.runner.base.exception.BusinessException;
import com.ai.runner.center.balance.api.resdeposit.param.ResourceDeposit;


/**
 * 资源入账业务层 <br>
 *
 * Date: 2015年10月28日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * @author lilg
 */
public interface IResDepositBusiSV {
    
    /**
     * 资源入账服务
     * @param param
     * @return
     * @throws BusinessException
     * @author lilg
     */
    public void depositResource(ResourceDeposit param) throws BusinessException;
}
