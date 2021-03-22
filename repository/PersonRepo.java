package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.PersonEntity;

public interface PersonRepo {
	void save(PersonEntity entity);

	PersonEntity findByNameFromVendorEntity(String name);

	void deleteById(int id);

	List<PersonEntity> getAll();

}
