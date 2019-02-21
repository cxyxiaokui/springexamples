package cn.zhuoqianmingyue.aop.adviceType;

import org.aspectj.lang.ProceedingJoinPoint;

public class CustomAdvice {
	
	public void before(){
		System.out.println("before....");
	}
	public void after(){
		System.out.println("after....");
	} 
	public void afterReturning(){
		System.out.println("afterReturning....");
	}
	public void afterThrowing(){
		System.out.println("afterThrowing....");
	}  
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("around before....");
		joinPoint.proceed();
		System.out.println("around after....");
	}
}
