package gjb.AopForXML.dao.aspect;

import org.aspectj.lang.JoinPoint;

public class MessageAspect {

//	@Pointcut(value = "execution(* gjb.Aop.dao.impl.CalculatorImpl.*(..))")
//	public void method(){}
	
	public void before(JoinPoint joinPoint){
		String method = joinPoint.getSignature().getName();
		System.out.println("пео╒ю╧╫ь"+method+"()");
	}
	
}
