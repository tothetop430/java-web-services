package learning.springjdbc.springjdbc.jdbc;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import learning.springjdbc.springjdbc.entity.PersonTable;

@Repository
@Transactional
public class JpaRepositoryDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public PersonTable findById(int id) {
		return entityManager.find(PersonTable.class, id);
	}
	
	public PersonTable updateOrInsert(PersonTable person) {
		return entityManager.merge(person);
	}
	
}
