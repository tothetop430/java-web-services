package learning.springjdbc.springjdbc;

import java.sql.Timestamp;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import learning.springjdbc.springjdbc.entity.PersonTable;
import learning.springjdbc.springjdbc.jdbc.JpaRepositoryDao;


@SpringBootApplication
public class JpaApplication implements CommandLineRunner {
	
	private static final Logger logger = LoggerFactory.getLogger(JpaApplication.class);
	
	@Autowired
	private JpaRepositoryDao jpaDao;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Insert Person 1" + jpaDao.updateOrInsert(new PersonTable("Sid", "Gzb", new Date())));
		logger.info("Insert Person 2" + jpaDao.updateOrInsert(new PersonTable("Abhi", "Gzb", new Date())));
		logger.info("Person By Id" + jpaDao.findById(1));
		logger.info("Deleting Person with Id 2" + jpaDao.deleteById(2));
	}
}
