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
@Table(name="Machine")
@NamedQueries({
	@NamedQuery(name = "findByNameFromMachineEntity",query = "select machine from MachineEntity machine where machine.name=:nm"),
	@NamedQuery(name="deleteByIdOfM",query="delete from MachineEntity machine where machine.id=:id"),
	@NamedQuery(name = "getAllFromMachineEntity",query = "select machine from MachineEntity machine")
	})

public class MachineEntity {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")  
	private String name;
	@Column(name="TYPE")
	private String type;
	@Column(name="COMPANY_NAME")
	private String CompanyName;
	public MachineEntity(String name, String type, String companyName) {
		super();
		this.name = name;
		this.type = type;
		CompanyName = companyName;
	}
	
	

}
