package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.emfUtil.util.EMFUtil;
import com.xworkz.temple.TempleEntity;
import com.xworkz.temple.entity.ComputerEntity;

public class ComputerRepoImpl implements ComputerRepo{
	private EntityManagerFactory factory = EMFUtil.getFactory();

	public ComputerRepoImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(ComputerEntity entity) {
		System.out.println("invoked  save");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

	@Override
	public void deleteByIdForC(int id) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Query createNamedQuery = manager.createNamedQuery("deleteByIdForC");
		createNamedQuery.setParameter("id", id);
		createNamedQuery.executeUpdate();
		manager.getTransaction().commit();
		
	}

	@Override
	public ComputerEntity findByBrand(String brand) {
		System.out.println("invoked  findByBrand");
		EntityManager manager = factory.createEntityManager();
		
			Query query = manager.createNamedQuery("findByBrand");
			query.setParameter("brand",brand);
			ComputerEntity compEntityFromDb = (ComputerEntity) query.getSingleResult();
			return compEntityFromDb;
	}

	@Override
	public List<ComputerEntity> getAllOfC() {
		System.out.println("invoked getAllOfC");
		EntityManager manager = factory.createEntityManager();
		Query createNamedQuery = manager.createNamedQuery("getAllOfC");
		List<ComputerEntity> resultList = createNamedQuery.getResultList();
		manager.close();
		return resultList;
	}

	

}
