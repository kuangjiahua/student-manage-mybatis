package com.demo.studentmanage.mapper;

import com.demo.studentmanage.dto.StudentScoreDto;
import com.demo.studentmanage.model.StudentScore;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 分页查询某个学生某学年各科成绩
 * @author kuangjiahua
 * @date   2021/01/042021/01/04
 */
@Repository
public interface StudentScoreMapper {

    /**
     * 分页查询某个学生某学年各科成绩
     * @param studentScoreDto
     * @return
     */
    List<StudentScore> listScorePage(@Param("studentScore") StudentScoreDto studentScoreDto);

    /**
     * 根据条件查询单条记录
     * @param studentScoreDto
     * @return
     */
    StudentScore findByCondition(@Param("studentScore") StudentScoreDto studentScoreDto);

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    StudentScore findById(@Param("id") Integer id);

    /**
     * 保存学生成绩
     * @param studentScoreDto
     * @return
     */
    int saveStudentScore(@Param("studentScore") StudentScoreDto studentScoreDto);

    /**
     * 修改学生成绩
     * @param studentScoreDto
     * @return
     */
    int updateStudentScore(@Param("studentScore") StudentScoreDto studentScoreDto);

    /**
     * 删除学生成绩
     * @param id
     * @return
     */
    int deleteStudentScore(@Param("id") Integer id);
}
