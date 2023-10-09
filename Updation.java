package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Department;

public class Updation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		System.out.println("to find enter id");
		int id=sc.nextInt();
		Department dept=em.find(Department.class, id);
		System.out.println("enter loc to update");
		String loc=sc.next();
		dept.setLoc(loc);
		et.begin();
		em.persist(dept);
		et.commit();
		Department dept1=em.find(Department.class, id);
		System.out.println(dept1);
		
		
	}

}
