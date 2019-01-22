package cn.zhuoqianmingyue.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * BeanFactory 和 ApplicationContext的区别
 * BeanFactory 是延迟加载，使用bean时才进行初始化
 * ApplicationContext 加载配置文件时 初始化bean对象
 * 功能：
 * ApplicationContext 提供了更多的功能
 * 国际化处理
 * 事件传递
 * Bean自动装配
 * 各种不同应用层的Context实现
 * 
 * @author zhuoqianmingyue
 *
 */
public class ApplicationContextAndBeanFactory {
	@Test
	public void applicationContextTest() {
		ApplicationContext application = new ClassPathXmlApplicationContext("ioc-helloworld-context.xml");
		//IocHelloWorldXml bean = (IocHelloWorldXml)application.getBean("iocHelloWorldXml");
	}
	@Test
	public void beanFactoryTest() {
		Resource resource = new ClassPathResource("ioc-helloworld-context.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		IocHelloWorldXml bean = (IocHelloWorldXml)beanFactory.getBean("iocHelloWorldXml");
	}
}
