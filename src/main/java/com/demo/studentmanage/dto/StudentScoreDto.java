package com.demo.studentmanage.dto;

import com.demo.studentmanage.dto.common.PageRequest;
import lombok.Data;

/**
 * 学生查询分数请求对象
 * @author kuangjiahua
 * @date   2021/01/04
 */
@Data
public class StudentScoreDto extends PageRequest {

    private Integer id;

    private Integer studentId;

    private Double score;

    private Integer subjectId;

    private String schoolYear;


}
