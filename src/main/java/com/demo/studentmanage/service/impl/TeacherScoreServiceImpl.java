package com.demo.studentmanage.service.impl;

import com.demo.studentmanage.dto.TeacherSubjectDto;
import com.demo.studentmanage.dto.converter.TeacherSubjectConverter;
import com.demo.studentmanage.mapper.SchoolScoreMapper;
import com.demo.studentmanage.mapper.TeacherSubjectMapper;
import com.demo.studentmanage.model.TeacherSubject;
import com.demo.studentmanage.service.TeacherScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kuangjiahua
 * @date   2021/01/04
 */
@Service
public class TeacherScoreServiceImpl implements TeacherScoreService {

    @Autowired
    private TeacherSubjectMapper teacherSubjectMapper;

    @Autowired
    private SchoolScoreMapper schoolScoreMapper;

    @Override
    public List<TeacherSubjectDto> listAvgScorePage(TeacherSubjectDto teacherSubjectDto) {
        return schoolScoreMapper.listSubjectAvgScoreForTeacher(teacherSubjectDto)
                .stream().map(TeacherSubjectConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<TeacherSubjectDto> listMaxScorePage(TeacherSubjectDto teacherSubjectDto) {
        return schoolScoreMapper.listSubjectMaxScoreForTeacher(teacherSubjectDto)
                .stream().map(TeacherSubjectConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<TeacherSubjectDto> listMinScorePage(TeacherSubjectDto teacherSubjectDto) {
        return schoolScoreMapper.listSubjectMinScoreForTeacher(teacherSubjectDto)
                .stream().map(TeacherSubjectConverter::convertModelToDto).collect(Collectors.toList());

    }

    @Override
    public boolean saveTeacherSubject(TeacherSubjectDto teacherSubjectDto) {
        //校验是否重复
        TeacherSubject teacherSubjectExist = teacherSubjectMapper.findByCondition(teacherSubjectDto);
        if(teacherSubjectExist != null){
            return false;
        }
        teacherSubjectMapper.saveTeacherSubject(teacherSubjectDto);
        return true;
    }

    @Override
    public boolean updateTeacherSubject(TeacherSubjectDto teacherSubjectDto) {
        //校验id对应数据是否存在
        TeacherSubject teacherSubjectExist = teacherSubjectMapper.findById(teacherSubjectDto.getId());
        if(teacherSubjectExist == null){
            return false;
        }
        //校验是否重复
        TeacherSubject teacherSubjectRepeat = teacherSubjectMapper.findByCondition(teacherSubjectDto);
        if(teacherSubjectRepeat != null && !teacherSubjectRepeat.getId().equals(teacherSubjectDto.getId())){
            return false;
        }
        teacherSubjectMapper.updateTeacherSubject(teacherSubjectDto);
        return true;
    }

    @Override
    public void deleteTeacherSubject(int id) {
        teacherSubjectMapper.deleteTeacherSubject(id);
    }
}
