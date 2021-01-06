package com.demo.studentmanage.dto.converter;

import com.demo.studentmanage.dto.StudentScoreDto;
import com.demo.studentmanage.model.StudentScore;
import org.springframework.beans.BeanUtils;

/**
 * 数据类型转换器
 * @author kuangjiahua
 * @date   2021/01/04
 */
public class StudentScoreConverter {

    public static StudentScoreDto convertModelToDto(StudentScore score){
        StudentScoreDto studentScoreDto = new StudentScoreDto();
        BeanUtils.copyProperties(score, studentScoreDto);
        return studentScoreDto;
    }



}
