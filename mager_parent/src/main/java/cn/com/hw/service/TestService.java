package cn.com.hw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.hw.bean.UserBean;
import cn.com.hw.dao.TestDAO;

@Service
@Transactional
public class TestService {

	@Autowired
	private TestDAO testDAO;

	public List<UserBean> getUser() {
		return testDAO.getUser();
	}

	public void addUser(UserBean user) {
		testDAO.addUser(user);
	}
}
