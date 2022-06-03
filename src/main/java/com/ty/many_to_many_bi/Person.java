package com.ty.many_to_many_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	@ManyToMany
	@JoinTable(name="person_cab", joinColumns = @JoinColumn(name="cab_id"),inverseJoinColumns =@JoinColumn(name="person_id"))
	private List<Cab> person;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Cab> getPerson() {
		return person;
	}
	public void setPerson(List<Cab> person) {
		this.person = person;
	}
	
	
}
