package com.hrm.company;


import com.hrm.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

//启动类
//1.配置Springboot的包扫描
@SpringBootApplication(scanBasePackages = "com.hrm")
//配置jpa的注解扫描,与实体类息息相关
@EntityScan(value = "com.hrm.domain.company")
public class CompanyApplication {
    /*
    * 启动方法*/
    public static void main(String[] args) {
        SpringApplication.run(CompanyApplication.class,args);

    }

    //注入Bean，在该模块中可以通过@Autowirte进行自动注入
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }




}
