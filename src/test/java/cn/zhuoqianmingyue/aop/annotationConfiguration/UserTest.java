package cn.zhuoqianmingyue.aop.annotationConfiguration;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {
	@Test
	public void run() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-aop-annotationConfiguration.xml");
		User user = (User)appliction.getBean("user");
		user.run();
	}
	@Test
	public void speak() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-aop-annotationConfiguration.xml");
		User user = (User)appliction.getBean("user");
		user.speak("hello !");
	}
	@Test
	public void add() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-aop-annotationConfiguration.xml");
		User user = (User)appliction.getBean("user");
		user.add(3,4);
	}
}
