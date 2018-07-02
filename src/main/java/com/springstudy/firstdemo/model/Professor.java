package com.springstudy.firstdemo.model;

public class Professor {

    private int id;
    private String name;
    private String dateOfBirth;
    private int proSubjectId;

    public Professor(int id, String name, String birth, int subjectId) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = birth;
        this.proSubjectId = subjectId;
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
    
    public int getProSubjectId() {
        return proSubjectId;
    }

    public void setProSubjectId(int proSubjectId) {
        this.proSubjectId = proSubjectId;
    }
}
