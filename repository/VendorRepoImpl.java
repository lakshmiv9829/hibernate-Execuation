package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.emfUtil.util.EMFUtil;
import com.xworkz.temple.entity.VendorEntity;

public class VendorRepoImpl implements VendorRepo {
	private EntityManagerFactory factory = EMFUtil.getFactory();
public VendorRepoImpl() {
	System.out.println("Created"+this.getClass().getSimpleName());
}

	@Override
	public void save(VendorEntity entity) {
		System.out.println("invoked save");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		System.out.println("entity saved");	
	}

	@Override
	public VendorEntity findByNameFromVendorEntity(String name) {
		
		System.out.println("invoked findByName");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("findByNameFromVendorEntity");
		query.setParameter("nm", name);
		VendorEntity entityFromDB = (VendorEntity) query.getSingleResult();
		session.close();
		return entityFromDB;
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		VendorEntity entityFromDB = session.find(VendorEntity.class, id);
		if (entityFromDB != null) {
			session.remove(entityFromDB);
			System.out.println("entity removed");
			session.getTransaction().commit();

		} else {
			System.out.println("cannot delete");
		}
		session.close();
	}

	@Override
	public List<VendorEntity> getAllFromVendorEntity() {
		System.out.println("invoked getAll");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getAllFromVendorEntity");
		List<VendorEntity> allFromDB = query.getResultList();
		session.close();
		return allFromDB;
	}

}
