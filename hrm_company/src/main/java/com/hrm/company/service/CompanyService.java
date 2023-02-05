package com.hrm.company.service;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.hrm.common.utils.IdWorker;
import com.hrm.company.dao.CompanyDao;
import com.hrm.domain.company.Company;
import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//交给spring容器实例化对象
@Service
public class CompanyService {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private IdWorker idWorker;

    /*
    * 保存企业
    * 1.配置idWorker到工程中
    * 2.在service层注入idworker
    * 3.通过idworker生成id
    * 4.保存企业
    **/

    public void addCompany(Company company){

        //为company设置雪花算法算出来的id
        company.setId(idWorker.nextId()+"");
        company.setManagerId("666");
        company.setCreateTime(new Date());
        company.setState(0); //0:未审核，1：审核通过
        //设置余额
        company.setBalance(999999999.0);
        companyDao.save(company);

    }



//    public void add(Company company){
//        //生成id
//        long companyId = idWorker.nextId();
//        //生成的id为Long类型，转为String类型
//        String StringCompanyId = companyId + "";
//        company.setAuditState("0");//0:未审核，1：已审核
//        company.setState(1);//0.未激活，1：已激活
//
//        //Column 'balance' cannot be null
//        Double balance = (double)999999;
//        company.setBalance(balance);
//
//        company.setCreateTime(new Date());
//
//        //Column 'manager_id' cannot be null
//        company.setManagerId("abc");
//
//        //把生成的id赋值给company
//        company.setId(StringCompanyId);
//        //将company进行保存
//        companyDao.save(company);
//    }



    /*
    * 更新企业
    *
    * */
    public void updateCompany(Company company){

        company.setManagerId("666");
        company.setCreateTime(new Date());
        company.setState(0); //0:未审核，1：审核通过
        //设置余额
        company.setBalance(999999999.0);
        companyDao.save(company);
    }


    /*
    * 删除企业
    *
    * */
    public void deleteCompany(String id){

        companyDao.deleteById(id);
    }



    /*
    * 根据id查询企业
    *
    * */
    public Company selectCompanyById(String id){

        Company company = companyDao.findById(id).get();
        return company;


    }

    /*
    *
    *
    * 查询企业列表
    * */
    public List<Company> selectAllCompany(){
        List<Company> companyList = companyDao.findAll();
        return companyList;

    }


}
