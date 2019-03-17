package com.xworkz.hibernate.repositary;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.entity.HotelEntity;



public class HotelRepositary {
	
	public HotelRepositary() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}
	
	public void save(HotelEntity entity) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		try {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();

		} catch (Exception e) {
			
			System.err.println("exception created :\t");
			e.printStackTrace();
			session.getTransaction().rollback();
		}

		finally {
			session.close();
			factory.close();
		}
	}

}
