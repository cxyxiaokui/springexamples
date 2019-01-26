package cn.zhuoqianmingyue.ioc.di.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAutowireTest {
	/**
	 * byDefault
	 */
	@Test
	public void userDefault() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-autowire.xml");
		UserDefault user = (UserDefault)appliction.getBean("userDefault");
		System.out.println("country:"+user.getCountry().getName());
	}
	/**
	 * byName
	 * 必须有set方法 并且set方法名称与属性名称一样
	 */
	@Test
	public void userByName() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-autowire.xml");
		UserByName user = (UserByName)appliction.getBean("userByName");
		System.out.println("country:"+user.getCountry().getName());
	}
	/**
	 * byType
	 * 必须set方法 但是set方法名称可以与属性名称不同
	 */
	@Test
	public void userByType() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-autowire.xml");
		UserByType user = (UserByType)appliction.getBean("userByType");
		System.out.println("country:"+user.getCountry().getName());
	}
	/**
	 * byConstructor
	 * 无需提供set方法
	 */
	@Test
	public void userByConstructor() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-autowire.xml");
		UserByConstructor user = (UserByConstructor)appliction.getBean("userByConstructor");
		System.out.println("country:"+user.getCountry().getName());
	}
	@Test
	public void userResource() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-autowire.xml");
		UserResource user = (UserResource)appliction.getBean("userResource");
		System.out.println("country:"+user.getCountryResource().getName());
	}
	
	@Test
	public void userAutowired() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-autowire.xml");
		UserAutowired user = (UserAutowired)appliction.getBean("userAutowired");
		System.out.println("country:"+user.getCountryResource3().getName());
		System.out.println("country:"+user.getCountryResource().getName());
	}
}
