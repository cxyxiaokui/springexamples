package cn.zhuoqianmingyue.ioc.di.autowire;

public class UserByConstructor {
	private Country country;

	
	public UserByConstructor(Country country) {
		super();
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

}
