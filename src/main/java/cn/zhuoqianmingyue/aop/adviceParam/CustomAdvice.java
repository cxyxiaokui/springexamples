package cn.zhuoqianmingyue.aop.adviceParam;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class CustomAdvice {
	
	public void before(JoinPoint joinPoint){
		printTargetInfo(joinPoint);
		System.out.println("before1....");
		System.out.println("################################");
	}
	public void after(JoinPoint joinPoint){
		printTargetInfo(joinPoint);
		System.out.println("after....");
		System.out.println("################################");
	} 
	public void afterReturning(JoinPoint joinPoint,Object obj){
		printTargetInfo(joinPoint);
		System.out.println("afterReturning....");
		System.out.println("return value:"+obj.toString());
		System.out.println("################################");
	}
	public void afterThrowing(JoinPoint joinPoint){
		printTargetInfo(joinPoint);
		System.out.println("afterThrowing....");
		System.out.println("################################");
	}  
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		Object[] args = joinPoint.getArgs();
		System.out.println("################################");
		System.out.println("around before....");
		Object object = joinPoint.proceed(args);
		System.out.println(object.toString());
		System.out.println("around after....");
		System.out.println("################################");
		return object;
		
	}
	private void printTargetInfo(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();//获取传入目标方法的参数对象
		Signature signature = joinPoint.getSignature();//获取封装了署名信息的对象,在该对象中可以获取到目标方法名,所属类的Class等信息
		Object target = joinPoint.getTarget();//获取被代理的对象
		Object this1 = joinPoint.getThis();//获取代理对象
		
		for (Object object : args) {
			System.out.print("获取传入目标方法的参数对象:"+ object.toString()+" ");
		}
		
		String declaringTypeName = signature.getDeclaringTypeName();
		String name = signature.getName();
		System.out.println("目标类具体名称："+declaringTypeName+" 切入的方法："+name);
		
	}
}
