package com.jsp.hospital.branch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Branch branch = entityManager.find(Branch.class, 3);
		System.out.println("Branch ID            : " + branch.getId());
		System.out.println("Branch Name          : " + branch.getName());
		System.out.println("Branch location    : " + branch.getLoc());

	}

}
