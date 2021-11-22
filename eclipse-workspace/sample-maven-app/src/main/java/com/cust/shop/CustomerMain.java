package com.cust.shop;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class CustomerMain {

	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder srv = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
		
		//Metadata meta =(Metadata) new MetadataSources(srv).getMetadataBuilder().build();
		//Done ma'am
		SessionFactory factory =config.buildSessionFactory(srv.build());
		
		Session session =  factory.openSession();
		Transaction t = session.beginTransaction();
		Customer crl = new Customer();
		
		crl.setCustid(1101);
		crl.setCustname("Suresh");
		crl.setOrderid(121);
		crl.setPrname("pen");
		session.save(crl);
		t.commit();
		System.out.println("Insert Succesfully");
		factory.close();
		session.close();
			
	}
}
