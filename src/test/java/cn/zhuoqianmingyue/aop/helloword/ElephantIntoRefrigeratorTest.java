package cn.zhuoqianmingyue.aop.helloword;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhuoqianmingyue.aop.helloworld.RefrigeratorA;

public class ElephantIntoRefrigeratorTest {
	@Test
	public void into() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-aop-helloworld.xml");
		RefrigeratorA refrigeratorA = (RefrigeratorA)appliction.getBean("refrigeratorA");
		//refrigeratorA.into();
		refrigeratorA.into("神秘礼物",2);
	/*	RefrigeratorB refrigeratorB = (RefrigeratorB)appliction.getBean("refrigeratorB");
		refrigeratorB.into();
		RefrigeratorC refrigeratorC = (RefrigeratorC)appliction.getBean("refrigeratorC");
		refrigeratorC.into();*/
	}
}
