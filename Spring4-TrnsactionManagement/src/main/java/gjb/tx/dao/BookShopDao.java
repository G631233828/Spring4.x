package gjb.tx.dao;

public interface BookShopDao {

	// ������Ż�ȡ��ĵ���
	public int findBookPriceByIsbn(String isbn);

	// ������ı�Ÿ�����Ŀ�� ʹ��Ŷ�Ӧ�Ŀ��-1
	public void updateBookStock(String isbn);

	// �����û����˻����ʹusername��balance -1
	public void updateUserAccount(String username, int price);
	
	public int fidnpriceByUser(String username);

}
