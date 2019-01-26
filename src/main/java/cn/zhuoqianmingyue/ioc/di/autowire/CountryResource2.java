package cn.zhuoqianmingyue.ioc.di.autowire;

import org.springframework.stereotype.Component;

@Component("c2")
public class CountryResource2 implements ICountry{
	@Override
	public String getName() {
		return "CountryResource2";
	}
}
