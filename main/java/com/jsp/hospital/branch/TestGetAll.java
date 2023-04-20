package com.jsp.hospital.branch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sejal");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "select s from Hospital s";
		Query query = entityManager.createQuery(sql);
		List<Hospital> hospitals = query.getResultList();
		System.out.println("=================Hospitals details====================");
		for (Hospital hospital : hospitals) {
			System.out.println("==============================");
			System.out.println("Hospitals id          :  " + hospital.getId());
			System.out.println("Hospitals Name        :  " + hospital.getName());
			System.out.println("Hospitals Gst number  :  " + hospital.getGst_number());
		}

		String sql1 = "select s from Branch s";
		Query query2 = entityManager.createQuery(sql1);
		List<Branch> branchs = query2.getResultList();
		System.out.println("=================Branch details====================");

		for (Branch branch : branchs) {
			System.out.println("==============================");
			System.out.println("Branch id          :" + branch.getId());
			System.out.println("Branch Name        :" + branch.getName());
			System.out.println("Branch Location    :" + branch.getLoc());
		}

	}

}
