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
@Table(name="person")
@NamedQueries({
	@NamedQuery(name="findByNameFromPersonEntity",query = "select person from PersonEntity person where person.name=:nm"),
	@NamedQuery(name="getAllFromPersonEntity",query = "select person from PersonEntity person")
})
	public class PersonEntity {
	
		@Id
		@Column(name="ID")
		private int id;
		@Column(name="NAME")
		private String name;
		@Column(name="EMAIL")
		private String email;
		@Column(name="PHONE_NO")
		private long phoneNo;
		
		public PersonEntity(String name, String email, long phoneNo) {
			super();
			this.name = name;
			this.email = email;
			this.phoneNo = phoneNo;
		}

}
