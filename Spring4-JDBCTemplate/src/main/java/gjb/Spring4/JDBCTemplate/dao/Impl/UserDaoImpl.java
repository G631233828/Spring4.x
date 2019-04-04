package gjb.Spring4.JDBCTemplate.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import gjb.Spring4.JDBCTemplate.dao.UserDao;
import gjb.Spring4.JDBCTemplate.pojo.User;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao {


	public void InsertUser(User user) {
		String sql = "insert into user(name,age,address)values(?,?,?)";
		List<Object[]> batchArgs = new ArrayList<Object[]>();
		batchArgs.add(new Object[] { user.getName(), user.getAge(), user.getAddress() });
		this.getJdbcTemplate().batchUpdate(sql, batchArgs);
	}

	public User findUserById(Integer id) {
		String sql = "SELECT * FROM USER WHERE id=?";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		User user = this.getJdbcTemplate().queryForObject(sql, rowMapper, id);
		return user;
	}

	public List<User> findUsers() {
		String sql = "SELECT * FROM USER";
		List<User> list = this.getJdbcTemplate().query(sql, new BeanPropertyRowMapper<User>(User.class));
		return list;
	}

	public int DeleteUserById(Integer id) {
		String sql = "DELETE FROM USER WHERE id = ?";
		List<Object[]> batchArgs = new ArrayList<Object[]>();
		batchArgs.add(new Object[] { id });
		int[] re = this.getJdbcTemplate().batchUpdate(sql, batchArgs);
		return re.length;
	}

	public int UpdateUser(User user, Integer id) {
		String sql = "UPDATE USER SET name=?,age=?,address=? WHERE id=?";
		List<Object[]> batchArgs = new ArrayList<Object[]>();
		batchArgs.add(new Object[] { user.getName(), user.getAge(), user.getAddress(),id});
		int[] re = this.getJdbcTemplate().batchUpdate(sql, batchArgs);
		return re.length;
	
	}

}
/*
class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setName(rs.getString("name"));
		user.setAge(rs.getInt("age"));
		user.setAddress(rs.getString("address"));
		return user;
	}

}
*/