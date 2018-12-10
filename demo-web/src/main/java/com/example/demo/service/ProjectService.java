package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Project;
import com.example.demo.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	//create operation	
	public Project create(String projectName,String projectDescription) {
		System.out.println("service.create");
		return projectRepository.save(new Project(projectName,projectDescription));
		
	}
	
	// Retrieve operation
	public List<Project> getAll(){
		System.out.println("Service.getAll");
		return projectRepository.findAll();
	}
	
	public Project getByProjectName(String projectName) {
		return projectRepository.findByProjectName(projectName);
	}

	//update operation
	public Project update(String projectName,String projectDescription) {
		Project p = (Project) projectRepository.findByProjectName(projectName);
		p.setProjectDescription(projectDescription);
		return projectRepository.save(p);
	}
	
	//delete operation
	public void delete(String projectName) {
		Project p = (Project) projectRepository.findByProjectName(projectName);
		projectRepository.delete(p);;
	}
}
