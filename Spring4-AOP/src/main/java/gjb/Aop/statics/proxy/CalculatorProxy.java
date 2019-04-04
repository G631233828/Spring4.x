package gjb.Aop.statics.proxy;

import gjb.Aop.dao.Calculator;

public class CalculatorProxy implements Calculator {
	
	public Calculator calculator;

	//代理calculator对象
	public CalculatorProxy(Calculator calculator) {
		this.calculator = calculator;
	}

	public void add(int x, int y) {
		System.out.println("使用了静态代理，很繁琐，每个方法都要加 add");
		calculator.add(x, y);
	}

	public void subtract(int x, int y) {
		System.out.println("使用了静态代理，很繁琐，每个方法都要加 substract");
		calculator.subtract(x, y);
	}

	public void multiply(int x, int y) {
		System.out.println("使用了静态代理，很繁琐，每个方法都要加 multiply");
		calculator.multiply(x, y);
	}

	public void divide(int x, int y) {
		System.out.println("使用了静态代理，很繁琐，每个方法都要加 divide");
		calculator.divide(x, y);
	}

	
	
	
}
