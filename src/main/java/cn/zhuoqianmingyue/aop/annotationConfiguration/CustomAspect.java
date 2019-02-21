package cn.zhuoqianmingyue.aop.annotationConfiguration;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect()
public class CustomAspect {
	@Pointcut(value="execution(* *..*.*(..))")  
	public void forAll() {};
	
	@Before(value = "forAll()")
	public void before(){
		System.out.println("before....");
	}
	
	@Before(value = "execution(* *..*.*(..))")
	public void before2(){
		System.out.println("before2....");
	}
	
	@Pointcut(value="execution(* *..*.speak(..)) && args(param)", argNames = "param")  
	public void beforeWithParamPointcut(String param) {}
	
	@Pointcut(value="execution(* *..*.*(..)) && args(param)", argNames = "param")  
	public void beforeWithParamPointcut2(String param) {}  
	@Before(value = "beforeWithParamPointcut2(param)", argNames = "param")  
	public void beforeWithParam(String param) {  
	    System.out.println("beforeWithParam.... param value:" + param);  
	}
	
	@After(value = "forAll()")
	public void after() {
		 System.out.println("after.......");  
	}
	
	@AfterReturning(  
		    value="execution(* *..*.*(..))",  
		    pointcut="execution(* *..*.*(..))",  
		    argNames="retVal", returning="retVal")  
	public void afterReturning(Object retVal) {  
	    System.out.println("afterReturning..... advice retVal:" + retVal);  
	}
	
	@AfterThrowing(value="forAll()",  argNames="exception", throwing="exception")
	public void afterThrowing(Exception exception) {
		System.out.println("after throwing exception:" + exception);  
	}
	@Around(value="execution(* *..*.*(..))")  
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Object[] args = pjp.getArgs();
		System.out.println("around before........");
		Object retVal = pjp.proceed(args);
		System.out.println("around after.......");
		return retVal;
	}
}
