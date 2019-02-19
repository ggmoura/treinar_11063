package br.com.treinar.jpa;

import java.util.Date;

import javax.persistence.EntityManager;

import br.com.treinar.jpa.model.Address;
import br.com.treinar.jpa.model.Employee;
import br.com.treinar.jpa.model.EmployeeType;

public class MainApp {
  public static void main(String[] args) {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    entityManager.getTransaction().begin();

    // Check database version
    String sql = "select version()";

    String result = (String) entityManager.createNativeQuery(sql).getSingleResult();
    System.out.println(result);
    
    Address a = new Address();
    a.setState("Minas Gerais");
    a.setNumber("202");
    
    Employee e = new Employee("Gleidson", "Moura", "Professor", 10000D ,a , new Date(), EmployeeType.PART_TIME);
    
    entityManager.persist(e);
    
    entityManager.getTransaction().commit();
    entityManager.close();

    JPAUtil.shutdown();
  }
}