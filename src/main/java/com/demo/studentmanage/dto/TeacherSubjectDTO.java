package com.demo.studentmanage.dto;

import lombok.Data;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class TeacherSubjectDTO {

    private Integer id;

    private String schoolYear;

    private Integer teacherId;

    private Integer subjectId;

    private TeacherDTO teacherDTO;

    private SubjectDTO subjectDTO;
}
