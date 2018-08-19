package pkg.dao;

import com.google.inject.Guice;

import pkg.businesslogic.BusinessLogicFactory;
import pkg.businesslogic.UserLogic;
import pkg.entity.Item;
import pkg.entity.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dao.add("fish", 1000, "big", ".", 2);
		Item item = new Item("big", ".", "fish", 1000, 2);
		// dao.remove(item);
		User user = new User(100000, "?", "f", "?");

		UserLogic logic = new BusinessLogicFactory().createUserLogic();
		logic.transaction(user, item);
	}

}