package com.demo.studentmanage.model;

import lombok.Data;

/**
 * 表名：score 学生分数表
 * @author kuangjiahua
 * @date   2021/01/042021/01/04
 */
@Data
public class StudentScore {

    private Integer id;

    private Integer studentId;

    private String schoolYear;

    private Integer subjectId;

    private Double score;

}
