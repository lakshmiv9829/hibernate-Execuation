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
@Table(name="vendor")
@NamedQueries({
	@NamedQuery(name="findByNameFromVendorEntity",query = "select vendor from VendorEntity vendor where vendor.name=:nm"),
	@NamedQuery(name="getAllFromVendorEntity",query = "select vendor from VendorEntity vendor")
})
public class VendorEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="PRICE")
	private double price;
	
	public VendorEntity(String name, String location, double price) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
	}	

}
