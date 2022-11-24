package com.app.conexionHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos el session factory
		SessionFactory sessionFactory = new Configuration().
		configure("hibernate.cfg.xml").addAnnotatedClass(Empleados.class).buildSessionFactory();
		
		//Creamos el session
		Session session = sessionFactory.openSession();
		
		try {
			//Creamos el obj
			Empleados empleado = new Empleados("Alberto", "Talamino", "632776236");
			
			//Ejecutamos la transacción SQL
			session.beginTransaction();
			session.persist(empleado);
			session.getTransaction().commit();	
			
			System.out.println("Registro insertado correctamente");
			
		}finally {
			sessionFactory.close();
			session.close();
		}
		
	}

}
