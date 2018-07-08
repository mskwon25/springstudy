package com.springstudy.firstdemo.model;

public class Student {

    private int id;
    private String name;
    private String dateOfBirth;
	private String courseName;

    public Student(int id, String name, String birth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
