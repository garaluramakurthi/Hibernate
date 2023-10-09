package jpql.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class jpqlUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("magician");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Query q=em.createQuery("update Stu s set s.id=?1 where s.id=?2");
		System.out.println("enter new id");
		int nid=sc.nextInt();
		System.out.println("enter oldid");
		int oid=sc.nextInt();
		q.setParameter(1, nid);
		q.setParameter(2, oid);
		et.begin();
		q.executeUpdate();
		et.commit();
		

	}

}
