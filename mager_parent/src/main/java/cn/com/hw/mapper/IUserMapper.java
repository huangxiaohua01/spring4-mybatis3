package cn.com.hw.mapper;

import java.util.List;

import cn.com.hw.bean.UserBean;

public interface IUserMapper {
	public List<UserBean> getUser();

	public void addUser(UserBean user);
}
