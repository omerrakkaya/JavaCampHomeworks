package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void add(User user);

	List<User> getAll();

	User getById(int id);

	User getByEmail(String email);

	User getByEmailAndPassword(String email, String password);

	boolean emailCheck(User user);

	boolean loginByCheck(String email, String password);
}
