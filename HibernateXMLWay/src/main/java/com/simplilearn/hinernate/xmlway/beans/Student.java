package com.simplilearn.hinernate.xmlway.beans;

public class Student 
{
   private int roll_no ;
   private String first_name ;
   private String last_name ;
   private String grade ;
   
   public Student(String first_name, String last_name, String grade) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.grade = grade;
	}
   
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
@Override
public String toString() {
	return "Student [roll_no=" + roll_no + ", first_name=" + first_name + ", last_name=" + last_name + ", grade="
			+ grade + "]";
}

   
}
