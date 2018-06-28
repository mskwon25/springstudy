package com.springstudy.firstdemo.model;

public class Grade {
	
	private int grade_num, grade_student_id,grade_sub_id;
	private String grade_score;
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Grade(int grade_num, int grade_student_id, int grade_sub_id, String grade_score) {
		super();
		this.grade_num = grade_num;
		this.grade_student_id = grade_student_id;
		this.grade_sub_id = grade_sub_id;
		this.grade_score = grade_score;
	}
	public int getGrade_num() {
		return grade_num;
	}
	public void setGrade_num(int grade_num) {
		this.grade_num = grade_num;
	}
	public int getGrade_student_id() {
		return grade_student_id;
	}
	public void setGrade_student_id(int grade_student_id) {
		this.grade_student_id = grade_student_id;
	}
	public int getGrade_sub_id() {
		return grade_sub_id;
	}
	public void setGrade_sub_id(int grade_sub_id) {
		this.grade_sub_id = grade_sub_id;
	}
	public String getGrade_score() {
		return grade_score;
	}
	public void setGrade_score(String grade_score) {
		this.grade_score = grade_score;
	}
}
