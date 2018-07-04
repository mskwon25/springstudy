package com.springstudy.firstdemo.model;

public class Professor {
	private int id;
	private String name;
	private String dateOfBirth;
	private String nameOfSubject;
	
	public Professor(int id, String name, String dateOfBirth, String nameOfSubject) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nameOfSubject = nameOfSubject;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getNameOfSubject() {
		return this.nameOfSubject;
	}
	
	public void setNameOfSubject(String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
	}
}
