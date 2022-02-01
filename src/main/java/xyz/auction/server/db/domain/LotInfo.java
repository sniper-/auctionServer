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
@Table(name = "lot_nfo")
public class LotInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id")
    private String id;
    @ApiModelProperty(value = "拍品名称")
    @Column(name = "name")
    private String name;
    @ApiModelProperty(value = "图片Id")
    @Column(name = "icon_id")
    private String iconId;
    @ApiModelProperty(value = "卖方账户Id")
    @Column(name = "account_id")
    private String accountId;
    @ApiModelProperty(value = "状态")
    @Column(name = "status")
    private String status;
    @ApiModelProperty(value = "开始时间")
    @Column(name = "begin_time")
    private Date beginTime;
    @ApiModelProperty(value = "结束时间")
    @Column(name = "end_time")
    private Date endTime;
    @ApiModelProperty(value = "产品价")
    @Column(name = "price")
    private BigDecimal price;
    @ApiModelProperty(value = "标的物所在地")
    @Column(name = "price")
    private String address;
    @ApiModelProperty(value = "处置机构")
    @Column(name = "institution")
    private String institution;
    @ApiModelProperty(value = "联系人")
    @Column(name = "contract_name")
    private String contractName;
    @ApiModelProperty(value = "联系方式")
    @Column(name = "contract_phone")
    private String contractPhone;
    @ApiModelProperty(value = "竞拍须知Id")
    @Column(name = "instructions_id")
    private String instructionsId;
    @ApiModelProperty(value = "拍品描述Id")
    @Column(name = "describe_id")
    private String describeId;
    @ApiModelProperty(value = "竞拍公告Id")
    @Column(name = "announcement_id")
    private String announcementId;
    @ApiModelProperty(value = "担保函Id")
    @Column(name = "guarantee_id")
    private String guaranteeId;
    @ApiModelProperty(value = "保险单Id")
    @Column(name = "insurance_id")
    private String insuranceId;
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

    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractPhone() {
        return contractPhone;
    }

    public void setContractPhone(String contractPhone) {
        this.contractPhone = contractPhone;
    }

    public String getInstructionsId() {
        return instructionsId;
    }

    public void setInstructionsId(String instructionsId) {
        this.instructionsId = instructionsId;
    }

    public String getDescribeId() {
        return describeId;
    }

    public void setDescribeId(String describeId) {
        this.describeId = describeId;
    }

    public String getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(String announcementId) {
        this.announcementId = announcementId;
    }

    public String getGuaranteeId() {
        return guaranteeId;
    }

    public void setGuaranteeId(String guaranteeId) {
        this.guaranteeId = guaranteeId;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
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
