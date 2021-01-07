package com.demo.studentmanage.dto.converter;

import com.demo.studentmanage.dto.TeacherSubjectDTO;
import com.demo.studentmanage.model.Subject;
import com.demo.studentmanage.model.Teacher;
import com.demo.studentmanage.model.TeacherSubject;
import org.springframework.beans.BeanUtils;

public class TeacherConverter {

    public static TeacherSubject convertDtoToModel(TeacherSubjectDTO dto){
        TeacherSubject teacherSubject = new TeacherSubject();
        BeanUtils.copyProperties(dto, teacherSubject);
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(dto.getTeacherDTO(), teacher);
        teacherSubject.setTeacher(teacher);
        Subject subject = new Subject();
        BeanUtils.copyProperties(dto.getSubjectDTO(), subject);
        teacherSubject.setSubject(subject);
        return  teacherSubject;
    }
}
