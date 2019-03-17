package com.xworkz.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "dish")
public class DishesEntity implements Serializable {
	//one to many
	//own
	//uni Direction

	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "D_id")
	private Integer dId;
	@Column(name = "D_name")
	private String name;
	@Column(name = "D_price")
	private Double price;
	@Column(name = "D_dishType")
	private String dishType;
	
	
	public DishesEntity() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getDishType() {
		return dishType;
	}


	public void setDishType(String dishType) {
		this.dishType = dishType;
	}


	@Override
	public String toString() {
		return "DishesEntity [dId=" + dId + ", name=" + name + ", price=" + price + ", dishType=" + dishType + "]";
	}
	
	
}
