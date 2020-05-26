package com.desafiojava.dao;

import java.util.List;

import com.desafiojava.model.Person;

public interface PersonDao {
	
	void savePerson(Person person);
	
	void deleteByIdPerson(Long idPerson);
	
	void updatePerson(Person person);
	
	List<Person> findAllPerson();
	
	Person findById(Long idPerson);
	
	Person finByName(String name);

}
