package com.springstudy.firstdemo.model;

public class Subject {
	private int sub_id;
	private String sub_name;
	public Subject(int sub_id, String sub_name) {
		super();
		this.sub_id = sub_id;
		this.sub_name = sub_name;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getsub_id() {
		return sub_id;
	}
	public void setsub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public String getsub_name() {
		return sub_name;
	}
	public void setsub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	
	
}
