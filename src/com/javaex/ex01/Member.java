package com.javaex.ex01;

public class Member {

	//필드
	private String id;
	private String name;
	private int point;
	public String getId() {
		return id;
	}
	
	
	//생성자
	public Member() {
		
	}
	
	//메소드g/s
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드일반
	public void showinfo() {
		System.out.println("회원정보 : "+name+"("+id+")"+", "+point+"점");
	}
	
	
}