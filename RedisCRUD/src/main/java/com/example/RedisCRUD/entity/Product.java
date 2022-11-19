package com.example.RedisCRUD.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String name;
	private Double price;
}
