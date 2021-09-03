package com.anshul.mypackage;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//import java.sql.SQLException;
//import java.sql.SQLIntegrityConstraintViolationException;


//import javax.persistence.PersistenceException;
public class StoreData {

	public static void main(String[] args) {
		
		
		String lname;
		Scanner scan=new Scanner(System.in);
		configure cf=new configure();
		Transaction t=cf.t;	
		Session session=cf.session;
		
		registation reg=new registation();
		
		
		Criteria c=session.createCriteria(registation.class);
		//c.add(Restrictions.between("id",105,110));
		List<registation> e=c.list();
		for (registation emp:e) {
			System.out.println(emp.getName()+"\t"+emp.getLast_name());
		}
		
		
		
		
		
		
		/*Query<registation> query=session.createQuery("from registation where last_name=:x");
		System.out.println("search by surname:-");
		lname=scan.nextLine();
		query.setParameter("x",lname);
		List<registation> emp_list=query.list();
		
		System.out.println("roll"+"\t"+"name"+"\t"+"surname"+"\n");
		for (registation e: emp_list) {
				System.out.println(e.getRoll()+"\t"+e.getName()+"\t"+e.getLast_name());
				
		}
		
	
		
		
		
		
		
		
		/*
		int emp_id;
		Scanner sc=new Scanner(System.in);
		configure cf=new configure();
		Transaction t=cf.t;	
		Session session=cf.session;
		Employe e1=new Employe();
		
		 
		
		/*			
		try {
			e1.setId(110);
			e1.setF_name("doraemon");
			e1.setL_name("nobi");
			session.save(e1);
			t.commit();
			System.out.print("data save...");
		} catch (PersistenceException e) {
			
			System.out.println("this data alredy exist.....");
		}
		
		
		/*
		e1.setId(102);
		session.delete(e1);
		t.commit();
		System.out.println("data deleted....")	;		
		*/
		/*
					System.out.println("enter employee id");
					emp_id= sc.nextInt();
					e1=(Employe)session.get(Employe.class,emp_id);
					
					if (e1==null) {
						System.out.println("no data exist");
					}
					else
					{
							e1.setF_name("sunil");
							session.update(e1);
							t.commit();
						System.out.println(e1.getF_name());
						System.out.println(e1.getL_name());
						
						
					}
				*/
	
	
	}
	
}