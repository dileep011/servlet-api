package com.jsp.service;

import java.util.List;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonService {
	PersonDao personDao=new PersonDao();
	
	public Person savePerson(Person person) {
		return personDao.savePerson(person);
	}
	public Person updatePerson(Person person) {
		return personDao.updatePerson(person);
	}
	public Person getPersonById(int id) {
		return personDao.getPersonById(id);
	}
	public List<Person> getPersonData() {
		return personDao.getPersonData();
	}
	public Person deletePersonData(Person person) {
		return personDao.deletePersonData(person);
	}

}
