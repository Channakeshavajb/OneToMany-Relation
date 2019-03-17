package com.xworkz.hibernate.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "hotel")
public class HotelEntity implements Serializable {

	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "H_id")
	private Integer hId;
	@Column(name = "H_name")
	private String name;
	@Column(name = "H_ratings")
	private Integer ratings;
	@Column(name = "H_isVegitarian")
	private boolean isVegitarian;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="hotel")
	private Collection<DishesEntity> dishesEntities;

	public HotelEntity() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRatings() {
		return ratings;
	}

	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}

	public boolean getIsVegitarian() {
		return isVegitarian;
	}

	public void setIsVegitarian(boolean isVegitarian) {
		this.isVegitarian = isVegitarian;
	}

	public Collection<DishesEntity> getDishesEntities() {
		return dishesEntities;
	}

	public void setDishesEntities(Collection<DishesEntity> dishesEntities) {
		this.dishesEntities = dishesEntities;
	}

	@Override
	public String toString() {
		return "HotelEntity [hId=" + hId + ", name=" + name + ", ratings=" + ratings + ", isVegitarian=" + isVegitarian
				+ ", dishesEntities=" + dishesEntities + "]";
	}

}
