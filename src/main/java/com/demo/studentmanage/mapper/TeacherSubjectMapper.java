package com.demo.studentmanage.mapper;

import com.demo.studentmanage.dto.TeacherSubjectDto;
import com.demo.studentmanage.model.TeacherSubject;
import org.apache.ibatis.annotations.Param;

/**
 * 分页获取教师每学年各科的平均分，最大分，最小分
 * @author kuangjiahua
 * @date   2021/01/04
 */
public interface TeacherSubjectMapper {

    TeacherSubject findById(@Param("id") Integer id);

    TeacherSubject findByCondition(@Param("teacherSubject") TeacherSubjectDto dto);

    int saveTeacherSubject(@Param("teacherSubject") TeacherSubjectDto dto);

    int updateTeacherSubject(@Param("teacherSubject") TeacherSubjectDto dto);

    int deleteTeacherSubject(@Param("id") Integer id);


}
