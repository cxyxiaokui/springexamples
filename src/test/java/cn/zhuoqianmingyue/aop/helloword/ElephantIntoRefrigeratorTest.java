package cn.zhuoqianmingyue.aop.helloword;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ElephantIntoRefrigeratorTest {
	@Test
	public void into() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-aop-helloworld.xml");
		RefrigeratorA refrigeratorA = (RefrigeratorA)appliction.getBean("refrigeratorA");
		refrigeratorA.into();
		RefrigeratorB refrigeratorB = (RefrigeratorB)appliction.getBean("refrigeratorB");
		refrigeratorB.into();
		RefrigeratorC refrigeratorC = (RefrigeratorC)appliction.getBean("refrigeratorC");
		refrigeratorC.into();
	}
}
