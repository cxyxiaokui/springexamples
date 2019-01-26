package cn.zhuoqianmingyue.ioc.di.initialization;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initializationBeanTest {
	
	@Test
	public void beanConstructor() {
		ApplicationContext application = new ClassPathXmlApplicationContext("ioc-initialization.xml");
		BeanConstructor beanConstructor = (BeanConstructor)application.getBean("beanConstructor");
		beanConstructor.fun();
	}
	
	@Test
	public void staticFactoryBean() {
		ApplicationContext application = new ClassPathXmlApplicationContext("ioc-initialization.xml");
		StaticFactoryBean staticFactoryBean = (StaticFactoryBean)application.getBean("staticFactoryBean");
		staticFactoryBean.fun();
	}
	@Test
	public void instanceFactoryBean() {
		ApplicationContext application = new ClassPathXmlApplicationContext("ioc-initialization.xml");
		InstanceFactoryBean instanceFactoryBean = (InstanceFactoryBean)application.getBean("instanceFactoryBean");
		instanceFactoryBean.fun();
	}
	@Test
	public void beanAnnotation() {
		ApplicationContext application = new ClassPathXmlApplicationContext("ioc-initialization.xml");
		BeanAnnotation instanceFactoryBean = (BeanAnnotation)application.getBean("beanAnnotation");
		instanceFactoryBean.fun();
	}
	
	@Test
	public void annotationFactoryBean() {
		ApplicationContext application = new ClassPathXmlApplicationContext("ioc-initialization.xml");
		AnnotationFactoryBean annotationFactoryBean = (AnnotationFactoryBean)application.getBean("annotationFactoryBean");
		annotationFactoryBean.fun();
	}
}
