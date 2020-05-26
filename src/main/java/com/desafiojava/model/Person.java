package com.desafiojava.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pessoa")
public class Person implements Serializable{
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPerson;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "datanascimento")
	@Temporal(TemporalType.DATE)
	private Date dateBirth;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(columnDefinition = "funcionario")
	private boolean employee;

	public Person(String name, Date dateBirth, String cpf, boolean employee) {
		super();
		this.name = name;
		this.dateBirth = dateBirth;
		this.cpf = cpf;
		this.employee = employee;
	}

	public Person() {
		super();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isEmployee() {
		return employee;
	}

	public void setEmployee(boolean employee) {
		this.employee = employee;
	}

	public Long getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}
	
}
