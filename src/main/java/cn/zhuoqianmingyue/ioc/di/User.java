package cn.zhuoqianmingyue.ioc.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
	private static Logger log = LoggerFactory.getLogger(User.class);
	
	private String name;
	private Integer age;
	private Country country;
	private List<String> address;
	private Set<String> address2;
	private Map<String,String> addressMap;
	
	public Map<String, String> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}
	public Set<String> getAddress2() {
		return address2;
	}
	public void setAddress2(Set<String> address2) {
		this.address2 = address2;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void showUserInfo() {
		log.info("name:"+name+" age:"+age+" country:"+country.getName()+" address");
		address.forEach((str)->{
			System.out.print(str+" ");
		});
		System.out.println("address2:");
		address2.forEach((str)->{
			System.out.print(str+" ");
		});
		addressMap.forEach((k, v)->{
			System.out.print("key:"+k+" value:"+v);
		});
	}
	
}
