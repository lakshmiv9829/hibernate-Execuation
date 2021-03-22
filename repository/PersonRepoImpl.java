package com.xworkz.temple.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import com.xworkz.emfUtil.util.EMFUtil;
import com.xworkz.temple.entity.PersonEntity;

public class PersonRepoImpl implements PersonRepo{
	private EntityManagerFactory factory = EMFUtil.getFactory();
public PersonRepoImpl() {
	System.out.println("created"+this.getClass().getSimpleName());
}
	@Override
	public void save(PersonEntity entity) {
		System.out.println("created save method");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

	@Override
	public PersonEntity findByName(String name) {
			System.out.println("invoked findByName");
			EntityManager session = factory.createEntityManager();
			Query query = session.createNamedQuery("findByNameFromPersonEntity");
			query.setParameter("nm", name);
			PersonEntity entityFromDB = (PersonEntity) query.getSingleResult();
			session.close();
			return entityFromDB;
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked deleteById");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		PersonEntity entityFromDB = session.find(PersonEntity.class, id);
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
	public List<PersonEntity> getAll() {
		System.out.println("invoked getAll");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getAllFromPersonEntity");
		List<PersonEntity> allFromDB = query.getResultList();
		session.close();
		return allFromDB;
	}

}
