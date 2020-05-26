package com.desafiojava.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "projeto")
public class Project implements Serializable{
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProject;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "data_inicio")
	@Temporal(TemporalType.DATE)
	private Date startDate;

	@Column(name = "data_previsao_fim")
	@Temporal(TemporalType.DATE)
	private Date forecasteEndDate;
	
	@Column(name = "data_fim")
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	@Column(name = "descricao")
	private String description;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "orcamento")
	private float budget;
	
	@Column(name = "risco")
	private String risk;
	
	@Column(name = "idgerente")
	private Long idManager;
	
	@ManyToMany()
	@JoinColumn(name = "id")
	private Set<Person> person;

	public Project(String name, Date startDate, Date forecasteEndDate, Date endDate, String description, String status,
			float budget, String risk, Long idManager, Set<Person> person) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.forecasteEndDate = forecasteEndDate;
		this.endDate = endDate;
		this.description = description;
		this.status = status;
		this.budget = budget;
		this.risk = risk;
		this.idManager = idManager;
		this.person = person;
	}

	public Project() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getForecasteEndDate() {
		return forecasteEndDate;
	}

	public void setForecasteEndDate(Date forecasteEndDate) {
		this.forecasteEndDate = forecasteEndDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public Long getIdManager() {
		return idManager;
	}

	public void setIdManager(Long idManager) {
		this.idManager = idManager;
	}

	public Set<Person> getPerson() {
		return person;
	}

	public void setPerson(Set<Person> person) {
		this.person = person;
	}

	public Long getIdProject() {
		return idProject;
	}

	public void setIdProject(Long idProject) {
		this.idProject = idProject;
	}
	
	

}
