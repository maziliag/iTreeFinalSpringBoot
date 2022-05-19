package com.finaltest.NaujokuManageris.dao;

import java.util.List;

import com.finaltest.NaujokuManageris.model.Person;

public interface PersonDao {
	
	int insertPerson(Person person);
	
	List<Person> selectAllPeople();
}
