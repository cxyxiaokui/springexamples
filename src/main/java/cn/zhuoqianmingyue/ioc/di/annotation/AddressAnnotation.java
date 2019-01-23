package cn.zhuoqianmingyue.ioc.di.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("addressAnnotation")
public class AddressAnnotation {
	private String name ="山西";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
