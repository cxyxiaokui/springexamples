package cn.zhuoqianmingyue.ioc.di.annotation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressSetConfig {
	@Bean("addressSet")
	public Set<String> getAddressSet(){
		Set<String>  addressList = new HashSet<String>() {{add("上海");add("广州");}};
		return addressList;
	}
}
