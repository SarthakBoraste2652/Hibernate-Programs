package org.tnsif.jpaembed;

import javax.persistence.EntityManager;

import org.tnsif.jpaintro.JPAUtil;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Hibernate program for Embeddable annotation use..");
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Student st1 = new Student();
		st1.setRollNo(1);
		st1.setName("Sarthak");
		
		Course co = new Course();
		co.setCourseId(1001);
		co.setCourseName("Computer Engineering");
		
		st1.setCourse(co);
		
		Student st2 = new Student();
		st2.setRollNo(2);
		st2.setName("Andy");
		
		Course co1 = new Course();
		co1.setCourseId(1002);
		co1.setCourseName("Electrical Engineering");
		
		st2.setCourse(co1);
		
		em.getTransaction().begin();
		em.persist(st1);
		em.persist(st2);
		em.getTransaction().commit();
	}
}
