package com.xworkz.temple.templeTester;

import com.xworkz.temple.entity.VendorEntity;
import com.xworkz.temple.repository.VendorRepo;
import com.xworkz.temple.repository.VendorRepoImpl;

public class VendorTester {

	public static void main(String[] args) {
		VendorEntity entity=new VendorEntity("Anitha", "hubli", 2.5);
		VendorEntity entity1=new VendorEntity("Venna", "lxm", 3.0);
		VendorEntity entity2=new VendorEntity("mala", "Gadhag", 3.0);
		VendorRepo repo=new VendorRepoImpl();
		//repo.save(entity2);
		//repo.deleteById(5);
		//System.out.println(repo.findByNameFromVendorEntity("Lakshmi"));
		System.out.println(repo.getAllFromVendorEntity());
		
	}

}
