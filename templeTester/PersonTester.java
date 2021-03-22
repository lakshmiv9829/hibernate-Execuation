package com.xworkz.temple.templeTester;

import com.xworkz.temple.entity.PersonEntity;
import com.xworkz.temple.repository.PersonRepo;
import com.xworkz.temple.repository.PersonRepoImpl;

public class PersonTester {

	public static void main(String[] args) {
		PersonEntity entity=new PersonEntity("lakshmi", "lakshmi@gmail.com", 9837269127l);
		PersonEntity entity1=new PersonEntity("madhu", "madhu@gmail.com", 992369127l);
		PersonEntity entity2=new PersonEntity("veeresh", "veeresh@gmail.com",863337711);
		PersonEntity entity3=new PersonEntity("veeresh", "veeresh@gmail.com",863337711);
		PersonEntity entity5=new PersonEntity("UnstoppableDriver", "UnstoppableDriver@gmail.com", 892269127l);

		PersonEntity entity4=new PersonEntity("mala", "mala@gmail.com", 827279127l);
		PersonRepo repo=new PersonRepoImpl();
		//repo.save(entity5);
		//System.out.println(repo.findByName("mala"));
		//repo.deleteById(5);
		System.out.println(repo.getAll());

		



		
	}

}
