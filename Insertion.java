package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Department;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Department dept=new Department();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter loc");
		String loc=sc.next();
		dept.setId(id);
		dept.setName(name);
		dept.setLoc(loc);
		
		et.begin();
		em.persist(dept);
		et.commit();

	}

}
