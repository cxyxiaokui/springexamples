package cn.zhuoqianmingyue.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhuoqianmingyue.ioc.scope.Bean;

public class LifecycleTest {
	@Test
	public void beanLifecycleInit() {
		ApplicationContext application = new ClassPathXmlApplicationContext("ioc-lifecycle.xml");
	}
	
	@Test
	public void beanLifecycleInitAndDestroy() {
		ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("ioc-lifecycle.xml");
		Bean bean = (Bean)application.getBean("bean");
		application.close();
	}
}
