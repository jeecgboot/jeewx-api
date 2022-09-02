package com.jeecg.qywx.api.message.vo;

/**
 * 企业微信文本卡片消息
 *
 * @author sunjianlei
 */
public class TextCard {

    private String touser;//成员ID列表（消息接收者，多个接收者用‘|’分隔，最多支持1000个）。特殊情况：指定为@all，则向关注该企业应用的全部成员发送
    private String toparty;//部门ID列表，多个接收者用‘|’分隔，最多支持100个。当touser为@all时忽略本参
    private String totag;//	标签ID列表，多个接收者用‘|’分隔。当touser为@all时忽略本参数
    private int agentid;//企业应用的id，整型。可在应用的设置页面查看
    private TextCardEntity textcard;//信息实体

    private String enable_id_trans;// 否	表示是否开启id转译，0表示否，1表示是，默认0
    private String enable_duplicate_check;// 否	表示是否开启重复消息检查，0表示否，1表示是，默认0
    private String duplicate_check_interval;// 否	表示是否重复消息检查的时间间隔，默认1800s，最大不超过4小时

    //消息类型，此时固定为：textcard
    public String getMsgtype() {
        return "textcard";
    }

    public String getTouser() {
        return touser;
    }

    public TextCard setTouser(String touser) {
        this.touser = touser;
        return this;
    }

    public String getToparty() {
        return toparty;
    }

    public TextCard setToparty(String toparty) {
        this.toparty = toparty;
        return this;
    }

    public String getTotag() {
        return totag;
    }

    public TextCard setTotag(String totag) {
        this.totag = totag;
        return this;
    }

    public int getAgentid() {
        return agentid;
    }

    public TextCard setAgentid(int agentid) {
        this.agentid = agentid;
        return this;
    }

    public TextCardEntity getTextcard() {
        return textcard;
    }

    public TextCard setTextcard(TextCardEntity textcard) {
        this.textcard = textcard;
        return this;
    }

    public String getEnable_id_trans() {
        return enable_id_trans;
    }

    public TextCard setEnable_id_trans(String enable_id_trans) {
        this.enable_id_trans = enable_id_trans;
        return this;
    }

    public String getEnable_duplicate_check() {
        return enable_duplicate_check;
    }

    public TextCard setEnable_duplicate_check(String enable_duplicate_check) {
        this.enable_duplicate_check = enable_duplicate_check;
        return this;
    }

    public String getDuplicate_check_interval() {
        return duplicate_check_interval;
    }

    public TextCard setDuplicate_check_interval(String duplicate_check_interval) {
        this.duplicate_check_interval = duplicate_check_interval;
        return this;
    }
}
