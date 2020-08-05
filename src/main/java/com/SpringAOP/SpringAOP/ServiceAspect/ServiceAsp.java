package com.SpringAOP.SpringAOP.ServiceAspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAsp {

	@Before("execution(* com.SpringAOP.SpringAOP.Services.*.mesajVer(..))")
	public void mesajVerMetodundanOnce(JoinPoint joinpoint)
	{
		System.out.println("Mesaj ver metodundan önce parametre yakalandı : "+joinpoint.getArgs()[0]);
		System.out.println(joinpoint.getSignature());
		
		
	}
	
	@After("execution(* com.SpringAOP.SpringAOP.Services.*.mesajVer(..))")
	public void mesajVerMetodundanSonra(JoinPoint joinpoint)
	{
		System.out.println("Mesaj ver metodundan sonra parametre yakalandı : "+joinpoint.getArgs()[0]);
		System.out.println(joinpoint.getSignature());
	}
	
	
}
