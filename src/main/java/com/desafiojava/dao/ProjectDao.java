package com.desafiojava.dao;

import java.util.List;

import com.desafiojava.model.Project;

public interface ProjectDao {
	
	void saveProject(Project project);
	
	void deleteProjectDyId(Long idProject);
	
	void updateProject(Project project);
	
	List<Project> findAllProjects();
	
	Project findById(Long idProject);
	
	Project findByName(String name);
	
	List<Project> findByIdManager(Long idManager);

}
