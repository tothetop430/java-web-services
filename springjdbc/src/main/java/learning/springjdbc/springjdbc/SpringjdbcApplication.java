package learning.springjdbc.springjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import learning.springjdbc.springjdbc.jdbc.PersonJdbcDao;

@SpringBootApplication
public class SpringjdbcApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SpringjdbcApplication.class);
	
	@Autowired
	private PersonJdbcDao personDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("" + personDao.findAll());
	}

}
