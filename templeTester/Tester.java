package com.xworkz.temple.templeTester;

import com.xworkz.temple.TempleEntity;
import com.xworkz.temple.repository.TempleRepoImpl;
import com.xworkz.temple.repository.TempleRepository;

public class Tester {

	public static void main(String[] args) {
		//TempleEntity entity=new TempleEntity("GanapathiTemple", "Banglore", 5000, 3);
		//TempleEntity entity1=new TempleEntity("abc", "aaa", 98, 7);
		
		TempleRepository repo=new TempleRepoImpl();
		System.out.println(repo.findByName("GanapathiTemple"));
		//repo.deleteById(6);
		//System.out.println(repo.getAll());
		
	}

}
