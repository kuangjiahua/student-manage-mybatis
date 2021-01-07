package com.demo.studentmanage.model;

import lombok.Data;

import javax.persistence.Column;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class TeacherSubject {

    private Integer id;

    private Integer teacherId;

    private Integer subjectId;

    private String schoolYear;

    private Teacher teacher;

    private Subject subject;
}
