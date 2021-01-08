package com.demo.studentmanage.service.impl;
import com.demo.studentmanage.constant.QueryTypeConstant;
import com.demo.studentmanage.mapper.ScoreMapper;
import com.demo.studentmanage.mapper.SubjectMapper;
import com.demo.studentmanage.mapper.TeacherMapper;
import com.demo.studentmanage.mapper.TeacherSubjectMapper;
import com.demo.studentmanage.model.Subject;
import com.demo.studentmanage.model.Teacher;
import com.demo.studentmanage.model.TeacherSubject;
import com.demo.studentmanage.model.exclude.ScoreResult;
import com.demo.studentmanage.query.ScoreQuery;
import com.demo.studentmanage.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    ScoreMapper scoreMapper;
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    SubjectMapper subjectMapper;
    @Autowired
    TeacherSubjectMapper teacherSubejctMapper;

    @Override
    public List<ScoreResult> listBatchTeacherSubjectScore(ScoreQuery scoreQuery) {
        List<ScoreResult> scoreResultList = new ArrayList<>();
        if(scoreQuery.getQueryType().equals(QueryTypeConstant.AVG)){
            scoreResultList = scoreMapper.listBatchSubjectTeacherAvgScore(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MAX)){
            scoreResultList = scoreMapper.listBatchSubjectTeacherMaxScore(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MIN)){
            scoreResultList = scoreMapper.listBatchSubjectTeacherMinScore(scoreQuery);
        }
        return scoreResultList;
    }

    @Override
    public List<ScoreResult> listTeacherSubjectScore(ScoreQuery scoreQuery) {
        List<ScoreResult> scoreResultList = new ArrayList<>();
        if(scoreQuery.getQueryType().equals(QueryTypeConstant.AVG)){
            scoreResultList = scoreMapper.listTeacherAvgScore(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MAX)){
            scoreResultList = scoreMapper.listTeacherMaxScore(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MIN)){
            scoreResultList = scoreMapper.listTeacherMinScore(scoreQuery);
        }
        return scoreResultList;
    }

    @Override
    public List<ScoreResult> listBatchSubjectScore(ScoreQuery scoreQuery) {
        List<ScoreResult> scoreResultList = new ArrayList<>();
        if(scoreQuery.getQueryType().equals(QueryTypeConstant.AVG)){
            scoreResultList = scoreMapper.listBatchTeacherAvgScore(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MAX)){
            scoreResultList = scoreMapper.listBatchTeacherMaxScore(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MIN)){
            scoreResultList = scoreMapper.listBatchTeacherMinScore(scoreQuery);
        }
        return scoreResultList;
    }

    @Override
    public List<ScoreResult> listSubjectScore(ScoreQuery scoreQuery) {
        List<ScoreResult> scoreResultList = new ArrayList<>();
        if(scoreQuery.getQueryType().equals(QueryTypeConstant.AVG)){
            scoreResultList = scoreMapper.listAvgScoreByTeacher(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MAX)){
            scoreResultList = scoreMapper.listMaxScoreByTeacher(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MIN)){
            scoreResultList = scoreMapper.listMinScoreByTeacher(scoreQuery);
        }
        return scoreResultList;
    }

    @Override
    public void saveTeacherSubject(TeacherSubject teacherSubject) {
        //校验课程信息是否存在,若没有则添加课程信息
        Subject subjectExist = subjectMapper.read(teacherSubject.getSubjectId());
        if(subjectExist == null){
            subjectMapper.save(teacherSubject.getSubject());
        }
        //校验教师信息是否存在，若没有则添加教师信息
        Teacher teacherExist = teacherMapper.read(teacherSubject.getTeacherId());
        if(teacherExist == null){
            teacherMapper.save(teacherSubject.getTeacher());
        }
        //关联教师和课程的关系
        teacherSubejctMapper.save(teacherSubject);
    }

    @Override
    public void updateTeacherSubject(TeacherSubject teacherSubject) {
        //查询id对应记录是否存在
        TeacherSubject teacherSubjectExist = teacherSubejctMapper.read(teacherSubject.getId());
        if(teacherSubjectExist == null){
            return;
        }
        //查询是否重复关联课程
        TeacherSubject teacherSubjectRepeat = teacherSubejctMapper.readByTeacherIdAndSubjectIdAndSchoolYear(teacherSubject);
        if(teacherSubjectRepeat != null
                && !teacherSubjectRepeat.getId().equals(teacherSubject.getId())){
            return;
        }
        //更新教师课程关联
        teacherSubejctMapper.update(teacherSubject);
    }

    @Override
    public void deleteTeacherSubject(int id) {
        teacherSubejctMapper.delete(id);
    }
}
