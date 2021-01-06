package com.demo.studentmanage.dto.converter;

import com.demo.studentmanage.dto.TeacherSubjectDto;
import com.demo.studentmanage.model.TeacherSubject;
import com.demo.studentmanage.model.exclude.SchoolScore;
import org.springframework.beans.BeanUtils;

/**
 * 数据类型转换器
 * @author kuangjiahua
 * @date   2021/01/04
 */
public class TeacherSubjectConverter {

    public static TeacherSubjectDto convertModelToDto(SchoolScore schoolScore){
        TeacherSubjectDto teacherSubjectDto = new TeacherSubjectDto();
        BeanUtils.copyProperties(schoolScore, teacherSubjectDto);
        return teacherSubjectDto;
    }
}
