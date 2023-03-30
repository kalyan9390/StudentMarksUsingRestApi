package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentMarks {
@Id
private Integer sId;
@Column(length=15)
private String fullName;
private int sub1;
private int sub2;
private int sub3;
private int total;
private int percentage;
@Column(length=10)
private String grade;
public StudentMarks() {
	super();
	
}
public StudentMarks(Integer sId, String fullName, int sub1, int sub2, int sub3, int total, int percentage,
		String grade) {
	super();
	this.sId = sId;
	this.fullName = fullName;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
	this.total = total;
	this.percentage = percentage;
	this.grade = grade;
}
public Integer getsId() {
	return sId;
}
public void setsId(Integer sId) {
	this.sId = sId;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public int getSub1() {
	return sub1;
}
public void setSub1(int sub1) {
	this.sub1 = sub1;
}
public int getSub2() {
	return sub2;
}
public void setSub2(int sub2) {
	this.sub2 = sub2;
}
public int getSub3() {
	return sub3;
}
public void setSub3(int sub3) {
	this.sub3 = sub3;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
@Override
public String toString() {
	return "StudentMarks [sId=" + sId + ", fullName=" + fullName + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3="
			+ sub3 + ", total=" + total + ", percentage=" + percentage + ", grade=" + grade + "]";
}



}
