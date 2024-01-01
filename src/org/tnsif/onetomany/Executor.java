package org.tnsif.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.tnsif.jpaintro.JPAUtil;

public class Executor {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		School sc = new School();
		sc.setSchoolId(101);
		sc.setSchoolName("K.R.T.Highschool");
		sc.setAddress("Mauje Sukene");
		
		List<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setRollNo(1);
		s1.setName("Sarth");
		s1.setSchool(sc);
		s1.setCourse("Computer Engg");
		
		Student s2 = new Student();
		s2.setRollNo(2);
		s2.setName("Abhi");
		s2.setSchool(sc);
		s2.setCourse("IT Engg");
		
		Student s3 = new Student();
		s3.setRollNo(3);
		s3.setName("Chai");
		s3.setSchool(sc);
		s3.setCourse("MBBS");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		sc.setStudents(students);
		
		em.getTransaction().begin();
		em.persist(sc);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.getTransaction().commit();
		em.close();

	}

}
