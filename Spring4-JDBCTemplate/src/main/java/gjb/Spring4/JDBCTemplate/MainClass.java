package gjb.Spring4.JDBCTemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import gjb.Spring4.JDBCTemplate.dao.UserDao;
import gjb.Spring4.JDBCTemplate.dao.Impl.UserDaoImpl;
import gjb.Spring4.JDBCTemplate.pojo.User;

public class MainClass {
	
	private static JdbcTemplate jdbcTemplate;
	private static ApplicationContext app;
	private static UserDao userDao;
	
	static{
		
		 app =new  ClassPathXmlApplicationContext("applicationContext.xml");
	    jdbcTemplate = app.getBean(JdbcTemplate.class);
		 userDao = app.getBean(UserDaoImpl.class);
	}
	
	public static void main(String[] args) {
		
	/*	插入数据
	   User u = new User();
		u.setName("jack");
		u.setAge(22);
		u.setAddress("北京");
		userDao.InsertUser(u);*/
		
		//查询数据
		User user = userDao.findUserById(2);
		System.out.println(user);
		
		
		//查询所有数据
		/*List<User> list = userDao.findUsers();
		System.out.println(list);
		*/
		
		//删除数据
	/*	int i = userDao.DeleteUserById(1);
		System.out.println(i);*/
		
		//更新数据
		/*User user = new User();
		user.setAge(30);
		user.setName("jack");
		user.setAddress("上海");
		int i = userDao.UpdateUser(user, 2);
		System.out.println(i);*/
	}


}
