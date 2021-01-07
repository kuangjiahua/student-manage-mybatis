package com.demo.studentmanage.model;

import lombok.Data;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class StudentSubject {

    private Integer id;

    private Integer studentId;

    private Integer subjectId;

    private String schoolYear;

    private Student student;

    private Subject subject;

}


