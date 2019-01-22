package cn.zhuoqianmingyue.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * BeanFactory �� ApplicationContext������
 * BeanFactory ���ӳټ��أ�ʹ��beanʱ�Ž��г�ʼ��
 * ApplicationContext ���������ļ�ʱ ��ʼ��bean����
 * ���ܣ�
 * ApplicationContext �ṩ�˸���Ĺ���
 * ���ʻ�����
 * �¼�����
 * Bean�Զ�װ��
 * ���ֲ�ͬӦ�ò��Contextʵ��
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
