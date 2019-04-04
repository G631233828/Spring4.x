package gjb.Aop.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorProxy<T> implements InvocationHandler {

	T target;

	public CalculatorProxy(T target) {
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("��̬����ִ����+" + method.getName() + "����");
		Object result = method.invoke(target, args);
		return result;
	}

}
