package pkg.servlet;

import javax.servlet.http.HttpSession;

import pkg.businesslogic.BusinessLogicFactory;
import pkg.businesslogic.ItemLogic;
import pkg.businesslogic.UserLogic;
import pkg.entity.Item;
import pkg.entity.User;

public class AttributeManager {
	
	private static final UserLogic USER_LOGIC = new BusinessLogicFactory().createUserLogic();
	private static final ItemLogic ITEM_LOGIC = new BusinessLogicFactory().createItemLogic();
	
	public static void removeUser(HttpSession session) {
		session.removeAttribute("items");
	}
	
	public static void setUser(HttpSession session, User user) {
		session.setAttribute("user", user);
	}
	
	public static void removeItems(HttpSession session) {
		session.removeAttribute("items");
	}
	
	public static void setItems(HttpSession session) {
		session.setAttribute("items", ITEM_LOGIC.findFirst10());
	}

	public static void removeItem(HttpSession session) {
		session.removeAttribute("item");
	}
	
	public static void setItem(HttpSession session, Item item) {
		session.setAttribute("item", item);
	}
	
}
