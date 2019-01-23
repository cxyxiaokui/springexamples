package cn.zhuoqianmingyue.ioc.di.annotation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressClassMapConfig {
	@Bean("addressClassMap")
	public Map<String,AddressAnnotation> getAddressClassMap(){
		Map<String,AddressAnnotation> map = new HashMap<String,AddressAnnotation>();
		AddressAnnotation addr1 = new AddressAnnotation();
		addr1.setName("北京");
		AddressAnnotation addr2 = new AddressAnnotation();
		addr2.setName("上海");
		map.put("BEIJING", addr1);
		map.put("SHANGHAI", addr2);
		return map;
	}
}
