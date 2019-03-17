package com.xworkz.hibernate.tester;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.hibernate.entity.DishesEntity;
import com.xworkz.hibernate.entity.HotelEntity;
import com.xworkz.hibernate.repositary.HotelRepositary;

public class OneToManyTester {

	private static final DishesEntity dish2 = null;

	public static void main(String[] args) {

		//create a obj hotel and init's props
		//create two dishes obj's and init's props
		//create a collection of type dishes
		//Add the dishes into collection
		//relate collection with hotel
		
		HotelEntity hotelEntity=new HotelEntity();
		hotelEntity.setName("kamath");
		hotelEntity.setRatings(5);
		hotelEntity.setIsVegitarian(true);
		
		DishesEntity dish1=new DishesEntity();
		dish1.setName("dose");
		dish1.setDishType("veg");
		dish1.setPrice(45.00);
		
		DishesEntity dish2=new DishesEntity();
		dish2.setName("idli");
		dish2.setDishType("veg");
		dish2.setPrice(20.00);
		
		Collection< DishesEntity> collection=new ArrayList<DishesEntity>();
		collection.add(dish1);
		collection.add(dish2);

		hotelEntity.setDishesEntities(collection);
		
		HotelRepositary hotelRepositary=new HotelRepositary();
		hotelRepositary.save(hotelEntity);
		
	}

}
