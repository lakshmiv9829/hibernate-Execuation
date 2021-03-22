package com.xworkz.temple;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.NonFinal;
@Data
@NoArgsConstructor
@Entity
@Table(name="temple")
@NamedQueries({
	@NamedQuery(name="findByName", query="select temple from TempleEntity temple where temple.name=:nm"),
	@NamedQuery(name="deleteById",query="delete from TempleEntity temple where temple.id=:id"),
	@NamedQuery(name="getAll",query="select temple  from TempleEntity temple"),

})
public class TempleEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private  String name;
	@Column(name="LOCATION")
	private String location;
	@Column(name="NO_OF_VISITORS")
	private int noOfVisitors;
	@Column(name="NO_OF_PRIESTS")
	private int noOfPriest;
	public TempleEntity(String name, String location, int noOfVisitors, int noOfPriest) {
		super();
		this.name = name;
		this.location = location;
		this.noOfVisitors = noOfVisitors;
		this.noOfPriest = noOfPriest;
	}
	

}

