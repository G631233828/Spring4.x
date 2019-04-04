package gjb.Aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gjb.Aop.dao.Calculator;
import gjb.Aop.dao.impl.CalculatorImpl;
import gjb.Aop.statics.proxy.CalculatorProxy;

public class MainClass {

	public static void main(String[] args) {

		 ApplicationContext app = new
		 ClassPathXmlApplicationContext("applicationContext.xml");
		// ֱ�ӵ�����calculator
		 Calculator ca1 = app.getBean(CalculatorImpl.class);
		 ca1.add(1, 2);
		 ca1.multiply(2, 5);
//		 
//		 ca1.subtract(1, 0);
//		 ca1.divide(1, 0);
		// ʹ�þ�̬����ģʽ�����е��ã���������е��鷳�������Ҫ�޸���־��Ϣ��ʱ����Ҫ��ÿ�������е����ݽ����޸�
		/*
		 Calculator ca = new CalculatorImpl();
		 CalculatorProxy cp = new CalculatorProxy(ca);
		 cp.add(1, 2); 
		 cp.multiply(1, 2); 
		 cp.divide(1, 2);
		 cp.subtract(1, 2);
		 

		// �����˶�̬����ģʽ
		//Calculator ca = new CalculatorImpl();
		// ����һ�����������������InvocationHandler
		InvocationHandler caInvocation = new gjb.Aop.dynamic.proxy.CalculatorProxy<Calculator>(ca);
		// ����һ���������stuProxy����������ÿ��ִ�з��������滻ִ��Invocation�е�invoke����
		Calculator dyca = (Calculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(),
				new Class<?>[] { Calculator.class }, caInvocation);

		dyca.add(1, 2);
		dyca.divide(1, 2);
		dyca.multiply(1, 2);
		dyca.subtract(1, 2);*/
	}

}
