package gjb.txForXml;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjb.tx.dao.BookShopDao;
import gjb.tx.service.BookShopService;
import gjb.tx.service.CashierService;

public class BookTest {

	private final static ApplicationContext applicationContext;
	private static BookShopDao bookShopDao = null;
	private static BookShopService bookShopService = null;
	private static CashierService cashierService = null;
	static {
		applicationContext = new ClassPathXmlApplicationContext("applicationContextForXml.xml");
		bookShopDao = applicationContext.getBean(BookShopDao.class);
		bookShopService = applicationContext.getBean(BookShopService.class);
		cashierService = applicationContext.getBean(CashierService.class);
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
