package com.demo.studentmanage.model;

import lombok.Data;

/**
 * 分页信息对象
 * @author kuangjiahua
 * @date   2021/01/05
 */
@Data
public class PageRequest {

    private int start;

    private int size;

    //自定义排序列号
    private int orderLine;

    private String orderType;

}
