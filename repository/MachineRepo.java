package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.MachineEntity;

public interface MachineRepo {
	void save(MachineEntity entity);
	public MachineEntity findByName(String name);
	public void deleteByIdOfM(int id);
	public List<MachineEntity> getAllFromMachineEntity();

}
