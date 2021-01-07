package com.demo.studentmanage.common;

public enum QueryTypeEnum {
    AVG(0, "平均值"),
    MAX(1, "最大值"),
    MIN(2, "最小值")
    ;
    private Integer code;

    private String name;

    QueryTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
