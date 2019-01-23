package cn.zhuoqianmingyue.ioc.di.annotation;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressClassSetConfig {
	@Bean("addressClassSet")
	public Set<AddressAnnotation> getAddressClassSet(){
		Set<AddressAnnotation> set = new HashSet<AddressAnnotation>();
		AddressAnnotation addr = new AddressAnnotation();
		addr.setName("重庆");
		AddressAnnotation addr2 = new AddressAnnotation();
		addr2.setName("西藏");
		set.add(addr);
		set.add(addr2);
		return set;
	}
}
