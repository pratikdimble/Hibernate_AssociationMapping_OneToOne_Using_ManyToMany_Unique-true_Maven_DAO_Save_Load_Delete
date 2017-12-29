package com.app.test;


import com.app.dao.DAO;
import com.app.dao.DAOFactory;
import com.app.utility.HibernateUtil;

public class deleteDataUsingPassport {

	public static void main(String[] args) {
		
		//get the DAO
		DAO dao=new DAOFactory().getInstance();
		//use the dao
		dao.deleteDataUsingPassport();
		
		HibernateUtil.closeFactory();
	}

}
