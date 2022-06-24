package com.javainuse.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	@Pointcut("@annotation(Loggable)")
	public void logAllMethodCallsPointcut() {

	}
	
//	@Pointcut("@annotation(Loggable)")
//	public void logAllMethodCallsPointcut2() {
//
//	}

	@Before("logAllMethodCallsPointcut()")
	public void advice1() {
		System.out.println("advice1 called");
	}
	
	@Before("execution(* com.javainuse.service.HomeService.*(*))")
	public void advice2(JoinPoint joinPoint){
		System.out.println("advice2 - Before running loggingAdvice on method="+joinPoint.toString()+ " --- Arguments Passed=" + Arrays.toString(joinPoint.getArgs()));
	}
	
	@Around("execution(* com.javainuse.service.HomeService.homePage(*))")
	public Object advice3(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("advice3 - Before invoking method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("advice3 - After invoking getName() method. Return value="+value);
		return value;
	}
	
	@After("execution(* com.javainuse.service.HomeService.*())")
	public void advice4(JoinPoint joinPoint){
		System.out.println("advice4 - After on method="+joinPoint.toString()+ " --- Arguments Passed=" + Arrays.toString(joinPoint.getArgs()));
	}
}

