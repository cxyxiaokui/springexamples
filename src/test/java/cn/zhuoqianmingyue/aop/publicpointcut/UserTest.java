package cn.zhuoqianmingyue.aop.publicpointcut;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhuoqianmingyue.aop.helloworld.RefrigeratorA;

public class UserTest {
	@Test
	public void speak() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-aop-publicpointcut.xml");
		User user = (User)appliction.getBean("user");
		user.speak();
	}
}
