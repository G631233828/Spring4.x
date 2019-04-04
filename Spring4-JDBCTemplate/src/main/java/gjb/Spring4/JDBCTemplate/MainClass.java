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
		
	/*	��������
	   User u = new User();
		u.setName("jack");
		u.setAge(22);
		u.setAddress("����");
		userDao.InsertUser(u);*/
		
		//��ѯ����
		User user = userDao.findUserById(2);
		System.out.println(user);
		
		
		//��ѯ��������
		/*List<User> list = userDao.findUsers();
		System.out.println(list);
		*/
		
		//ɾ������
	/*	int i = userDao.DeleteUserById(1);
		System.out.println(i);*/
		
		//��������
		/*User user = new User();
		user.setAge(30);
		user.setName("jack");
		user.setAddress("�Ϻ�");
		int i = userDao.UpdateUser(user, 2);
		System.out.println(i);*/
	}


}
