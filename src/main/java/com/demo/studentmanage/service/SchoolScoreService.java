package com.demo.studentmanage.service;

import com.demo.studentmanage.dto.SchoolScoreDto;

import java.util.List;

/**
 * 查询每学年，学科平均成绩，最高分，最低分
 * 查询每学年，老师-学科平均成绩，最高分，最低分
 * @author kuangjiahua
 * @date   2021/01/05
 * */
public interface SchoolScoreService {

     /**
     * 分页获取每学年各科的平均分
     * @param schoolScoreDto
     * @return
     * */
    List<SchoolScoreDto> listSubjectAvgScorePage(SchoolScoreDto schoolScoreDto);

     /**
     * 分页获取每学年各科的最高分
     * @param schoolScoreDto
     * @return
     */
    List<SchoolScoreDto> listSubjectMaxScorePage(SchoolScoreDto schoolScoreDto);

    /**
     * 分页获取每学年各科的最低分
     * @param schoolScoreDto
     * @return
     * */
    List<SchoolScoreDto> listSubjectMinScorePage(SchoolScoreDto schoolScoreDto);

     /**
     * 分页获取每学年 各老师各学科的平均分
     * @param schoolScoreDto
     * @return
     * */
    List<SchoolScoreDto> listTeacherSubjectAvgScorePage(SchoolScoreDto schoolScoreDto);

    /**
     * 分页获取每学年 各老师各学科的平均分
     * @param schoolScoreDto
     * @return
     **/
    List<SchoolScoreDto> listTeacherSubjectMaxScorePage(SchoolScoreDto schoolScoreDto);

    /**
     * 分页获取每学年 各老师各学科的平均分
     * @param schoolScoreDto
     * @return
     * */
    List<SchoolScoreDto> listTeacherSubjectMinScorePage(SchoolScoreDto schoolScoreDto);
}
