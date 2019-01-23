package cn.zhuoqianmingyue.ioc.di.xml;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zhuoqianmingyue.ioc.di.xml.Address;
import cn.zhuoqianmingyue.ioc.di.xml.Country;
import cn.zhuoqianmingyue.ioc.di.xml.User;
/**
 * 1 为应用程序的成员变量注入对应的值
	 1 为注入成员变量 需要提供setter 方法
	 2 在spring的配置文件中指定需要资源的属性
 * @author zhuoqianmingyue
 *
 */
public class UserPropertyDITest {
	private static Logger log = LoggerFactory.getLogger(UserPropertyDITest.class);
	@Test
	public void diBasePropertyXml() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		User user = (User)appliction.getBean("user");
		user.showUserInfo();
	}
	@Test
	public void diClassProperty() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		User user = (User)appliction.getBean("user");
		Country country = user.getCountry();
		log.info("country:"+country.getName());
	}
	@Test
	public void diListProperty() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		User user = (User)appliction.getBean("user");
		List<String> address = user.getAddressList();
		address.forEach((str)->{
			System.out.print(str+" ");
		});
	}
	@Test
	public void diListHasClassProperty() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		User user = (User)appliction.getBean("user");
		List<Address> addressClass = user.getAddressClassList();
		
		addressClass.forEach((addr)->{
			System.out.print(addr.getName());
		});
	}
	
	@Test
	public void diSetHasClassProperty() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		User user = (User)appliction.getBean("user");
		Set<Address> address2Class = user.getAddressClassSet();
		address2Class.forEach((addr)->{
			System.out.print(addr.getName());
		});
	}
	
	@Test
	public void diMapProperty() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		User user = (User)appliction.getBean("user");
		Map<String, String> addressMap = user.getAddressMap();
		addressMap.forEach((k, v)->{
			System.out.print("key:"+k+" value:"+v);
		});
	}
	
	@Test
	public void diMapHasClassProperty() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-context.xml");
		User user = (User)appliction.getBean("user");
		Map<String, Address> addressClassMap = user.getAddressClassMap();
		addressClassMap.forEach((k, v)->{
			System.out.print("key:"+k+" value:"+v.getName());
		});
	}
	
	

}
