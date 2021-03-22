package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.TempleEntity;

public interface TempleRepository {
	void save (TempleEntity entity);
	TempleEntity findByName(String name);
	void deleteById(int id);
	public List<TempleEntity> getAll();

}
