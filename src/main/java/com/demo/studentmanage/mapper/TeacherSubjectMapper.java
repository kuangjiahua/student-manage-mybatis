package com.demo.studentmanage.mapper;

import com.demo.studentmanage.model.TeacherSubject;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
public interface TeacherSubjectMapper {

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    TeacherSubject read(Integer id);

    /**
     * 根据条件查询记录
     * @param teacherSubject
     * @return
     */
    TeacherSubject readByTeacherIdAndSubjectIdAndSchoolYear(TeacherSubject teacherSubject);

    /**
     * 更新教师课程关联关系
     * @param teacherSubject
     */
    void update(TeacherSubject teacherSubject);

    /**
     * 删除教师课程关联关系
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 保存教师课程关联关系
     * @param teacherSubject
     */
    void save(TeacherSubject teacherSubject);

}
