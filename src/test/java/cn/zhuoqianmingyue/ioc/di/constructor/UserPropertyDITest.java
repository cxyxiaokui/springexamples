package cn.zhuoqianmingyue.ioc.di.constructor;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author zhuoqianmingyue
 *
 */
public class UserPropertyDITest {
	private static Logger log = LoggerFactory.getLogger(UserPropertyDITest.class);
	@Test
	public void userDefault() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-constructor.xml");
		User user = (User)appliction.getBean("userDefault");
		user.showUserInfo();
	}
	@Test
	public void userIndex() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-constructor.xml");
		User user = (User)appliction.getBean("userIndex");
		user.showUserInfo();
	}
	@Test
	public void userType() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-constructor.xml");
		User user = (User)appliction.getBean("userType");
		user.showUserInfo();
	}
	@Test
	public void userHasClass() {
		ApplicationContext appliction = new ClassPathXmlApplicationContext("ioc-di-constructor.xml");
		User user = (User)appliction.getBean("userHasClass");
		user.showUserInfoHasCountry();
	}
	
	
}
