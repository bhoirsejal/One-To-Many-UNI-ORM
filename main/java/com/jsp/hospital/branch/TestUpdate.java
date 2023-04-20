package com.jsp.hospital.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Branch branch = entityManager.find(Branch.class, 3);
		branch.setName("Lotus");
		branch.setLoc("Ulwe");

		entityTransaction.begin();
		entityManager.merge(branch);
		entityTransaction.commit();

	}

}
