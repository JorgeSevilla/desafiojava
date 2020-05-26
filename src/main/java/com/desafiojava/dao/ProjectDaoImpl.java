package com.desafiojava.dao;

import java.util.List;

import com.desafiojava.model.Project;

public class ProjectDaoImpl extends AbstractSession implements ProjectDao{

	@Override
	public void saveProject(Project project) {
		getSession().persist(project);
		
	}

	@Override
	public void deleteProjectDyId(Long idProject) {
		Project project = findById(idProject);
		if(project != null) {
			getSession().delete(project);
		}
		
	}

	@Override
	public void updateProject(Project project) {
		getSession().update(project);
	}

	@Override
	public List<Project> findAllProjects() {
		return getSession().createQuery("from Project").list();
	}

	@Override
	public Project findById(Long idProject) {
		return (Project) getSession().get(Project.class, idProject);
	}

	@Override
	public Project findByName(String name) {
		return (Project) getSession().createQuery(
				"from Project where name = :name")
				.setParameter("name", name).uniqueResult();
	}

	@Override
	public List<Project> findByIdManager(Long idManager) {
		return (List<Project>) getSession().get(Project.class, idManager);
	}
	
	

}
