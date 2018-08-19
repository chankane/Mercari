package pkg.dao;

import pkg.entity.User;

public interface UserDAOInterface {
	
	public User find(int id);
	
	public User find(String email, String password);
	
	public void update(User user);
	
}
