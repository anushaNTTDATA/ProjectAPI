package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Project {
	
	@Id
	private String id;
	private String projectName;
	private String projectDescription;
		
	public Project(String projectName, String projectDescription) {
		super();
		this.projectName = projectName;
		this.projectDescription = projectDescription;
	}

	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", projectDescription=" + projectDescription + "]";
	}
	
	

}
