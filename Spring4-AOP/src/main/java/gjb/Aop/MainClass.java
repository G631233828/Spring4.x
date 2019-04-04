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
		// 直接调用了calculator
		 Calculator ca1 = app.getBean(CalculatorImpl.class);
		 ca1.add(1, 2);
		 ca1.multiply(2, 5);
//		 
//		 ca1.subtract(1, 0);
//		 ca1.divide(1, 0);
		// 使用静态代理模式来进行调用，但是这个有点麻烦，如果需要修改日志信息的时候需要对每个方法中的内容进行修改
		/*
		 Calculator ca = new CalculatorImpl();
		 CalculatorProxy cp = new CalculatorProxy(ca);
		 cp.add(1, 2); 
		 cp.multiply(1, 2); 
		 cp.divide(1, 2);
		 cp.subtract(1, 2);
		 

		// 创建了动态代理模式
		//Calculator ca = new CalculatorImpl();
		// 创建一个与代理对象相关联的InvocationHandler
		InvocationHandler caInvocation = new gjb.Aop.dynamic.proxy.CalculatorProxy<Calculator>(ca);
		// 创建一个代理对象stuProxy，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
		Calculator dyca = (Calculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(),
				new Class<?>[] { Calculator.class }, caInvocation);

		dyca.add(1, 2);
		dyca.divide(1, 2);
		dyca.multiply(1, 2);
		dyca.subtract(1, 2);*/
	}

}
