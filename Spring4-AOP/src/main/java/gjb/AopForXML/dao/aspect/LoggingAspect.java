package gjb.AopForXML.dao.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 
 * @author fliay
 * @Aspect 将类声明为切面类，需要将LoggingAspect放入IOC容器中，再声明为一个切面类
 * @Order(2) 来设置AOP切面类执行的优先级，数字越小执行优先级越高
 */
public class LoggingAspect {
	
	/**
	 * 定义一个方法用于声明切入点表达式
	 */
	

	// 声明该方法是一个前置通知，在目标方法开始之前执行
	public void befortMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("the method begins");
		System.out.println("methodName is " + methodName);
		System.out.println("args is " + args);
	}

	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println(methodName + "方法执行完成");
	}

	/*
	 * @AfterReturning("execution(* gjb.Aop.dao.impl.*.*(..))") public void
	 * afterReturning(){ System.out.println("after returning"); }
	 */

	/**
	 * 环绕通知需要携带ProceedingJoinPoint典型的参数
	 * 环绕通知类似于动态代理的全过程：ProceedingJoinPoint累心的参数可以决定是否执行目标方法。
	 * 且环绕通知必须有返回值，返回值即为目标方法的返回值。
	 */
//	@Around("execution(* gjb.Aop.dao.impl.*.*(..))")
//	public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
//
//		Object result = null;
//		String methodName = proceedingJoinPoint.getSignature().getName();
//		try {
//			System.out.println("前置通知" + methodName + "begins with" + Arrays.asList(proceedingJoinPoint.getArgs()));
//			// 执行目标方法
//			result = proceedingJoinPoint.proceed();
//			// 后置通知
//			System.out.println("后置通知" + result);
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;
//	}

	public void throwing(JoinPoint joinPoint, Exception ex) {
		System.out.println("错误方法：" + joinPoint.getSignature().getName() + "错误信息：" + ex.getMessage());
	}
}
