package cn.zhuoqianmingyue.ioc.di.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
//@Order(2)
public class AddressClassListConfig {
	@Bean("addressClassList")
	public List<AddressAnnotation> getAddressClassList() {
		List<AddressAnnotation> list = new ArrayList<AddressAnnotation>();
		AddressAnnotation addr1 = new AddressAnnotation();
		addr1.setName("北京");
		list.add(addr1);
		return list;
	}
}
