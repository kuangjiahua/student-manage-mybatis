package com.demo.studentmanage.controller;

import com.demo.studentmanage.dto.*;
import com.demo.studentmanage.dto.common.ApiResponseDTO;
import com.demo.studentmanage.dto.converter.ScoreQueryConverter;
import com.demo.studentmanage.dto.converter.StudentConverter;
import com.demo.studentmanage.model.Score;
import com.demo.studentmanage.model.Student;
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

    @ApiOperation("查询学生列表(支持自定义排序)")
    @GetMapping("nhsoft.scoreManageDemo.student.list")
    public ApiResponseDTO listStudent(StudentDTO studentDTO){
        Student student = StudentConverter.convertDtoToModel(studentDTO);
        List<StudentDTO> results = studentService.listStudent(student)
                .stream().map(StudentConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(results);
    }

    @ApiOperation("查询学生学年各科成绩(支持自定义排序)")
    @GetMapping("nhsoft.scoreManageDemo.student.listScore")
    public ApiResponseDTO listStudentScore(ScoreQuery scoreQuery){
        List<ScoreResultDTO> results = studentService.listScoreByOrder(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(results);
    }


    @ApiOperation("多个学年各科平均分/最高分/最低分查询")
    @GetMapping("nhsoft.scoreManageDemo.student.listSchoolYearsScore")
    public ApiResponseDTO listBatchYearScore(ScoreQuery scoreQuery){
        List<ScoreResultDTO> results = studentService.listBatchYearScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(results);
    }

    @ApiOperation("某学年各科平均分/最高分/最低分查询")
    @GetMapping("nhsoft.scoreManageDemo.student.listSubjectScore")
    public ApiResponseDTO listSchoolStudentScore(ScoreQuery scoreQuery){
        List<ScoreResultDTO> results = studentService.listStudentScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(results);
    }

    @ApiOperation("多个学生多学年各科目分数查询")
    @GetMapping("nhsoft.scoreManageDemo.student.listStudentsScore")
    public ApiResponseDTO listBatchStudentScore(ScoreQuery scoreQuery){
        List<ScoreResultDTO> results = studentService.listBatchStudentScore(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(results);
    }

    @ApiOperation("查询学生各科分数")
    @GetMapping("nhsoft.scoreManageDemo.student.listStudentSubjectScore")
    public ApiResponseDTO listStudentScorePage(ScoreQuery scoreQuery){
        List<ScoreResultDTO> results = studentService.listScorePage(scoreQuery)
                .stream().map(ScoreQueryConverter::convertModelToDto).collect(Collectors.toList());
        return new ApiResponseDTO(results);
    }

    @ApiOperation("修改课程分数")
    @PostMapping("nhsoft.scoreManageDemo.student.update")
    public ApiResponseDTO updateStudentScore(ScoreDTO scoreDTO){
        Score score = StudentConverter.convertDtoToModel(scoreDTO);
        studentService.updateStudentScore(score);
        return new ApiResponseDTO();
    }

    @ApiOperation("选课")
    @RequestMapping("nhsoft.scoreManageDemo.student.save")
    public ApiResponseDTO saveStudentSubject(StudentSubjectDTO studentSubjectDTO){
        StudentSubject subjectSubject = StudentConverter.convertDtoToModel(studentSubjectDTO);
        studentService.saveStudentSubject(subjectSubject);
        return new ApiResponseDTO();
    }

    @ApiOperation("退选课程")
    @DeleteMapping("nhsoft.scoreManageDemo.student.delete")
    public ApiResponseDTO deleteStudentSubject(Integer id){
        studentService.deleteStudentSubject(id);
        return new ApiResponseDTO();
    }

}
