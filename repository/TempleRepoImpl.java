package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.emfUtil.util.EMFUtil;
import com.xworkz.temple.TempleEntity;

public class TempleRepoImpl implements TempleRepository {
	private EntityManagerFactory factory = EMFUtil.getFactory();

	
	public TempleRepoImpl() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	@Override
	public void save(TempleEntity entity) {
	System.out.println("created save method");
	EntityManager session = factory.createEntityManager();
	session.getTransaction().begin();
	session.persist(entity);
	session.getTransaction().commit();
	session.close();
	factory.close();

		
	}

	@Override
	public TempleEntity findByName(String name) {
		System.out.println("invoked  findByName");
		EntityManager manager = factory.createEntityManager();
		
			//manager.getTransaction().begin();
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nm",name);
			TempleEntity templentityFromDb = (TempleEntity) query.getSingleResult();
			return templentityFromDb;
	}

	@Override
	public void deleteById(int id) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Query createNamedQuery = manager.createNamedQuery("deleteById");
		createNamedQuery.setParameter("id", id);
		createNamedQuery.executeUpdate();
		manager.getTransaction().commit();
	}

	@Override
	public List<TempleEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager manager = factory.createEntityManager();
		Query createNamedQuery = manager.createNamedQuery("getAll");
		List<TempleEntity> resultList = createNamedQuery.getResultList();
		manager.close();
		return resultList;
	}

}
