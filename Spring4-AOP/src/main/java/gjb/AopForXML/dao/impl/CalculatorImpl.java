package gjb.AopForXML.dao.impl;

import gjb.AopForXML.dao.Calculator;

public class CalculatorImpl implements Calculator {

	
	
	public CalculatorImpl() {
	}

	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void subtract(int x, int y) {
		System.out.println(x - y);
	}

	public void multiply(int x, int y) {
		System.out.println(x * y);
	}

	public void divide(int x, int y) {
		System.out.println(x / y);
	}

}
