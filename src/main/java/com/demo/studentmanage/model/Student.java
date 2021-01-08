package com.demo.studentmanage.model;

import lombok.Data;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class Student extends PageRequest{

    private Integer id;

    private String name;

    private Score score;

    private Subject subject;

}
