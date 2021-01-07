package com.demo.studentmanage.mapper;

import com.demo.studentmanage.model.Score;
import com.demo.studentmanage.model.StudentSubject;
import com.demo.studentmanage.model.exclude.ScoreResult;
import com.demo.studentmanage.model.query.ScoreQuery;

import java.util.List;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
public interface ScoreMapper {

    /**
     * 保存学生分数
     * @param studentSubject
     */
    void save(StudentSubject studentSubject);

    /**
     * 更新学生分数
     * @param score
     */
    void update(Score score);

    /**
     * 删除学生分数
     * @param id
     */
    void delete(Integer id);

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    Score read(Integer id);

    /**
     * 根据条件查询记录
     * @param studentSubject
     * @return
     */
    Score readBySubjectIdAndStudentIdAndSchoolYear(StudentSubject studentSubject);

    /**
     * 查询课程平均分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listSubjectAvgScore(ScoreQuery scoreQuery);

    /**
     * 查询课程最高分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listSubjectMaxScore(ScoreQuery scoreQuery);

    /**
     * 查询课程最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listSubjectMinScore(ScoreQuery scoreQuery);

    /**
     * 查询多个年份的课程平均分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listSubjectAvgScoreWithinYears(ScoreQuery scoreQuery);

    /**
     * 查询多个年份的课程最高分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listSubjectMaxScoreWithinYears(ScoreQuery scoreQuery);

    /**
     * 查询多个年份的课程最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listSubjectMinScoreWithinYears(ScoreQuery scoreQuery);

    /**
     * 查询多个年份，多个学生各科成绩
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchStudentScore(ScoreQuery scoreQuery);

    /**
     * 查询教师课程平均分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listTeacherAvgScore(ScoreQuery scoreQuery);

    /**
     * 查询教师课程最高分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listTeacherMaxScore(ScoreQuery scoreQuery);

    /**
     * 查询教师课程最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listTeacherMinScore(ScoreQuery scoreQuery);

    /**
     * 查询多个年份教师课程平均分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchSubjectTeacherAvgScore(ScoreQuery scoreQuery);

    /**
     * 查询多个年份教师课程最高分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchSubjectTeacherMaxScore(ScoreQuery scoreQuery);

    /**
     * 查询多个年份教师课程最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchSubjectTeacherMinScore(ScoreQuery scoreQuery);

    /**
     * 查询多个教师多个学年课程平均分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchTeacherAvgScore(ScoreQuery scoreQuery);

    /**
     * 查询多个教师多个学年课程最高分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchTeacherMaxScore(ScoreQuery scoreQuery);

    /**
     * 查询多个教师多个学年课程最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchTeacherMinScore(ScoreQuery scoreQuery);

    /**
     * 查询学生成绩
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listStudentScore(ScoreQuery scoreQuery);

    /**
     * 查询教师学科平均分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listAvgScoreByTeacher(ScoreQuery scoreQuery);

    /**
     * 查询教师学科最高分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listMaxScoreByTeacher(ScoreQuery scoreQuery);

    /**
     * 查询教师学科最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listMinScoreByTeacher(ScoreQuery scoreQuery);
}
