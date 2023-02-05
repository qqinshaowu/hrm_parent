package com.hrm.common.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
* 分页查询的时候，需要将信息放入到Result中一起返回
*
*       {
*           "SUCCESS" : true,
*           "code"    :10000,
*           "message" :"成功",
*           "data":{
*               "total"://总条数
*               "rows"://数据列表
*           }
*       }
*
* */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {

    //总条数
    private Long total;

    //数据列表
    private List<T> rows;
}
