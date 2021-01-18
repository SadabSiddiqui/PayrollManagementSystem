package com.bean;

import java.util.Date;

public class Employee {
	private int empid;
	private String fname;
	private Date dob;
	private String gender;
	private String email;
	private String mno;
	private String add;
	private String dgn;
	private Date doj;
	private double bsal;
	

	public Employee(int eid) {
		// TODO Auto-generated constructor stub
		this.empid=eid;
	}

	

	public Employee() {
		super();
	}



	public Employee(int empid, String fname, Date dob, String gender, String email, String mno, String add, String dgn,
			Date doj, double bsal) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.mno = mno;
		this.add = add;
		this.dgn = dgn;
		this.doj = doj;
		this.bsal = bsal;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMno() {
		return mno;
	}


	public void setMno(String mno) {
		this.mno = mno;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public String getDgn() {
		return dgn;
	}


	public void setDgn(String dgn) {
		this.dgn = dgn;
	}


	public Date getDoj() {
		return doj;
	}


	public void setDoj(Date doj) {
		this.doj = doj;
	}


	public double getBsal() {
		return bsal;
	}


	public void setBsal(double bsal) {
		this.bsal = bsal;
	}
	
	
}