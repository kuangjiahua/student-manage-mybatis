package com.demo.studentmanage.service.impl;
import com.demo.studentmanage.constant.QueryTypeConstant;
import com.demo.studentmanage.mapper.ScoreMapper;
import com.demo.studentmanage.mapper.StudentMapper;
import com.demo.studentmanage.mapper.SubjectMapper;
import com.demo.studentmanage.model.Score;
import com.demo.studentmanage.model.Student;
import com.demo.studentmanage.model.StudentSubject;
import com.demo.studentmanage.model.Subject;
import com.demo.studentmanage.model.exclude.ScoreResult;
import com.demo.studentmanage.query.ScoreQuery;
import com.demo.studentmanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ScoreMapper scoreMapper;
    @Autowired
    private SubjectMapper subjectMapper;

    @Override
    public List<Student> list(Student student) {
        return studentMapper.list(student);
    }

    @Override
    public List<ScoreResult> listScoreByOrder(ScoreQuery scoreQuery) {
        return scoreMapper.listScoreByOrder(scoreQuery);
    }

    @Override
    public List<ScoreResult> listBatchYearScore(ScoreQuery scoreQuery) {
        List<ScoreResult> scoreResultList = new ArrayList<>();
        if(scoreQuery.getQueryType().equals(QueryTypeConstant.AVG)){
            scoreResultList = scoreMapper.listSubjectAvgScoreWithinYears(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MAX)){
            scoreResultList = scoreMapper.listSubjectMaxScoreWithinYears(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MIN)){
            scoreResultList = scoreMapper.listSubjectMinScoreWithinYears(scoreQuery);
        }
        return scoreResultList;
    }

    @Override
    public List<ScoreResult> listStudentScore(ScoreQuery scoreQuery) {
        List<ScoreResult> scoreResultList = new ArrayList<>();
        if(scoreQuery.getQueryType().equals(QueryTypeConstant.AVG)){
            scoreResultList = scoreMapper.listSubjectAvgScore(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MAX)){
            scoreResultList = scoreMapper.listSubjectMaxScore(scoreQuery);
        } else if(scoreQuery.getQueryType().equals(QueryTypeConstant.MIN)){
            scoreResultList = scoreMapper.listSubjectMinScore(scoreQuery);
        }
        return scoreResultList;
    }

    @Override
    public List<ScoreResult> listBatchStudentScore(ScoreQuery scoreQuery) {
        return scoreMapper.listBatchStudentScore(scoreQuery);
    }


    @Override
    public List<ScoreResult> listScorePage(ScoreQuery scoreQuery) {
        return scoreMapper.listStudentScore(scoreQuery);
    }

    @Override
    public void updateStudentScore(Score score) {
        //校验查询id对应数据是否存在
        Score scoreExist = scoreMapper.read(score.getId());
        if(scoreExist == null){
            return;
        }
        //更新数据
        scoreMapper.update(score);
    }

    @Override
    public void saveStudentSubject(StudentSubject studentSubject) {
        //校验学生信息是否存在，没有则新增
        Student studentInfo = studentMapper.read(studentSubject.getStudentId());
        if(studentInfo == null){
            studentMapper.save(studentSubject.getStudent());
        }
        //校验课程是否存在, 没有则新增
        Subject subject = subjectMapper.read(studentSubject.getSubjectId());
        if(subject == null){
            subjectMapper.save(studentSubject.getSubject());
        }
        //校验学生是否重复选择课程
        Score subjectRepeat = scoreMapper.readBySubjectIdAndStudentIdAndSchoolYear(studentSubject);
        if(subjectRepeat != null){
            return;
        }
        //添加学生课程关联
        scoreMapper.save(studentSubject);
    }

    @Override
    public void deleteStudentSubject(int id) {
        scoreMapper.delete(id);
    }
}
