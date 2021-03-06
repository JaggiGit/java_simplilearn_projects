package com.simplilearn.hibernate.xmlway.client;
import java.io.Serializable;

import org.hibernate.Session ;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import com.simplilearn.hinernate.xmlway.beans.Student;

public class Client
{

	public static void main(String[] args) throws Exception 
	{
		//read configuration file and establish connection with database
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();    
	SessionFactory factory =  (SessionFactory) meta.getSessionFactoryBuilder().build();
	//create object which needs to be persisted
	Student s1 = new Student("Ramlal","Verma","A+");
	//create object of session to add object to database table
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	int rollno= (Integer) session.save(s1);
	transaction.commit() ;
	System.out.println("roll no is :"+ rollno) ;
	factory.close();
	
	}
}
