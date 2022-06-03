package com.ty.many_to_many_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonCab {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		
		List<Person> persons =new ArrayList();
		Person person = new Person();
		person.setName("vikas");
		person.setAge(30);
		persons.add(person);
		
		Person person2 = new Person();
		person2.setName("mikas");
		person2.setAge(20);
		persons.add(person2);
		
		Person person3 = new Person();
		person3.setName("nikas");
		person3.setAge(25);
		persons.add(person3);
		
		List<Cab> cabs = new ArrayList<Cab>();
		Cab cab = new Cab();
		cab.setDriverName("chimgond");
		cab.setPhno(0001);
		
		Cab cab2 = new Cab();
		cab2.setDriverName("chameli");
		cab2.setPhno(1311);
		
		Cab cab3 = new Cab();
		cab3.setDriverName("chnni");
		cab3.setPhno(9999);
		
		List<Cab> caba = new ArrayList();
		caba.add(cab);
		caba.add(cab2);
	
		List<Cab> cabb = new ArrayList();
		cabb.add(cab);
		cabb.add(cab2);
		
		List<Cab> cabc = new ArrayList();
		cabc.add(cab);
		cabc.add(cab2);
		
		cab.setCab(persons);
				
	}
}
