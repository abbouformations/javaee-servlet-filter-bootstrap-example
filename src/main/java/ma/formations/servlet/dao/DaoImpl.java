package ma.formations.servlet.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ma.formations.servlet.service.model.User;

public class DaoImpl implements IDao {
	private static List<User> users = new ArrayList<User>();
	static {
		users.add(new User("user01", "user01"));
		users.add(new User("user02", "user02"));
		users.add(new User("user03", "user03"));
		users.add(new User("user04", "user04"));
	}

	@Override
	public List<User> findAllUsers() {
		return users;
	}

	@Override
	public User getUserByUsername(String username) {
		Optional<User> r = users.stream().filter(u -> u.getUsername().equals(username)).findAny();
		if (!r.isPresent())
			return null;
		return r.get();
	}
}
