package xyz.auction.server.db.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@ApiModel
@Entity
@Table(name = "user_info")
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id")
    private String id;
    @ApiModelProperty(value = "姓名")
    @Column(name = "name")
    private String name;
    @ApiModelProperty(value = "手机号")
    @Column(name = "phone_num")
    private String phoneNum;
    @ApiModelProperty(value = "邀请码")
    @Column(name = "invitation_code")
    private String invitationCode;
    @ApiModelProperty(value = "身份证号码")
    @Column(name = "id_no")
    private String idNo;
    @ApiModelProperty(value = "绑卡身份证号码")
    @Column(name = "card_id_no")
    private String cardIdNo;
    @ApiModelProperty(value = "绑卡姓名")
    @Column(name = "card_name")
    private String cardName;
    @ApiModelProperty(value = "卡号")
    @Column(name = "card_no")
    private String cardNo;
    @ApiModelProperty(value = "银行Id")
    @Column(name = "bank_id")
    private String bankId;
    @ApiModelProperty(value = "所属银行")
    @Column(name = "bank_name")
    private String bankName;
    @ApiModelProperty(value = "开户行Id")
    @Column(name = "sub_bank_id")
    private String subBankId;
    @ApiModelProperty(value = "开户行")
    @Column(name = "sub_bank_name")
    private String subBankName;
    @ApiModelProperty("创建时间")
    @Column(name = "create_time")
    private Date createTime;
    @ApiModelProperty("更新时间")
    @Column(name = "update_time")
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getCardIdNo() {
        return cardIdNo;
    }

    public void setCardIdNo(String cardIdNo) {
        this.cardIdNo = cardIdNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSubBankId() {
        return subBankId;
    }

    public void setSubBankId(String subBankId) {
        this.subBankId = subBankId;
    }

    public String getSubBankName() {
        return subBankName;
    }

    public void setSubBankName(String subBankName) {
        this.subBankName = subBankName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public String toString() {
        return ((JSONObject) JSON.toJSON(this)).toJSONString();
    }
}
