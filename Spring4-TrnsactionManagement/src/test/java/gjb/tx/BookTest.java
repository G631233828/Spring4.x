package gjb.tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjb.tx.dao.BookShopDao;
import gjb.tx.service.BookShopService;

public class BookTest {

	private final static ApplicationContext applicationContext;
	private static BookShopDao bookShopDao = null;
	private static BookShopService bookShopService = null;
	static {
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		bookShopDao = applicationContext.getBean(BookShopDao.class);
		bookShopService = applicationContext.getBean(BookShopService.class);
	}

	@Test
	public void testfindBookPriceByIsbn() {
		System.out.println(bookShopDao.findBookPriceByIsbn("1"));
	}

	@Test
	public void testupdateBookStock() {
		bookShopDao.updateBookStock("1");
	}
	
	@Test
	public void testupdateUserAccount() {
		bookShopDao.updateUserAccount("fliay", 320);
	}
	
	
	@Test
	public void testByBook() {
		bookShopService.byBook("fliay", "1");
	}
	
	
	
	
	
	
	
	
}
