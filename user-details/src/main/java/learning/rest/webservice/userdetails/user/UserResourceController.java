package learning.rest.webservice.userdetails.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResourceController {
	
	@Autowired
	private UserDaoService userDaoService;
	
	@GetMapping(path="/users")
	public List<User> retrieveAllUsers() {
		return userDaoService.findAll();
	}
	
	@GetMapping(path="/users/{id}")
	public User retrieveUser(@PathVariable Integer id) {
		return userDaoService.findUser(id);
	}
}
