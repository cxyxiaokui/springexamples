package cn.zhuoqianmingyue.ioc.di.autowire;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component("userResource")
public class UserResource{
	@Resource(name="c2")
	private ICountry countryResource;

	public ICountry getCountryResource() {
		return countryResource;
	}
}
