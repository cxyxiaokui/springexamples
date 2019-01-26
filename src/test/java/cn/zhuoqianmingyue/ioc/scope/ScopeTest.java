package cn.zhuoqianmingyue.ioc.scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhuoqianmingyue.ioc.di.autowire.UserByType;

public class ScopeTest {
	@Test
	public void singleton() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-scope.xml");
		Bean user = (Bean)appliction.getBean("bean");
		Bean user2 = (Bean)appliction.getBean("bean");
		Bean user3 = (Bean)appliction.getBean("bean");
		System.out.println(user.toString());
		System.out.println(user2.toString());
		System.out.println(user3.toString());
	}
}
