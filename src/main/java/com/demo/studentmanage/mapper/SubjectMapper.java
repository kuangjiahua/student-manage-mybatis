package com.demo.studentmanage.mapper;

import com.demo.studentmanage.model.Subject;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
public interface SubjectMapper {

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    Subject read(int id);

    /**
     * 保存课程信息
     * @param subject
     */
    void save(Subject subject);

}
