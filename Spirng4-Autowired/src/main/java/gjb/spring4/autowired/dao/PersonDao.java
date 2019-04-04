package gjb.spring4.autowired.dao;

import java.util.concurrent.ConcurrentLinkedQueue;

import gjb.spring4.autowired.pojo.Person;

public interface PersonDao {

	public ConcurrentLinkedQueue<Person> addPerson(Person person);
}
