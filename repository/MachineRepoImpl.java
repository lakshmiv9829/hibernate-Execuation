package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.emfUtil.util.EMFUtil;
import com.xworkz.temple.entity.MachineEntity;

public class MachineRepoImpl implements  MachineRepo{
	private EntityManagerFactory factory = EMFUtil.getFactory();

	public MachineRepoImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(MachineEntity entity) {
		System.out.println("created save method");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		//factory.close();
	
	}

	@Override
	public MachineEntity findByName(String name) {
		System.out.println("invoked findByName");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("findByNameFromMachineEntity");

		query.setParameter("nm", name);
		MachineEntity entityFromDB = (MachineEntity) query.getSingleResult();
		session.close();
		return entityFromDB;
	}

	@Override
	public void deleteByIdOfM(int id) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Query query = manager.createNamedQuery("deleteByIdOfM");
		query.setParameter("id",id);
		query.executeUpdate();
		manager.getTransaction().commit();
	}

	@Override
	public List<MachineEntity> getAllFromMachineEntity() {
		System.out.println("invoked getAll");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getAllFromMachineEntity");
		List<MachineEntity> allFromDB = query.getResultList();
		session.close();
		return allFromDB;
	}
	
}
