package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.TempleEntity;
import com.xworkz.temple.entity.ComputerEntity;

public interface ComputerRepo {
	void save(ComputerEntity entity);
	void deleteByIdForC(int id);
	ComputerEntity findByBrand(String brand);
	public List<ComputerEntity> getAllOfC();

}
