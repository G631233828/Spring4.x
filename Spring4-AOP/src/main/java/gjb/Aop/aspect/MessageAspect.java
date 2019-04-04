package gjb.Aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MessageAspect {

//	@Pointcut(value = "execution(* gjb.Aop.dao.impl.CalculatorImpl.*(..))")
//	public void method(){}
	
	@Before(value="LoggingAspect.method()")
	public void before(JoinPoint joinPoint){
		String method = joinPoint.getSignature().getName();
		System.out.println("пео╒ю╧╫ь"+method+"()");
	}
	
}
