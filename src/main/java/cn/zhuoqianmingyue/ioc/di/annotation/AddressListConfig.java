package cn.zhuoqianmingyue.ioc.di.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressListConfig {
	@Bean(name= {"addressList"})
	public List<String> getString() {
		List<String>  addressList = new ArrayList<String>() {{add("上海");add("广州");}};
		return addressList;
	}
	
	@Bean(name= {"addressList1"})
	public List<String> getString2() {
		List<String>  addressList = new ArrayList<String>() {{add("上海");add("广州");}};
		return addressList;
	}
}
