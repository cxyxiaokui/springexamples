package cn.zhuoqianmingyue.ioc.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 1 ΪӦ�ó���ĳ�Ա����ע���Ӧ��ֵ
	 1 Ϊע���Ա���� ��Ҫ�ṩsetter ����
	 2 ��spring�������ļ���ָ����Ҫ��Դ������
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
