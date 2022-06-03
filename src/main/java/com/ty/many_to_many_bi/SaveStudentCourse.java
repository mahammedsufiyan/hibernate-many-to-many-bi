package com.ty.many_to_many_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.ty.many_to_many_bi.Course;
//import com.ty.many_to_many_bi.Student;

public class SaveStudentCourse {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		List<Student> students = new ArrayList<Student>();
		
		Student student = new Student();
		student.setName("Sahil");
		student.setAge(21);
		students.add(student);
		
		Student student2 = new Student();
		student2.setName("manu");
		student2.setAge(18);
		students.add(student2);
		
		Student student3 = new Student();
		student3.setName("jaffa");
		student3.setAge(31);
		students.add(student3);
		
		
		
		List<Course> list = new ArrayList<Course>();
		
		Course course =new Course();
		course.setName("java");
		course.setDuration(3);
		list.add(course);

		Course course2 =new Course();
		course2.setName("python");
		course2.setDuration(6);
		list.add(course2);
		

		Course course3 =new Course();
		course3.setName("C++");
		course3.setDuration(3);
		list.add(course3);
		
		student.setCourses(list);
		course.setStudent(students);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(course);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();

	}
}
