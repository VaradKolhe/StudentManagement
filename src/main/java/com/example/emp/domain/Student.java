package com.example.emp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
	private String studentname;
    private String course;
    private int fee;
    public Student() {
    	super();
    }
    
    public Student(Long id, String studentname, String course, int fee) {
    
        this.id = id;
        this.studentname = studentname;
        this.course = course;
        this.fee = fee;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getStudentname() {
        return studentname;
    }
    
    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
    
    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public int getFee() {
        return fee;
    }
    
    public void setFee(int fee) {
        this.fee = fee;
    }

}