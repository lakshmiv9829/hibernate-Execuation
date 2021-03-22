package com.xworkz.temple.repository;

import java.util.List;

import com.xworkz.temple.entity.VendorEntity;

public interface VendorRepo {
	void save(VendorEntity entity);

	VendorEntity findByNameFromVendorEntity(String name);

	void deleteById(int id);

	List<VendorEntity> getAllFromVendorEntity();

}
