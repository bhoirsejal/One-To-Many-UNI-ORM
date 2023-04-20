package com.jsp.hospital.branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = new Hospital();
		hospital.setName("MGM");
		hospital.setGst_number("367CVYFV89");
		
		Hospital hospital2 = new Hospital();
		hospital2.setName("Apollo");
		hospital2.setGst_number("367CV6354");

		Branch branch1 = new Branch();
		branch1.setName("MGM");
		branch1.setLoc("Panvel");

		Branch branch2 = new Branch();
		branch2.setName("MGM");
		branch2.setLoc("Panvel");

		Branch branch3 = new Branch();
		branch3.setName("MGM");
		branch3.setLoc("Panvel");
		
		Branch branch4 = new Branch();
		branch4.setName("Hirandani");
		branch4.setLoc("Vashi");
		
		List<Branch> l1 = new ArrayList<Branch>();
		l1.add(branch1);
		l1.add(branch2);
		l1.add(branch3);
		hospital.setBranchs(l1);
		
		List<Branch> l2 = new ArrayList<Branch>();
		l2.add(branch4);
		hospital2.setBranchs(l2);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(hospital2);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(branch4);
		
		entityTransaction.commit();
	}

}
