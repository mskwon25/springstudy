package com.springstudy.firstdemo.model;

public class Score {

	private int id;
	private int studentId;
	private int subjectId;
	private int score;
	
	public Score(int id, int studentId, int subjectId, int score) {
		this.id = id;
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.score = score;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getSubjectId() {
		return this.subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScre(int score) {
		this.score = score;
	}
}
