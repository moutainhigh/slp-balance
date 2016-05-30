package com.ai.runner.center.balance.api.fundquery.param;

import com.ai.runner.base.vo.BaseInfo;

public class SubjectId extends BaseInfo {
    /**
     * 账户ID，必填
     */
    private long accountId;

    /**
     * 科目ID，必填
     */
    private long subjectId;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }
}
