package cn.zhuoqianmingyue.ioc.di.constructor;

public class User {
	private String name;
	private Integer age;
	private Country country;
	public User(String name, Integer age, Country country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void showUserInfo() {
		System.out.println("name:"+name+" age:"+age);
	}
	public void showUserInfoHasCountry() {
		System.out.println("name:"+name+" age:"+age+" country:"+country.getName());
	}
}
