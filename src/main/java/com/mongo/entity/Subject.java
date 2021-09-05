package com.mongo.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Subject {
	
	@Field(name = "subject_name")
	private String subjectName;
	
	@Field(name = "marks_optained")
	private int marksOptained;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getMarksOptained() {
		return marksOptained;
	}

	public void setMarksOptained(int marksOptained) {
		this.marksOptained = marksOptained;
	}
}
