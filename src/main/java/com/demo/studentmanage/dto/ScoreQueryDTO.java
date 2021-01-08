package com.demo.studentmanage.dto;

import com.demo.studentmanage.model.PageRequest;
import lombok.Data;

import java.util.List;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class ScoreQueryDTO extends PageRequest {

    private Integer queryType;

    private Integer studentId;

    private String schoolYear;

    private Integer teacherId;

    private Double score;

    List<Integer> studentIdList;

    List<Integer> teacherIdList;

    List<String> schoolYearList;
}
