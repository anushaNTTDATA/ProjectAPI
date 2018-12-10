package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Project;
import com.example.demo.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String projectName, @RequestParam String projectDescription) {
		System.out.println("create");
		Project p = projectService.create(projectName, projectDescription);
		System.out.println("create end");
		return p.toString();
	}
	
	@RequestMapping("/get")
	public Project getProject(@RequestParam String projectName) {
		return projectService.getByProjectName(projectName);
	}
	
	@RequestMapping("/getAll")
	public List<Project> getAll(){
		System.out.println("getAll");
		return projectService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam String projectName, @RequestParam String projectDescription) {
		Project p = projectService.update(projectName, projectDescription);
		return p.toString();
	}
	
	@RequestMapping("/delete")
		public String delete(@RequestParam String projectName) {
			projectService.delete(projectName);
			return "Deleted " + projectName;
		}
	}

