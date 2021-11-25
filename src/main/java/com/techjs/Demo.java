package com.techjs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techjs.entity.FourWheeler;
import com.techjs.entity.TwoWheeler;
import com.techjs.entity.Vehicle;

public class Demo 
{

	public static void main(String[] args) 
	{

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Vehicle");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bullet-350");
		bike.setSteeringHandle("Bike Streeing Handle");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Range Rover");
		car.setStreeingWheel("Range Rover Streeing Wheel");
		
		Configuration config = new Configuration().configure();
//		config.addAnnotatedClass(Vehicle.class);
//		config.addAnnotatedClass(TwoWheeler.class);
//		config.addAnnotatedClass(FourWheeler.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tn = session.beginTransaction();
		session.save(vehicle);
		session.save(bike);
		session.save(car);

		tn.commit();
		
		session.close();
		sf.close();
		
		
	}

}
