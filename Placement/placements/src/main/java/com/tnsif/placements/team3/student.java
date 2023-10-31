package com.tnsif.placements.team3;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student {
	
	private int id;
	private String name;
	private long roll;
	private String qualification;
	private String  course;
	private int year;
	private long halltickno;
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int id, String name, long roll, String qualification, String course, int year, long halltickno) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.halltickno = halltickno;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getHalltickno() {
		return halltickno;
	}
	public void setHalltickno(long halltickno) {
		this.halltickno = halltickno;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", halltickno=" + halltickno+ "]";
	}
	
}
