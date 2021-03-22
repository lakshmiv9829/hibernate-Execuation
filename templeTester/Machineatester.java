package com.xworkz.temple.templeTester;

import com.xworkz.temple.entity.MachineEntity;
import com.xworkz.temple.repository.MachineRepo;
import com.xworkz.temple.repository.MachineRepoImpl;

public class Machineatester {
	public static void main(String[] args) {
		
	
           MachineEntity entity=new MachineEntity("WashingMachine", "washing", "lg");
           MachineEntity entity1=new MachineEntity("Tv", "Electronic", "philps");
           MachineEntity entity2=new MachineEntity("vaccumCleaner", "cleaning", "philips");
           MachineEntity entity3=new MachineEntity("Computer", "Electroinc", "Dell");
           MachineEntity entity4=new MachineEntity("laser", "Factory", "Ashavpad");
           MachineEntity entity5=new MachineEntity("pest", "isud", "jsh");
           MachineRepo repo=new MachineRepoImpl();
//           repo.save(entity);
//           repo.save(entity1);
//           repo.save(entity2);
//           repo.save(entity3);
//           repo.save(entity4);
//           repo.save(entity5);
          //System.out.println( repo.findByName("pest"));

           //repo.deleteByIdOfM(10);
          System.out.println(repo.getAllFromMachineEntity()); 
           
	}
}
