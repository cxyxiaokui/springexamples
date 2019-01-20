package cn.zhuoqianmingyue.ioc;

import org.springframework.stereotype.Component;

@Component("iocHelloWorldAnnotation")
public class IocHelloWorldAnnotation {
	public void say() {
		System.out.println("annotation hello word....");
	}
}
