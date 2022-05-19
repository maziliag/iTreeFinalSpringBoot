package com.finaltest.NaujokuManageris.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finaltest.NaujokuManageris.model.Person;
import com.finaltest.NaujokuManageris.service.PersonService;

@RequestMapping("/person")
@RestController
public class PersonConstroller {

	private final PersonService personService;
	
	@Autowired
	public PersonConstroller(PersonService personService) {
		this.personService = personService;
	}
	
	@PostMapping("/add")
	public void addPerson(@Valid @NonNull @RequestBody Person person) {
		personService.addPerson(person);
	}
	
	@GetMapping("/all")
	public List<Person> getAllPeople() {
		return personService.getAllPeople();
	}
	
}
