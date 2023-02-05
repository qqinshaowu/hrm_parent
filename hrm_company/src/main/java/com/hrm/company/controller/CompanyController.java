package com.hrm.company.controller;


import com.hrm.common.entity.Result;
import com.hrm.common.entity.ResultCode;
import com.hrm.company.service.CompanyService;
import com.hrm.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    /*
    * 保存企业
    *
    * */
    @RequestMapping(value = "",method = RequestMethod.POST)
    //@RequestBody:将前端返回的json数据解析为对象，前提是要属性名一一对应
    public Result addCompany(@RequestBody Company company){
        companyService.addCompany(company);
        return new Result(ResultCode.SUCCESS);
    }


    /*
    * 更新企业*/
    @RequestMapping(value = "/updateCompany",method = RequestMethod.PUT)
    public Result updateCompany(@RequestBody Company company){
        companyService.updateCompany(company);
        return new Result(ResultCode.SUCCESS);
    }


    /*
    *
    * 根据id删除企业
    * @PathParam的作用
    * @PathVariable的作用
    * */
    @RequestMapping(value = "/deleteCompanyById/{id}",method = RequestMethod.DELETE)
    public Result deleteCompanyById(@PathVariable(value ="id" ) String id){
        companyService.deleteCompany(id);
        return new Result(ResultCode.SUCCESS);
    }

    /*
    * 根据id查询企业*/

    @RequestMapping(value = "/selectCompany/{id}",method = RequestMethod.GET)
    public Result selectCompany(@PathVariable(value = "id") String id){

        Company company = companyService.selectCompanyById(id);

        return new Result(ResultCode.SUCCESS,company);
    }

    /*
    * 查询企业列表
    *
    * */
    @RequestMapping(value = "/selectAllCompanyController",method = RequestMethod.GET)
    public Result selectAllCompanyController(){
        List<Company> companies = companyService.selectAllCompany();
        return new Result(ResultCode.SUCCESS,companies);

    }


}
