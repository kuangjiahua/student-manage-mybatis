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






    /**
     * 分页获取每学年各科分数平均值
     * @param schoolYear 学年
     * @param start 开始位置
     * @param size 分页大小
     * @return 获取每学年各科分数平均值分页信息
     *//*
    @Select("SELECT AVG(score) as score , subject_id FROM score " +
            "WHERE school_year = #{schoolYear} " +
            "GROUP BY subject_id " +
            "LIMIT #{start}, #{size}")
    @Results ({
            @Result(property = "score", column = "score"),
            @Result(property = "subjectId", column = "subject_id")
    })
    List<Score> listSubjectAvgScore(@Param("schoolYear") String schoolYear,
                                    @Param("start") int start,
                                    @Param("size") int size);


    *//**
     * 分页获取每学年各科分数最大值
     * @param schoolYear 学年
     * @param start 开始位置
     * @param size 分页大小
     * @return 获取每学年各科分数最大值分页信息
     *//*
    @Select("SELECT MAX(score) as score ,subject_id FROM score " +
            "WHERE school_year = #{schoolYear} " +
            "GROUP BY subject_id " +
            "LIMIT #{start}, #{size}")
    @Results ({
            @Result(property = "score", column = "score"),
            @Result(property = "subjectId", column = "subject_id")
    })
    List<Score> listSubjectMaxScore(@Param("schoolYear") String schoolYear,
                                      @Param("start") int start,
                                      @Param("size") int size);


    *//**
     * 分页获取每学年各科分数最小值
     * @param schoolYear 学年
     * @param start 开始位置
     * @param size 分页大小
     * @return 获取每学年各科分数最小值分页信息
     *//*
    @Select("SELECT MIN(score) as score , subject_id FROM score " +
            "WHERE school_year = #{schoolYear} " +
            "GROUP BY subject_id " +
            "LIMIT #{start}, #{size}")
    @Results ({
            @Result(property = "score", column = "score"),
            @Result(property = "subjectId", column = "subject_id")
    })
    List<Score> listSubjectMinScore(@Param("schoolYear") String schoolYear,
                                      @Param("start") int start,
                                      @Param("size") int size);


    *//**
     * 分页获取每学年各科分数平均值
     * @param schoolYear 学年
     * @param start 开始位置
     * @param size 分页大小
     * @return 获取每学年各科分数平均值分页信息
     *//*
    @Select("SELECT AVG(score) as score , subject_id, teacher_id FROM score " +
            "WHERE school_year = #{schoolYear} " +
            "GROUP BY subject_id, teacher_id " +
            "LIMIT #{start}, #{size}")
    @Results ({
            @Result(property = "score", column = "score"),
            @Result(property = "subjectId", column = "subject_id"),
            @Result(property = "teacherId", column = "teacher_id")
    })
    List<Score> listTeacherSubjectAvgScore(@Param("schoolYear") String schoolYear,
                                      @Param("start") int start,
                                      @Param("size") int size);

    *//**
     * 分页获取每学年各科分数最大值
     * @param schoolYear 学年
     * @param start 开始位置
     * @param size 分页大小
     * @return 获取每学年各科分数最大值分页信息
     *//*
    @Select("SELECT MAX(score) as score , subject_id, teacher_id FROM score " +
            "WHERE school_year = #{schoolYear} " +
            "GROUP BY subject_id, teacher_id " +
            "LIMIT #{start}, #{size}")
    @Results ({
            @Result(property = "score", column = "score"),
            @Result(property = "subjectId", column = "subject_id"),
            @Result(property = "teacherId", column = "teacher_id")
    })
    List<Score> listTeacherSubjectMaxScore(@Param("schoolYear") String schoolYear,
                                             @Param("start") int start,
                                             @Param("size") int size);

    *//**
     * 分页获取每学年各科分数最小值
     * @param schoolYear 学年
     * @param start 开始位置
     * @param size 分页大小
     * @return 获取每学年各科分数最小值分页信息
     *//*
    @Select("SELECT Min(score) as score , subject_id, teacher_id FROM score " +
            "WHERE school_year = #{schoolYear} " +
            "GROUP BY subject_id, teacher_id " +
            "LIMIT #{start}, #{size}")
    @Results ({
            @Result(property = "score", column = "score"),
            @Result(property = "subjectId", column = "subject_id"),
            @Result(property = "teacherId", column = "teacher_id")
    })
    List<Score> listTeacherSubjectMinScore(@Param("schoolYear") String schoolYear,
                                                 @Param("start") int start,
                                                 @Param("size") int size);*/


}
