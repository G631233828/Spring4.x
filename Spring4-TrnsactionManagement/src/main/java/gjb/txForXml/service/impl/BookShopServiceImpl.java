package gjb.txForXml.service.impl;

import gjb.tx.dao.BookShopDao;
import gjb.tx.service.BookShopService;

public class BookShopServiceImpl implements BookShopService {

	private BookShopDao bookShopDao;
	public BookShopDao getBookShopDao() {
		return bookShopDao;
	}
	public void setBookShopDao(BookShopDao bookShopDao) {
		this.bookShopDao = bookShopDao;
	}


	public void byBook(String username, String isbn) {
		//获取书的单价
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		//更新书的库存
		bookShopDao.updateBookStock(isbn);
		//更新用户的余额
		bookShopDao.updateUserAccount(username, price);
	}


}
