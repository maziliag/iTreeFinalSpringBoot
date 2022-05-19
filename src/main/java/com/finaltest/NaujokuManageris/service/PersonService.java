package com.finaltest.NaujokuManageris.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.finaltest.NaujokuManageris.dao.PersonDao;
import com.finaltest.NaujokuManageris.dao.fakePersonDataAccessService;
import com.finaltest.NaujokuManageris.exceptions.DuplicateValueException;
import com.finaltest.NaujokuManageris.model.Person;

@Component
public class PersonService {

	private final PersonDao personDao;
	
	@Autowired
	public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
		this.personDao = personDao;
	}
	
	fakePersonDataAccessService fpda = new fakePersonDataAccessService();
	DuplicateValueException myEx = new DuplicateValueException("Duplicate email found");
	
	public int addPerson(Person person) {
		// Checking for unique emails and phone numbers
		for(int i=0; i<fpda.selectAllPeople().size(); i++) {
			if(fpda.selectAllPeople().get(i).getEmail().equals(person.getEmail())) {
				System.out.println("Duplicate email found");
				return i;
			} else if (fpda.selectAllPeople().get(i).getPhone().equals(person.getPhone())) {
				System.out.println("Duplicate phone found");
				return i;
			}
		}
		return personDao.insertPerson(person);
	}
	
	public List<Person> getAllPeople() {
		
		return personDao.selectAllPeople();
	}
}
