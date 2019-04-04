package gjb.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import gjb.tx.dao.UserDao;
import gjb.tx.dao.impl.UserDaoImpl;
import gjb.tx.pojo.User;

public class MainClass {

	private static JdbcTemplate jdbcTemplate;
	private static ApplicationContext app;
	private static UserDao userDao;

	static {

		app = new ClassPathXmlApplicationContext("applicationContext.xml");
		jdbcTemplate = app.getBean(JdbcTemplate.class);
	}

	public static void main(String[] args) {

	}

}
