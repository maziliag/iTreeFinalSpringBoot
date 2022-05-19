package com.finaltest.NaujokuManageris.dao;

import com.finaltest.NaujokuManageris.model.Person;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;


@Repository("fakeDao")
public class fakePersonDataAccessService implements PersonDao {
	
	private static List<Person> DB = new ArrayList<>();
	
	@Override
	public int insertPerson(Person person) {
		DB.add(new Person(person.getName(), 
						  person.getSurename(), 
						  person.getDob(), 
						  person.getPhone(), 
						  person.getEmail()));
		return 1;
	}

	@Override
	public List<Person> selectAllPeople() {
		return DB;
	}
}
