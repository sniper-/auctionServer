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
@Table(name = "sub_lot_nfo")
public class SubLotInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id")
    private String id;
    @ApiModelProperty(value = "拍品Id")
    @Column(name = "lot_id")
    private String lotId;
    @ApiModelProperty(value = "产品价")
    @Column(name = "price")
    private BigDecimal price;
    @ApiModelProperty(value = "当前价")
    @Column(name = "current_price")
    private BigDecimal currentPrice;
    @ApiModelProperty(value = "起拍价")
    @Column(name = "start_price")
    private BigDecimal startPrice;
    @ApiModelProperty(value = "加价")
    @Column(name = "increase_price")
    private BigDecimal increasePrice;
    @ApiModelProperty(value = "保证金")
    @Column(name = "margin_amount")
    private BigDecimal marginAmount;
    @ApiModelProperty(value = "保留价")
    @Column(name = "retention_price")
    private BigDecimal retentionPrice;
    @ApiModelProperty(value = "状态")
    @Column(name = "status")
    private String status;
    @ApiModelProperty(value = "竞得者")
    @Column(name = "user_id")
    private String userId;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    public BigDecimal getIncreasePrice() {
        return increasePrice;
    }

    public void setIncreasePrice(BigDecimal increasePrice) {
        this.increasePrice = increasePrice;
    }

    public BigDecimal getMarginAmount() {
        return marginAmount;
    }

    public void setMarginAmount(BigDecimal marginAmount) {
        this.marginAmount = marginAmount;
    }

    public BigDecimal getRetentionPrice() {
        return retentionPrice;
    }

    public void setRetentionPrice(BigDecimal retentionPrice) {
        this.retentionPrice = retentionPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
