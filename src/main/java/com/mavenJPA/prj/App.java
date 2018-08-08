package com.mavenJPA.prj;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Student student = new Student();

		student.setRollNumber(1);
		student.setName("Chris");
		student.setGrade("A");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		em.close();
	}
}
