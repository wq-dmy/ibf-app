package com.sxy.ibf.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * OTA平台信息
 * </p>
 *
 * @author mybatis.plus
 * @since 2020-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SibeOta implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * OTACode
     */
    private String otaCode;

    /**
     * OTA中文名
     */
    private String otaCname;

    /**
     * OTA英文名
     */
    private String otaEname;

    /**
     * OTA中文全名
     */
    private String otaFullCname;

    /**
     * OTA英文全名
     */
    private String otaFullEname;

    /**
     * OTA类型 数据字典 OTA_TYPE
     */
    private String otaType;

    /**
     * 国家Code,2字码 如 CN/US/KR ref table base_country.country_code
     */
    private String countryCode;

    /**
     * 城市Code 3字码 如 SHA/NYC/SEL ref table base_city.city_code
     */
    private String cityCode;

    /**
     * 客户级别 数据字典OTA_GRADE
     */
    private String grade;

    /**
     * 版本控制
     */
    private Integer version;

    /**
     * 备注说明
     */
    private String remark;

    /**
     * 优先排序序号
     */
    private Integer sortSeq;

    /**
     * 状态：0-无效(删除),1-有效(正常),2-暂停
     */
    private Integer status;

    /**
     * 生效日期(开始)
     */
    private LocalDateTime startTime;

    /**
     * 失效日期(截止)
     */
    private LocalDateTime endTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建人ID
     */
    private Long createUserId;

    /**
     * 创建人名称
     */
    private String createUserName;

    /**
     * 修改人ID
     */
    private Long updateUserId;

    /**
     * 修改人名称
     */
    private String updateUserName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOtaCode() {
        return otaCode;
    }

    public void setOtaCode(String otaCode) {
        this.otaCode = otaCode;
    }

    public String getOtaCname() {
        return otaCname;
    }

    public void setOtaCname(String otaCname) {
        this.otaCname = otaCname;
    }

    public String getOtaEname() {
        return otaEname;
    }

    public void setOtaEname(String otaEname) {
        this.otaEname = otaEname;
    }

    public String getOtaFullCname() {
        return otaFullCname;
    }

    public void setOtaFullCname(String otaFullCname) {
        this.otaFullCname = otaFullCname;
    }

    public String getOtaFullEname() {
        return otaFullEname;
    }

    public void setOtaFullEname(String otaFullEname) {
        this.otaFullEname = otaFullEname;
    }

    public String getOtaType() {
        return otaType;
    }

    public void setOtaType(String otaType) {
        this.otaType = otaType;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSortSeq() {
        return sortSeq;
    }

    public void setSortSeq(Integer sortSeq) {
        this.sortSeq = sortSeq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }
}
