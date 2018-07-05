package com.springstudy.firstdemo.dto;

public class professorDTO {
	private int prof_num;
	private String prof_name,prof_birthday,prof_sub;
	
	public professorDTO(int prof_num, String prof_name, String prof_birthday, String prof_sub) {
		super();
		this.prof_num = prof_num;
		this.prof_name = prof_name;
		this.prof_birthday = prof_birthday;
		this.prof_sub = prof_sub;
	}
	public int getProf_num() {
		return prof_num;
	}
	public void setProf_num(int prof_num) {
		this.prof_num = prof_num;
	}
	public String getProf_name() {
		return prof_name;
	}
	public void setProf_name(String prof_name) {
		this.prof_name = prof_name;
	}
	public String getProf_birthday() {
		return prof_birthday;
	}
	public void setProf_birthday(String prof_birthday) {
		this.prof_birthday = prof_birthday;
	}
	public String getProf_sub() {
		return prof_sub;
	}
	public void setProf_sub(String prof_sub) {
		this.prof_sub = prof_sub;
	}
	

}
