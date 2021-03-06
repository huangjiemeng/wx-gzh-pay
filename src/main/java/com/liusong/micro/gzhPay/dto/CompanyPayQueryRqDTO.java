package com.liusong.micro.gzhPay.dto;

import com.liusong.micro.gzhPay.dto.wx.IWxSignDTO;

/**
 * 企业支付查询请求参数
 */
public class CompanyPayQueryRqDTO implements IWxSignDTO{

    private String nonce_str;
    private String sign;
    private String partner_trade_no;
    private String mch_id;
    private String appid;

    public String getNonce_str() {
        return nonce_str;
    }

    @Override
    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    @Override
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPartner_trade_no() {
        return partner_trade_no;
    }

    public void setPartner_trade_no(String partner_trade_no) {
        this.partner_trade_no = partner_trade_no;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }
}
