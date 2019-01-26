package cn.zhuoqianmingyue.ioc.di.initialization;

import org.springframework.stereotype.Component;

@Component("beanAnnotation")
public class BeanAnnotation {
	public void fun() {
		System.out.println("beanAnnotation........");
	}
}
