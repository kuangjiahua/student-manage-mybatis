package com.demo.studentmanage.service;

import com.demo.studentmanage.model.Score;
import com.demo.studentmanage.model.StudentSubject;
import com.demo.studentmanage.model.exclude.ScoreResult;
import com.demo.studentmanage.model.query.ScoreQuery;

import java.util.List;

/**
 * 学生分数管理
 * @author kuangjiahua
 * @date   2021/01/07
 */
public interface StudentService {
    /**
     * 查询多个年份分数分数平均分/最高分/最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchYearScore(ScoreQuery scoreQuery);

    /**
     * 查询多个学生多个年份各科成绩
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchStudentScore(ScoreQuery scoreQuery);
    /**
     * 查询学生分数平均分/最高分/最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listStudentScore(ScoreQuery scoreQuery);

    /**
     * 查询学生成绩
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listScorePage(ScoreQuery scoreQuery);

    /**
     * 更新成绩
     * @param score
     */
    void updateStudentScore(Score score);

    /**
     * 保存成绩
     * @param studentSubject
     */
    void saveStudentSubject(StudentSubject studentSubject);

    /**
     * 删除学生成绩
     * @param id
     */
    void deleteStudentSubject(int id);

}
