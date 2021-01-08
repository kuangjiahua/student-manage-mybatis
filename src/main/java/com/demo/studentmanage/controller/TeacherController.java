package com.demo.studentmanage.controller;
import com.demo.studentmanage.dto.ScoreQueryDTO;
import com.demo.studentmanage.dto.ScoreResultDTO;
import com.demo.studentmanage.dto.TeacherSubjectDTO;
import com.demo.studentmanage.dto.common.ApiResponseDTO;
import com.demo.studentmanage.dto.converter.ScoreQueryConverter;
import com.demo.studentmanage.dto.converter.TeacherConverter;
import com.demo.studentmanage.model.TeacherSubject;
import com.demo.studentmanage.query.ScoreQuery;
import com.demo.studentmanage.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Api(tags = "教师管理")
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation("多个年份教师学科分数查询")
    @GetMapping("nhsoft.scoreManageDemo.teacher.listSchoolYearsScore")
    public ApiResponseDTO listBatchTeacherSubjectScore(ScoreQueryDTO scoreQueryDTO) {
        ScoreQuery scoreQuery = ScoreQueryConverter.convertDtoToModel(scoreQueryDTO);
        List<ScoreResultDTO> results = teacherService.listBatchTeacherSubjectScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(results);
    }


    @ApiOperation("教师学科分数查询")
    @GetMapping("nhsoft.scoreManageDemo.teacher.listSubjectScore")
    public ApiResponseDTO listSchoolTeacherSubjectScore(ScoreQueryDTO scoreQueryDTO) {
        ScoreQuery scoreQuery = ScoreQueryConverter.convertDtoToModel(scoreQueryDTO);
        List<ScoreResultDTO> results = teacherService.listTeacherSubjectScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(results);
    }

    @ApiOperation("多个年份多个教师各科分数查询")
    @GetMapping("nhsoft.scoreManageDemo.teacher.listSchoolYearsTeachersScore")
    public ApiResponseDTO listBatchTeacherScore(ScoreQueryDTO scoreQueryDTO) {
        ScoreQuery scoreQuery = ScoreQueryConverter.convertDtoToModel(scoreQueryDTO);
        List<ScoreResultDTO> results = teacherService.listBatchSubjectScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(results);
    }

    @ApiOperation("查询教师各科分数")
    @GetMapping("nhsoft.scoreManageDemo.teacher.list")
    public ApiResponseDTO listTeacherSubjectScore(ScoreQueryDTO scoreQueryDTO) {
        ScoreQuery scoreQuery = ScoreQueryConverter.convertDtoToModel(scoreQueryDTO);
        List<ScoreResultDTO> resultList = teacherService.listSubjectScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(resultList);
    }

    @ApiOperation("新建课程")
    @GetMapping("nhsoft.scoreManageDemo.teacher.save")
    public ApiResponseDTO saveTeacherSubject(TeacherSubjectDTO teacherSubjectDTO){
        TeacherSubject teacherSubject = TeacherConverter.convertDtoToModel(teacherSubjectDTO);
        teacherService.saveTeacherSubject(teacherSubject);
        return new ApiResponseDTO();
    }

    @ApiOperation("修改课程")
    @GetMapping("nhsoft.scoreManageDemo.teacher.update")
    public ApiResponseDTO updateTeacherSubject(TeacherSubjectDTO teacherSubjectDTO){
        TeacherSubject teacherSubject = TeacherConverter.convertDtoToModel(teacherSubjectDTO);
        teacherService.updateTeacherSubject(teacherSubject);
        return new ApiResponseDTO();
    }

    @ApiOperation("退出课程")
    @DeleteMapping("nhsoft.scoreManageDemo.teacher.delete")
    public ApiResponseDTO deleteTeacherSubject(int id){
        teacherService.deleteTeacherSubject(id);
        return new ApiResponseDTO();
    }



}
