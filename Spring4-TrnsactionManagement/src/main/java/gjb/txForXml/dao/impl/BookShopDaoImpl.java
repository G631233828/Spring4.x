package gjb.txForXml.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import gjb.tx.dao.BookShopDao;
import gjb.tx.exception.BookStockException;
import gjb.tx.exception.UserAccountException;

public class BookShopDaoImpl implements BookShopDao {
	
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int findBookPriceByIsbn(String isbn) {
		String sql = "SELECT PRICE FROM BOOK WHERE ISBN=?";
		return jdbcTemplate.queryForObject(sql, Integer.class, isbn);
	}

	public void updateBookStock(String isbn) {
		//检查书本的数量
		int num =findBookPriceByIsbn(isbn);
		if(num == 0) {
			throw new BookStockException("库存不足");
		}
		
		String sql = "UPDATE BOOK_STOCK SET STOCK=STOCK-1 WHERE ISBN=?";
		jdbcTemplate.update(sql, isbn);
	}

	public void updateUserAccount(String username, int price) {
		int balance = fidnpriceByUser(username);
		if(balance<price) {
			throw new UserAccountException("余额不足");
		}
		
		String sql = "UPDATE account SET BALANCE=BALANCE-? WHERE USERNAME = ?";
		jdbcTemplate.update(sql, price, username);
	}

	public int fidnpriceByUser(String username) {
		String sql="SELECT balance FROM ACCOUNT WHERE USERNAME=?";
		return jdbcTemplate.queryForInt(sql, username);
	}

}
