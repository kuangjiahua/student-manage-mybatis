package com.demo.studentmanage.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class Subject implements Serializable {

    private Integer id;

    private String name;
}
