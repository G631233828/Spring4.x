package gjb.txForXml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gjb.tx.dao.BookShopDao;
import gjb.tx.service.BookShopService;
import gjb.tx.service.CashierService;

@Service
public class CashierServiceImpl implements CashierService {

	@Autowired
	private BookShopService bookShopService;


	/**
	 * 使用propagation 来指定事务的传播行为
	 */
	@Transactional
	public void byMoreBook(String username, List<String> listIsbn) {
		for(String isbn:listIsbn) {
			this.bookShopService.byBook(username, isbn);
		}
	}

}
