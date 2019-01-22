package cn.zhuoqianmingyue.ioc.di;

public class Country {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void countryInfo() {
		System.out.println(name);
	}
}
