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
		//��ȡ��ĵ���
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		//������Ŀ��
		bookShopDao.updateBookStock(isbn);
		//�����û������
		bookShopDao.updateUserAccount(username, price);
	}


}
