package com.demo.studentmanage.service.impl;

import com.demo.studentmanage.dto.StudentScoreDto;
import com.demo.studentmanage.dto.converter.StudentScoreConverter;
import com.demo.studentmanage.mapper.StudentScoreMapper;
import com.demo.studentmanage.model.StudentScore;
import com.demo.studentmanage.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kuangjiahua
 * @date   2021/01/04
 */
@Service
public class StudentScoreServiceImpl implements StudentScoreService {

    @Autowired
    private StudentScoreMapper studentScoreMapper;

    @Override
    public List<StudentScoreDto> listScorePage(StudentScoreDto studentScoreDto) {
        return studentScoreMapper.listScorePage(studentScoreDto)
                .stream().map(StudentScoreConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public boolean saveStudentScore(StudentScoreDto studentScoreDto) {
        //校验数据是否重复
        StudentScore studentScoreExist = studentScoreMapper.findByCondition(studentScoreDto);
        if(studentScoreExist != null){
            return false;
        }
        studentScoreMapper.saveStudentScore(studentScoreDto);
        return true;
    }

    @Override
    public boolean updateStudentScore(StudentScoreDto studentScoreDto) {
        //校验当前id对应记录是否存在
        StudentScore studentScoreExist = studentScoreMapper.findById(studentScoreDto.getId());
        if(studentScoreExist == null){
            return false;
        }
        //校验是否重复
        StudentScore studentScoreRepeat = studentScoreMapper.findByCondition(studentScoreDto);
        if(studentScoreRepeat != null && !studentScoreRepeat.getId().equals(studentScoreDto.getId())){
            return false;
        }
        studentScoreMapper.updateStudentScore(studentScoreDto);
        return true;
    }

    @Override
    public void deleteStudentScore(int id) {
        studentScoreMapper.deleteStudentScore(id);
    }
}
