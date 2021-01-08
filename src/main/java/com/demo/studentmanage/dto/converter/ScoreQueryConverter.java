package com.demo.studentmanage.dto.converter;

import com.demo.studentmanage.dto.ScoreQueryDTO;
import com.demo.studentmanage.dto.ScoreResultDTO;
import com.demo.studentmanage.model.exclude.ScoreResult;
import com.demo.studentmanage.query.ScoreQuery;
import org.springframework.beans.BeanUtils;

public class ScoreQueryConverter {

    public static ScoreQuery convertDtoToModel(ScoreQueryDTO dto){
        ScoreQuery scoreQuery = new ScoreQuery();
        BeanUtils.copyProperties(dto, scoreQuery);
        return scoreQuery;
    }

    public static ScoreResultDTO convertModelToDto(ScoreResult scoreResult){
        ScoreResultDTO dto = new ScoreResultDTO();
        BeanUtils.copyProperties(scoreResult, dto);
        return dto;
    }
}
