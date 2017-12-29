package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.dao.DAO;
import com.app.dao.DAOFactory;

import com.app.model.Person;
import com.app.utility.HibernateUtil;

public class saveDataUsingPassport {

	public static void main(String[] args) {
		
		//get the DAO
		DAO dao=new DAOFactory().getInstance();
		//use the dao
		dao.saveDataUsingPassport();
		
		HibernateUtil.closeFactory();
	}

}
