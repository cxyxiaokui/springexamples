package cn.zhuoqianmingyue.aop.annotationConfiguration;

import org.springframework.stereotype.Component;

@Component
public class User {
	public void run() {
		System.out.println("run....");
	}
	
	public void speak(String name) {
		System.out.println(name+"run....");
	}
	
	public int add(int a,int b) {
		return a+b;
	}
}
