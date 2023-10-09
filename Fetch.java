package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Department;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		System.out.println("enter id");
		int id=sc.nextInt();
		Department dept=em.find(Department.class, id);
		//System.out.println(dept);
		if(dept!=null) {
			String name=dept.getName();
			System.out.println("enter name");
			String dname=sc.next();
			if(name.equals(dname)) {
				System.out.println(dept);
			}else {
				System.out.println("enter correct name");
			}
		}
		else {
			System.out.println("invalid user");
		}

	}

}
