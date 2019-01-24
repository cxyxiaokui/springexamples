package cn.zhuoqianmingyue.ioc.di.annotation;


import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component()
public class UserAnnotation {
	private static Logger log = LoggerFactory.getLogger(UserAnnotation.class);
	@Value(value = "zhuoqianmingyue2")
	private String name;
	@Value(value = "19")
	private Integer age;
	@Autowired
	private CountryAnnotation countryAnnotation;
	@Autowired
	private List<String> addressList;
	@Autowired
	private List<AddressAnnotation> addressClassList;
	@Autowired
	private Set<String> addressSet;
	@Autowired
	private Set<AddressAnnotation> addressClassSet;

	
	@Autowired
	private Map<String,AddressAnnotation> addressClassMap;
	

	public Map<String, AddressAnnotation> getAddressClassMap() {
		return addressClassMap;
	}

	public Set<AddressAnnotation> getAddressClassSet() {
		return addressClassSet;
	}

	public Set<String> getAddressSet() {
		return addressSet;
	}

	public List<String> getAddressList() {
		return addressList;
	}

	public CountryAnnotation getCountryAnnotation() {
		return countryAnnotation;
	}


	
	public List<AddressAnnotation> getAddressClassList() {
		return addressClassList;
	}

	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	
}
