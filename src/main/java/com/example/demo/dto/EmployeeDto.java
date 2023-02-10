package com.example.demo.dto;

public class EmployeeDto {
	
	private int eid;
	private String ename;
	
	public EmployeeDto() {
		
	}
	
	public EmployeeDto(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "EmployeeDto [eid=" + eid + ", ename=" + ename + ", address]";
	}
	

}
