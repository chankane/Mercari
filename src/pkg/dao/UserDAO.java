package pkg.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import com.google.inject.Inject;
import pkg.entity.User;

public class UserDAO implements UserDAOInterface {

	@Inject
	EntityManager em;
	
	public User find(int id) {
		return em.find(User.class, id);
	}
	
	public User find(String email, String password) {
		try {
			String jpql = "SELECT e FROM User e WHERE e.email=?1 and e.password=?2";
			User user = em.createQuery(jpql, User.class)
					.setParameter(1, email)
					.setParameter(2, password)
					.getSingleResult();
			return user;
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		em.merge(user);
		em.flush();
	}

}
