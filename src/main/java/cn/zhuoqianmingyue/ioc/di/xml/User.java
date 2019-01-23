package cn.zhuoqianmingyue.ioc.di.xml;

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
	private List<String> addressList;
	private List<Address> addressClassList;
	public Set<String> getAddressSet() {
		return addressSet;
	}
	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}
	private Set<String> addressSet;
	private Set<Address> addressClassSet;
	public Set<Address> getAddressClassSet() {
		return addressClassSet;
	}
	public void setAddressClassSet(Set<Address> addressClassSet) {
		this.addressClassSet = addressClassSet;
	}
	private Map<String,String> addressMap;
	private Map<String,Address> addressClassMap;
	
	
	public List<Address> getAddressClassList() {
		return addressClassList;
	}
	public void setAddressClassList(List<Address> addressClassList) {
		this.addressClassList = addressClassList;
	}
	public Map<String, Address> getAddressClassMap() {
		return addressClassMap;
	}
	public void setAddressClassMap(Map<String, Address> addressClassMap) {
		this.addressClassMap = addressClassMap;
	}
	public Map<String, String> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}

	public List<String> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
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
		
	}
	
}
