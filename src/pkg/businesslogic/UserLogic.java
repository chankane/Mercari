package pkg.businesslogic;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import pkg.dao.UserDAOInterface;
import pkg.entity.Item;
import pkg.entity.User;

@Transactional(rollbackOn=Exception.class)
public class UserLogic {
	
	@Inject
	UserDAOInterface dao;
	
	/**
	 * If you want to get this instance, use BusinessLogicFactory.
	 */
	UserLogic() {
		// TODO Auto-generated constructor stub
	}
	
	public User signIn(String email, String password) {
		return dao.find(email, password);
	}

	public void transaction(User buyer, Item item) {
		User seller = dao.find(item.getSellerId());
		int price = item.getPrice();
		buyer.setBalance(buyer.getBalance() - price);
		dao.update(buyer);
		seller.setBalance(seller.getBalance() + price);
		dao.update(seller);
		/*if(true) {
			throw new RuntimeException();
		}*/
	}
	
}
