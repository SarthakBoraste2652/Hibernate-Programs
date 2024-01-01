package org.tnsif.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.tnsif.jpaintro.JPAUtil;

public class Executor {
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
//		
//		Employee e1 = new Employee();
//		e1.seteId(1);
//		e1.seteName("Sarth");
//		
//		Employee e2 = new Employee();
//		e2.seteId(2);
//		e2.seteName("Lion");
//
//
//		
//		List<Employee> ems1 = new ArrayList<Employee>();
//		ems1.add(e1);
//		ems1.add(e2);
//		
//		Project p1 = new Project();
//		p1.setpId(1001);
//		p1.setpName("DevOps");
//		
//		Project p2 = new Project();
//		p2.setpId(1002);
//		p2.setpName("Android");
//		
//		List<Project> prs1 = new ArrayList<Project>();
//		prs1.add(p1);
//		prs1.add(p2);
//		
//		List<Project> prs2 = new ArrayList<Project>();
//		prs2.add(p2);
//		
//		e1.setProjects(prs1);
//		e2.setProjects(prs2);
//		
//		p1.setEmps(ems1);
		
		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
		
		
//		em.persist(e1);
//		em.persist(e2);
		
		Employee emp = (Employee)em.find(Employee.class, 1);
		em.getTransaction().commit();
		
		//Lazy loading--> means when asked then fetched using getters
		//another is Eager loadinng--> explained inside Employee class
		//currently working in eager mode
		System.out.println(emp.geteId());
		System.out.println(emp.geteName());
		System.out.println(emp.getProjects().size());
		
		em.close();
		
		
	}
}
