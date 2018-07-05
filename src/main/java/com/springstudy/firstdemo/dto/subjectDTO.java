package com.springstudy.firstdemo.dto;

public class subjectDTO {
	private int sub_id;
	private String sub_name;
	public subjectDTO(int sub_id, String sub_name) {
		super();
		this.sub_id = sub_id;
		this.sub_name = sub_name;
	}
	
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	
	
	

}
