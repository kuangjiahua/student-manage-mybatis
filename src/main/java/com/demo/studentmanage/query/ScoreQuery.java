package com.demo.studentmanage.query;

import com.demo.studentmanage.dto.common.PageRequest;
import lombok.Data;

import java.util.List;

@Data
public class ScoreQuery extends PageRequest {

    private Integer queryType;

    private Integer studentId;

    private String schoolYear;

    private Integer teacherId;

    private Double score;

    List<Integer> studentIdList;

    List<Integer> teacherIdList;

    List<String> schoolYearList;



}
