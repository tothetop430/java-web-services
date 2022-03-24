package learning.springjdbc.springjdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import learning.springjdbc.springjdbc.entity.Person;
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
		logger.info("" + personDao.findById(10001));
		logger.info("Delete By Id - Rows Deleted - {}", personDao.deleteById(10002));
		logger.info("" + personDao.findAll());
		logger.info("Insert Person Id 2 again - {}", personDao.insert(new Person(10002, "Abhi", "Gzb", new Date())));
		logger.info("" + personDao.findAll());
		logger.info("Update Person Id 2 - {}", personDao.update(new Person(10002, "Abhi", "Bng", new Date())));
		logger.info("" + personDao.findAll());
	}

}
