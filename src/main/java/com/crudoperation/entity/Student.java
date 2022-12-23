package com.crudoperation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Stud_Info")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long cont;
	private String branch;
	private String yop;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String name, String email, long cont, String branch, String yop) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cont = cont;
		this.branch = branch;
		this.yop = yop;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCont() {
		return cont;
	}
	public void setCont(long cont) {
		this.cont = cont;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getYop() {
		return yop;
	}
	public void setYop(String yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", cont=" + cont + ", branch=" + branch
				+ ", yop=" + yop + "]";
	}

	
}
