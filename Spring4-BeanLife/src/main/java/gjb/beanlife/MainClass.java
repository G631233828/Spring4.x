package gjb.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjb.beanlife.pojo.Person;

public class MainClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Person p = (Person) context.getBean("person");
//		System.out.println(p);
	
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		
	}

}
