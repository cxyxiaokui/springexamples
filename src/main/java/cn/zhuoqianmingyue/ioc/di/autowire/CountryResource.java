package cn.zhuoqianmingyue.ioc.di.autowire;

import org.springframework.stereotype.Component;

@Component("c1")
public class CountryResource implements ICountry{
	private String name="CountryResource";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
