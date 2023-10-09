package jpql.dao;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpql.dto.Stu;
public class JpqlFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query q=em.createQuery("select s from Stu s");
		List<Stu> s1=q.getResultList();
		for (Stu stu : s1) {
			System.out.println(stu);
		}
		

	}

}
