package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý oluþturuldu " + user.getFirstName());

	}

	@Override
	public List<User> getAll() {

		return users;
	}


	@Override
	public User getById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if (user.geteMail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for (User user : users) {
			if (user.geteMail() == email && user.getPassword() == password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean emailCheck(User user) {
		for (User u : users
		        )
		            if (u.geteMail() == user.geteMail()) {
		                return false;
		            }
		        return true;
	}

	@Override
	public boolean loginByCheck(String email, String password) {
		for (User user : users) {
            if (user.geteMail() == email && user.getPassword() == password)
                return true;
        }
        return false;
	}

}
