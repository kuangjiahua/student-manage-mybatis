package com.demo.studentmanage.dto.common;

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

    private int orderLine;

}
