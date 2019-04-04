package gjb.Aop.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorProxy<T> implements InvocationHandler {

	T target;

	public CalculatorProxy(T target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("动态代理执行了+" + method.getName() + "方法");
		Object result = method.invoke(target, args);
		return result;
	}

}
