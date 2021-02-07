package com.chifuyong.entity;

import javax.validation.constraints.NotNull;

public class Student {
    private String id ;

    @NotNull(message = "姓名不能为空")
    private String name;

    private Integer age;

    @NotNull(message = "性别不能为空")
    private String sex;

    public Student() {
    }

    public Student(String id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSex(String sex) {
        this.sex = sex;
    }
}
