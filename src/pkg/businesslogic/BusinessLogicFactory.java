package pkg.businesslogic;

import com.google.inject.Guice;
import com.google.inject.Injector;

import pkg.dao.JpaPersistDaoModule;

public class BusinessLogicFactory {
	
	Injector injector = Guice.createInjector(new JpaPersistDaoModule());

	public UserLogic createUserLogic() {
		return injector.getInstance(UserLogic.class);
	}
	
	public ItemLogic createItemLogic() {
		return injector.getInstance(ItemLogic.class);
	}
	
	public UserItemLogic createUserItemLogic() {
		return injector.getInstance(UserItemLogic.class);
	}
}
