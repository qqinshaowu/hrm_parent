package com.hrm.company;


import com.hrm.company.dao.CompanyDao;
import com.hrm.domain.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CompanyDaoTest {

    @Autowired
    private CompanyDao companyDao;

    @Test
    public void Test(){
        /*
        * 1.save(company);保存，如果数据库中已经有了这个id，则进行更新
        * 2.deleteById(id);根据id删除
        * 3.findById(id);根据id查询
        * //findAll()查询全部
        *
        * */
//        Company company = companyDao.findById("1").get();
//        System.out.println(company);


        Double blance;
        blance = (double) 122222222;
        System.out.println(blance);
    }


}
