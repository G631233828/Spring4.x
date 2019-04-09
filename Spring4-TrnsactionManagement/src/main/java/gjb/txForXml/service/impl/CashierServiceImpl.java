package gjb.txForXml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gjb.tx.dao.BookShopDao;
import gjb.tx.service.BookShopService;
import gjb.tx.service.CashierService;

public class CashierServiceImpl implements CashierService {

	private BookShopService bookShopService;
	public BookShopService getBookShopService() {
		return bookShopService;
	}
	public void setBookShopService(BookShopService bookShopService) {
		this.bookShopService = bookShopService;
	}
	public void byMoreBook(String username, List<String> listIsbn) {
		for(String isbn:listIsbn) {
			this.bookShopService.byBook(username, isbn);
		}
	}

}
