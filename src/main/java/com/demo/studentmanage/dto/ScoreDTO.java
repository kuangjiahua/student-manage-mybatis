package com.demo.studentmanage.dto;

import lombok.Data;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class ScoreDTO {

    private Integer id;

    private Integer studentId;

    private Integer subjectId;

    private String schoolYear;

    private Double score;

}
