package com.jsp.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.Person;

public class PersonDao{
	
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("dileep");
	
		public Person savePerson(Person person) {
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction(); 
			if(person!=null) {
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			}
			return person;
		}
		public Person updatePerson(Person person) {
			EntityManager entityManager =entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			Person person1=entityManager.find(Person.class, person.getId());
			if(person1!=null) {
				entityTransaction.begin();
				entityManager.merge(person);
				entityTransaction.commit();
			}
			return person1;
		}
		public Person getPersonById(int id) {
			EntityManager entityManager =entityManagerFactory.createEntityManager();
			Person person1=entityManager.find(Person.class, id);
			return person1;
			
		}		
		public List<Person> getPersonData() {
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Query query= entityManager.createQuery("select a from Person a");
			List<Person> list= query.getResultList();
			return list;
		}
		public Person deletePersonData(Person person) {
			EntityManager entityManager =entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			Person person1= entityManager.find(Person.class, person.getId());
			if(person1!=null){
				entityTransaction.begin();
				entityManager.remove(person1);
				entityTransaction.commit();
			}
			return person1;
		}
	}


