package pkg.businesslogic;

import java.util.List;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import pkg.dao.ItemDAOInterface;
import pkg.entity.Item;

@Transactional(rollbackOn=Exception.class)
public class ItemLogic {
	
	@Inject
	ItemDAOInterface dao;
	
	/**
	 * If you want to get this instance, use BusinessLogicFactory.
	 */
	ItemLogic() {
		// TODO Auto-generated constructor stub
	}
	
	public Item find(int id) {
		return dao.find(id);
	}
	
	public List<Item> findFirst10() {
		return dao.findAll();
	}
	
	public void sell(Item item) {
		dao.add(item);
	}
	
}
