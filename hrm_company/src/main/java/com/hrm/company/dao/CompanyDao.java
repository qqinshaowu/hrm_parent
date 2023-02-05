package com.hrm.company.dao;


import com.hrm.domain.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/*
* 利用jpa实现企业管理的曾删改查
* 1.创建CompanyDao接口
* 2.继承JpaRepository<对应实现功能的类，里面的主键id的类型>
* 3.继承JpaSpecificationExecutor<实体类的类型>
*
*
* */
public interface CompanyDao extends JpaRepository<Company,String>,JpaSpecificationExecutor<Company>{

}
