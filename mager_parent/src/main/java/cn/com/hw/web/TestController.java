package cn.com.hw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import cn.com.hw.bean.UserBean;
import cn.com.hw.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

	public void test() {
		try {
			List<UserBean> user = testService.getUser();
			System.out.println(user.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		try {
			TestService testService = (TestService) getBean();
			testService.addUser(new UserBean("test1", "test2"));
			List<UserBean> user = testService.getUser();
			System.out.println(user.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static Object getBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		return context.getBean("testService");
	}
}
