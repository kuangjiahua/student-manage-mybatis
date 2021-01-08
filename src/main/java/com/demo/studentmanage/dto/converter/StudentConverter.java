package com.demo.studentmanage.dto.converter;
import com.demo.studentmanage.dto.ScoreDTO;
import com.demo.studentmanage.dto.StudentDTO;
import com.demo.studentmanage.dto.StudentSubjectDTO;
import com.demo.studentmanage.model.Score;
import com.demo.studentmanage.model.Student;
import com.demo.studentmanage.model.StudentSubject;
import com.demo.studentmanage.model.Subject;
import org.springframework.beans.BeanUtils;

public class StudentConverter {

    public static StudentSubject convertDtoToModel(StudentSubjectDTO studentSubjectDTO){
        StudentSubject studentSubject = new StudentSubject();
        BeanUtils.copyProperties(studentSubjectDTO, studentSubject);
        Student student = new Student();
        BeanUtils.copyProperties(studentSubjectDTO.getStudentDTO(), student);
        studentSubject.setStudent(student);
        Subject subject = new Subject();
        BeanUtils.copyProperties(studentSubjectDTO.getSubjectDTO(), subject);
        studentSubject.setSubject(subject);
        return studentSubject;
    }

    public static Score convertDtoToModel(ScoreDTO scoreDTO){
        Score score = new Score();
        BeanUtils.copyProperties(scoreDTO, score);
        return score;
    }

    public static Student convertDtoToModel(StudentDTO studentDTO){
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO, student);
        return student;
    }

    public static StudentDTO convertModelToDto(Student student){
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(student, studentDTO);
        return studentDTO;
    }



}
