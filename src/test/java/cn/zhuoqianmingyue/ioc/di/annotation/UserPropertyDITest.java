package cn.zhuoqianmingyue.ioc.di.annotation;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations= {"classpath:ioc-di-context.xml"})
public class UserPropertyDITest {
	private static Logger log = LoggerFactory.getLogger(UserPropertyDITest.class);
	@Autowired
	private UserAnnotation userAnnotation;
	@Test
	public void diBaseProperty() {
		log.info(userAnnotation.getName()+"#"+userAnnotation.getAge());
	}
	@Test
	public void diClassProperty() {
		log.info(userAnnotation.getCountryAnnotation().getName());
	}
	@Test
	public void diListProperty() {
		List<String> addressList = userAnnotation.getAddressList();
		addressList.forEach((addr)->{
			log.info(addr);
		});
	}
	/**
	 *  需要将AddressAnnotation类上的@Component注解注释掉
	 */
	@Test
	public void diListHasClassProperty() {
		List<AddressAnnotation> addressClass = userAnnotation.getAddressClassList();
		addressClass.forEach((addr)->{
			log.info(addr.getName());
		});
	}
	@Test
	public void diSetProperty() {
		Set<String> address2 = userAnnotation.getAddressSet();
		address2.forEach((addr)->{
			log.info("diSetProperty"+addr);
		});
	}
	/**
	 *  需要将AddressAnnotation类上的@Component注解注释掉
	 */
	@Test
	public void diSetHasClassProperty() {
		Set<AddressAnnotation> address2Class = userAnnotation.getAddressClassSet();
		address2Class.forEach((addr)->{
			log.info(addr.getName());
		});
	}
	
	@Test
	public void diMapHasClassProperty() {
		Map<String, AddressAnnotation> addressClassMap = userAnnotation.getAddressClassMap();
		addressClassMap.forEach((k, v)->{
			System.out.print(" key:"+k+" value:"+v.getName());
		});
	}
	
}
