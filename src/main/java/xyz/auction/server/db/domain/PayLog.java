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
@Table(name = "pay_log")
public class PayLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id")
    private String id;
    @ApiModelProperty(value = "拍品Id")
    @Column(name = "lot_id")
    private String lotId;
    @ApiModelProperty(value = "拆分拍品Id")
    @Column(name = "sub_lot_id")
    private String subLotId;
    @ApiModelProperty(value = "最终拍价金额")
    @Column(name = "amount")
    private BigDecimal amount;
    @ApiModelProperty(value = "用户Id")
    @Column(name = "user_id")
    private String userId;
    @ApiModelProperty(value = "买方账户Id")
    @Column(name = "buyer_account_id")
    private String buyerAccountId;
    @ApiModelProperty(value = "卖方方账户Id")
    @Column(name = "seller_account_id")
    private String sellerAccountId;
    @ApiModelProperty(value = "状态")
    @Column(name = "status")
    private String status;
    @ApiModelProperty(value = "失败原因")
    @Column(name = "fail_message")
    private String failMessage;
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

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    public String getSubLotId() {
        return subLotId;
    }

    public void setSubLotId(String subLotId) {
        this.subLotId = subLotId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBuyerAccountId() {
        return buyerAccountId;
    }

    public void setBuyerAccountId(String buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
    }

    public String getSellerAccountId() {
        return sellerAccountId;
    }

    public void setSellerAccountId(String sellerAccountId) {
        this.sellerAccountId = sellerAccountId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
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
