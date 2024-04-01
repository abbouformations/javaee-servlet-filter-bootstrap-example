package ma.formations.servlet.dao;

import java.util.List;

import ma.formations.servlet.service.model.User;

public interface IDao {
	List<User> findAllUsers();
	User getUserByUsername(String username);
}
