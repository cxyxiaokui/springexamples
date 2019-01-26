package cn.zhuoqianmingyue.ioc.di.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userAutowired")
public class UserAutowired {
	@Autowired
	private CountryResource3 countryResource3;
	@Autowired
	@Qualifier("c1")
	private ICountry countryResource;

	public ICountry getCountryResource() {
		return countryResource;
	}

	public CountryResource3 getCountryResource3() {
		return countryResource3;
	}
}
