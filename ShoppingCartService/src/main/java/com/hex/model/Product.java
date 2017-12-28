package com.hex.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idproduct;

	@Column(name = "id")
	private String id;

	@Column(name = "price")
	private String price;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "ingredients")
	private String ingredients;

	protected Product() {
	}

	/**
	 * Constructor
	 * 
	 * @param idproduct
	 * @param id
	 * @param price
	 * @param name
	 * @param description
	 * @param ingredients
	 */
	public Product(long idproduct, String id, String price, String name, String description, String ingredients) {
		super();
		this.idproduct = idproduct;
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
		this.ingredients = ingredients;
	}

	/*
	 * Getters and setters
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getIdproduct() {
		return idproduct;
	}

	public void setIdproduct(long idproduct) {
		this.idproduct = idproduct;
	}

	@Override
	public String toString() {
		return "Product [idproduct=" + idproduct + ",id=" + id + ", price=" + price + ", name=" + name
				+ ", description=" + description + ", ingredients=" + ingredients + "]";
	}
}