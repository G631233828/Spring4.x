package gjb.spring4.autowired.dao.impl;

import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Repository;

import gjb.spring4.autowired.dao.PersonDao;
import gjb.spring4.autowired.pojo.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	ConcurrentLinkedQueue<Person> clist = new ConcurrentLinkedQueue<Person>();

//	List<Person> list = new ArrayList<Person>();
	
	public ConcurrentLinkedQueue<Person> addPerson(Person person) {
		clist.add(person);
		return clist;
	}

}
