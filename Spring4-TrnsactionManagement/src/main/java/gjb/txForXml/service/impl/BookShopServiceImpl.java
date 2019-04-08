package gjb.txForXml.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gjb.tx.dao.BookShopDao;
import gjb.tx.exception.UserAccountException;
import gjb.tx.service.BookShopService;

public class BookShopServiceImpl implements BookShopService {

	private BookShopDao bookShopDao;
	public BookShopDao getBookShopDao() {
		return bookShopDao;
	}
	public void setBookShopDao(BookShopDao bookShopDao) {
		this.bookShopDao = bookShopDao;
	}


	/**
	 * 添加事务注解@Transactional
	 * propagation 指定事务的传播行为，即当前的事务方法被另外一个事务方法调用时
	   *     默认取值为REQUIRED即使用调用方法的事务
	 * REQUIRES_NEW 事务为自己的事务，调用的事务方法的事务被挂机
	   *    使用isolation 指定事务的隔离级别，最常用的取值为READ_COMMITTED独立提交
	   *     默认情况下spring的声明式事务对所有运行时异常进行回滚，也可以通过对应的属性进行设置。
	 *      rollbackFor根据已成进行回滚
	 *      readonly 指定事务是否是只读，表示这个事务只读数据但不更新数据，这样可以帮主数据库引擎优化事务
	   *                   若真的是一个只读数据库的方法，应设置readOnly=true
	 * timeout     指定强制回滚之前事务可以占用的时间       
	 */
	@Transactional(propagation =Propagation.REQUIRES_NEW,
			isolation = Isolation.READ_COMMITTED,
			rollbackFor = {UserAccountException.class}/**设置回滚的异常**/,
			readOnly = false/*设置只读属性*/,
			timeout = 3)
	public void byBook(String username, String isbn) {
		//获取书的单价
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		//更新书的库存
		bookShopDao.updateBookStock(isbn);
		//更新用户的余额
		bookShopDao.updateUserAccount(username, price);
	}


}
