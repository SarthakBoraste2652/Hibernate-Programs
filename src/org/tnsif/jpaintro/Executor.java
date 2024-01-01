package org.tnsif.jpaintro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;

public class Executor {

	public static void main(String[] args) throws IOException {
		EntityManager em = JPAUtil.getEntityManager();
		Product pr = new Product();
		pr.setProductId(101);
		pr.setProductName("rubber");
		pr.setQuantity(6);
		pr.setRate(100);
		pr.setDate(new Date());
		//reading image data
		FileInputStream fis = new FileInputStream("src/pic.png");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		fis.close();
		pr.setProdImg(data);
		
		
		em.getTransaction().begin();
		em.persist(pr);
		em.getTransaction().commit();	
	}
}
