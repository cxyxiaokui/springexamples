package cn.zhuoqianmingyue.aop.helloworld;

public class RefrigeratorA {
	protected void into() {
		System.out.println("RefrigeratorA 装入大象...");
	}
	public void into(String something,Integer num) {
		System.out.println("RefrigeratorA 装入："+something+" 装入的个数"+num);
	}
}
