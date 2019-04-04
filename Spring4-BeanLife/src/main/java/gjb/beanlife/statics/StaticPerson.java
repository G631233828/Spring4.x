package gjb.beanlife.statics;

import java.util.HashMap;
import java.util.Map;

import gjb.beanlife.pojo.Person;

public class StaticPerson {

	private static Map<String, Person> p = new HashMap<String, Person>();

	static {
		p.put("p1", new Person("fliay"));
		p.put("p2", new Person("jay"));
	}

	public static Person getPerson(String person) {
		return p.get(person);
	}

}
