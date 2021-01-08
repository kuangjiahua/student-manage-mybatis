package com.demo.studentmanage.dto;

import com.demo.studentmanage.model.PageRequest;
import lombok.Data;

/**
 * @author kuangjiahua
 * @date   2021/01/07
 */
@Data
public class StudentDTO extends PageRequest {

    private Integer id;

    private String name;

}
