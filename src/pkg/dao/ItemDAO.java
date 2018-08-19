package pkg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import com.google.inject.Inject;
import pkg.entity.Item;

public class ItemDAO implements ItemDAOInterface {

	@Inject
	EntityManager em;

	public Item find(int id) {
		return em.find(Item.class, id);
	}
	
	public List<Item> findAll() {
		String jpql = "SELECT e FROM Item e";
		return em.createQuery(jpql, Item.class).getResultList();
	}

	public void remove(Item item) {
		System.out.println("em:" + em);
		item = em.merge(item);
		em.remove(item);
	}
	
	public void add(String name, int price, String description, String imagePath, int sellerId) {
		System.out.println(em);
		em.persist(new Item(description, imagePath, name, price, sellerId));
		em.flush();
	}
	
	public void add(Item item) {
		em.persist(item);
		em.flush();
	}
	
	public void update(Item item) {
		em.merge(item);
		em.flush();
	}

}
