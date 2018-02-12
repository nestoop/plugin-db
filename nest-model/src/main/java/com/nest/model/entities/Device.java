package com.nest.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.nest.model.Logable;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dm_device")
public class Device implements Logable, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 设备编号
     */
    @Column(name = "serial_num")
    private String serialNum;

    /**
     * 设备key
     */
    @Column(name = "auth_key")
    private String authKey;

    /**
     * 设备类型
     */
    @Column(name = "model_id")
    private Short modelId;

    /**
     * 设备类型：[1:RC 2:基础版 3: 兼容版 4：加强版]
     */
    @Column(name = "model_type")
    private Integer modelType;

    /**
     * 设备所属服务商/代理商ID
     */
    @Column(name = "customer_id")
    private Long customerId;

    /**
     * 箱子
     */
    @Column(name = "case_id")
    private Long caseId;

    /**
     * 生产批次编号
     */
    @Column(name = "batch_id")
    private Long batchId;

    @Column(name = "pay_channel_id")
    private Long payChannelId;

    /**
     * 设备生产时间
     */
    @Column(name = "produced_date")
    private Date producedDate;

    /**
     * 设备激活时间
     */
    @Column(name = "activated_date")
    private Date activatedDate;

    /**
     * 第三方商户信息ID(t_dm_merchant)
     */
    @Column(name = "merchant_id")
    private Long merchantId;

    /**
     * 设备状态：1：生产中，2：成品库，3：已销售，4：已报废
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "sold_date")
    private Date soldDate;

    /**
     * 参数列表Id
     */
    @Column(name = "param_id")
    private Long paramId;

    /**
     * 报废日期
     */
    @Column(name = "scrap_time")
    private Date scrapTime;

    /**
     * 报废理由
     */
    @Column(name = "scrap_reason")
    private String scrapReason;

    /**
     * dm_base_model_type的PK
     */
    @Column(name = "base_model_type")
    private Long baseModelType;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取设备编号
     *
     * @return serial_num - 设备编号
     */
    public String getSerialNum() {
        return serialNum;
    }

    /**
     * 设置设备编号
     *
     * @param serialNum 设备编号
     */
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum == null ? null : serialNum.trim();
    }

    /**
     * 获取设备key
     *
     * @return auth_key - 设备key
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * 设置设备key
     *
     * @param authKey 设备key
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey == null ? null : authKey.trim();
    }

    /**
     * 获取设备类型
     *
     * @return model_id - 设备类型
     */
    public Short getModelId() {
        return modelId;
    }

    /**
     * 设置设备类型
     *
     * @param modelId 设备类型
     */
    public void setModelId(Short modelId) {
        this.modelId = modelId;
    }

    /**
     * 获取设备类型：[1:RC 2:基础版 3: 兼容版 4：加强版]
     *
     * @return model_type - 设备类型：[1:RC 2:基础版 3: 兼容版 4：加强版]
     */
    public Integer getModelType() {
        return modelType;
    }

    /**
     * 设置设备类型：[1:RC 2:基础版 3: 兼容版 4：加强版]
     *
     * @param modelType 设备类型：[1:RC 2:基础版 3: 兼容版 4：加强版]
     */
    public void setModelType(Integer modelType) {
        this.modelType = modelType;
    }

    /**
     * 获取设备所属服务商/代理商ID
     *
     * @return customer_id - 设备所属服务商/代理商ID
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 设置设备所属服务商/代理商ID
     *
     * @param customerId 设备所属服务商/代理商ID
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取箱子
     *
     * @return case_id - 箱子
     */
    public Long getCaseId() {
        return caseId;
    }

    /**
     * 设置箱子
     *
     * @param caseId 箱子
     */
    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    /**
     * 获取生产批次编号
     *
     * @return batch_id - 生产批次编号
     */
    public Long getBatchId() {
        return batchId;
    }

    /**
     * 设置生产批次编号
     *
     * @param batchId 生产批次编号
     */
    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    /**
     * @return pay_channel_id
     */
    public Long getPayChannelId() {
        return payChannelId;
    }

    /**
     * @param payChannelId
     */
    public void setPayChannelId(Long payChannelId) {
        this.payChannelId = payChannelId;
    }

    /**
     * 获取设备生产时间
     *
     * @return produced_date - 设备生产时间
     */
    public Date getProducedDate() {
        return producedDate;
    }

    /**
     * 设置设备生产时间
     *
     * @param producedDate 设备生产时间
     */
    public void setProducedDate(Date producedDate) {
        this.producedDate = producedDate;
    }

    /**
     * 获取设备激活时间
     *
     * @return activated_date - 设备激活时间
     */
    public Date getActivatedDate() {
        return activatedDate;
    }

    /**
     * 设置设备激活时间
     *
     * @param activatedDate 设备激活时间
     */
    public void setActivatedDate(Date activatedDate) {
        this.activatedDate = activatedDate;
    }

    /**
     * 获取第三方商户信息ID(t_dm_merchant)
     *
     * @return merchant_id - 第三方商户信息ID(t_dm_merchant)
     */
    public Long getMerchantId() {
        return merchantId;
    }

    /**
     * 设置第三方商户信息ID(t_dm_merchant)
     *
     * @param merchantId 第三方商户信息ID(t_dm_merchant)
     */
    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取设备状态：1：生产中，2：成品库，3：已销售，4：已报废
     *
     * @return status - 设备状态：1：生产中，2：成品库，3：已销售，4：已报废
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置设备状态：1：生产中，2：成品库，3：已销售，4：已报废
     *
     * @param status 设备状态：1：生产中，2：成品库，3：已销售，4：已报废
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return created_by
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return sold_date
     */
    public Date getSoldDate() {
        return soldDate;
    }

    /**
     * @param soldDate
     */
    public void setSoldDate(Date soldDate) {
        this.soldDate = soldDate;
    }

    /**
     * 获取参数列表Id
     *
     * @return param_id - 参数列表Id
     */
    public Long getParamId() {
        return paramId;
    }

    /**
     * 设置参数列表Id
     *
     * @param paramId 参数列表Id
     */
    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }

    /**
     * 获取报废日期
     *
     * @return scrap_time - 报废日期
     */
    public Date getScrapTime() {
        return scrapTime;
    }

    /**
     * 设置报废日期
     *
     * @param scrapTime 报废日期
     */
    public void setScrapTime(Date scrapTime) {
        this.scrapTime = scrapTime;
    }

    /**
     * 获取报废理由
     *
     * @return scrap_reason - 报废理由
     */
    public String getScrapReason() {
        return scrapReason;
    }

    /**
     * 设置报废理由
     *
     * @param scrapReason 报废理由
     */
    public void setScrapReason(String scrapReason) {
        this.scrapReason = scrapReason == null ? null : scrapReason.trim();
    }

    /**
     * 获取dm_base_model_type的PK
     *
     * @return base_model_type - dm_base_model_type的PK
     */
    public Long getBaseModelType() {
        return baseModelType;
    }

    /**
     * 设置dm_base_model_type的PK
     *
     * @param baseModelType dm_base_model_type的PK
     */
    public void setBaseModelType(Long baseModelType) {
        this.baseModelType = baseModelType;
    }
}