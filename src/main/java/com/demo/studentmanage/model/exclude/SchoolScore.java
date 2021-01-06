package com.demo.studentmanage.model.exclude;

import lombok.Data;

/**
 * 分数查询实体类
 * @author kuangjiahua
 * @date   2021/01/6
 */
@Data
public class SchoolScore {

    private Integer teacherId;

    private Double score;

    private Integer subjectId;
}
