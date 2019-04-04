package gjb.tx.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gjb.tx.dao.BookShopDao;
import gjb.tx.service.BookShopService;

@Service
public class BookShopServiceImpl implements BookShopService {

	@Autowired
	private BookShopDao bookShopDao;

	/**
	 * 添加事务注解@Transactional
	 */
	@Transactional
	public void byBook(String username, String isbn) {
		//获取书的单价
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		//更新书的库存
		bookShopDao.updateBookStock(isbn);
		//更新用户的余额
		bookShopDao.updateUserAccount(username, price);
	}

}
