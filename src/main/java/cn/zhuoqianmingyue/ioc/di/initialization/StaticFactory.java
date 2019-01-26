package cn.zhuoqianmingyue.ioc.di.initialization;

public class StaticFactory {
	public static StaticFactoryBean getBean() {
		return new StaticFactoryBean();
	}
}
