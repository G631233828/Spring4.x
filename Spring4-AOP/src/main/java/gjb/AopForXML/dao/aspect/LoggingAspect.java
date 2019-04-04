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
 * @Aspect ��������Ϊ�����࣬��Ҫ��LoggingAspect����IOC�����У�������Ϊһ��������
 * @Order(2) ������AOP������ִ�е����ȼ�������ԽСִ�����ȼ�Խ��
 */
public class LoggingAspect {
	
	/**
	 * ����һ���������������������ʽ
	 */
	

	// �����÷�����һ��ǰ��֪ͨ����Ŀ�귽����ʼ֮ǰִ��
	public void befortMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		List<Object> args = Arrays.asList(joinPoint.getArgs());
		System.out.println("the method begins");
		System.out.println("methodName is " + methodName);
		System.out.println("args is " + args);
	}

	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println(methodName + "����ִ�����");
	}

	/*
	 * @AfterReturning("execution(* gjb.Aop.dao.impl.*.*(..))") public void
	 * afterReturning(){ System.out.println("after returning"); }
	 */

	/**
	 * ����֪ͨ��ҪЯ��ProceedingJoinPoint���͵Ĳ���
	 * ����֪ͨ�����ڶ�̬�����ȫ���̣�ProceedingJoinPoint���ĵĲ������Ծ����Ƿ�ִ��Ŀ�귽����
	 * �һ���֪ͨ�����з���ֵ������ֵ��ΪĿ�귽���ķ���ֵ��
	 */
//	@Around("execution(* gjb.Aop.dao.impl.*.*(..))")
//	public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
//
//		Object result = null;
//		String methodName = proceedingJoinPoint.getSignature().getName();
//		try {
//			System.out.println("ǰ��֪ͨ" + methodName + "begins with" + Arrays.asList(proceedingJoinPoint.getArgs()));
//			// ִ��Ŀ�귽��
//			result = proceedingJoinPoint.proceed();
//			// ����֪ͨ
//			System.out.println("����֪ͨ" + result);
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return result;
//	}

	public void throwing(JoinPoint joinPoint, Exception ex) {
		System.out.println("���󷽷���" + joinPoint.getSignature().getName() + "������Ϣ��" + ex.getMessage());
	}
}
