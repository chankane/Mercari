package pkg.businesslogic;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import pkg.dao.ItemDAO;
import pkg.entity.Item;
import pkg.entity.User;

@Transactional(rollbackOn=Exception.class)
public class UserItemLogic {

	@Inject
	private UserLogic userLogic;
	@Inject
	private ItemDAO itemDAO;
	
	/**
	 * If you want to get this instance, use BusinessLogicFactory.
	 */
	UserItemLogic() {
		// TODO Auto-generated constructor stub
	}
	
	public void buy(User buyer, Item item) {
		userLogic.transaction(buyer, item);
		itemDAO.remove(item);
		if(true) {
			throw new RuntimeException();
		}
	}
	
}
