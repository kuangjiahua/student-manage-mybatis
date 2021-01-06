package com.demo.studentmanage.dto.converter;

import com.demo.studentmanage.dto.SchoolScoreDto;
import com.demo.studentmanage.model.exclude.SchoolScore;
import org.springframework.beans.BeanUtils;

/**
 * 数据类型转换器
 * @author kuangjiahua
 * @date   2021/01/04
 */
public class SchoolScoreConverter {

    public static SchoolScoreDto convertModelToDto(SchoolScore schoolScore){
        SchoolScoreDto schoolScoreBO = new SchoolScoreDto();
        BeanUtils.copyProperties(schoolScore, schoolScoreBO);
        return schoolScoreBO;
    }

}
