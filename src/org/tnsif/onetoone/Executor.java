package org.tnsif.onetoone;

import javax.persistence.EntityManager;

import org.tnsif.jpaintro.JPAUtil;

public class Executor {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Question q1 = new Question();
		q1.setqId(1);
		q1.setQuestion("What is Hibernate?");
		
		Answer a1 = new Answer();
		a1.setAnsId(1001);
		a1.setAnswer("Hibernate is a ORM Tool..");
		a1.setQuestion(q1);
		
		q1.setAns(a1);
		
		Question q2 = new Question();
		q2.setqId(2);
		q2.setQuestion("What is Java?");
		
		Answer a2 = new Answer();
		a2.setAnsId(1002);
		a2.setAnswer("Java is an island..");
		a2.setQuestion(q2);
		q2.setAns(a2);
		
		em.getTransaction().begin();
		em.persist(q1);
		em.persist(a1);
		em.persist(q2);
		em.persist(a2);
		Question q = (Question)em.find(Question.class, 1);
		System.out.println(q);
		
		Answer a = (Answer)em.find(Answer.class, 1001);
		System.out.println(a);
		
		em.getTransaction().commit();
		
	}

}
