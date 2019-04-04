package gjb.AopForXML.dao;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		 ApplicationContext app = new
		 ClassPathXmlApplicationContext("applicationContext.xml");
		 Calculator ca2 = (Calculator) app.getBean("calculatorImpl");
		 ca2.add(1, 2);
		 ca2.multiply(1, 2);
	}

}
