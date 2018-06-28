package com.springstudy.firstdemo.model;

public class Student {

    private int student_id;
    private String student_name;
    private String student_birthday;
	
    public Student()
    {
    	this.student_id = 0;
    	this.student_name = "default_name";
    	this.student_birthday = "default_birth";
    }
    public Student(int student_id, String student_name, String student_birthday) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_birthday = student_birthday;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_birthday() {
		return student_birthday;
	}

	public void setStudent_birthday(String student_birthday) {
		this.student_birthday = student_birthday;
	}
    
    
}
