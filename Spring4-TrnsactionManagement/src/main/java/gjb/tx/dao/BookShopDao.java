package gjb.tx.dao;

public interface BookShopDao {

	// 根据书号获取书的单价
	public int findBookPriceByIsbn(String isbn);

	// 根据书的编号更新书的库存 使书号对应的库存-1
	public void updateBookStock(String isbn);

	// 更新用户的账户余额使username的balance -1
	public void updateUserAccount(String username, int price);
	
	public int fidnpriceByUser(String username);

}
