package br.com.treinar.jpa;

import javax.persistence.EntityManager;

import br.com.treinar.jpa.model.Employee;

public class JPALoadEntity {

	public static void main(String[] args) {
	    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
	    entityManager.getTransaction().begin();
	    
	    
	    Employee e = entityManager.find(Employee.class, 3);
	    
	    System.out.println(e);
	    
	    entityManager.getTransaction().commit();
	    entityManager.close();

	    JPAUtil.shutdown();
	}
	
}
