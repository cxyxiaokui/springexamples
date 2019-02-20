package cn.zhuoqianmingyue.aop.adviceParam;

public class User {
	public void run() {
		System.out.println("run....");
	}
	public void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public int sub(int x,int y) {
		return x-y;
	}
}
