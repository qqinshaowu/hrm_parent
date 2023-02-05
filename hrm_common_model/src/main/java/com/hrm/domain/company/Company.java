package com.hrm.domain.company;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;



/*
* 使用jpa操作数据
*   配置实体类和数据库表的映射关系：jpa注解
*   1.实体类和表的映射关系
*   2.字段和属性的映射关系
*       - 主键属性的映射
*       -- 普通属性的映射
*       */
//映射实体类的注解
@Entity
//实体类与那张表对应     实体类和表的映射关系
@Table(name = "co_company")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Serializable {

    private static final long serialVersionUID = 594829320797158219L;

    //Id
    @Id
    private String id;
    /**
     * 公司名称
     */
//    @Column(name = "数据库中对应的字段，如果符合驼峰命名的话可以省略")
    private String name;
    /**
     * 企业登录账号ID
     */
    private String managerId;
    /**
     * 当前版本
     */
    private String version;
    /**
     * 续期时间
     */
    private Date renewalDate;
    /**
     * 到期时间
     */
    private Date expirationDate;
    /**
     * 公司地区
     */
    private String companyArea;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 营业执照-图片ID
     */
    private String businessLicenseId;
    /**
     * 法人代表
     */
    private String legalRepresentative;
    /**
     * 公司电话
     */
    private String companyPhone;
    /**
     * 邮箱
     */
    private String mailbox;
    /**
     * 公司规模
     */
    private String companySize;
    /**
     * 所属行业
     */
    private String industry;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 审核状态
     */
    private String auditState;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 当前余额
     */
    private Double balance;
    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
