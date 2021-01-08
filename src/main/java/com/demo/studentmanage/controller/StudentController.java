package com.demo.studentmanage.controller;

import com.demo.studentmanage.dto.*;
import com.demo.studentmanage.dto.common.ApiResponse;
import com.demo.studentmanage.dto.converter.ScoreQueryConverter;
import com.demo.studentmanage.dto.converter.StudentConverter;
import com.demo.studentmanage.model.Score;
import com.demo.studentmanage.model.StudentSubject;
import com.demo.studentmanage.query.ScoreQuery;
import com.demo.studentmanage.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Api(tags = "学生分数管理")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation("查询学生学年各科成绩(支持自定义排序)")
    @GetMapping("nhsoft.scoreManageDemo.subjectScore.orderList")
    public ApiResponse listStudentScore(ScoreQueryDTO scoreQueryDTO){
        ScoreQuery scoreQuery = ScoreQueryConverter.convertDtoToModel(scoreQueryDTO);
        List<ScoreResultDTO> results = studentService.listScoreByOrder(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponse(results);
    }


    @ApiOperation("多个学年各科平均分/最高分/最低分查询")
    @GetMapping("nhsoft.scoreManageDemo.batchYearScore.batchList")
    public ApiResponse listBatchYearScore(ScoreQueryDTO scoreBatchDTO){
        ScoreQuery scoreQuery = ScoreQueryConverter.convertDtoToModel(scoreBatchDTO);
        List<ScoreResultDTO> results = studentService.listBatchYearScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponse(results);
    }

    @ApiOperation("某学年各科平均分/最高分/最低分查询")
    @GetMapping("nhsoft.scoreManageDemo.schoolStudentScore.list")
    public ApiResponse listSchoolStudentScore(ScoreQueryDTO scoreQueryDTO){
        ScoreQuery scoreQuery = ScoreQueryConverter.convertDtoToModel(scoreQueryDTO);
        List<ScoreResultDTO> results = studentService.listStudentScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponse(results);
    }

    @ApiOperation("多个学生多学年各科目分数查询")
    @GetMapping("nhsoft.scoreManageDemo.studentScore.batchList")
    public ApiResponse listBatchStudentScore(ScoreQueryDTO scoreQueryDTO){
        ScoreQuery scoreQuery = ScoreQueryConverter.convertDtoToModel(scoreQueryDTO);
        List<ScoreResultDTO> results = studentService.listBatchStudentScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponse(results);
    }

    @ApiOperation("查询学生各科分数")
    @GetMapping("nhsoft.scoreManageDemo.studentScore.list")
    public ApiResponse listStudentScorePage(ScoreQueryDTO scoreQueryDTO){
        ScoreQuery scoreQuery = ScoreQueryConverter.convertDtoToModel(scoreQueryDTO);
        List<ScoreResultDTO> results = studentService.listScorePage(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponse(results);
    }

    @ApiOperation("修改课程分数")
    @PostMapping("nhsoft.scoreManageDemo.studentScore.update")
    public ApiResponse updateStudentScore(ScoreDTO scoreDTO){
        Score score = StudentConverter.convertDtoToModel(scoreDTO);
        studentService.updateStudentScore(score);
        return new ApiResponse();
    }

    @ApiOperation("选课")
    @RequestMapping("nhsoft.scoreManageDemo.studentSubject.save")
    public ApiResponse saveStudentSubject(StudentSubjectDTO studentSubjectDTO){
        StudentSubject subjectSubject = StudentConverter.convertDtoToModel(studentSubjectDTO);
        studentService.saveStudentSubject(subjectSubject);
        return new ApiResponse();
    }

    @ApiOperation("退选课程")
    @DeleteMapping("nhsoft.scoreManageDemo.studentSubject.delete")
    public ApiResponse deleteStudentSubject(Integer id){
        studentService.deleteStudentSubject(id);
        return new ApiResponse();
    }

}
