package gjb.spring4.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjb.spring4.autowired.dao.PersonDao;

public class MainClass {
	
	@Autowired
	private PersonDao personDao;

	public static void main(String[] args) {
		
		ApplicationContext app =new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		PersonDao p = (PersonDao) app.getBean("personDaoImpl");
		
		System.out.println(p);
		
	}

}
