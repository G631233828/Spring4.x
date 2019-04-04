package gjb.Spring4.JDBCTemplate.dao;

import java.util.List;

import gjb.Spring4.JDBCTemplate.pojo.User;

public interface UserDao {

	public void InsertUser(User user);

	public User findUserById(Integer id);

	public List<User> findUsers();

	public int DeleteUserById(Integer id);

	public int UpdateUser(User user, Integer id);

}
