package com.ai.runner.center.balance.api.deduct.param;

import java.util.List;

import com.ai.runner.base.vo.BaseInfo;

/**
 * 销账扣款参数 <br>
 *
 * Date: 2015年8月27日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author lilg
 */
public class SettleParam extends BaseInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 系统ID，必填
     */
    private String systemId;

    /**
     * 外部流水号，必填
     */
    private String externalId;

    /**
     * 账户ID，必填
     */
    private long accountId;

    /**
     * 交易摘要，至少1个
     */
    private List<SettleSummary> transSummary;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public List<SettleSummary> getTransSummary() {
        return transSummary;
    }

    public void setTransSummary(List<SettleSummary> transSummary) {
        this.transSummary = transSummary;
    }
}
