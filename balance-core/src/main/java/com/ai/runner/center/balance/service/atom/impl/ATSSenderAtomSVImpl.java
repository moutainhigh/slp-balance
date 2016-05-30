package com.ai.runner.center.balance.service.atom.impl;

import org.springframework.stereotype.Service;

import com.ai.paas.ipaas.ats.producer.TransactionMsgProducerFactory;
import com.ai.paas.ipaas.txs.common.protocol.TransactionMessage;
import com.ai.runner.center.balance.ats.interfaces.IAccountIndexTableSV;
import com.ai.runner.center.balance.ats.interfaces.ITableIndexSV;
import com.ai.runner.center.balance.dao.mapper.bo.FunAccountInfoByCustIdIdx;
import com.ai.runner.center.balance.dao.mapper.bo.FunAccountInfoByExternalIdIdx;
import com.ai.runner.center.balance.dao.mapper.bo.FunFundSerialByAcctIdIdx;
import com.ai.runner.center.balance.service.atom.interfaces.IATSSenderAtomSV;
import com.ai.runner.sdk.tools.PaaSServiceTool;
@Service
public class ATSSenderAtomSVImpl implements IATSSenderAtomSV {

    @Override
    public void sendAtsInsertFunAccountInfoByExternalIdIdx(FunAccountInfoByExternalIdIdx info) {
        String signatureId = PaaSServiceTool.getATSSignatureId();
        /** 创建消息， 写入 索引表 FunAccountInfoByExternalIdIdx */
        TransactionMessage tsMsg = 
                new TransactionMessage(
                        signatureId, 
                        IAccountIndexTableSV.class.getName(), 
                        "insertFunAccountInfoByExternalIdIdx", 
                        info);
        /** 发送消息 */
        TransactionMsgProducerFactory.getClient().sendMessage(tsMsg);
    }

    @Override
    public void sendAtsInsertFunAccountInfoByCustIdIdx(FunAccountInfoByCustIdIdx info) {
        String signatureId = PaaSServiceTool.getATSSignatureId();
        /** 创建消息，写入 索引表 FunAccountInfoByCustIdIdx */
        TransactionMessage tsMsg = 
                new TransactionMessage(
                        signatureId,
                        IAccountIndexTableSV.class.getName(),
                        "insertFunAccountInfoByCustIdIdx",
                        info);
        /** 发送消息 */
        TransactionMsgProducerFactory.getClient().sendMessage(tsMsg);
    }

    @Override
    public void sendAtsAddFunFundSerialByAcctIdIdx(FunFundSerialByAcctIdIdx idx) {
        String signatureId = PaaSServiceTool.getATSSignatureId();
        TransactionMessage mq = new TransactionMessage(signatureId,
                ITableIndexSV.class.getName(), "addFunFundSerialByAcctIdIdx", idx);
        TransactionMsgProducerFactory.getClient().sendMessage(mq);
    }

}
