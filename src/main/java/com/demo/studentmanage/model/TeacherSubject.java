package com.demo.studentmanage.model;

import lombok.Data;

import javax.persistence.Column;

/**
 * 表名：teacher_subject 教师-学科关联表
 * @author kuangjiahua
 * @date   2021/01/06
 */
@Data
public class TeacherSubject {

    private Integer id;

    private Integer teacherId;

    private Integer subjectId;

    private String schoolYear;
}
