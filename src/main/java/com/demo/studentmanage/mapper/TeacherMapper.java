package com.demo.studentmanage.mapper;

import com.demo.studentmanage.model.Teacher;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
public interface TeacherMapper {

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    Teacher read(Integer id);

    /**
     * 保存教师信息
     * @param teacher
     */
    void save(Teacher teacher);
}
