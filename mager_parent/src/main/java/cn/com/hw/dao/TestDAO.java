package cn.com.hw.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import cn.com.hw.bean.StudentBean;
import cn.com.hw.bean.UserBean;

@Repository
public class TestDAO extends SqlSessionDaoSupport {

	public List<UserBean> getUser() {
		return this.getSqlSession().selectList("getUser");

	}

	public void addUser(UserBean user) {
		this.getSqlSession().insert("addUser", user);
	}

	// public List<StudentBean> getStudent() {
	// return this.getSqlSession().selectList("getStudent");
	//
	// }

}
