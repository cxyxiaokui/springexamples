package cn.zhuoqianmingyue.ioc.di.annotation;

import org.springframework.stereotype.Component;

@Component("countryAnnotation")
public class CountryAnnotation {
	private String name = "加拿大";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
