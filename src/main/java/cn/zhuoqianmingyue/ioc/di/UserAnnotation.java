package cn.zhuoqianmingyue.ioc.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("userAnnotation")
public class UserAnnotation {
	private static Logger log = LoggerFactory.getLogger(User.class);
	@Value(value = "zhuoqianmingyue2")
	private String name;
	@Value(value = "19")
	private Integer age;
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
		log.info("name:"+name+" age:"+age);
	}
}
