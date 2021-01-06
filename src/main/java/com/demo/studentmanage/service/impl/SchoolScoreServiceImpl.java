package com.demo.studentmanage.service.impl;

import com.demo.studentmanage.dto.SchoolScoreDto;
import com.demo.studentmanage.dto.TeacherSubjectDto;
import com.demo.studentmanage.dto.converter.SchoolScoreConverter;
import com.demo.studentmanage.mapper.StudentScoreMapper;
import com.demo.studentmanage.mapper.TeacherSubjectMapper;
import com.demo.studentmanage.service.SchoolScoreService;
import com.demo.studentmanage.service.StudentScoreService;
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
public class SchoolScoreServiceImpl implements SchoolScoreService {

    @Autowired
    private StudentScoreMapper studentScoreMapper;

    @Autowired
    private TeacherSubjectMapper teacherSubjectMapper;

    @Override
    public List<SchoolScoreDto> listSubjectAvgScorePage(SchoolScoreDto schoolScoreDto) {
        return studentScoreMapper.listSubjectAvgScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<SchoolScoreDto> listSubjectMaxScorePage(SchoolScoreDto schoolScoreDto) {
        return studentScoreMapper.listSubjectMaxScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<SchoolScoreDto> listSubjectMinScorePage(SchoolScoreDto schoolScoreDto) {
        return studentScoreMapper.listSubjectMinScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<SchoolScoreDto> listTeacherSubjectAvgScorePage(SchoolScoreDto schoolScoreDto) {
        return teacherSubjectMapper.listTeacherSubjectAvgScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<SchoolScoreDto> listTeacherSubjectMaxScorePage(SchoolScoreDto schoolScoreDto) {
        return teacherSubjectMapper.listTeacherSubjectMaxScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());

    }

    @Override
    public List<SchoolScoreDto> listTeacherSubjectMinScorePage(SchoolScoreDto schoolScoreDto) {
        return teacherSubjectMapper.listTeacherSubjectMinScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());

    }
}
