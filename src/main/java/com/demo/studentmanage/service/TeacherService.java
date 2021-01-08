package com.demo.studentmanage.service;
import com.demo.studentmanage.model.TeacherSubject;
import com.demo.studentmanage.model.exclude.ScoreResult;
import com.demo.studentmanage.query.ScoreQuery;

import java.util.List;

public interface TeacherService {

    /**
     * 查询多个年份教师课程平均分/最高分/最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchTeacherSubjectScore(ScoreQuery scoreQuery);

    /**
     * 查询教师课程平均分/最高分/最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listTeacherSubjectScore(ScoreQuery scoreQuery);

    /**
     * 查询多个教师多个年份各科平均分/最高分/最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listBatchSubjectScore(ScoreQuery scoreQuery);

    /**
     * 查询该教师各科平均分/最高分/最低分
     * @param scoreQuery
     * @return
     */
    List<ScoreResult> listSubjectScore(ScoreQuery scoreQuery);

    /**
     * 保存教师课程关联关系
     * @param teacherSubject
     */
    void saveTeacherSubject(TeacherSubject teacherSubject);

    /**
     * 更新教师课程关联关系
     * @param teacherSubject
     */
    void updateTeacherSubject(TeacherSubject teacherSubject);

    /**
     * 删除教师课程关联关系
     * @param id
     */
    void deleteTeacherSubject(int id);


}
