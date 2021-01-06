package com.demo.studentmanage.service.impl;

import com.demo.studentmanage.dto.SchoolScoreDto;
import com.demo.studentmanage.dto.converter.SchoolScoreConverter;
import com.demo.studentmanage.mapper.SchoolScoreMapper;
import com.demo.studentmanage.service.SchoolScoreService;
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
    private SchoolScoreMapper schoolScoreMapper;

    @Override
    public List<SchoolScoreDto> listSubjectAvgScorePage(SchoolScoreDto schoolScoreDto) {
        return schoolScoreMapper.listSubjectAvgScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<SchoolScoreDto> listSubjectMaxScorePage(SchoolScoreDto schoolScoreDto) {
        return schoolScoreMapper.listSubjectMaxScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<SchoolScoreDto> listSubjectMinScorePage(SchoolScoreDto schoolScoreDto) {
        return schoolScoreMapper.listSubjectMinScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<SchoolScoreDto> listTeacherSubjectAvgScorePage(SchoolScoreDto schoolScoreDto) {
        return schoolScoreMapper.listTeacherSubjectAvgScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());
    }

    @Override
    public List<SchoolScoreDto> listTeacherSubjectMaxScorePage(SchoolScoreDto schoolScoreDto) {
        return schoolScoreMapper.listTeacherSubjectMaxScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());

    }

    @Override
    public List<SchoolScoreDto> listTeacherSubjectMinScorePage(SchoolScoreDto schoolScoreDto) {
        return schoolScoreMapper.listTeacherSubjectMinScore(schoolScoreDto)
                .stream().map(SchoolScoreConverter::convertModelToDto).collect(Collectors.toList());

    }
}
