package com.demo.studentmanage.model.query;

import lombok.Data;

import java.util.List;

@Data
public class ScoreBatchQuery {

    private Integer queryType;

    private Integer studentId;

    private Integer teacherId;

    private List<String> schoolYearList;

    private List<Integer> studentIdList;

    private List<Integer> teacherIdList;

    private Double score;
}
