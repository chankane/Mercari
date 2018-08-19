package pkg.dao;

import java.util.List;

import pkg.entity.Item;

public interface ItemDAOInterface {
	
	public Item find(int id);
	
	public List<Item> findAll();
	
	public void remove(Item item);
	
	public void add(String name, int price, String description, String imagePath, int sellerId);
	
	public void add(Item item);
	
	public void update(Item item);
}
