package learning.rest.webservice.userdetails.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		User user = userDaoService.findUser(id);
		if (user == null) throw new UserNotFoundException("id="+id);
		return user;
	}
	
	@PostMapping(path="/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User createdUser = userDaoService.saveUser(user);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(createdUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping(path="/users/{id}")
	public ResponseEntity<Object> deteleUser(@PathVariable Integer id) {
		User user = userDaoService.deleteById(id);
		if (user == null) throw new UserNotFoundException("id="+id);
		return ResponseEntity.noContent().build();
	}
}
