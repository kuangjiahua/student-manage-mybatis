package com.demo.studentmanage.mapper;

import com.demo.studentmanage.dto.SchoolScoreDto;
import com.demo.studentmanage.dto.TeacherSubjectDto;
import com.demo.studentmanage.model.exclude.SchoolScore;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 分页获取教师每学年各科的平均分，最大分，最小分
 * 分页获取教师每学年各老师各科的平均分，最大分，最小分
 * @author kuangjiahua
 * @date   2021/01/04
 */
public interface SchoolScoreMapper {

    /**
     * 获取学年各科平均分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScore> listSubjectAvgScore(@Param("schoolScore") SchoolScoreDto schoolScoreDto);

    /**
     * 获取学年各科最高分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScore> listSubjectMaxScore(@Param("schoolScore") SchoolScoreDto schoolScoreDto);

    /**
     * 获取学年各科最低分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScore> listSubjectMinScore(@Param("schoolScore") SchoolScoreDto schoolScoreDto);

    /**
     * 获取学年教师-科目平均分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScore> listTeacherSubjectAvgScore(@Param("schoolScore") SchoolScoreDto schoolScoreDto);

    /**
     * 获取学年教师-科目平均分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScore> listTeacherSubjectMaxScore(@Param("schoolScore") SchoolScoreDto schoolScoreDto);


    /**
     * 获取学年教师-科目平均分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScore> listTeacherSubjectMinScore(@Param("schoolScore") SchoolScoreDto schoolScoreDto);

    /**
     * 获取教师学年各科平均分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScore> listSubjectAvgScoreForTeacher(@Param("teacherScore") TeacherSubjectDto schoolScoreDto);

    /**
     * 获取教师学年各科最高分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScore> listSubjectMaxScoreForTeacher(@Param("teacherScore") TeacherSubjectDto schoolScoreDto);

    /**
     * 获取教师学年各科最低分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScore> listSubjectMinScoreForTeacher(@Param("teacherScore") TeacherSubjectDto schoolScoreDto);
}
