package com.desafiojava.dao;

import java.util.List;

import com.desafiojava.model.Person;

public class PersonDaoImpl extends AbstractSession implements PersonDao{

	@Override
	public void savePerson(Person person) {
		getSession().persist(person);
		
	}

	@Override
	public void deleteByIdPerson(Long idPerson) {
		Person person = findById(idPerson);
		if(person != null) {
			getSession().delete(person);
		}
	}

	@Override
	public void updatePerson(Person person) {
		getSession().update(person);
	}

	@Override
	public List<Person> findAllPerson() {
		return  getSession().createQuery("from Person").list();
	}

	@Override
	public Person findById(Long idPerson) {
		return (Person) getSession().get(Person.class, idPerson);
	}

	@Override
	public Person finByName(String name) {
		return (Person) getSession().createQuery(
				"from Person where name = :name")
				.setParameter("name", name).uniqueResult();
	}
	
	
}
