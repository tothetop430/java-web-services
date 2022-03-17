package learning.jpa.Jpa.Project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import learning.jpa.Jpa.Project.entity.User;
import learning.jpa.Jpa.Project.service.UserDAOService;

@Component
public class UserDAOCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserDAOService userDaoService;
	
	private static final Logger log = LoggerFactory.getLogger(UserDAOCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("User 1", "First User");
		long id = userDaoService.insert(user);
		log.info("User created with id=" + id);
		log.info(user.toString());
	}

}
