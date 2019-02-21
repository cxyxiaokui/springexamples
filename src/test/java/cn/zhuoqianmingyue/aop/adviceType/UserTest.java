package cn.zhuoqianmingyue.aop.adviceType;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {
	@Test
	public void run() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-aop-adviceType.xml");
		User user = (User)appliction.getBean("user");
		user.run();
	}
}
