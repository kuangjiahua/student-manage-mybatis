package com.demo.studentmanage.dto;

import lombok.Data;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class ScoreResultDTO {

    private Double score;

    private Integer subjectId;

    private Integer teacherId;

    private Integer studentId;

    private String schoolYear;

}
