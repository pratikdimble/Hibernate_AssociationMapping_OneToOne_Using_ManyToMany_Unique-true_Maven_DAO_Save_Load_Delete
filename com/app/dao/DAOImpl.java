package com.app.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.app.model.Passport;
import com.app.model.Person;
import com.app.utility.HibernateUtil;

public class DAOImpl implements DAO {

	@Override
	public void saveDataUsingPassport() {
		// TODO Auto-generated method stub
		Session ses=null;
		//get the session
		ses=HibernateUtil.getSession();
			Transaction tx=null;
		//create the objects
				Person per1=new Person();
				Person per2=new Person();
		per1.setPerName("Pratik");per1.setAge(25);per1.setGender("Male");
		per2.setPerName("Shona");per2.setAge(22);per2.setGender("Female");
				
				Passport pass1=new Passport();
				//Passport pass1=new Passport();
		pass1.setCountry("India");pass1.setExpiryDate( new Date(2020,3,20));pass1.setPerson(per1);
			
			

				//save objs (parent to child)

					try {
						tx=ses.beginTransaction();
						ses.save(pass1);
					//	ses.save(hall2);

						tx.commit();
						System.out.println("\n\n\t\tObjects saved Successfully");
						
					} catch (Exception e2) {
						tx.rollback();
						e2.printStackTrace();
						System.out.println("\n\n\t\tObjects not saved Successfully");
					}
						//close the session
					HibernateUtil.closeSession(ses);

	}//save data using hall ticket

	
	@Override
	public void loadDataUsingPassport() {
		Session ses=null;
		//get the session
		ses=HibernateUtil.getSession();
		//prepare the query
			Query q=ses.createQuery("from Passport");
			
			//execute the list
			List<Passport> list=q.list();
			for(Passport pass:list) {
				System.out.println("\t\tChild:: "+pass);
				Person per=pass.getPerson();
				System.out.println("\t\tParent:: "+per);
			}
			//close the session
			HibernateUtil.closeSession(ses);
	}//loadDataUsingStudent
	
	@Override
	public void deleteDataUsingPassport() {
		// TODO Auto-generated method stub 10000100
		Session ses=null;
		//get the session
		ses=HibernateUtil.getSession();
			Transaction tx=null;
		//get the Object
			Passport pass=ses.get(Passport.class,10000100);
				
					try {
						tx=ses.beginTransaction();
							//delete the object
						ses.delete(pass);

						tx.commit();
						System.out.println("\n\n\t\tObject and its asoociated parent  Deleted  Successfully");
						
					} catch (Exception e2) {
						tx.rollback();
						e2.printStackTrace();
						System.out.println("\n\n\t\tObject and its asoociated parent not  Deleted Successfully");
					}
						//close the session
					HibernateUtil.closeSession(ses);
	}
}//class
