package cn.zhuoqianmingyue.ioc.scope;

public class Bean {
	
	public void init() {
		System.out.println("init......");
	}
	public void destroy() {
		System.out.println("destroy......");
	}
	public void fun() {
		System.out.println("bean......");
	}
}
