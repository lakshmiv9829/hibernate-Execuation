package com.xworkz.temple.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="computer")
@NamedQueries({
	@NamedQuery(name="deleteByIdForC",query="delete from ComputerEntity comp where comp.id=:id"),
	@NamedQuery(name="findByBrand", query="select com from ComputerEntity com where com.brand=:brand"),
	@NamedQuery(name="getAllOfC",query="select com  from ComputerEntity com")

	})
	public class ComputerEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="BRAND")
	private String brand;
	@Column(name="PRICE")
	private double price;
	@Column(name="TYPE")
	private  String type;
	@Column(name="NAME")
	private String name;
	public ComputerEntity(String brand, double price, String type, String name) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.name = name;
	}
	

}
