package com.demo.studentmanage.mapper;


import com.demo.studentmanage.model.Student;

import java.util.List;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
public interface StudentMapper {

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    Student read(int id);

    /**
     * 保存学生信息
     * @param student
     */
    void save(Student student);


    List<Student> list(Student student);



}
