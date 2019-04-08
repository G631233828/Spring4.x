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
	 * �������ע��@Transactional
	 * propagation ָ������Ĵ�����Ϊ������ǰ�����񷽷�������һ�����񷽷�����ʱ
	   *     Ĭ��ȡֵΪREQUIRED��ʹ�õ��÷���������
	 * REQUIRES_NEW ����Ϊ�Լ������񣬵��õ����񷽷������񱻹һ�
	   *    ʹ��isolation ָ������ĸ��뼶����õ�ȡֵΪREAD_COMMITTED�����ύ
	   *     Ĭ�������spring������ʽ�������������ʱ�쳣���лع���Ҳ����ͨ����Ӧ�����Խ������á�
	 *      rollbackFor�����ѳɽ��лع�
	 *      readonly ָ�������Ƿ���ֻ������ʾ�������ֻ�����ݵ����������ݣ��������԰������ݿ������Ż�����
	   *                   �������һ��ֻ�����ݿ�ķ�����Ӧ����readOnly=true
	 * timeout     ָ��ǿ�ƻع�֮ǰ�������ռ�õ�ʱ��       
	 */
	@Transactional(propagation =Propagation.REQUIRES_NEW,
			isolation = Isolation.READ_COMMITTED,
			rollbackFor = {UserAccountException.class}/**���ûع����쳣**/,
			readOnly = false/*����ֻ������*/,
			timeout = 3)
	public void byBook(String username, String isbn) {
		//��ȡ��ĵ���
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		//������Ŀ��
		bookShopDao.updateBookStock(isbn);
		//�����û������
		bookShopDao.updateUserAccount(username, price);
	}


}
