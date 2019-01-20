package cn.zhuoqianmingyue.ioc;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IocHelloWorldNotAnnotationTest {
	
	private static Logger log = LoggerFactory.getLogger(IocHelloWorldNotAnnotationTest.class);
	ApplicationContext appliction = null;
	@Before
	public void initApplication() {
		 //appliction = new ClassPathXmlApplicationContext("ioc-helloworld-context.xml");
		appliction = new FileSystemXmlApplicationContext("ioc-helloworld-context.xml");
	}
	@Test
	public void classPathXml() {
		//IocHelloWorldXml iocHelloWorld = (IocHelloWorldXml)appliction.getBean("iocHelloWorldXml");
		//iocHelloWorld.say();
		IocHelloWorldAnnotation iocHelloWorldAnnotation = (IocHelloWorldAnnotation)appliction.getBean("iocHelloWorldAnnotation");
		iocHelloWorldAnnotation.say();
	}
	@Test
	public void fileSysteXml() {
		IocHelloWorldXml iocHelloWorld = (IocHelloWorldXml)appliction.getBean("iocHelloWorldXml");
		IocHelloWorldAnnotation iocHelloWorldAnnotation = (IocHelloWorldAnnotation)appliction.getBean("iocHelloWorldAnnotation");
		iocHelloWorld.say();
		iocHelloWorldAnnotation.say();
	}
}
