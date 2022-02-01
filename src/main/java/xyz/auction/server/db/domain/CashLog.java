package xyz.auction.server.db.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@ApiModel
@Entity
@Table(name = "cash_log")
public class CashLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id")
    private String id;
    @ApiModelProperty(value = "用户Id")
    @Column(name = "user_id")
    private String userId;
    @ApiModelProperty(value = "账户Id")
    @Column(name = "account_id")
    private String accountId;
    @ApiModelProperty(value = "卡号")
    @Column(name = "card_no")
    private String cardNo;
    @ApiModelProperty(value = "取现金额")
    @Column(name = "amount")
    private BigDecimal amount;
    @ApiModelProperty(value = "绑卡身份证号")
    @Column(name = "card_id_no")
    private String cardIdNo;
    @ApiModelProperty(value = "绑卡姓名")
    @Column(name = "card_name")
    private String cardName;
    @ApiModelProperty(value = "开户行ID")
    @Column(name = "sub_bank_id")
    private String subBankId;
    @ApiModelProperty(value = "开户行")
    @Column(name = "sub_bank_name")
    private String subBankName;
    @ApiModelProperty(value = "状态")
    @Column(name = "status")
    private String status;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
