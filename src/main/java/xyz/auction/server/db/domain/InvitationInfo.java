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
@Table(name = "invitation_info")
public class InvitationInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id")
    private String id;
    @ApiModelProperty(value = "邀请码")
    @Column(name = "code")
    private String code;
    @ApiModelProperty(value = "销售姓名")
    @Column(name = "saler_Name")
    private String salerName;
    @ApiModelProperty(value = "手机号")
    @Column(name = "saler_phone_num")
    private String salerPhoneNum;
    @ApiModelProperty(value = "身份证号码")
    @Column(name = "saler_id_no")
    private String salerIdNo;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSalerName() {
        return salerName;
    }

    public void setSalerName(String salerName) {
        this.salerName = salerName;
    }

    public String getSalerPhoneNum() {
        return salerPhoneNum;
    }

    public void setSalerPhoneNum(String salerPhoneNum) {
        this.salerPhoneNum = salerPhoneNum;
    }

    public String getSalerIdNo() {
        return salerIdNo;
    }

    public void setSalerIdNo(String salerIdNo) {
        this.salerIdNo = salerIdNo;
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
