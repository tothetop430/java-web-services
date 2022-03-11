package learning.rest.webservice.userdetails.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	private static Integer counter;
	
	static {
		users.add(new User(1, "Siddharth", new Date()));
		users.add(new User(2, "Abhishek", new Date()));
		users.add(new User(3, "Aviral", new Date()));
		users.add(new User(4, "Shashank", new Date()));
		users.add(new User(5, "Ayush", new Date()));
		users.add(new User(6, "Manish", new Date()));
		counter = 7;
	}
	
	public List<User> findAll() {
		return new ArrayList(users);
	}
	
	public User saveUser(User user) {
		if (user.getId() == null) {
			user.setId(counter++);
		}
		users.add(user);
		return user;
	}
	
	public User findUser(Integer id) {
		for (User user: users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(Integer id) {
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
	
}
