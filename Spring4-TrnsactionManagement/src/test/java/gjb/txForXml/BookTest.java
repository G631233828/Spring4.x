package gjb.txForXml;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjb.txForXml.dao.BookShopDao;
import gjb.txForXml.dao.impl.BookShopDaoImpl;
import gjb.txForXml.service.BookShopService;
import gjb.txForXml.service.CashierService;
import gjb.txForXml.service.impl.BookShopServiceImpl;
import gjb.txForXml.service.impl.CashierServiceImpl;

public class BookTest {

	private final static ApplicationContext applicationContext;
	private static BookShopDaoImpl bookShopDao = null;
	private static BookShopServiceImpl bookShopService = null;
	private static CashierServiceImpl cashierService = null;
	static {
		applicationContext = new ClassPathXmlApplicationContext("applicationContextForXml.xml");
		bookShopDao = (BookShopDaoImpl) applicationContext.getBean("bookShopDao");
		bookShopService = (BookShopServiceImpl) applicationContext.getBean("bookShopService");
		cashierService = (CashierServiceImpl) applicationContext.getBean("cashierService");
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

	@Test
	public void testByMoreBooks() {
		cashierService.byMoreBook("fliay", Arrays.asList("1", "2"));
	}

}
