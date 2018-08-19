package pkg.dao;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.Inject;
import com.google.inject.persist.PersistService;
import com.google.inject.persist.jpa.JpaPersistModule;

public class JpaPersistDaoModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new JpaPersistModule("Mercari"));
		bind(ItemDAOInterface.class).to(ItemDAO.class);
		bind(UserDAOInterface.class).to(UserDAO.class);
		bind(JpaPersistInitializer.class).asEagerSingleton();
	}
	
	@Singleton
	private static class JpaPersistInitializer {

		@Inject
		public JpaPersistInitializer(PersistService service) {
			service.start();
			System.out.println("started");
		}
	}
}