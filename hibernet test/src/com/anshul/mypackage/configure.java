package com.anshul.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class configure {
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	public Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	public SessionFactory factory=meta.getSessionFactoryBuilder().build();
	public Session session= factory.openSession();
	public Transaction t=session.beginTransaction();

}
