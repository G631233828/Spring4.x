package gjb.txForXml.dao;

import java.util.List;

import gjb.tx.pojo.User;

public interface UserDao {

	public void InsertUser(User user);

	public User findUserById(Integer id);

	public List<User> findUsers();

	public int DeleteUserById(Integer id);

	public int UpdateUser(User user, Integer id);

}
