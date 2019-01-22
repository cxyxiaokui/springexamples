package cn.zhuoqianmingyue.ioc.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 1 为应用程序的成员变量注入对应的值
	 1 为注入成员变量 需要提供setter 方法
	 2 在spring的配置文件中指定需要资源的属性
 * @author Administrator
 *
 */
public class UserPropertyDITest {
	@Test
	public void diBasePropertyXml() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		User user = (User)appliction.getBean("user");
		user.showUserInfo();
	}
	@Test
	public void diBasePropertyAnnotation() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		UserAnnotation userAnnotation = (UserAnnotation)appliction.getBean("userAnnotation");
		userAnnotation.showUserInfo();
	}
	@Test
	public void diClassProperty() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		User user = (User)appliction.getBean("user");
		user.getCountry().countryInfo();
	}
}
