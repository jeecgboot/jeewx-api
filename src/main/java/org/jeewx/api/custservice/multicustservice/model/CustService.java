package org.jeewx.api.custservice.multicustservice.model;

import org.jeewx.api.core.req.model.WeixinReqParam;

/**
 * 客户服务人员
 * @author caojm
 *
 */


public class CustService extends WeixinReqParam{

    //完整客服账号，格式为：账号前缀@公众号微信号
    private String kfAccount = "";
    
    //客服在线状态 1：pc在线，2：手机在线。若pc和手机同时在线则为 1+2=3
    private int status = -1;
    
    //客服工号
    private String kfId = "";
    
    //客服设置的最大自动接入数
    private int autoAccept = -1;
    
    //客服当前正在接待的会话数
    private int acceptedCase = -1;

    public String getKfAccount() {
        return kfAccount;
    }

    public void setKfAccount(String kfAccount) {
        this.kfAccount = kfAccount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getKfId() {
        return kfId;
    }

    public void setKfId(String kfId) {
        this.kfId = kfId;
    }

    public int getAutoAccept() {
        return autoAccept;
    }

    public void setAutoAccept(int autoAccept) {
        this.autoAccept = autoAccept;
    }

    public int getAcceptedCase() {
        return acceptedCase;
    }

    public void setAcceptedCase(int acceptedCase) {
        this.acceptedCase = acceptedCase;
    }
}
