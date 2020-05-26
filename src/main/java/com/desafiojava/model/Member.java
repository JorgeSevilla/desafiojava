package com.desafiojava.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "membros")
public class Member implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idprojeto")	
	private Long id_project;
	
	@Column(name = "idpessoa")
	private Long id_person;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idProject")
	private Project idProject;
	
	@OneToMany()
	@JoinColumn(name = "idpessoa")
	private Person idPerson;

	public Member(Project idProject, Person idPerson) {
		super();
		this.idProject = idProject;
		this.idPerson = idPerson;
	}

	public Member() {
		super();
	}

	public Long getId_project() {
		return id_project;
	}

	public void setId_project(Long id_project) {
		this.id_project = id_project;
	}

	public Long getId_person() {
		return id_person;
	}

	public void setId_person(Long id_person) {
		this.id_person = id_person;
	}

	public Project getIdProject() {
		return idProject;
	}

	public void setIdProject(Project idProject) {
		this.idProject = idProject;
	}

	public Person getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Person idPerson) {
		this.idPerson = idPerson;
	}
	
}
