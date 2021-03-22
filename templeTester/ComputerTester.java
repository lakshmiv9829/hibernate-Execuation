package com.xworkz.temple.templeTester;

import com.xworkz.temple.entity.ComputerEntity;
import com.xworkz.temple.repository.ComputerRepo;
import com.xworkz.temple.repository.ComputerRepoImpl;

public class ComputerTester {

	public static void main(String[] args) {
		ComputerEntity entity=new ComputerEntity("vastro", 10000, "desktop", "Apple");
		ComputerRepo repo=new ComputerRepoImpl();
		//repo.save(entity);
		//repo.deleteByIdForC(6);
	System.out.println(repo.findByBrand("Dell"));
	System.out.println(repo.getAllOfC());
	}

}
