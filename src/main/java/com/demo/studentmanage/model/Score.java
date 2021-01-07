package com.demo.studentmanage.model;

import lombok.Data;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class Score {

    private Integer id;

    private Integer studentId;

    private String schoolYear;

    private Integer subjectId;

    private Double score;
}
