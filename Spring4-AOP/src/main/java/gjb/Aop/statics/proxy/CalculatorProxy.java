package gjb.Aop.statics.proxy;

import gjb.Aop.dao.Calculator;

public class CalculatorProxy implements Calculator {
	
	public Calculator calculator;

	//����calculator����
	public CalculatorProxy(Calculator calculator) {
		this.calculator = calculator;
	}

	public void add(int x, int y) {
		System.out.println("ʹ���˾�̬�����ܷ�����ÿ��������Ҫ�� add");
		calculator.add(x, y);
	}

	public void subtract(int x, int y) {
		System.out.println("ʹ���˾�̬�����ܷ�����ÿ��������Ҫ�� substract");
		calculator.subtract(x, y);
	}

	public void multiply(int x, int y) {
		System.out.println("ʹ���˾�̬�����ܷ�����ÿ��������Ҫ�� multiply");
		calculator.multiply(x, y);
	}

	public void divide(int x, int y) {
		System.out.println("ʹ���˾�̬�����ܷ�����ÿ��������Ҫ�� divide");
		calculator.divide(x, y);
	}

	
	
	
}
